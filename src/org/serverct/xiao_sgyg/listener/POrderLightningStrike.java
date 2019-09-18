package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

public class POrderLightningStrike implements Listener {

	@EventHandler
	public void onfly(LightningStrikeEvent e) {
		if (getRuntime().getConfig().getBoolean("LightingStrike.Switch")) {
			e.setCancelled(true);		
			}
		
	}
	
}
