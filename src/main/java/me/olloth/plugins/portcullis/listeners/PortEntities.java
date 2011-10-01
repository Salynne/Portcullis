package me.olloth.plugins.portcullis.listeners;

import me.olloth.plugins.portcullis.Portcullis;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityListener;

public class PortEntities extends EntityListener {
	Portcullis plugin;
	
	public PortEntities(Portcullis plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void onEntityDamage(EntityDamageEvent event) {
		if (event.getCause().equals(DamageCause.FALL)) {
			event.setCancelled(true);
		}
	}
}
