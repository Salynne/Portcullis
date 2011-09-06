package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;

import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.ItemManager;
import org.getspout.spoutapi.inventory.SpoutCustomBlockDesign;

public class Blocks {

	Portcullis plugin;
	ItemManager im;

	public Blocks(Portcullis plugin) {
		this.plugin = plugin;

		buildQuartz();
		buildBlueQuartz();
	}

	public void buildQuartz() {
		SpoutCustomBlockDesign quartz = new SpoutCustomBlockDesign();

		quartz.setBoundingBox(0, 0, 0, 1, 1, 1);

		quartz.setQuadNumber(15);

		quartz.setTexture(plugin.getDescription().getName(), "http://dl.dropbox.com/u/40267690/quartz.png");

		quartz.setMinBrightness(0F);
		quartz.setMaxBrightness(1F);

		// 1st face
		quartz.setVertex(0, 0, getX(0), 0F, getZ(0), 0, 0, 16, 16);
		quartz.setVertex(0, 1, getX(0), 1F, getZ(0), 0, 16, 16, 16);
		quartz.setVertex(0, 2, getX(72), 1F, getZ(72), 16, 16, 16, 16);
		quartz.setVertex(0, 3, getX(72), 0F, getZ(72), 16, 0, 16, 16);

		// 2nd face
		quartz.setVertex(1, 0, getX(72), 0F, getZ(72), 0, 0, 16, 16);
		quartz.setVertex(1, 1, getX(72), 1F, getZ(72), 0, 16, 16, 16);
		quartz.setVertex(1, 2, getX(72 * 2), 1F, getZ(72 * 2), 16, 16, 16, 16);
		quartz.setVertex(1, 3, getX(72 * 2), 0F, getZ(72 * 2), 16, 0, 16, 16);

		// 3rd face
		quartz.setVertex(2, 0, getX(72 * 2), 0F, getZ(72 * 2), 0, 0, 16, 16);
		quartz.setVertex(2, 1, getX(72 * 2), 1F, getZ(72 * 2), 0, 16, 16, 16);
		quartz.setVertex(2, 2, getX(72 * 3), 1F, getZ(72 * 3), 16, 16, 16, 16);
		quartz.setVertex(2, 3, getX(72 * 3), 0F, getZ(72 * 3), 16, 0, 16, 16);

		// 4th face
		quartz.setVertex(3, 0, getX(72 * 3), 0F, getZ(72 * 3), 0, 0, 16, 16);
		quartz.setVertex(3, 1, getX(72 * 3), 1F, getZ(72 * 3), 0, 16, 16, 16);
		quartz.setVertex(3, 2, getX(72 * 4), 1F, getZ(72 * 4), 16, 16, 16, 16);
		quartz.setVertex(3, 3, getX(72 * 4), 0F, getZ(72 * 4), 16, 0, 16, 16);

		// 5th face
		quartz.setVertex(4, 0, getX(72 * 4), 0F, getZ(72 * 4), 0, 0, 16, 16);
		quartz.setVertex(4, 1, getX(72 * 4), 1F, getZ(72 * 4), 0, 16, 16, 16);
		quartz.setVertex(4, 2, getX(0), 1F, getZ(0), 16, 16, 16, 16);
		quartz.setVertex(4, 3, getX(0), 0F, getZ(0), 16, 0, 16, 16);

		// 1st top
		quartz.setVertex(5, 0, getX(0), 1F, getZ(0), 0, 0, 16, 16);
		quartz.setVertex(5, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(5, 2, getX(72), 1F, getZ(72), 16, 16, 16, 16);
		quartz.setVertex(5, 3, getX(0), 1F, getZ(0), 16, 0, 16, 16);

		// 2nd top
		quartz.setVertex(6, 0, getX(72), 1F, getZ(72), 0, 0, 16, 16);
		quartz.setVertex(6, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(6, 2, getX(72 * 2), 1F, getZ(72 * 2), 16, 16, 16, 16);
		quartz.setVertex(6, 3, getX(72), 1F, getZ(72), 16, 0, 16, 16);

		// 3rd top
		quartz.setVertex(7, 0, getX(72 * 2), 1F, getZ(72 * 2), 0, 0, 16, 16);
		quartz.setVertex(7, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(7, 2, getX(72 * 3), 1F, getZ(72 * 3), 16, 16, 16, 16);
		quartz.setVertex(7, 3, getX(72 * 2), 1F, getZ(72 * 2), 16, 0, 16, 16);

		// 4th top
		quartz.setVertex(8, 0, getX(72 * 3), 1F, getZ(72 * 3), 0, 0, 16, 16);
		quartz.setVertex(8, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(8, 2, getX(72 * 4), 1F, getZ(72 * 4), 16, 16, 16, 16);
		quartz.setVertex(8, 3, getX(72 * 3), 1F, getZ(72 * 3), 16, 0, 16, 16);

		// 5th top
		quartz.setVertex(9, 0, getX(72 * 4), 1F, getZ(72 * 4), 0, 0, 16, 16);
		quartz.setVertex(9, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(9, 2, getX(0), 1F, getZ(0), 16, 16, 16, 16);
		quartz.setVertex(9, 3, getX(72 * 4), 1F, getZ(72 * 4), 16, 0, 16, 16);

		// 1st bottom
		quartz.setVertex(10, 0, getX(72), 0F, getZ(72), 16, 16, 16, 16);
		quartz.setVertex(10, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(10, 2, getX(0), 0F, getZ(0), 0, 0, 16, 16);
		quartz.setVertex(10, 3, getX(0), 0F, getZ(0), 16, 0, 16, 16);

		// 2nd bottom
		quartz.setVertex(11, 0, getX(72 * 2), 0F, getZ(72 * 2), 16, 16, 16, 16);
		quartz.setVertex(11, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(11, 2, getX(72), 0F, getZ(72), 16, 0, 16, 16);
		quartz.setVertex(11, 3, getX(72), 0F, getZ(72), 0, 0, 16, 16);

		// 3rd bottom
		quartz.setVertex(12, 0, getX(72 * 3), 0F, getZ(72 * 3), 16, 16, 16, 16);
		quartz.setVertex(12, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(12, 2, getX(72 * 2), 0F, getZ(72 * 2), 16, 0, 16, 16);
		quartz.setVertex(12, 3, getX(72 * 2), 0F, getZ(72 * 2), 0, 0, 16, 16);

		// 4th bottom
		quartz.setVertex(13, 0, getX(72 * 4), 0F, getZ(72 * 4), 16, 16, 16, 16);
		quartz.setVertex(13, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(13, 2, getX(72 * 3), 0F, getZ(72 * 3), 16, 0, 16, 16);
		quartz.setVertex(13, 3, getX(72 * 3), 0F, getZ(72 * 3), 0, 0, 16, 16);

		// 5th bottom
		quartz.setVertex(14, 0, getX(0), 0F, getZ(0), 16, 16, 16, 16);
		quartz.setVertex(14, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		quartz.setVertex(14, 2, getX(72 * 4), 0F, getZ(72 * 4), 16, 0, 16, 16);
		quartz.setVertex(14, 3, getX(72 * 4), 0F, getZ(72 * 4), 0, 0, 16, 16);
		
		quartz.setRenderPass(1);

		SpoutManager.getItemManager().setCustomBlockDesign(444, 0, quartz);

	}

	public void buildBlueQuartz() {
		SpoutCustomBlockDesign blueQuartz = new SpoutCustomBlockDesign();

		blueQuartz.setBoundingBox(0, 0, 0, 1, 1, 1); // Can cause server/client
														// mismatches

		blueQuartz.setQuadNumber(15);

		blueQuartz.setTexture(plugin.getDescription().getName(), "http://dl.dropbox.com/u/40267690/blueQuartz.png");

		blueQuartz.setMinBrightness(0.3F);
		blueQuartz.setMaxBrightness(1F);

		// 1st face
		blueQuartz.setVertex(0, 0, getX(0), 0F, getZ(0), 0, 0, 16, 16);
		blueQuartz.setVertex(0, 1, getX(0), 1F, getZ(0), 0, 16, 16, 16);
		blueQuartz.setVertex(0, 2, getX(72), 1F, getZ(72), 16, 16, 16, 16);
		blueQuartz.setVertex(0, 3, getX(72), 0F, getZ(72), 16, 0, 16, 16);

		// 2nd face
		blueQuartz.setVertex(1, 0, getX(72), 0F, getZ(72), 0, 0, 16, 16);
		blueQuartz.setVertex(1, 1, getX(72), 1F, getZ(72), 0, 16, 16, 16);
		blueQuartz.setVertex(1, 2, getX(72 * 2), 1F, getZ(72 * 2), 16, 16, 16, 16);
		blueQuartz.setVertex(1, 3, getX(72 * 2), 0F, getZ(72 * 2), 16, 0, 16, 16);

		// 3rd face
		blueQuartz.setVertex(2, 0, getX(72 * 2), 0F, getZ(72 * 2), 0, 0, 16, 16);
		blueQuartz.setVertex(2, 1, getX(72 * 2), 1F, getZ(72 * 2), 0, 16, 16, 16);
		blueQuartz.setVertex(2, 2, getX(72 * 3), 1F, getZ(72 * 3), 16, 16, 16, 16);
		blueQuartz.setVertex(2, 3, getX(72 * 3), 0F, getZ(72 * 3), 16, 0, 16, 16);

		// 4th face
		blueQuartz.setVertex(3, 0, getX(72 * 3), 0F, getZ(72 * 3), 0, 0, 16, 16);
		blueQuartz.setVertex(3, 1, getX(72 * 3), 1F, getZ(72 * 3), 0, 16, 16, 16);
		blueQuartz.setVertex(3, 2, getX(72 * 4), 1F, getZ(72 * 4), 16, 16, 16, 16);
		blueQuartz.setVertex(3, 3, getX(72 * 4), 0F, getZ(72 * 4), 16, 0, 16, 16);

		// 5th face
		blueQuartz.setVertex(4, 0, getX(72 * 4), 0F, getZ(72 * 4), 0, 0, 16, 16);
		blueQuartz.setVertex(4, 1, getX(72 * 4), 1F, getZ(72 * 4), 0, 16, 16, 16);
		blueQuartz.setVertex(4, 2, getX(0), 1F, getZ(0), 16, 16, 16, 16);
		blueQuartz.setVertex(4, 3, getX(0), 0F, getZ(0), 16, 0, 16, 16);

		// 1st top
		blueQuartz.setVertex(5, 0, getX(0), 1F, getZ(0), 0, 0, 16, 16);
		blueQuartz.setVertex(5, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(5, 2, getX(72), 1F, getZ(72), 16, 16, 16, 16);
		blueQuartz.setVertex(5, 3, getX(0), 1F, getZ(0), 16, 0, 16, 16);

		// 2nd top
		blueQuartz.setVertex(6, 0, getX(72), 1F, getZ(72), 0, 0, 16, 16);
		blueQuartz.setVertex(6, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(6, 2, getX(72 * 2), 1F, getZ(72 * 2), 16, 16, 16, 16);
		blueQuartz.setVertex(6, 3, getX(72), 1F, getZ(72), 16, 0, 16, 16);

		// 3rd top
		blueQuartz.setVertex(7, 0, getX(72 * 2), 1F, getZ(72 * 2), 0, 0, 16, 16);
		blueQuartz.setVertex(7, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(7, 2, getX(72 * 3), 1F, getZ(72 * 3), 16, 16, 16, 16);
		blueQuartz.setVertex(7, 3, getX(72 * 2), 1F, getZ(72 * 2), 16, 0, 16, 16);

		// 4th top
		blueQuartz.setVertex(8, 0, getX(72 * 3), 1F, getZ(72 * 3), 0, 0, 16, 16);
		blueQuartz.setVertex(8, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(8, 2, getX(72 * 4), 1F, getZ(72 * 4), 16, 16, 16, 16);
		blueQuartz.setVertex(8, 3, getX(72 * 3), 1F, getZ(72 * 3), 16, 0, 16, 16);

		// 5th top
		blueQuartz.setVertex(9, 0, getX(72 * 4), 1F, getZ(72 * 4), 0, 0, 16, 16);
		blueQuartz.setVertex(9, 1, 0.5F, 1.5F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(9, 2, getX(0), 1F, getZ(0), 16, 16, 16, 16);
		blueQuartz.setVertex(9, 3, getX(72 * 4), 1F, getZ(72 * 4), 16, 0, 16, 16);

		// 1st bottom
		blueQuartz.setVertex(10, 0, getX(72), 0F, getZ(72), 16, 16, 16, 16);
		blueQuartz.setVertex(10, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(10, 2, getX(0), 0F, getZ(0), 0, 0, 16, 16);
		blueQuartz.setVertex(10, 3, getX(0), 0F, getZ(0), 16, 0, 16, 16);

		// 2nd bottom
		blueQuartz.setVertex(11, 0, getX(72 * 2), 0F, getZ(72 * 2), 16, 16, 16, 16);
		blueQuartz.setVertex(11, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(11, 2, getX(72), 0F, getZ(72), 16, 0, 16, 16);
		blueQuartz.setVertex(11, 3, getX(72), 0F, getZ(72), 0, 0, 16, 16);

		// 3rd bottom
		blueQuartz.setVertex(12, 0, getX(72 * 3), 0F, getZ(72 * 3), 16, 16, 16, 16);
		blueQuartz.setVertex(12, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(12, 2, getX(72 * 2), 0F, getZ(72 * 2), 16, 0, 16, 16);
		blueQuartz.setVertex(12, 3, getX(72 * 2), 0F, getZ(72 * 2), 0, 0, 16, 16);

		// 4th bottom
		blueQuartz.setVertex(13, 0, getX(72 * 4), 0F, getZ(72 * 4), 16, 16, 16, 16);
		blueQuartz.setVertex(13, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(13, 2, getX(72 * 3), 0F, getZ(72 * 3), 16, 0, 16, 16);
		blueQuartz.setVertex(13, 3, getX(72 * 3), 0F, getZ(72 * 3), 0, 0, 16, 16);

		// 5th bottom
		blueQuartz.setVertex(14, 0, getX(0), 0F, getZ(0), 16, 16, 16, 16);
		blueQuartz.setVertex(14, 1, 0.5F, 0F, 0.5F, 0, 16, 16, 16);
		blueQuartz.setVertex(14, 2, getX(72 * 4), 0F, getZ(72 * 4), 16, 0, 16, 16);
		blueQuartz.setVertex(14, 3, getX(72 * 4), 0F, getZ(72 * 4), 0, 0, 16, 16);
		
		blueQuartz.setRenderPass(1);

		SpoutManager.getItemManager().setCustomBlockDesign(445, 0, blueQuartz);

	}

	public float getX(int degrees) {
		return (float) (0.5 + (0.5 * Math.cos(Math.toRadians(degrees))));
	}

	public float getZ(int degrees) {
		return (float) (0.5 + (0.5 * Math.sin(Math.toRadians(degrees))));
	}

}
