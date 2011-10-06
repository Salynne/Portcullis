package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.CubeBlockDesign;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class HighlandDust extends GenericCubeCustomBlock {

	public HighlandDust() {
		super(Portcullis.instance, "Highland Dust", true, new CubeBlockDesign(0), 0);
	}

}
