package org.serverct.xiao_sgyg;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.serverct.xiao_sgyg.command.POrderCommand;
import org.serverct.xiao_sgyg.listener.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Main extends JavaPlugin{
	
	private static JavaPlugin plugin;

	public void onEnable() {
		plugin = this;
		saveDefaultConfig();
		getServer().getConsoleSender().sendMessage("[POrder] Plugin Enable");
		CheckRunnable checkVersion= new CheckRunnable();
		Thread check = new Thread(checkVersion);
		check.run();
		Listener[] listeners = {new POrderEnchant(),new POrderCraft(),new POrderbrewing(),new POrderFurnace(),new POrderChat(),new POrderAnvil(),new POrderBreak(),
				new POrderPlace(),new POrderEntity(),new POrderDrop(),new POrderFishing(),new POrderHold(),new POrderLightningStrike(),new POrderThunder(),
				new POrderChange(),new InventoryClick(),new Debug(),new Redstone(),new Bancommand()};
		for (Listener listener : listeners) {
			Bukkit.getPluginManager().registerEvents(listener,this);
		}
		reloadConfig();
		}
	
	public static JavaPlugin getRuntime(){
        if(plugin!=null){
            return plugin;
        }else {
            throw new IllegalStateException();
        }
    }
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("[POrder] Plugin Disenable");
	}

	class CheckRunnable implements Runnable {
		@Override
		public void run() {
			try {
				URL url = new URL("https://api.github.com/repos/LovesAsuna/ProhibitionOrder/releases");
				BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
				String newestversion = reader.readLine().split(",") [7];
				String currentVersion = getDescription().getVersion();
				String[] replace = {"tag_name","\"",":"};
				for (String cr :replace) {
					newestversion = newestversion.replace(cr,"");
				}
				reader.close();
				if (currentVersion.equalsIgnoreCase(newestversion)) {
					getServer().getConsoleSender().sendMessage("¡ì7[POrder]¡ì2You are using the newest " + currentVersion + " version");
				} else {
					getServer().getConsoleSender().sendMessage("¡ì7[POrder]¡ìcThe newest version is " + newestversion);
					getServer().getConsoleSender().sendMessage("¡ì7[POrder]¡ìcPlease download on https://www.spigotmc.org/resources/porder.71367/");
				}
			} catch (IOException e) {
				getLogger().severe("An error occurres when check the plugin version!");
				e.printStackTrace();
			}
		}
	}
}
