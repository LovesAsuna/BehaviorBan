package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

public class POrderAnvil implements Listener {

	@EventHandler
	public void onfly(PrepareAnvilEvent e) {
		if(getRuntime().getConfig().getBoolean("Anvil.Switch")){
			e.setResult(null);
		}
		
	}
	
}
