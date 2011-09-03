package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;

import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.event.inventory.SpoutCustomBlockDesign;

public class Blocks {
	
	Portcullis plugin;
	
	SpoutCustomBlockDesign quartz;
	SpoutCustomBlockDesign blueQuartz;
	
	public Blocks(Portcullis plugin) {
		this.plugin = plugin;
		
		quartz = new SpoutCustomBlockDesign();
		blueQuartz = new SpoutCustomBlockDesign(); 
		buildQuartz();
		buildBlueQuartz();
	}
	
	public SpoutCustomBlockDesign buildQuartz() {
	    quartz.setBoundingBox(0, 0, 0, 1, 1, 1);  // Can cause server/client mismatches

	    quartz.setQuadNumber(6);

	    quartz.setTexture(plugin.getDescription().getName(), "http://dl.dropbox.com/u/15813472/quartz.png");

	    quartz.setVertex(0, 0, 0F, 0F, 0F, 0, 0, 16, 16);
	    quartz.setVertex(0, 1, 0F, 1F, 0F, 0, 16, 16, 16);
	    quartz.setVertex(0, 2, 1F, 1F, 0F, 16, 16, 16, 16);
	    quartz.setVertex(0, 3, 1F, 0F, 0F, 16, 0, 16, 16);
	    
	    quartz.setVertex(1, 0, 0F, 0F, 1F, 0, 0, 16, 16);
	    quartz.setVertex(1, 1, 0F, 1F, 1F, 0, 16, 16, 16);
	    quartz.setVertex(1, 2, 1F, 1F, 1F, 16, 16, 16, 16);
	    quartz.setVertex(1, 3, 1F, 0F, 1F, 16, 0, 16, 16);
	    
	    quartz.setVertex(2, 0, 0F, 0F, 1F, 0, 0, 16, 16);
	    quartz.setVertex(2, 1, 0F, 1F, 1F, 0, 16, 16, 16);
	    quartz.setVertex(2, 2, 0F, 1F, 0F, 16, 16, 16, 16);
	    quartz.setVertex(2, 3, 0F, 0F, 0F, 16, 0, 16, 16);
	    
	    quartz.setVertex(3, 0, 1F, 0F, 1F, 0, 0, 16, 16);
	    quartz.setVertex(3, 1, 1F, 1F, 1F, 0, 16, 16, 16);
	    quartz.setVertex(3, 2, 1F, 1F, 0F, 16, 16, 16, 16);
	    quartz.setVertex(3, 3, 1F, 0F, 0F, 16, 0, 16, 16);
	    
	    quartz.setVertex(4, 0, 0F, 1F, 1F, 0, 0, 16, 16);
	    quartz.setVertex(4, 1, 1F, 1F, 1F, 0, 16, 16, 16);
	    quartz.setVertex(4, 2, 0F, 1F, 0F, 16, 16, 16, 16);
	    quartz.setVertex(4, 3, 1F, 1F, 0F, 16, 0, 16, 16);

	    quartz.setVertex(5, 0, 0F, 0F, 1F, 0, 0, 16, 16);
	    quartz.setVertex(5, 1, 1F, 0F, 1F, 0, 16, 16, 16);
	    quartz.setVertex(5, 2, 0F, 0F, 0F, 16, 16, 16, 16);
	    quartz.setVertex(5, 3, 1F, 0F, 0F, 16, 0, 16, 16);

	    SpoutManager.getItemManager().setCustomBlockDesign(444, 0, quartz);
		
		return quartz;
	}
	
	public SpoutCustomBlockDesign buildBlueQuartz() {
	    blueQuartz.setBoundingBox(0, 0, 0, 1, 1, 1);  // Can cause server/client mismatches

	    blueQuartz.setQuadNumber(2);

	    blueQuartz.setTexture(plugin.getDescription().getName(), "http://dl.dropbox.com/u/15813472/blueQuartz.png");

	    blueQuartz.setVertex(0, 0, 0F, 0F, 0.5F, 0, 0, 16, 16);
	    blueQuartz.setVertex(0, 1, 0F, 1F, 0.5F, 0, 16, 16, 16);
	    blueQuartz.setVertex(0, 2, 1F, 1F, 0.5F, 16, 16, 16, 16);
	    blueQuartz.setVertex(0, 3, 1F, 0F, 0.5F, 16, 0, 16, 16);

	    blueQuartz.setVertex(1, 0, 0.5F, 0F, 0F, 0, 0, 16, 16);
	    blueQuartz.setVertex(1, 1, 0.5F, 1F, 0F, 0, 16, 16, 16);
	    blueQuartz.setVertex(1, 2, 0.5F, 1F, 1F, 16, 16, 16, 16);
	    blueQuartz.setVertex(1, 3, 0.5F, 0F, 1F, 16, 0, 16, 16);

	    SpoutManager.getItemManager().setCustomBlockDesign(445, 0, blueQuartz);
		
		return blueQuartz;
	}

}
