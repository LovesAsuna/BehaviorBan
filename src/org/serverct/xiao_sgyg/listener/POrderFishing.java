package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.getRuntime;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class POrderFishing implements Listener {

	@EventHandler
	public void onfly(PlayerFishEvent e) {
		Player p = e.getPlayer();
		if (getRuntime().getConfig().getBoolean("Fishing.Switch")) {
			if (!(p.hasPermission("POrder.Fishing")||p.isOp())) {
				
				e.setCancelled(true);
				p.sendMessage(getRuntime().getConfig().getString("Fishing.msg").replace("&", "��"));
				
			}
			
		}
		
	}
	
}
