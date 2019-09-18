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
            player.sendMessage("¡ìa=================Debug=================");
            player.sendMessage("¡ìbMaterial:¡ìe " + String.valueOf(e.getItemDrop().getItemStack().getType()));
            player.sendMessage("¡ìbTypeID:¡ìe " + String.valueOf(e.getItemDrop().getItemStack().getTypeId()));
            player.sendMessage("¡ìa=================Debug=================");
        }
    }
}
