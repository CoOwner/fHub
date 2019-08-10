package com.fragmc.hub.events;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.fragmc.hub.Hub;
import com.fragmc.hub.events.utils.DataFetcher;
import com.fragmc.hub.scoreboard.Translator;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import me.signatured.ezqueueshared.QueueInfo;
import me.vertises.aztec.tablist.TablistEntrySupplier;

public class ExampleSupplier implements TablistEntrySupplier {
	@Override
	public Table<Integer, Integer, String> getEntries(final Player player) {
		final int playerPing = ((CraftPlayer)player).getHandle().ping;
		final Table<Integer, Integer, String> table = HashBasedTable.create();
		
		table.put(1, 0, (ChatColor.translateAlternateColorCodes('&',
				Hub.getInstance().getConfig().getString("tab.server-name"))));
		
		
		table.put(1, 4, ChatColor.RED + "Practice: " + ChatColor.GRAY + DataFetcher.getPlayerCountPractice() + "§7/350");
		
		table.put(0, 4, ChatColor.RED + "Online:");
		table.put(0, 5, ChatColor.RED + "§7" + ChatColor.GRAY + Translator.getPlayerCount());
		
		table.put(0, 7, ChatColor.RED + "Name: ");
		table.put(0, 8, ChatColor.RED + "§7" + player.getDisplayName());
		
		table.put(0, 10, ChatColor.RED + "Ping: ");
		table.put(0, 11, ChatColor.RED + "§7" + + playerPing);
		
		table.put(1, 2, ChatColor.RED + "" + ChatColor.BOLD + "Server Info");
		table.put (1, 10, ChatColor.RED + "Kit Map: " + ChatColor.GRAY + DataFetcher.getPlayerCountKitMap() + "§7/350");
		table.put(1, 6, ChatColor.RED + "KitPvP: " + ChatColor.GRAY + DataFetcher.getPlayerCountFFA2()  + "§7/250");
		table.put(1, 8, ChatColor.RED + "Bunkers: " + ChatColor.GRAY + DataFetcher.getPlayerCountRaids() + "§7/100");
		table.put(1, 12, ChatColor.RED + "SG: " + ChatColor.GRAY + DataFetcher.getPlayerCountSg() + "§7/100");
		table.put(2, 4, ChatColor.RED + "Medium HCF: " + ChatColor.GRAY + DataFetcher.getPlayerCountHCF1() + "§7/450");
		table.put(2, 5, ChatColor.GRAY + "15 Man, 0 Allies");
		table.put(2, 6, ChatColor.GRAY + "Prot 1, Sharp 1");
		table.put(2, 8, ChatColor.RED + "Mini HCF: " + ChatColor.GRAY + DataFetcher.getPlayerCountHCF2() + "/450");
		table.put(2, 9, ChatColor.GRAY + "4 Man, 0 Allies");
		table.put(2, 10, ChatColor.GRAY + "Prot 1, Sharp 1");
		
		table.put(2, 12, ChatColor.RED + "Duo HCF: " + ChatColor.GRAY + DataFetcher.getPlayerCountHCF2() + "§7/450");
		table.put(2, 13, ChatColor.GRAY + "2 Man, 0 Allies");
		table.put(2, 14, ChatColor.GRAY + "Prot 1, Sharp 1");
		
		
		table.put(0, 13, ChatColor.RED + "" + ChatColor.BOLD + "Queue Info");
		
		
		table.put(1, 18, ChatColor.RED + "§cTeamspeak:");
		table.put(0, 18, ChatColor.RED + "§cWebsite:");
		table.put(2, 18, ChatColor.RED + "§cStore:");
		
		
		
		table.put(1, 19, ChatColor.RED + "§7ts.fragmc.com");
		table.put(0, 19, ChatColor.RED + "§7www.fragmc.com");
		table.put(2, 19, ChatColor.RED + "§7store.fragmc.com");
		if (QueueInfo.getQueue(player.getName()) != null) {
			table.put(0, 14, ChatColor.GRAY + "Position: " + QueueInfo.getPosition(player.getName()) + "/"
					+ QueueInfo.getQueueInfo(QueueInfo.getQueue(player.getName())).getSize());
			table.put(0, 15, ChatColor.GRAY + "Server: " + QueueInfo.getQueue(player.getName()));
		}
		if (QueueInfo.getQueue(player.getName()) == null) {
			table.put(0, 14, ChatColor.GRAY + "Position: N/A");
			table.put(0, 15, ChatColor.GRAY + "Server: N/A");
		}
		return table;
	}

	@Override
	public String getHeader(final Player player) {
		return null;
	}

	@Override
	public String getFooter(final Player player) {
		return null;
	}
}