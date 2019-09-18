package org.serverct.xiao_sgyg;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import org.serverct.xiao_sgyg.command.POrderCommand;
import org.serverct.xiao_sgyg.listener.*;


public class Main extends JavaPlugin{
	
	private static JavaPlugin plugin;

	public void onEnable() {
		plugin = this;
		saveDefaultConfig();
		getServer().getConsoleSender().sendMessage("[POrder] Plugin Enable");
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
}
