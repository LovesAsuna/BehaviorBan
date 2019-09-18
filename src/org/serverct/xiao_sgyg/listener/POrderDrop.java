package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class POrderDrop implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		if (getRuntime().getConfig().getBoolean("Drop.Switch")) {
			if (!(p.hasPermission("POrder.Drop")||p.isOp())) {
				for (int s1 : getRuntime().getConfig().getIntegerList("Drop.DropList")) {
			        if (e.getItemDrop().getItemStack().getTypeId() == s1) {
			        p.sendMessage(getRuntime().getConfig().getString("Drop.msg").replace("&", "¡ì"));
			        e.setCancelled(true);
			      }
				
			    }
			}
			
		}
		
	}
	
}
