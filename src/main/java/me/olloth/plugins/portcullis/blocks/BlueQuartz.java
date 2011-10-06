package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.QuartzBlockDesign;

import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class BlueQuartz extends GenericCustomBlock {

	public BlueQuartz() {
		super(Portcullis.instance, "Blue Quartz", false);
		this.setBlockDesign(new QuartzBlockDesign(4));
	}

}
