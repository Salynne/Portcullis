package me.olloth.plugins.portcullis.generators;

import java.util.Random;

import me.olloth.plugins.portcullis.blocks.Blocks;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.util.noise.SimplexOctaveGenerator;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.MaterialManager;

public class SlowTerrainPopulator extends BlockPopulator {
	
	MaterialManager mm;
	
	public SlowTerrainPopulator() {
		mm = SpoutManager.getMaterialManager();
	}

	@Override
	public void populate(World world, Random random, Chunk source) {
		SimplexOctaveGenerator gen = new SimplexOctaveGenerator(world, 8);
		
		int chunkX = source.getX();
		int chunkZ = source.getZ();

		gen.setScale(1.0D / 256.0D);

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < 128; y++) {
					double noise = gen.noise(x + chunkX * 16, z + chunkZ * 16, 0.5, 0.5, true) * 12;
					if (y == 0) {
						
					} else if (y < 64 + noise && y > 58 + noise) {
						mm.overrideBlock(world.getBlockAt(x, y, z), Blocks.highlandDust);
					} else if (y <= 58 + noise && y > 50 + noise) {
						mm.overrideBlock(world.getBlockAt(x, y, z), Blocks.mare);
					} else if (y <= 50 + noise) {
						mm.overrideBlock(world.getBlockAt(x, y, z), Blocks.moonrock);
					}
				}
			}
		}
	}

}
