package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.*;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

public class POrderEnchant implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(PrepareItemEnchantEvent e) {
		if(getRuntime().getConfig().getBoolean("Entity.Switch")){
			for (int s1 : getRuntime().getConfig().getIntegerList("Entity.EntityList")) {
		        if (e.getItem().getTypeId() == s1) {
		        e.setCancelled(true);
		      }
			
		    }
			}
		}
	}
