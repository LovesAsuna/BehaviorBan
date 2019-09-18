package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;


public class POrderChange implements Listener {
	
	@EventHandler
	public void onfly(WeatherChangeEvent e) {
		if (getRuntime().getConfig().getBoolean("ChangeWeather.Switch")) {
			if (e.toWeatherState()) {
				e.setCancelled(true);
			}
			else {
				e.setCancelled(true);
			}
		}
	}

}
