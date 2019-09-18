package org.serverct.xiao_sgyg.command;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.serverct.xiao_sgyg.GUI.GUI;

import java.util.ArrayList;
import java.util.List;

import static org.serverct.xiao_sgyg.Main.getRuntime;

public class POrderCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,String label, String[] args) {

		if (command.getName().equalsIgnoreCase("PO")) {


			if (args.length == 0) {
				sender.sendMessage("��a===========��bPOrder��a===========");
				sender.sendMessage("��6/PO reload     ��areload the plugin");
				sender.sendMessage("��6/PO Break     ��cturn on/off the funtion of prohibiting breaking");
				sender.sendMessage("��6/PO Change     ��cturn on/off the funtion of prohibiting changing the weather");
				sender.sendMessage("��6/PO Chat     ��cturn on/off the funtion of curse/swear word filtering");
				sender.sendMessage("��6/PO Thunder     ��cturn on/off the funtion of prohibiting thundering");
				sender.sendMessage("��6/PO Fishing     ��cturn on/off the funtion of prohibiting fishing");
				sender.sendMessage("��6/PO Drop     ��cturn on/off the funtion of prohibiting droping");
				sender.sendMessage("��6/PO Place     ��cturn on/off the funtion of prohibiting placeing");
				sender.sendMessage("��a���롰/PO 2��     ��bnext page");
				sender.sendMessage("��a===========��bPOrder��a===========");

				return true;
			}

			if (args[0].equalsIgnoreCase("2")) {

				sender.sendMessage("��a===========��bPOrder��a===========");
				sender.sendMessage("��6/PO Enchant     ��cturn on/off the funtion of prohibiting enchanting");
				sender.sendMessage("��6/PO Craft     ��cturn on/off the funtion of prohibiting crafting");
				sender.sendMessage("��6/PO LightingStrike     ��cturn on/off the funtion of prohibiting fundering");
				sender.sendMessage("��6/PO Brew     ��cturn on/off the funtion of prohibiting brewing");
				sender.sendMessage("��6/PO Furnace     ��cturn on/off the funtion of prohibiting using furnace");
				sender.sendMessage("��6/PO Entity     ��cturn on/off the funtion of prohibiting non-player entity changing the block");
				sender.sendMessage("��6/PO Hold     ��cturn on/off the funtion of prohibiting holding an item");
				sender.sendMessage("��6/PO Anvil     ��cturn on/off the funtion of prohibiting using anvil");
				sender.sendMessage("��a===========��bPOrder��a===========");

				return true;
			}

			if (args[0].equalsIgnoreCase("reload")) {
				if(sender.hasPermission("PO.reload")||sender.isOp()){
					getRuntime().reloadConfig();
					sender.sendMessage("��b[POrder] ��areload success");
					return true;
				}

				if(!(sender.hasPermission("PO.reload"))){
					sender.sendMessage("��4You don't have the permission!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("Break")) {

				if (!(sender.hasPermission("PO.Break"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Break"))) {
					if (getRuntime().getConfig().getBoolean("Break.Switch")) {
						getRuntime().getConfig().set("Break.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bSuccess turning off the function of curse/swear word filtering��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Break.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aSuccess turning on the function of prohibiting breaking��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Change")) {

				if (!(sender.hasPermission("PO.Change"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Change"))) {
					if (getRuntime().getConfig().getBoolean("ChangeWeather.Switch")) {
						getRuntime().getConfig().set("ChangeWeather.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bSuccess turning on the function of prohibiting raining��");
						return true;
					}
					else {
						getRuntime().getConfig().set("ChangeWeather.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aSuccess turning on the function of prohibiting changing weather��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Chat")) {

				if (!(sender.hasPermission("PO.Chat"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Chat"))) {
					if (getRuntime().getConfig().getBoolean("Chat.Switch")) {
						getRuntime().getConfig().set("Chat.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bSuccess turning off the function of curse/swear word filtering��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Chat.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aSuccess turning on the function of curse/swear word filtering��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Thunder")) {

				if (!(sender.hasPermission("PO.Thunder"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Thunder"))) {
					if (getRuntime().getConfig().getBoolean("Thunder.Switch")) {
						getRuntime().getConfig().set("Thunder.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe prohibition of thunder has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Thunder.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe prohibition of thunder has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Fishing")) {

				if (!(sender.hasPermission("PO.Fishing"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Fishing"))) {
					if (getRuntime().getConfig().getBoolean("Fishing.Switch")) {
						getRuntime().getConfig().set("Fishing.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe ban on phishing has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Fishing.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe ban on phishing has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Drop")) {

				if (!(sender.hasPermission("PO.Drop"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Drop"))) {
					if (getRuntime().getConfig().getBoolean("Drop.Switch")) {
						getRuntime().getConfig().set("Drop.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe prohibition of discarding specified items has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Drop.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe function of forbidding the discarding of specified items has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Place")) {

				if (!(sender.hasPermission("PO.Place"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Place"))) {
					if (getRuntime().getConfig().getBoolean("Place.Switch")) {
						getRuntime().getConfig().set("Place.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe prohibition of placing specified items has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Place.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe prohibition of placing specified items has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Enchant")) {

				if (!(sender.hasPermission("PO.Enchant"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Enchant"))) {
					if (getRuntime().getConfig().getBoolean("Enchant.Switch")) {
						getRuntime().getConfig().set("Enchant.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bProhibited enchanted item has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Enchant.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe banned affiliation item has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Craft")) {

				if (!(sender.hasPermission("PO.Craft"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Craft"))) {
					if (getRuntime().getConfig().getBoolean("Craft.Switch")) {
						getRuntime().getConfig().set("Craft.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bProhibit compositing specified items has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Craft.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aProhibition of compositing specified items has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("LightingStrike")) {

				if (!(sender.hasPermission("PO.LightingStrike"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.LightingStrike"))) {
					if (getRuntime().getConfig().getBoolean("LightingStrike.Switch")) {
						getRuntime().getConfig().set("LightingStrike.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe lightning strike prevention function has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("LightingStrike.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe lightning strike prevention function has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Brew")) {

				if (!(sender.hasPermission("PO.Brew"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Brew"))) {
					if (getRuntime().getConfig().getBoolean("Brew.Switch")) {
						getRuntime().getConfig().set("Brew.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bProhibition of brewing has been successfully disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Brew.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aProhibition of brewing has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Furnace")) {

				if (!(sender.hasPermission("PO.Furnace"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Furnace"))) {
					if (getRuntime().getConfig().getBoolean("Furnace.Switch")) {
						getRuntime().getConfig().set("Furnace.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe function of prohibiting furnace burning of an item has been successful disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Furnace.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe function of prohibiting furnace burning of an item has been successfully enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Entity")) {


				if (!(sender.hasPermission("PO.Entity"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Entity"))) {
					if (getRuntime().getConfig().getBoolean("Entity.Switch")) {
						getRuntime().getConfig().set("Entity.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe function to prohibit non-player entities from changing blocks has been successful disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Entity.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe function to prohibit non-player entities from changing blocks has been successful enabled��");
						return true;
					}
				}
			}
			if (args[0].equalsIgnoreCase("Hold")) {

				if (!(sender.hasPermission("PO.Hold"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Hold"))) {
					if (getRuntime().getConfig().getBoolean("Hold.Switch")) {
						getRuntime().getConfig().set("Hold.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe ability to hold items in an item slot has been successful disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Hold.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe ability to hold items in an item slot has been successful enabled��");
						return true;
					}
				}


			}

			if (args[0].equalsIgnoreCase("Anvil")) {

				if (!(sender.hasPermission("PO.Anvil"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Anvil"))) {
					if (getRuntime().getConfig().getBoolean("Anvil.Switch")) {
						getRuntime().getConfig().set("Anvil.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bThe ban on the use of iron felt has been successful disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Anvil.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aThe ban on the use of iron felt has been successful enabled��");
						return true;
					}
				}
			}

			if (args[0].equalsIgnoreCase("debug")) {

				if (!(sender.hasPermission("PO.Debug"))) {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
				if ((sender.hasPermission("PO.Debug"))) {
					if (getRuntime().getConfig().getBoolean("Debug.Switch")) {
						getRuntime().getConfig().set("Debug.Switch", false);
						getRuntime().saveConfig();
						sender.sendMessage("��bDebug mode has been successful disabled��");
						return true;
					}
					else {
						getRuntime().getConfig().set("Debug.Switch", true);
						getRuntime().saveConfig();
						sender.sendMessage("��aDebug mode has been successful enabled��");
						return true;
					}
				}
			}

			if (args[0].equalsIgnoreCase("gui")) {
				if (sender instanceof Player) {
					Player player = (Player) sender;
					GUI gui = new GUI();
					Inventory inv = gui.addGUi();
					player.closeInventory();
					player.openInventory(inv);
					return true;
				} else {
					sender.sendMessage("You don't have the permission!");
					return true;
				}
			}

		}
		return false;
	}



}

