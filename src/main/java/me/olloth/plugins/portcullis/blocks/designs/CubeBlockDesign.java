package me.olloth.plugins.portcullis.blocks.designs;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.Blocks;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;

public class CubeBlockDesign extends GenericCubeBlockDesign {

	public CubeBlockDesign(int textureId) {
		super(Portcullis.instance, Blocks.texture, textureId);
	}

}
