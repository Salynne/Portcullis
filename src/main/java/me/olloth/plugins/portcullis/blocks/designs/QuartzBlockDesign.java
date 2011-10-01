package me.olloth.plugins.portcullis.blocks.designs;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.inventory.GenericBlockDesign;

public class QuartzBlockDesign extends GenericBlockDesign {
	
	public QuartzBlockDesign(Plugin plugin, String texture, int texLoc, int texSize) {
		
		setBoundingBox(0, 0, 0, 1, 1, 1);

		setQuadNumber(15);

		setTexture(plugin, texture);

		setMinBrightness(0F);
		setMaxBrightness(1F);

		// 1st face
		setVertex(0, 0, getX(0), 0F, getZ(0), texLoc, texLoc, texSize, texSize);
		setVertex(0, 1, getX(0), 1F, getZ(0), texLoc, texLoc + texSize, texSize, texSize);
		setVertex(0, 2, getX(72), 1F, getZ(72), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(0, 3, getX(72), 0F, getZ(72), texLoc + texSize, texLoc, texSize, texSize);

		// 2nd face
		setVertex(1, 0, getX(72), 0F, getZ(72), texLoc, texLoc, texSize, texSize);
		setVertex(1, 1, getX(72), 1F, getZ(72), texLoc, texLoc + texSize, texSize, texSize);
		setVertex(1, 2, getX(72 * 2), 1F, getZ(72 * 2), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(1, 3, getX(72 * 2), 0F, getZ(72 * 2), texLoc + texSize, texLoc, texSize, texSize);

		// 3rd face
		setVertex(2, 0, getX(72 * 2), 0F, getZ(72 * 2), texLoc, texLoc, texSize, texSize);
		setVertex(2, 1, getX(72 * 2), 1F, getZ(72 * 2), texLoc, texLoc + texSize, texSize, texSize);
		setVertex(2, 2, getX(72 * 3), 1F, getZ(72 * 3), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(2, 3, getX(72 * 3), 0F, getZ(72 * 3), texLoc + texSize, texLoc, texSize, texSize);

		// 4th face
		setVertex(3, 0, getX(72 * 3), 0F, getZ(72 * 3), texLoc, texLoc, texSize, texSize);
		setVertex(3, 1, getX(72 * 3), 1F, getZ(72 * 3), texLoc, texLoc + texSize, texSize, texSize);
		setVertex(3, 2, getX(72 * 4), 1F, getZ(72 * 4), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(3, 3, getX(72 * 4), 0F, getZ(72 * 4), texLoc + texSize, texLoc, texSize, texSize);

		// 5th face
		setVertex(4, 0, getX(72 * 4), 0F, getZ(72 * 4), texLoc, texLoc, texSize, texSize);
		setVertex(4, 1, getX(72 * 4), 1F, getZ(72 * 4), texLoc, texLoc + texSize, texSize, texSize);
		setVertex(4, 2, getX(0), 1F, getZ(0), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(4, 3, getX(0), 0F, getZ(0), texLoc + texSize, texLoc, texSize, texSize);

		// 1st top
		setVertex(5, 0, getX(0), 1F, getZ(0), texLoc, texLoc, texSize, texSize);
		setVertex(5, 1, 0.5F, 1.5F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(5, 2, getX(72), 1F, getZ(72), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(5, 3, getX(0), 1F, getZ(0), texLoc + texSize, texLoc, texSize, texSize);

		// 2nd top
		setVertex(6, 0, getX(72), 1F, getZ(72), texLoc, texLoc, texSize, texSize);
		setVertex(6, 1, 0.5F, 1.5F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(6, 2, getX(72 * 2), 1F, getZ(72 * 2), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(6, 3, getX(72), 1F, getZ(72), texLoc + texSize, texLoc, texSize, texSize);

		// 3rd top
		setVertex(7, 0, getX(72 * 2), 1F, getZ(72 * 2), texLoc, texLoc, texSize, texSize);
		setVertex(7, 1, 0.5F, 1.5F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(7, 2, getX(72 * 3), 1F, getZ(72 * 3), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(7, 3, getX(72 * 2), 1F, getZ(72 * 2), texLoc + texSize, texLoc, texSize, texSize);

		// 4th top
		setVertex(8, 0, getX(72 * 3), 1F, getZ(72 * 3), texLoc, texLoc, texSize, texSize);
		setVertex(8, 1, 0.5F, 1.5F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(8, 2, getX(72 * 4), 1F, getZ(72 * 4), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(8, 3, getX(72 * 3), 1F, getZ(72 * 3), texLoc + texSize, texLoc, texSize, texSize);

		// 5th top
		setVertex(9, 0, getX(72 * 4), 1F, getZ(72 * 4), texLoc, texLoc, texSize, texSize);
		setVertex(9, 1, 0.5F, 1.5F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(9, 2, getX(0), 1F, getZ(0), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(9, 3, getX(72 * 4), 1F, getZ(72 * 4), texLoc + texSize, texLoc, texSize, texSize);

		// 1st bottom
		setVertex(10, 0, getX(72), 0F, getZ(72), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(10, 1, 0.5F, 0F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(10, 2, getX(0), 0F, getZ(0), texLoc, texLoc, texSize, texSize);
		setVertex(10, 3, getX(0), 0F, getZ(0), texLoc + texSize, texLoc, texSize, texSize);

		// 2nd bottom
		setVertex(11, 0, getX(72 * 2), 0F, getZ(72 * 2), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(11, 1, 0.5F, 0F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(11, 2, getX(72), 0F, getZ(72), texLoc + texSize, texLoc, texSize, texSize);
		setVertex(11, 3, getX(72), 0F, getZ(72), texLoc, texLoc, texSize, texSize);

		// 3rd bottom
		setVertex(12, 0, getX(72 * 3), 0F, getZ(72 * 3), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(12, 1, 0.5F, 0F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(12, 2, getX(72 * 2), 0F, getZ(72 * 2), texLoc + texSize, texLoc, texSize, texSize);
		setVertex(12, 3, getX(72 * 2), 0F, getZ(72 * 2), texLoc, texLoc, texSize, texSize);

		// 4th bottom
		setVertex(13, 0, getX(72 * 4), 0F, getZ(72 * 4), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(13, 1, 0.5F, 0F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(13, 2, getX(72 * 3), 0F, getZ(72 * 3), texLoc + texSize, texLoc, texSize, texSize);
		setVertex(13, 3, getX(72 * 3), 0F, getZ(72 * 3), texLoc, texLoc, texSize, texSize);

		// 5th bottom
		setVertex(14, 0, getX(0), 0F, getZ(0), texLoc + texSize, texLoc + texSize, texSize, texSize);
		setVertex(14, 1, 0.5F, 0F, 0.5F, texLoc, texLoc + texSize, texSize, texSize);
		setVertex(14, 2, getX(72 * 4), 0F, getZ(72 * 4), texLoc + texSize, texLoc, texSize, texSize);
		setVertex(14, 3, getX(72 * 4), 0F, getZ(72 * 4), texLoc, texLoc, texSize, texSize);
		
		setRenderPass(1);
	}
	
	public float getX(int degrees) {
		return (float) (0.5 + (0.5 * Math.cos(Math.toRadians(degrees))));
	}

	public float getZ(int degrees) {
		return (float) (0.5 + (0.5 * Math.sin(Math.toRadians(degrees))));
	}

}
