package me.olloth.plugins.portcullis.blocks.designs;

import me.olloth.plugins.portcullis.Portcullis;
import me.olloth.plugins.portcullis.blocks.Blocks;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

public class QuartzBlockDesign extends GenericBlockDesign {

	public QuartzBlockDesign(int textureId) {
		Portcullis plugin = Portcullis.instance;
		Texture texture = Blocks.texture;

		setBoundingBox(0, 0, 0, 1, 1, 1).setQuadNumber(15);

		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);

		SubTexture subTex = texture.getSubTexture(textureId);

		Quad face1 = new Quad(0, subTex);
		face1.addVertex(0, getX(0), 0F, getZ(0));
		face1.addVertex(1, getX(0), 1F, getZ(0));
		face1.addVertex(2, getX(72), 1F, getZ(72));
		face1.addVertex(3, getX(72), 0F, getZ(72));

		Quad face2 = new Quad(1, subTex);
		face2.addVertex(0, getX(72), 0F, getZ(72));
		face2.addVertex(1, getX(72), 1F, getZ(72));
		face2.addVertex(2, getX(72 * 2), 1F, getZ(72 * 2));
		face2.addVertex(3, getX(72 * 2), 0F, getZ(72 * 2));

		Quad face3 = new Quad(2, subTex);
		face3.addVertex(0, getX(72 * 2), 0F, getZ(72 * 2));
		face3.addVertex(1, getX(72 * 2), 1F, getZ(72 * 2));
		face3.addVertex(2, getX(72 * 3), 1F, getZ(72 * 3));
		face3.addVertex(3, getX(72 * 3), 0F, getZ(72 * 3));

		Quad face4 = new Quad(3, subTex);
		face4.addVertex(0, getX(72 * 3), 0F, getZ(72 * 3));
		face4.addVertex(1, getX(72 * 3), 1F, getZ(72 * 3));
		face4.addVertex(2, getX(72 * 4), 1F, getZ(72 * 4));
		face4.addVertex(3, getX(72 * 4), 0F, getZ(72 * 4));

		Quad face5 = new Quad(4, subTex);
		face5.addVertex(0, getX(72 * 4), 0F, getZ(72 * 4));
		face5.addVertex(1, getX(72 * 4), 1F, getZ(72 * 4));
		face5.addVertex(2, getX(0), 1F, getZ(0));
		face5.addVertex(3, getX(0), 0F, getZ(0));

		Quad top1 = new Quad(5, subTex);
		top1.addVertex(0, getX(0), 1F, getZ(0));
		top1.addVertex(1, 0.5F, 1.5F, 0.5F); // Dummy vertex for a triangle
		top1.addVertex(2, getX(72), 1F, getZ(72));
		top1.addVertex(3, getX(0), 1F, getZ(0));

		Quad top2 = new Quad(6, subTex);
		top2.addVertex(0, getX(72), 1F, getZ(72));
		top2.addVertex(1, 0.5F, 1.5F, 0.5F); // Dummy vertex for a triangle
		top2.addVertex(2, getX(72 * 2), 1F, getZ(72 * 2));
		top2.addVertex(3, getX(72), 1F, getZ(72));

		Quad top3 = new Quad(7, subTex);
		top3.addVertex(0, getX(72 * 2), 1F, getZ(72 * 2));
		top3.addVertex(1, 0.5F, 1.5F, 0.5F); // Dummy vertex for a triangle
		top3.addVertex(2, getX(72 * 3), 1F, getZ(72 * 3));
		top3.addVertex(3, getX(72 * 2), 1F, getZ(72 * 2));

		Quad top4 = new Quad(8, subTex);
		top4.addVertex(0, getX(72 * 3), 1F, getZ(72 * 3));
		top4.addVertex(1, 0.5F, 1.5F, 0.5F); // Dummy vertex for a triangle
		top4.addVertex(2, getX(72 * 4), 1F, getZ(72 * 4));
		top4.addVertex(3, getX(72 * 3), 1F, getZ(72 * 3));

		Quad top5 = new Quad(9, subTex);
		top5.addVertex(0, getX(72 * 4), 1F, getZ(72 * 4));
		top5.addVertex(1, 0.5F, 1.5F, 0.5F); // Dummy vertex for a triangle
		top5.addVertex(2, getX(0), 1F, getZ(0));
		top5.addVertex(3, getX(72 * 4), 1F, getZ(72 * 4));

		Quad bottom1 = new Quad(10, subTex);
		bottom1.addVertex(0, getX(72), 0F, getZ(72));
		bottom1.addVertex(1, 0.5F, 0F, 0.5F); // Dummy vertex for a triangle
		bottom1.addVertex(2, getX(0), 0F, getZ(0));
		bottom1.addVertex(3, getX(0), 0F, getZ(0));

		Quad bottom2 = new Quad(11, subTex);
		bottom2.addVertex(0, getX(72 * 2), 0F, getZ(72 * 2));
		bottom2.addVertex(1, 0.5F, 0F, 0.5F); // Dummy vertex for a triangle
		bottom2.addVertex(2, getX(72), 0F, getZ(72));
		bottom2.addVertex(3, getX(72), 0F, getZ(72));

		Quad bottom3 = new Quad(12, subTex);
		bottom3.addVertex(0, getX(72 * 3), 0F, getZ(72 * 3));
		bottom3.addVertex(1, 0.5F, 0F, 0.5F); // Dummy vertex for a triangle
		bottom3.addVertex(2, getX(72 * 2), 0F, getZ(72 * 2));
		bottom3.addVertex(3, getX(72 * 2), 0F, getZ(72 * 2));

		Quad bottom4 = new Quad(13, subTex);
		bottom4.addVertex(0, getX(72 * 4), 0F, getZ(72 * 4));
		bottom4.addVertex(1, 0.5F, 0F, 0.5F); // Dummy vertex for a triangle
		bottom4.addVertex(2, getX(72 * 3), 0F, getZ(72 * 3));
		bottom4.addVertex(3, getX(72 * 3), 0F, getZ(72 * 3));

		Quad bottom5 = new Quad(14, subTex);
		bottom5.addVertex(0, getX(0), 0F, getZ(0));
		bottom5.addVertex(1, 0.5F, 0F, 0.5F); // Dummy vertex for a triangle
		bottom5.addVertex(2, getX(72 * 4), 0F, getZ(72 * 4));
		bottom5.addVertex(3, getX(72 * 4), 0F, getZ(72 * 4));

		this.setQuad(face1).setQuad(face2).setQuad(face3).setQuad(face4).setQuad(face5);
		this.setQuad(top1).setQuad(top2).setQuad(top3).setQuad(top4).setQuad(top5);
		this.setQuad(bottom1).setQuad(bottom2).setQuad(bottom3).setQuad(bottom4).setQuad(bottom5);
	}

	public float getX(int degrees) {
		return (float) (0.5 + (0.5 * Math.cos(Math.toRadians(degrees))));
	}

	public float getZ(int degrees) {
		return (float) (0.5 + (0.5 * Math.sin(Math.toRadians(degrees))));
	}

}
