package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.QuartzBlockDesign;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class BlueQuartz extends GenericCustomBlock {

	public BlueQuartz() {
		super(Portcullis.instance, "Blue Quartz", false);
		this.setBlockDesign(new QuartzBlockDesign(4));
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
	public boolean canPlaceBlockAt(World world, int x, int y, int z, BlockFace face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean isIndirectlyProdivingPowerTo(World world, int x, int y, int z, BlockFace face) {
		// TODO Auto-generated method stub
		return false;
	}

}
