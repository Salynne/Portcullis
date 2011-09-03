package me.olloth.plugins.portcullis.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

public class PortGenerator extends ChunkGenerator {

	public PortGenerator() {

	}

	@Override
	public byte[] generate(World world, Random rand, int chunkX, int chunkZ) {
		byte[] chunk = new byte[16 * 16 * 128];

		SimplexOctaveGenerator gen = new SimplexOctaveGenerator(world, 8);

		gen.setScale(1.0D / 64.0D);

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {

				for (int y = 0; y < 128; y++) {
					byte block = 0;
					double noise = gen.noise(x + chunkX * 16, z + chunkZ * 16, 0.5, 0.5, true) * 12;
					if (y == 0) {
						block = (byte) Material.BEDROCK.getId();
					} else if (y < 64 + noise && y > 58 + noise) {
						block = (byte) Material.IRON_BLOCK.getId();
					} else if (y <= 58 + noise && y > 50 + noise) {
						block = (byte) Material.STONE.getId();
					} else if (y <= 50 + noise) {
						block = (byte) Material.COBBLESTONE.getId();
					}
					chunk[xyzToByte(x, y, z)] = block;
				}
			}
		}
		return chunk;
	}

	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		List<BlockPopulator> list = new ArrayList<BlockPopulator>();
		list.add(new CraterPopulator());
		list.add(new SilicatePopulator());
		return list;
	}

	@Override
	public boolean canSpawn(World world, int x, int z) {
		return true;
	}

	public int xyzToByte(int x, int y, int z) {
		return (x * 16 + z) * 128 + y;
	}

}