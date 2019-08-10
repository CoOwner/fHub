package com.fragmc.hub.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Move implements Listener {

	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if (p.getLocation().getY() <= 15) {
			p.teleport(Bukkit.getWorld(p.getWorld().getName()).getSpawnLocation());
		}
	}

}
