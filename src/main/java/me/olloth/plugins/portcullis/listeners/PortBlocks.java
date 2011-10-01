package me.olloth.plugins.portcullis.listeners;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.BlueQuartz;
import me.olloth.plugins.portcullis.blocks.Quartz;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.ItemManager;

public class PortBlocks extends BlockListener {
	
	Portcullis plugin;
	ItemManager im;
	
	public static Quartz quartz;
	public static BlueQuartz blueQuartz;
	
	public PortBlocks(Portcullis plugin) {
		this.plugin = plugin;
		im = SpoutManager.getItemManager();
		
		quartz = new Quartz(plugin);
		blueQuartz = new BlueQuartz(plugin);
	}
	
	@Override
	public void onBlockBreak(BlockBreakEvent event) {
		super.onBlockBreak(event);
		
		SpoutBlock block = im.getSpoutBlock(event.getBlock());
		
		if(block.isCustomBlock()) {
			if(block.getCustomBlock() instanceof Quartz) {
				block.getWorld().dropItem(block.getLocation(), im.getCustomItemStack(block.getCustomBlock(), 1));
			}
			else if (block.getCustomBlock() instanceof BlueQuartz) {
				block.getWorld().dropItem(block.getLocation(), im.getCustomItemStack(block.getCustomBlock(), 1));
			}
		}
	}
}
