package me.olloth.plugins.portcullis.blocks;

import me.olloth.plugins.portcullis.Portcullis;

import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;

public class Blocks {
	
	public static final int textureSize = 256;
	public static final int spriteSize = 16;
	public static final String textureUrl = "http://dl.dropbox.com/u/40267690/mooncraft.png";
//	public static final String textureUrl = "http://dl.dropbox.com/u/15813472/test.png";
	public static final Texture texture = new Texture(Portcullis.instance, textureUrl, textureSize, textureSize, spriteSize);
	
	public static HighlandDust highlandDust;
	public static Mare mare;
	public static Moonrock moonrock;
	public static Quartz quartz;
	public static BlueQuartz blueQuartz;
	
	public Blocks() {
		SpoutManager.getFileManager().addToPreLoginCache(Portcullis.instance, textureUrl);
		
		highlandDust = new HighlandDust();
		mare = new Mare();
		moonrock = new Moonrock();
		quartz = new Quartz();
		blueQuartz = new BlueQuartz();
	}
}
