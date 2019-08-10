package com.fragmc.hub.events;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobSpawn implements Listener {
	public void onCreatureSpawn(CreatureSpawnEvent e) {
		e.setCancelled(true);
	}

}
