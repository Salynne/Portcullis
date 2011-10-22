package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.QuartzBlockDesign;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class BlueQuartz extends GenericCustomBlock {

	public BlueQuartz() {
		super(Portcullis.instance, "Blue Quartz", false);
		this.setBlockDesign(new QuartzBlockDesign(4));
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) {
		System.out.println("Neighbor Block Change");
		
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z) {
		System.out.println("Block Place");
	}

	@Override
	public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) {
		System.out.println("Block Place by entity");
		
	}

	@Override
	public void onBlockDestroyed(World world, int x, int y, int z) {
		System.out.println("Block destroyed");
		world.dropItem(new Location(world, x, y, z), SpoutManager.getMaterialManager().getCustomItemStack(Blocks.moonrock, 1));
	}

	@Override
	public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
		System.out.println("On interact");
		return false;
	}

	@Override
	public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) {
		System.out.println("Entity move at");
	}

	@Override
	public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) {
		System.out.println("Block clicked");
	}

	@Override
	public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
		System.out.println("Providing power to");
		return false;
	}

	@Override
	public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
		System.out.println("inDirectly providing power to");
		return false;
	}

}
