package org.serverct.xiao_sgyg;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
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
		try {
			Version();
		} catch (IOException e) {
			getLogger().severe("An error occurres when check the plugin version!");
			e.printStackTrace();
		}
		Bukkit.getPluginCommand("PO").setExecutor((CommandExecutor) new POrderCommand());
		Bukkit.getPluginManager().registerEvents(new POrderEnchant(), this);
		Bukkit.getPluginManager().registerEvents(new POrderCraft(), this);
		Bukkit.getPluginManager().registerEvents(new POrderbrewing(), this);
		Bukkit.getPluginManager().registerEvents(new POrderFurnace(), this);
		Bukkit.getPluginManager().registerEvents(new POrderChat(), this);
		Bukkit.getPluginManager().registerEvents(new POrderAnvil(), this);
		Bukkit.getPluginManager().registerEvents(new POrderBreak(), this);
		Bukkit.getPluginManager().registerEvents(new POrderPlace(), this);
		Bukkit.getPluginManager().registerEvents(new POrderEntity(), this);
		Bukkit.getPluginManager().registerEvents(new POrderDrop(), this);
		Bukkit.getPluginManager().registerEvents(new POrderFishing(), this);
		Bukkit.getPluginManager().registerEvents(new POrderHold(), this);
		Bukkit.getPluginManager().registerEvents(new POrderLightningStrike(), this);
		Bukkit.getPluginManager().registerEvents(new POrderThunder(), this);
		Bukkit.getPluginManager().registerEvents(new POrderChange(), this);
		Bukkit.getPluginManager().registerEvents(new InventoryClick(),this);
		Bukkit.getPluginManager().registerEvents(new Debug(),this);
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

	public String getNewestVersion() throws IOException {
		URL url = new URL("https://api.github.com/repos/LovesAsuna/ProhibitionOrder/releases");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String version = reader.readLine().split(",") [7];
		String[] replace = {"tag_name","\"",":"};
		for (String cr :replace) {
			version = version.replace(cr,"");
		}
		reader.close();
		return version;
	}

	public void Version() throws IOException {
		String currentVersion = getDescription().getVersion();
		String newVersion = getNewestVersion();
		getServer().getConsoleSender().sendMessage("¡ì7[POrder] Plugin Enable");
		if (currentVersion.equalsIgnoreCase(newVersion)) {
			getServer().getConsoleSender().sendMessage("¡ì7[POrder]¡ì2You are using the newest " + currentVersion + " version");
		} else {
			getServer().getConsoleSender().sendMessage("¡ì7[POrder]¡ìcThe newest version is " + newVersion);
			getServer().getConsoleSender().sendMessage("¡ì7[POrder]¡ìcPlease download on https://www.spigotmc.org/resources/porder.71367/");
		}
	}
}
