package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.*;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class POrderBreak implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onfly(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if (getRuntime().getConfig().getBoolean("Break.Switch")) {
			if (!(p.hasPermission("POrder.Break")||p.isOp())) {
				
				for (int s1 : getRuntime().getConfig().getIntegerList("Break.BreakList")) {
			        if (e.getBlock().getTypeId() == s1) {
			        p.sendMessage(getRuntime().getConfig().getString("Break.msg").replace("&", "¡ì"));
			        e.setCancelled(true);
			      }
				
			    }
			}
		}
	}
	
}
