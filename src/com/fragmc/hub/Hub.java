package com.fragmc.hub;

import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.fragmc.hub.commands.SetSpawn;
import com.fragmc.hub.events.Blocks;
import com.fragmc.hub.events.Damage;
import com.fragmc.hub.events.ExampleSupplier;
import com.fragmc.hub.events.Inventories;
import com.fragmc.hub.events.Items;
import com.fragmc.hub.events.Join;
import com.fragmc.hub.events.MobSpawn;
import com.fragmc.hub.events.Move;
import com.fragmc.hub.events.UpdateInventory;
import com.fragmc.hub.scoreboard.ScoreboardManager;

import me.vertises.aztec.tablist.TablistManager;
import net.md_5.bungee.api.ChatColor;


public class Hub extends JavaPlugin {

	private static Hub instance;

	public Inventory inv = this.getServer().createInventory(null, 27, ChatColor.GRAY + "Select a Server");
	public Inventory ffa = this.getServer().createInventory(null, 9, ChatColor.GRAY + "Select an FFA");
	public Inventory sg = this.getServer().createInventory(null, 9, ChatColor.GRAY + "Select an SG");
	public Inventory hcf = this.getServer().createInventory(null, 9, ChatColor.GRAY + "Select an HCF");
	public Inventory bunkers = this.getServer().createInventory(null, 9, ChatColor.GRAY + "Select a Bunkers");

	ScoreboardManager sm;

	@SuppressWarnings("deprecation")
	public void onEnable() {

		instance = this;
		this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

		sm = new ScoreboardManager(this);

		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new Join(this), this);
		pm.registerEvents(new Items(this), this);
		pm.registerEvents(new Blocks(), this);
		pm.registerEvents(new Damage(), this);
		pm.registerEvents(new Inventories(), this);
		pm.registerEvents(new MobSpawn(), this);
		pm.registerEvents(new SetSpawn(), this);
		pm.registerEvents(new Move(), this);

		new TablistManager(this, new ExampleSupplier(), TimeUnit.SECONDS.toMillis(5L));

		for (Player all : this.getServer().getOnlinePlayers()) {
			sm.defaultBoard(all);
		}

		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for (Player all : Hub.this.getServer().getOnlinePlayers()) {
					sm.updateBoard(all);
				}
			}
		}, 0, 0);

		UpdateInventory ui = new UpdateInventory(this);
		ui.runTaskAsynchronously(this);

		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
	}

	public ScoreboardManager getScoreboardManager() {
		return sm;
	}

	public static Hub getInstance() {
		return instance;
	}
	
	public Location getSpawn(){
		return new Location(Bukkit.getWorld(getConfig().getString("spawn.world")), getConfig().getDouble("spawn.x"), getConfig().getDouble("spawn.y"), getConfig().getDouble("spawn.z"), getConfig().getInt("spawn.yaw"), getConfig().getInt("spawn.pitch"));
	}
	


		   @EventHandler(priority = EventPriority.HIGHEST)
		    public void DisableWeather(final WeatherChangeEvent event) {
		        event.setCancelled(event.toWeatherState());
		    }
	}



		
	

