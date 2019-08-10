package com.fragmc.hub.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.fragmc.hub.Hub;

import me.signatured.ezqueuespigot.util.EzQueueUtil;
import net.md_5.bungee.api.ChatColor;

public class Inventories implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		ItemStack practice = new ItemStack(Material.BOW);
		ItemMeta practicemeta = practice.getItemMeta();
		practicemeta.setDisplayName(ChatColor.RED + "Practice");
		//practicemeta.setLore(practiceLore);
		practice.setItemMeta(practicemeta);

		ItemStack kitmap = new ItemStack(Material.ENDER_CHEST);
		ItemMeta kitmapmeta = kitmap.getItemMeta();
		kitmapmeta.setDisplayName(ChatColor.RED + "KitMap");
		//kitmapmeta.setLore(kitMapLore);
		kitmap.setItemMeta(kitmapmeta);
		
		ItemStack dev = new ItemStack(Material.COMMAND);
		ItemMeta devmeta = dev.getItemMeta();
		devmeta.setDisplayName(ChatColor.RED + "Developement");
		dev.setItemMeta(devmeta);

		ItemStack kitpvp = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta kitpvpmeta = kitpvp.getItemMeta();
		kitpvpmeta.setDisplayName(ChatColor.RED + "KitPvP");
		//kitpvpmeta.setLore(kitpvp1Lore);
		kitpvp.setItemMeta(kitpvpmeta);

		ItemStack sg = new ItemStack(Material.FISHING_ROD);
		ItemMeta sgmeta = sg.getItemMeta();
		sgmeta.setDisplayName(ChatColor.RED + "SG");
		sg.setItemMeta(sgmeta);

		ItemStack bunkers = new ItemStack(Material.BEACON);
		ItemMeta bunkersmeta = bunkers.getItemMeta();
		bunkersmeta.setDisplayName(ChatColor.RED + "Bunkers");
		bunkers.setItemMeta(bunkersmeta);

		ItemStack potion = new ItemStack(Material.POTION);
		ItemMeta potion_meta = potion.getItemMeta();
		potion_meta.setDisplayName(ChatColor.RED + "Potion");
		potion.setItemMeta(potion_meta);

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

		ItemStack hcf = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta hcfmeta = hcf.getItemMeta();
		hcfmeta.setDisplayName(ChatColor.RED + "HCF");
		hcf.setItemMeta(hcfmeta);
		
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

		if (!p.isOp() || e.getInventory().getName().equals(Hub.getInstance().inv.getName())
				|| e.getInventory().getName().equals(Hub.getInstance().bunkers.getName())
				|| e.getInventory().getName().equals(Hub.getInstance().ffa.getName())
				|| e.getInventory().getName().equals(Hub.getInstance().sg.getName()) || e.getInventory().getName().equals(Hub.getInstance().hcf.getName())) {
			e.setCancelled(true);
		}
		if (e.getInventory().getName().equals(Hub.getInstance().inv.getName())) {
			if (e.getCurrentItem() != null && e.getCurrentItem().equals(practice)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "practice");
			}
		}
		if (e.getInventory().getName().equals(Hub.getInstance().inv.getName())) {
			if (e.getCurrentItem() != null && e.getCurrentItem().equals(dev)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "dev");
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().inv.getName())) {
			if (e.getCurrentItem().equals(kitmap)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "kitmap");
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().hcf.getName())) {
			if (e.getCurrentItem().equals(hcf1)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "medium");
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().hcf.getName())) {
			if (e.getCurrentItem().equals(hcf2)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "mini");
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().hcf.getName())) {
			if (e.getCurrentItem().equals(hcf3)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "duo");
			}
		}
		if (e.getCurrentItem() != null && e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().sg.getName())) {
			if (e.getCurrentItem().equals(sg1)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "sg1");
			}
		}
		if (e.getCurrentItem() != null && e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().sg.getName())) {
			if (e.getCurrentItem().equals(sg2)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "sg2");
			}
		}
		if (e.getCurrentItem() != null && e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().sg.getName())) {
			if (e.getCurrentItem().equals(sg3)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "sg3");
			}
		}
		if (e.getCurrentItem() != null && e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().sg.getName())) {
			if (e.getCurrentItem().equals(sg4)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "sg4");
			}
		}
		if (e.getCurrentItem() != null && e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().sg.getName())) {
			if (e.getCurrentItem().equals(sg5)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "sg5");
			}
		}
		if (e.getCurrentItem() != null
				&& (e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().inv.getName()))) {
			if (e.getCurrentItem().equals(kitpvp)) {
				EzQueueUtil.sendJoinRequest(p, "kitpvp");
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().inv.getName())) {
			if (e.getCurrentItem().equals(hcf)) {
				p.openInventory(Hub.getInstance().hcf);
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().inv.getName())) {
			if (e.getCurrentItem().equals(sg)) {
				p.openInventory(Hub.getInstance().sg);
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().inv.getName())) {
			if (e.getCurrentItem().equals(bunkers)) {
				p.openInventory(Hub.getInstance().bunkers);
			}
		}
		if (e.getCurrentItem() != null
				&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().bunkers.getName())) {
			if (e.getCurrentItem().equals(bunkers1)) {
				p.closeInventory();
				EzQueueUtil.sendJoinRequest(p, "raids1");
			}
			if (e.getCurrentItem() != null
					&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().bunkers.getName())) {
				if (e.getCurrentItem().equals(bunkers2)) {
					p.closeInventory();
					EzQueueUtil.sendJoinRequest(p, "raids2");
				}
			}
			if (e.getCurrentItem() != null
					&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().bunkers.getName())) {
				if (e.getCurrentItem().equals(bunkers3)) {
					p.closeInventory();
					EzQueueUtil.sendJoinRequest(p, "raids3");
				}
			}
			if (e.getCurrentItem() != null
					&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().bunkers.getName())) {
				if (e.getCurrentItem().equals(bunkers4)) {
					p.closeInventory();
					EzQueueUtil.sendJoinRequest(p, "raids4");
				}
				if (e.getCurrentItem() != null
						&& e.getInventory().getName().equalsIgnoreCase(Hub.getInstance().bunkers.getName())) {
					if (e.getCurrentItem().equals(bunkers5)) {
						p.closeInventory();
						EzQueueUtil.sendJoinRequest(p, "raids5");
					}
				}
			}
		}
	}
}
