package me.olloth.plugins.portcullis.generators;

import java.util.Random;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.util.BlockVector;
import org.bukkit.util.Vector;

public class CraterPopulator extends BlockPopulator {
	private int overallChance = 50;
	private int biggerChance = 15;
	private int minimumSize = 3;
	private int smallMax = 10;
	private int largeMax = 32;

	public void populate(World world, Random random, Chunk chunk) {
		if (random.nextInt(100) <= overallChance) {
			int centerX = (chunk.getX() << 4) + random.nextInt(16);
			int centerZ = (chunk.getZ() << 4) + random.nextInt(16);
			int centerY = world.getHighestBlockYAt(centerX, centerZ);
			Vector center = new BlockVector(centerX, centerY, centerZ);
			int r = 0;

			if (random.nextInt(100) <= biggerChance) {
				r = random.nextInt(largeMax - minimumSize + 1) + minimumSize;
			} else {
				r = random.nextInt(smallMax - minimumSize + 1) + minimumSize;
			}

			for (int x = -r; x <= r; x++) {
				for (int z = -r; z <= r; z++) {
					for (int y = -12; y <= 30; y++) {
						Vector xyzPos = center.clone().add(new Vector(x, y, z));
						Vector xzPos = center.clone().add(new Vector(x, 0, z));
						double distance = r + 0.5 - Math.abs(y);

						if (center.distance(xyzPos) <= distance && y < 0) {
							world.getBlockAt(xyzPos.toLocation(world)).setType(Material.AIR);
						}
						else if(center.distance(xzPos) <= r + 0.5 && y >= 0) {
							world.getBlockAt(xyzPos.toLocation(world)).setType(Material.AIR);
						}
						
					}
				}

			}

		}
	}
}