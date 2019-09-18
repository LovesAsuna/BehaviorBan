package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class POrderPlace implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(getRuntime().getConfig().getBoolean("Place.Switch")){
			if (!(p.hasPermission("POrder.Place"))) {
				
				for (int s1 : getRuntime().getConfig().getIntegerList("Place.PlaceList")) {
			        if (e.getBlock().getTypeId() == s1) {
			        p.sendMessage(getRuntime().getConfig().getString("Place.msg").replace("&", "§"));
			        e.setCancelled(true);
			      }
				
			    }
				
			}
			
		}
		
	}

}
