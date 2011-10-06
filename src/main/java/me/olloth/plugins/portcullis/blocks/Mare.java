package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.CubeBlockDesign;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Mare extends GenericCubeCustomBlock {

	public Mare() {
		super(Portcullis.instance, "Mare", true, new CubeBlockDesign(1), 0);
	}
}
