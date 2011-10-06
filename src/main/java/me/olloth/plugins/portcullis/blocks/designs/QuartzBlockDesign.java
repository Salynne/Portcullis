package me.olloth.plugins.portcullis.blocks.designs;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.Blocks;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class QuartzBlockDesign extends GenericBlockDesign {
	
	public QuartzBlockDesign(int textureId) {
		Portcullis plugin = Portcullis.instance;
		Texture texture = Blocks.texture;
		
		setBoundingBox(0, 0, 0, 1, 1, 1);

		setQuadNumber(15);

		setTexture(plugin, texture.getTexture());

		setMinBrightness(1F);
		setMaxBrightness(1F);
		
		SubTexture subTex = texture.getSubTexture(textureId);
		int width = texture.getWidth();
		int height = texture.getHeight();
		int x = subTex.getXLoc();
		int y = subTex.getYLoc();
		int x2 = subTex.getXTopLoc();
		int y2 = subTex.getYTopLoc();
		
		System.out.println("x: " + x + " x2: " + x2 + " y" + y + " y2: " + y2);

		// 1st face
		setVertex(0, 0, getX(0), 0F, getZ(0), x, y, width, height);
		setVertex(0, 1, getX(0), 1F, getZ(0), x, y2, width, height);
		setVertex(0, 2, getX(72), 1F, getZ(72), x2, y2, width, height);
		setVertex(0, 3, getX(72), 0F, getZ(72), x2, y, width, height);

		// 2nd face
		setVertex(1, 0, getX(72), 0F, getZ(72), x, y, width, height);
		setVertex(1, 1, getX(72), 1F, getZ(72), x, y2, width, height);
		setVertex(1, 2, getX(72 * 2), 1F, getZ(72 * 2), x2, y2, width, height);
		setVertex(1, 3, getX(72 * 2), 0F, getZ(72 * 2), x2, y, width, height);

		// 3rd face
		setVertex(2, 0, getX(72 * 2), 0F, getZ(72 * 2), x, y, width, height);
		setVertex(2, 1, getX(72 * 2), 1F, getZ(72 * 2), x, y2, width, height);
		setVertex(2, 2, getX(72 * 3), 1F, getZ(72 * 3), x2, y2, width, height);
		setVertex(2, 3, getX(72 * 3), 0F, getZ(72 * 3), x2, y, width, height);

		// 4th face
		setVertex(3, 0, getX(72 * 3), 0F, getZ(72 * 3), x, y, width, height);
		setVertex(3, 1, getX(72 * 3), 1F, getZ(72 * 3), x, y2, width, height);
		setVertex(3, 2, getX(72 * 4), 1F, getZ(72 * 4), x2, y2, width, height);
		setVertex(3, 3, getX(72 * 4), 0F, getZ(72 * 4), x2, y, width, height);

		// 5th face
		setVertex(4, 0, getX(72 * 4), 0F, getZ(72 * 4), x, y, width, height);
		setVertex(4, 1, getX(72 * 4), 1F, getZ(72 * 4), x, y2, width, height);
		setVertex(4, 2, getX(0), 1F, getZ(0), x2, y2, width, height);
		setVertex(4, 3, getX(0), 0F, getZ(0), x2, y, width, height);

		// 1st top
		setVertex(5, 0, getX(0), 1F, getZ(0), x, y, width, height);
		setVertex(5, 1, 0.5F, 1.5F, 0.5F, x, y2, width, height);
		setVertex(5, 2, getX(72), 1F, getZ(72), x2, y2, width, height);
		setVertex(5, 3, getX(0), 1F, getZ(0), x2, y, width, height);

		// 2nd top
		setVertex(6, 0, getX(72), 1F, getZ(72), x, y, width, height);
		setVertex(6, 1, 0.5F, 1.5F, 0.5F, x, y2, width, height);
		setVertex(6, 2, getX(72 * 2), 1F, getZ(72 * 2), x2, y2, width, height);
		setVertex(6, 3, getX(72), 1F, getZ(72), x2, y, width, height);

		// 3rd top
		setVertex(7, 0, getX(72 * 2), 1F, getZ(72 * 2), x, y, width, height);
		setVertex(7, 1, 0.5F, 1.5F, 0.5F, x, y2, width, height);
		setVertex(7, 2, getX(72 * 3), 1F, getZ(72 * 3), x2, y2, width, height);
		setVertex(7, 3, getX(72 * 2), 1F, getZ(72 * 2), x2, y, width, height);

		// 4th top
		setVertex(8, 0, getX(72 * 3), 1F, getZ(72 * 3), x, y, width, height);
		setVertex(8, 1, 0.5F, 1.5F, 0.5F, x, y2, width, height);
		setVertex(8, 2, getX(72 * 4), 1F, getZ(72 * 4), x2, y2, width, height);
		setVertex(8, 3, getX(72 * 3), 1F, getZ(72 * 3), x2, y, width, height);

		// 5th top
		setVertex(9, 0, getX(72 * 4), 1F, getZ(72 * 4), x, y, width, height);
		setVertex(9, 1, 0.5F, 1.5F, 0.5F, x, y2, width, height);
		setVertex(9, 2, getX(0), 1F, getZ(0), x2, y2, width, height);
		setVertex(9, 3, getX(72 * 4), 1F, getZ(72 * 4), x2, y, width, height);

		// 1st bottom
		setVertex(10, 0, getX(72), 0F, getZ(72), x2, y2, width, height);
		setVertex(10, 1, 0.5F, 0F, 0.5F, x, y2, width, height);
		setVertex(10, 2, getX(0), 0F, getZ(0), x, y, width, height);
		setVertex(10, 3, getX(0), 0F, getZ(0), x2, y, width, height);

		// 2nd bottom
		setVertex(11, 0, getX(72 * 2), 0F, getZ(72 * 2), x2, y2, width, height);
		setVertex(11, 1, 0.5F, 0F, 0.5F, x, y2, width, height);
		setVertex(11, 2, getX(72), 0F, getZ(72), x2, y, width, height);
		setVertex(11, 3, getX(72), 0F, getZ(72), x, y, width, height);

		// 3rd bottom
		setVertex(12, 0, getX(72 * 3), 0F, getZ(72 * 3), x2, y2, width, height);
		setVertex(12, 1, 0.5F, 0F, 0.5F, x, y2, width, height);
		setVertex(12, 2, getX(72 * 2), 0F, getZ(72 * 2), x2, y, width, height);
		setVertex(12, 3, getX(72 * 2), 0F, getZ(72 * 2), x, y, width, height);

		// 4th bottom
		setVertex(13, 0, getX(72 * 4), 0F, getZ(72 * 4), x2, y2, width, height);
		setVertex(13, 1, 0.5F, 0F, 0.5F, x, y2, width, height);
		setVertex(13, 2, getX(72 * 3), 0F, getZ(72 * 3), x2, y, width, height);
		setVertex(13, 3, getX(72 * 3), 0F, getZ(72 * 3), x, y, width, height);

		// 5th bottom
		setVertex(14, 0, getX(0), 0F, getZ(0), x2, y2, width, height);
		setVertex(14, 1, 0.5F, 0F, 0.5F, x, y2, width, height);
		setVertex(14, 2, getX(72 * 4), 0F, getZ(72 * 4), x2, y, width, height);
		setVertex(14, 3, getX(72 * 4), 0F, getZ(72 * 4), x, y, width, height);
		
		setRenderPass(0);
	}
	
	public float getX(int degrees) {
		return (float) (0.5 + (0.5 * Math.cos(Math.toRadians(degrees))));
	}

	public float getZ(int degrees) {
		return (float) (0.5 + (0.5 * Math.sin(Math.toRadians(degrees))));
	}

}
