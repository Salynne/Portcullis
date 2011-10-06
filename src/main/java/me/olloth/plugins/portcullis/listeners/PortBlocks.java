package me.olloth.plugins.portcullis.listeners;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.Blocks;

import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.ItemManager;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class PortBlocks extends BlockListener {
	
	Portcullis plugin;
	ItemManager im;
	
	public static GenericCustomItem testItem;
	
	public PortBlocks(Portcullis plugin) {
		this.plugin = plugin;
		im = SpoutManager.getItemManager();
	}
	
	@Override
	public void onBlockBreak(BlockBreakEvent event) {
		super.onBlockBreak(event);
		
		SpoutBlock block = im.getSpoutBlock(event.getBlock());
		
		if(block.isCustomBlock()) {
			int id = block.getCustomBlockId();
			CustomBlock cb = block.getCustomBlock();
			ItemStack is = im.getCustomItemStack(cb, 1);
			System.out.println(im.getCustomItemName(Material.FLINT, (short) cb.getCustomId()));
			if(id == Blocks.quartz.getCustomId()) {
				block.getWorld().dropItem(block.getLocation(), is);
			}
			else if (id == Blocks.blueQuartz.getCustomId()) {
				block.getWorld().dropItem(block.getLocation(), is);
			}
		}
	}
}
