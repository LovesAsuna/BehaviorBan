package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;

public class POrderThunder implements Listener {

	@EventHandler
	public void onfly(ThunderChangeEvent e) {
		if (getRuntime().getConfig().getBoolean("THunder.Switch")) {
			e.setCancelled(true);		
			}
		
	}
	
}
