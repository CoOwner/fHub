package com.fragmc.hub.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Health implements Listener {

	@EventHandler
	public void onHealth(FoodLevelChangeEvent e) {
		e.setCancelled(true);
	}

}
