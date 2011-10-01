package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.QuartzBlockDesign;

import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class Quartz extends GenericCustomBlock {

	public Quartz(Portcullis plugin) {
		super(plugin, "Quartz", false);
		this.setBlockDesign(new QuartzBlockDesign(plugin, "http://dl.dropbox.com/u/40267690/quartz.png", 0, 16));
		im.setCustomItemBlock(getCustomID(), getRawId(), (short) 0);
	}

}
