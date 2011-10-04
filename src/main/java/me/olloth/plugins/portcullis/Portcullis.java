package me.olloth.plugins.portcullis;

import me.olloth.plugins.portcullis.generators.PortGenerator;
import me.olloth.plugins.portcullis.listeners.PortEntities;
import me.olloth.plugins.portcullis.listeners.PortPlayers;
import me.olloth.plugins.portcullis.listeners.PortBlocks;
import me.olloth.plugins.portcullis.listeners.PortSpout;
import me.olloth.plugins.portcullis.listeners.PortWeather;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;

public class Portcullis extends JavaPlugin {
	public static Portcullis instance;

	PluginManager pm;
	PortSpout spouts;
	PortEntities entities;
	PortWeather weathers;
	PortPlayers players;
	PortBlocks blocks;

	public void onDisable() {
		System.out.println(this + " is now disabled!");
	}

	public void onEnable() {
		instance = this;

		pm = getServer().getPluginManager();

		SpoutManager.getFileManager().addToPreLoginCache(this, "http://dl.dropbox.com/u/15813472/test.png");
		SpoutManager.getFileManager().addToPreLoginCache(this, "http://dl.dropbox.com/u/40267690/quartz.png");
		SpoutManager.getFileManager().addToPreLoginCache(this, "http://dl.dropbox.com/u/40267690/blueQuartz.png");

		spouts = new PortSpout(this);
		entities = new PortEntities(this);
		weathers = new PortWeather(this);
		players = new PortPlayers(this);
		blocks = new PortBlocks(this);

		pm.registerEvent(Type.CUSTOM_EVENT, spouts, Priority.Low, this);
		pm.registerEvent(Type.ENTITY_DAMAGE, entities, Priority.Low, this);
		pm.registerEvent(Type.WEATHER_CHANGE, weathers, Priority.Low, this);
		pm.registerEvent(Type.PLAYER_TOGGLE_SNEAK, players, Priority.Low, this);
		pm.registerEvent(Type.BLOCK_BREAK, blocks, Priority.Low, this);
		pm.registerEvent(Type.PLAYER_PICKUP_ITEM, players, Priority.Low, this);

		SpoutShapedRecipe recipe = new SpoutShapedRecipe(SpoutManager.getItemManager().getCustomItemStack(PortBlocks.blueQuartz, 1));
		recipe.shape("a");
		recipe.setIngredient('a', PortBlocks.quartz);
		System.out.println(SpoutManager.getItemManager().registerSpoutRecipe(recipe));
		System.out.println(PortBlocks.quartz.getRawData());

		System.out.println(this + " is now enabled!");
	}

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		return new PortGenerator();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		return super.onCommand(sender, command, label, args);

	}
}
