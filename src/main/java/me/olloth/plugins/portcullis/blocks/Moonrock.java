package me.olloth.plugins.portcullis.blocks;

import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.designs.CubeBlockDesign;

public class Moonrock extends GenericCubeCustomBlock {
	public Moonrock() {
		super(Portcullis.instance, "Moonrock", true, new CubeBlockDesign(2), 0);
	}
}
