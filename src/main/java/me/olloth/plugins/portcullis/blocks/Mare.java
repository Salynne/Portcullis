package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.CubeBlockDesign;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Mare extends GenericCubeCustomBlock {

	public Mare() {
		super(Portcullis.instance, "Mare", true, new CubeBlockDesign(1));
		setHardness(MaterialData.stone.getHardness());
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockDestroyed(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onBlockDestroyed(World world, int x, int y, int z, LivingEntity living) {
		// TODO Auto-generated method stub
		
	}
}
