package org.serverct.xiao_sgyg.listener;
import static org.serverct.xiao_sgyg.Main.*;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;

public class POrderbrewing implements Listener {
	
	@EventHandler
	public void onfly(BrewEvent e) {
		if(getRuntime().getConfig().getBoolean("Brew.Switch")){
                    e.setCancelled(true);
					return;
				}
			}
			
		}
		
	
	
