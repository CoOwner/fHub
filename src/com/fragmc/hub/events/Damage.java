package com.fragmc.hub.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Damage implements Listener {

	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onWeatherChange(WeatherChangeEvent event){
		event.getWorld().setWeatherDuration(0);
		event.getWorld().setStorm(false);
		event.getWorld().setThunderDuration(0);
	}
}