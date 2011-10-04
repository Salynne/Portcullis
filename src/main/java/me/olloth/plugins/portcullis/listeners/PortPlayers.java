package me.olloth.plugins.portcullis.listeners;

import me.olloth.plugins.portcullis.Portcullis;

import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

public class PortPlayers extends PlayerListener{
	Portcullis plugin;
	
	public PortPlayers(Portcullis plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
		SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
		if(event.isSneaking()) {
			player.setJumpingMultiplier(0.3);
		}
		else {
			player.setJumpingMultiplier(1);
		}
	}
	
	@Override
	public void onPlayerPickupItem(PlayerPickupItemEvent event) {
		super.onPlayerPickupItem(event);
		System.out.println(event.getItem().getItemStack().getTypeId() + " " + event.getItem().getItemStack().getDurability());
	}
}
