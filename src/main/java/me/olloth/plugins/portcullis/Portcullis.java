package me.olloth.plugins.portcullis;

import me.olloth.plugins.portcullis.generators.PortGenerator;
import me.olloth.plugins.portcullis.listeners.Entities;
import me.olloth.plugins.portcullis.listeners.Players;
import me.olloth.plugins.portcullis.listeners.Spouts;
import me.olloth.plugins.portcullis.listeners.Weathers;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Portcullis extends JavaPlugin {
	
	PluginManager pm;
	Spouts spouts;
	Entities entities;
	Weathers weathers;
	Players players;
	
    public void onDisable() {
        System.out.println(this + " is now disabled!");
    }

    public void onEnable() {
    	pm = getServer().getPluginManager();
    	spouts = new Spouts(this);
    	entities = new Entities(this);
    	weathers = new Weathers(this);
    	players = new Players(this);
    	
    	pm.registerEvent(Type.CUSTOM_EVENT,spouts,Priority.Low,this);
    	pm.registerEvent(Type.ENTITY_DAMAGE,entities,Priority.Low,this);
    	pm.registerEvent(Type.WEATHER_CHANGE, weathers, Priority.Low, this);
    	pm.registerEvent(Type.PLAYER_TOGGLE_SNEAK, players, Priority.Low, this);
    	
        System.out.println(this + " is now enabled!");
    }
    
    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
    	return new PortGenerator();
    }
}
