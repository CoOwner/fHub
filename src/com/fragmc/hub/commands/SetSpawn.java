package com.fragmc.hub.commands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.fragmc.hub.Hub;

import net.md_5.bungee.api.ChatColor;

public class SetSpawn implements Listener {

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		if (e.getMessage().equalsIgnoreCase("/setspawn")) {
			if (!p.hasPermission("owner.setspawn")) {
				p.sendMessage(ChatColor.RED + "No permission.");
				return;
			}
			
			Hub.getInstance().getConfig().set("spawn.x", p.getLocation().getX());
			Hub.getInstance().getConfig().set("spawn.y", p.getLocation().getY());
			Hub.getInstance().getConfig().set("spawn.z", p.getLocation().getZ());
			Hub.getInstance().getConfig().set("spawn.yaw", p.getLocation().getYaw());
			Hub.getInstance().getConfig().set("spawn.pitch", p.getLocation().getPitch());
			
			p.sendMessage(ChatColor.GREEN + "Spawn set.");
			return;
		}
	}
	
	

}
