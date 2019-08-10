package com.fragmc.hub.events;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import com.fragmc.hub.Hub;

import net.md_5.bungee.api.ChatColor;

public class UpdateInventory extends BukkitRunnable {
	Hub plugin;

	public UpdateInventory(Hub plugin) {
		this.plugin = plugin;
	}

	public void run() {
		ItemStack practice = new ItemStack(Material.BOW);
		ItemMeta practicemeta = practice.getItemMeta();
		practicemeta.setDisplayName(ChatColor.RED + "Practice");
		practice.setItemMeta(practicemeta);

		ItemStack kitmap = new ItemStack(Material.ENDER_CHEST);
		ItemMeta kitmapmeta = kitmap.getItemMeta();
		kitmapmeta.setDisplayName(ChatColor.RED + "KitMap");
		kitmap.setItemMeta(kitmapmeta);

		ItemStack kitpvp = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta kitpvpmeta = kitpvp.getItemMeta();
		kitpvpmeta.setDisplayName(ChatColor.RED + "KitPvP");
		kitpvp.setItemMeta(kitpvpmeta);

		ItemStack hcf = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta hcfmeta = hcf.getItemMeta();
		hcfmeta.setDisplayName(ChatColor.RED + "HCF");
		hcf.setItemMeta(hcfmeta);
		
		ItemStack sg = new ItemStack(Material.FISHING_ROD);
		ItemMeta sgmeta = sg.getItemMeta();
		sgmeta.setDisplayName(ChatColor.RED + "SG");
		sg.setItemMeta(sgmeta);

		ItemStack bunkers = new ItemStack(Material.BEACON);
		ItemMeta bunkersmeta = bunkers.getItemMeta();
		bunkersmeta.setDisplayName(ChatColor.RED + "Bunkers");
		bunkers.setItemMeta(bunkersmeta);
		
		ItemStack dev = new ItemStack(Material.COMMAND);
		ItemMeta devmeta = dev.getItemMeta();
		devmeta.setDisplayName(ChatColor.RED + "Developement");
		dev.setItemMeta(devmeta);

		this.plugin.inv.setItem(0, practice);
		this.plugin.inv.setItem(2, kitpvp);
		this.plugin.inv.setItem(4, hcf);
		this.plugin.inv.setItem(6, kitmap);
		this.plugin.inv.setItem(8, sg);
		this.plugin.inv.setItem(12, bunkers);
		this.plugin.inv.setItem(14, dev);

		ItemStack hcf1 = new ItemStack(Material.DIAMOND_SWORD, 15);
		ItemMeta hcf1meta = hcf1.getItemMeta();
		hcf1meta.setDisplayName(ChatColor.RED + "Medium HCF");
		hcf1.setItemMeta(hcf1meta);

		ItemStack hcf2 = new ItemStack(Material.DIAMOND_SWORD, 4);
		ItemMeta hcf2meta = hcf2.getItemMeta();
		hcf2meta.setDisplayName(ChatColor.RED + "Mini HCF");
		hcf2.setItemMeta(hcf2meta);
		
		ItemStack hcf3 = new ItemStack(Material.DIAMOND_SWORD, 2);
		ItemMeta hcf3meta = hcf3.getItemMeta();
		hcf3meta.setDisplayName(ChatColor.RED + "Duo HCF");
		hcf3.setItemMeta(hcf3meta);
		
		this.plugin.hcf.setItem(0, hcf3);
		this.plugin.hcf.setItem(1, hcf2);
		this.plugin.hcf.setItem(2, hcf1);
		
		ItemStack sg1 = new ItemStack(Material.INK_SACK, 1, (byte) 10);
		ItemMeta sg1meta = sg1.getItemMeta();
		sg1meta.setDisplayName(ChatColor.RED + "SG 1");
		sg1.setItemMeta(sg1meta);

		ItemStack sg2 = new ItemStack(Material.INK_SACK, 2, (byte) 10);
		ItemMeta sg2meta = sg2.getItemMeta();
		sg2meta.setDisplayName(ChatColor.RED + "SG 2");
		sg2.setItemMeta(sg2meta);

		ItemStack sg3 = new ItemStack(Material.INK_SACK, 3, (byte) 10);
		ItemMeta sg3meta = sg3.getItemMeta();
		sg3meta.setDisplayName(ChatColor.RED + "SG 3");
		sg3.setItemMeta(sg3meta);

		ItemStack sg4 = new ItemStack(Material.INK_SACK, 4, (byte) 10);
		ItemMeta sg4meta = sg4.getItemMeta();
		sg4meta.setDisplayName(ChatColor.RED + "SG 4");
		sg4.setItemMeta(sg4meta);

		ItemStack sg5 = new ItemStack(Material.INK_SACK, 5, (byte) 10);
		ItemMeta sg5meta = sg5.getItemMeta();
		sg5meta.setDisplayName(ChatColor.RED + "SG 5");
		sg5.setItemMeta(sg5meta);

		this.plugin.sg.setItem(0, sg1);
		this.plugin.sg.setItem(1, sg2);
		this.plugin.sg.setItem(2, sg3);
		this.plugin.sg.setItem(3, sg4);
		this.plugin.sg.setItem(4, sg5);

		ItemStack bunkers1 = new ItemStack(Material.INK_SACK, 1, (byte) 10);
		ItemMeta bunkers1meta = bunkers1.getItemMeta();
		bunkers1meta.setDisplayName(ChatColor.RED + "Bunkers 1");
		bunkers1.setItemMeta(bunkers1meta);

		ItemStack bunkers2 = new ItemStack(Material.INK_SACK, 2, (byte) 10);
		ItemMeta bunkers2meta = bunkers2.getItemMeta();
		bunkers2meta.setDisplayName(ChatColor.RED + "Bunkers 2");
		bunkers2.setItemMeta(bunkers2meta);

		ItemStack bunkers3 = new ItemStack(Material.INK_SACK, 3, (byte) 10);
		ItemMeta bunkers3meta = bunkers3.getItemMeta();
		bunkers3meta.setDisplayName(ChatColor.RED + "Bunkers 3");
		bunkers3.setItemMeta(bunkers3meta);

		ItemStack bunkers4 = new ItemStack(Material.INK_SACK, 4, (byte) 10);
		ItemMeta bunkers4meta = bunkers4.getItemMeta();
		bunkers4meta.setDisplayName(ChatColor.RED + "Bunkers 4");
		bunkers4.setItemMeta(bunkers4meta);

		ItemStack bunkers5 = new ItemStack(Material.INK_SACK, 5, (byte) 10);
		ItemMeta bunkers5meta = bunkers5.getItemMeta();
		bunkers5meta.setDisplayName(ChatColor.RED + "Bunkers 5");
		bunkers5.setItemMeta(bunkers5meta);

		this.plugin.bunkers.setItem(0, bunkers1);
		this.plugin.bunkers.setItem(1, bunkers2);
		this.plugin.bunkers.setItem(2, bunkers3);
		this.plugin.bunkers.setItem(3, bunkers4);
		this.plugin.bunkers.setItem(4, bunkers5);
	}

}
