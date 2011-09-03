package me.olloth.plugins.portcullis.generators;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;

public class SilicatePopulator extends BlockPopulator {

	@Override
	public void populate(World world, Random random, Chunk chunk) {

		int centerX;
		int centerZ;

		int height = 2 + random.nextInt(3);
		int chance = 85;
		int multiplier = 15;

		for (int i = 0; i < multiplier; i++) {
			centerX = (chunk.getX() << 4) + random.nextInt(16);
			centerZ = (chunk.getZ() << 4) + random.nextInt(16);
			if (random.nextInt(100) <= chance) {
				int centerY = world.getHighestBlockYAt(centerX, centerZ) - 1;
				Block sourceBlock = world.getBlockAt(centerX, centerY, centerZ);

				if (sourceBlock.getType() == Material.COBBLESTONE) {
					height = 2 + random.nextInt(3);
					sourceBlock.setType(Material.GLASS);
					for (int y = 1; y <= height; y++) {
						if (random.nextInt(4) == 3) {
							world.getBlockAt(centerX, centerY + y, centerZ).setType(Material.MOSSY_COBBLESTONE);
						} else {
							world.getBlockAt(centerX, centerY + y, centerZ).setType(Material.GLASS);
						}
					}
				}

			}
		}

	}
}
