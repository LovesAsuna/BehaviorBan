package org.serverct.xiao_sgyg.listener;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import static org.serverct.xiao_sgyg.Main.getRuntime;

public class Debug implements Listener {
    @EventHandler
    public void debug(PlayerDropItemEvent e) {
        if (getRuntime().getConfig().getBoolean("Debug.Switch")) {
            Player player = (Player) e.getPlayer();
            player.sendMessage("��a=================Debug=================");
            player.sendMessage("��bMaterial:��e " + String.valueOf(e.getItemDrop().getItemStack().getType()));
            player.sendMessage("��bTypeID:��e " + String.valueOf(e.getItemDrop().getItemStack().getTypeId()));
            player.sendMessage("��a=================Debug=================");
        }
    }
}
