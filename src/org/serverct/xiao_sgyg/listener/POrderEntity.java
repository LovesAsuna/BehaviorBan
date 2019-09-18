package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class POrderEntity implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(EntityChangeBlockEvent e) {
		Entity p = e.getEntity();
		if (getRuntime().getConfig().getBoolean("Entity.Switch")) {
			if (!(p.hasPermission("POrder.Entity")||p.isOp())) {
				
				for (int s1 : getRuntime().getConfig().getIntegerList("Entity.EntityList")) {
			        if (e.getBlock().getTypeId() == s1) {
			        e.setCancelled(true);
			      }
				
			    }
				
			}
		}
		
	}
	
}
