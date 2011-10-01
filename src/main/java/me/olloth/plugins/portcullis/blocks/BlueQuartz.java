package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.QuartzBlockDesign;

import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class BlueQuartz extends GenericCustomBlock {

	public BlueQuartz(Portcullis plugin) {
		super(plugin, "BlueQuartz", false);
		this.setBlockDesign(new QuartzBlockDesign(plugin, "http://dl.dropbox.com/u/40267690/blueQuartz.png", 0, 16));
		im.setCustomItemBlock(getCustomID(), getRawId(), (short) 0);
	}

}
