package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class POrderCraft implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(CraftItemEvent e) {
		if(getRuntime().getConfig().getBoolean("Craft.Switch")){
			for (int s1 : getRuntime().getConfig().getIntegerList("Craft.CraftList")) {
		        if (e.getRecipe().getResult().getTypeId() == s1) {
		        e.setCancelled(true);
		      }
			
		    }
				}
				
			}
		}
