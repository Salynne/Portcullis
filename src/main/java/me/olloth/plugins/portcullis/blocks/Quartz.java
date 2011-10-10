package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.QuartzBlockDesign;

import org.getspout.spoutapi.material.block.GenericCustomBlock;

public class Quartz extends GenericCustomBlock {

	public Quartz() {
		super(Portcullis.instance, "Quartz", false);
		this.setBlockDesign(new QuartzBlockDesign(3));
	}

}
