package com.fragmc.hub.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.fragmc.hub.Hub;
import com.fragmc.hub.scoreboard.ScoreboardManager;

import net.md_5.bungee.api.ChatColor;

public class Join implements Listener {
	Hub plugin;

	public Join(Hub plugin) {
		this.plugin = plugin;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		ScoreboardManager sm = this.plugin.getScoreboardManager();

		ItemStack compass = new ItemStack(Material.COMPASS);
		ItemMeta compassmeta = compass.getItemMeta();
		compassmeta.setDisplayName(ChatColor.RED + "Select a Server");
		compass.setItemMeta(compassmeta);

		e.setJoinMessage(null);
		sm.defaultBoard(p);
		p.getInventory().clear();
		p.getInventory().setArmorContents(null);
		p.setHealth(20.0);
		p.setFoodLevel(20);
		p.getInventory().setItem(4, compass);
		p.getInventory().setHeldItemSlot(4);
		p.updateInventory();
		
		p.performCommand("help");

		for (Player all : this.plugin.getServer().getOnlinePlayers()) {
			all.hidePlayer(p);
			p.hidePlayer(all);
		}
		p.setWalkSpeed((float) 0.3);
		p.teleport(Hub.getInstance().getSpawn());
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}
}
