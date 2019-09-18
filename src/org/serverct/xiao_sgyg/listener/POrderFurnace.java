package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.*;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

public class POrderFurnace implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(FurnaceSmeltEvent e) {
		if (getRuntime().getConfig().getBoolean("Hold.Switch")) {
			for (int s1 : getRuntime().getConfig().getIntegerList("Hold.HoldList")) {
		        if (e.getResult().getTypeId() == s1 || e.getResult().getType().equals(s1)) {
		        e.setCancelled(true);
		      }
			
		    }
			
		}
		
	}
	
}
