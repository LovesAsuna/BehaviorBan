package org.serverct.xiao_sgyg.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class InventoryClick implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Inventory inv = e.getInventory();
        Player player = (Player) e.getWhoClicked();
        if (inv.getTitle().equals("¡ìePorder Control")) {

            switch (e.getRawSlot()) {
                case 0:
                    player.chat("/po reload");
                    e.setCancelled(true);
                    break;
                case 1:
                    player.chat("/po fishing");
                    e.setCancelled(true);
                    break;
                case 2:
                    player.chat("/po enchant");
                    e.setCancelled(true);
                    break;
                case 3:
                    player.chat("/po brew");
                    e.setCancelled(true);
                    break;
                case 4:
                    player.chat("/po chat");
                    e.setCancelled(true);
                    break;
                case 5:
                    player.chat("/po anvil");
                    e.setCancelled(true);
                    break;
                case 6:
                    player.chat("/po craft");
                    e.setCancelled(true);
                    break;
                case 7:
                    player.chat("/po furnace");
                    e.setCancelled(true);
                    break;
                case 8:
                    player.chat("/po hold");
                    e.setCancelled(true);
                    break;
                case 9:
                    player.chat("/po LightingStrike");
                    e.setCancelled(true);
                    break;
                case 10:
                    player.chat("/po Thunder");
                    e.setCancelled(true);
                    break;
                case 11:
                    player.chat("/po break");
                    e.setCancelled(true);
                    break;
                case 12:
                    player.chat("/po place");
                    e.setCancelled(true);
                    break;
                case 13:
                    player.chat("/po Change");
                    e.setCancelled(true);
                    break;
                case 14:
                    player.chat("/po debug");
                    e.setCancelled(true);
                    break;
            }
            player.closeInventory();
        }

    }
    }
