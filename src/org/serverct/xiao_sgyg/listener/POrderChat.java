package org.serverct.xiao_sgyg.listener;

import static org.serverct.xiao_sgyg.Main.*;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class POrderChat implements Listener {

	@EventHandler
	public void onfly(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		if (getRuntime().getConfig().getBoolean("Chat.Switch")) {
			if (!(p.hasPermission("POrder.Chat")||p.isOp())) {
			    String msg = e.getMessage();
			    for (String s1 : getRuntime().getConfig().getStringList("Chat.ChatList")) {
			        if (msg.contains(s1)) {
			        p.sendMessage(getRuntime().getConfig().getString("Chat.msg").replace("&", "¡ì").replaceAll("%message%", msg + ""));
			        e.setCancelled(true);
			      }
				
			}
			
		}
	}
  }
}
