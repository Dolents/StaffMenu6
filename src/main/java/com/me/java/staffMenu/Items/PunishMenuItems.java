package com.me.java.staffMenu.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class PunishMenuItems {

    public static ItemStack getBanItems() {
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = item.getItemMeta();

        if (meta != null) {
            meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "GAMEPLAY OFFENSES");
            // Set custom lore for the item
            List<String> lore = Arrays.asList(
                    ChatColor.GRAY.toString() + "Examples of " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Gameplay Offenses" + ChatColor.GRAY.toString() + ":",
                    ChatColor.GRAY.toString() + "Cheating (Speedhacks, killaura, autoclicker, unfair advantage clients, glitching, etc.)",
                    ChatColor.GRAY.toString() + "Outcomes: usually substantiates with a " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "BAN"
            );
            meta.setLore(lore);

            item.setItemMeta(meta);
        }
        return item;
    }

    public static ItemStack getMuteItems() {
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "CHAT OFFENSES");
            // Set custom lore for the item
            List<String> lore = Arrays.asList(
                    ChatColor.GRAY.toString() + "Examples of " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Chat Offenses" + ChatColor.GRAY.toString() + ":",
                    ChatColor.GRAY.toString() + "Slurs, racism, discrimination, excessive swearing, etc.",
                    ChatColor.GRAY.toString() + "Outcomes: usually substantiates with a " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "MUTE"
            );
            meta.setLore(lore);

            item.setItemMeta(meta);

        return item;
    }
}
