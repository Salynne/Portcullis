package me.olloth.plugins.portcullis.blocks.designs;

import org.getspout.spoutapi.inventory.GenericCubeBlockDesign;

public class CubeBlockDesign extends GenericCubeBlockDesign {

	/**
	 * Creates a regular cube were all faces are the same
	 * 
	 * @param textureURL
	 * @param textureSize
	 * @param location
	 */
	public CubeBlockDesign(String texturePlugin, String textureURL, int textureSize, int location) {
		super(texturePlugin, textureURL, textureSize, new int[] { location, location, location, location, location, location });
	}

}
