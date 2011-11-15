package me.olloth.plugins.portcullis.generators;

import java.util.Random;

import me.olloth.plugins.portcullis.blocks.Blocks;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.MaterialManager;

public class SilicatePopulator extends BlockPopulator {

	MaterialManager mm;

	public SilicatePopulator() {
		mm = SpoutManager.getMaterialManager();
	}

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
				SpoutBlock sourceBlock = (SpoutBlock) world.getBlockAt(centerX, centerY, centerZ);

				if (sourceBlock.getCustomBlock().equals(Blocks.moonrock)) {
					height = 2 + random.nextInt(3);

					for (int y = 1; y <= height; y++) {
						if (random.nextInt(4) == 3) {
							sourceBlock = (SpoutBlock) world.getBlockAt(centerX, centerY + y, centerZ);
							sourceBlock.setCustomBlock(Blocks.blueQuartz);
						} else {
							sourceBlock = (SpoutBlock) world.getBlockAt(centerX, centerY + y, centerZ);
							sourceBlock.setCustomBlock(Blocks.quartz);
						}
					}
				}

			}
		}
	}
}
