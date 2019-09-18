package org.serverct.xiao_sgyg.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import static org.serverct.xiao_sgyg.Main.getRuntime;

import java.util.ArrayList;
import java.util.List;

public class GUI {

        ItemStack redstone = new ItemStack(Material.REDSTONE);//����
        ItemStack Brewing_stand = new ItemStack(Material.BREWING_STAND_ITEM);//����
        ItemStack creeper_head = new ItemStack(Material.SKULL);
        ItemStack enchant_table = new ItemStack(Material.ENCHANTMENT_TABLE);//��ħ
        ItemStack sign = new ItemStack(Material.SIGN);//�໰
        ItemStack fishing_rod = new ItemStack(Material.FISHING_ROD);//����
        ItemStack grass = new ItemStack(Material.GRASS);//����
        ItemStack diamond_pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);//�ƻ�
        ItemStack blaze_rod = new ItemStack(Material.BLAZE_ROD);//����
        ItemStack crafting_table = new ItemStack(Material.WORKBENCH);//�ϳ�
        ItemStack ender_pearl = new ItemStack(Material.ENDER_PEARL);//�ı�����
        ItemStack anvil = new ItemStack(Material.ANVIL);//ʹ������
        ItemStack diamond_boots = new ItemStack(Material.DIAMOND_BOOTS);//��ֹ�ֳ�
        ItemStack firework_star = new ItemStack(Material.FIREWORK_CHARGE);//��ֹ�׻�
        ItemStack nether_star = new ItemStack(Material.NETHER_STAR);//��ֹ����
        ItemStack furnace = new ItemStack(Material.FURNACE);//��¯
        ItemStack stick = new ItemStack(Material.STICK);//Debug
        //��Ʒ

        public Inventory addGUi() {
                Inventory inv = Bukkit.createInventory(null, 2 * 9, "��ePorder Control");

                setGUI(redstone,redstone.getItemMeta(),"��cReload","Reload this plugin");
                setGUI(fishing_rod,fishing_rod.getItemMeta(),"��bFishing","Prohibit fishing","Fishing.Switch");
                setGUI(enchant_table,enchant_table.getItemMeta(),"��aEnchant","Prohibit enchanting","Enchant.Switch");
                setGUI(fishing_rod,fishing_rod.getItemMeta(),"��bFishing","Prohibit fishing","Fishing.Switch");
                setGUI(fishing_rod,fishing_rod.getItemMeta(),"��bFishing","Prohibit fishing","Fishing.Switch");
                setGUI(fishing_rod,fishing_rod.getItemMeta(),"��bFishing","Prohibit fishing","Fishing.Switch");
                setGUI(Brewing_stand,Brewing_stand.getItemMeta(),"Brew","Prohibit brewing","Brew.Switch");
                setGUI(sign,sign.getItemMeta(),"��6Chat","Curse/swear word filtering","Chat.Switch");
                setGUI(anvil,anvil.getItemMeta(),"��eAnvil","Prohibit using anvil","Anvil.Switch");
                setGUI(crafting_table,crafting_table.getItemMeta(),"��aCraft","Craft.Switch");
                setGUI(furnace,furnace.getItemMeta(),"��cAnvil","Prohibit using furnace","Furnace.Switch");
                setGUI(diamond_boots,diamond_boots.getItemMeta(),"��bHolding","Prohibit holding specific item","Hold.Switch");
                setGUI(firework_star,firework_star.getItemMeta(),"��6LightingStrike","Prohibit lightingstrike","LightingStrike.Switch");
                setGUI(nether_star,nether_star.getItemMeta(),"��6Thudner","Prohibit thunder","Thunder.Switch");
                setGUI(diamond_pickaxe,diamond_pickaxe.getItemMeta(),"��cBreak","Prohibit breaking","Break.Switch");
                setGUI(grass,grass.getItemMeta(),"��aPlace","Prohibit placing","Place.Switch");
                setGUI(ender_pearl,ender_pearl.getItemMeta(),"��eChange weather","Prohibiting changing the weather","ChangeWeather.Switch");
                setGUI(stick,stick.getItemMeta(),"��cDebug Mode","��bSwitch Debug Mode","Debug.Switch");

                ItemStack[] IS = {redstone,fishing_rod,enchant_table,Brewing_stand,sign,anvil,crafting_table,furnace,diamond_boots,firework_star,nether_star,diamond_pickaxe,grass,ender_pearl,stick};
                int num = 0;
                for (ItemStack is : IS) {
                        inv.setItem(num,is);
                        num++;
                }
                return inv;
        }


        public void setGUI(ItemStack item,ItemMeta meta,String displayname,String lorename) {
                meta = diamond_boots.getItemMeta();
                meta.setDisplayName(displayname);
                List<String> lore = new ArrayList<>();
                lore.add(lorename);
                meta.setLore(lore);
                item.setItemMeta(meta);
        }

        public void setGUI(ItemStack item,ItemMeta meta,String displayname,String lorename,String path) {
                meta = diamond_boots.getItemMeta();
                meta.setDisplayName(displayname);
                List<String> lore = new ArrayList<>();
                lore.add(lorename);
                lore.add("��aStatus: "+ String.valueOf(getRuntime().getConfig().getBoolean(path)));
                meta.setLore(lore);
                item.setItemMeta(meta);
        }


}
