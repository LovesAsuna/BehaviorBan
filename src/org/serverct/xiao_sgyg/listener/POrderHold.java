package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class POrderHold implements Listener {

	@EventHandler
	public void onfly(PlayerItemHeldEvent e) {
		Player p = e.getPlayer();
		if (getRuntime().getConfig().getBoolean("Hold.Switch")) {
			if (!(p.hasPermission("POrder.Hold")||p.isOp())) {
				
				for (int s1 : getRuntime().getConfig().getIntegerList("Hold.HoldList")) {
			        if (e.getNewSlot() == s1) {
			        p.sendMessage(getRuntime().getConfig().getString("Hold.msg").replace("&", "¡ì"));
			        e.setCancelled(true);
			      }
				
			    }
				
			}
			
		}
	}
	
}
