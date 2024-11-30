package com.me.java.staffMenu.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class GameplayMenuItems {

    public static ItemStack getGmSummary() {
        ItemStack item = new ItemStack(Material.GOAT_HORN);
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

    public static ItemStack getUnfair1Items() {
        ItemStack item = new ItemStack(Material.PAPER);
        ItemMeta meta = item.getItemMeta();

        if (meta != null) {
            meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "1ST OFFENSE");
            // Set custom lore for the item
            List<String> lore = Arrays.asList(
                    ChatColor.GRAY.toString() + "Cheating (Speedhacks, killaura, autoclicker, unfair advantage clients, glitching, etc.)",
                    ChatColor.RED.toString() + "Punishment Type " + ChatColor.GRAY.toString() + ChatColor.BOLD.toString() + ": " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "BAN",
                    ChatColor.RED.toString() + "Duration " + ChatColor.GRAY.toString() + ChatColor.BOLD.toString() + ": " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "365 Day Ban"
            );
            meta.setLore(lore);

            item.setItemMeta(meta);
        }
        return item;
    }

    public static ItemStack getUnfair2Items() {
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "2ND OFFENSE");
        // Set custom lore for the item
        List<String> lore = Arrays.asList(
                ChatColor.GRAY.toString() + "Cheating (Speedhacks, killaura, autoclicker, unfair advantage clients, glitching, etc.)",
                ChatColor.RED.toString() + "Punishment Type " + ChatColor.GRAY.toString() + ChatColor.BOLD.toString() + ": " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "BAN",
                ChatColor.RED.toString() + "Duration " + ChatColor.GRAY.toString() + ChatColor.BOLD.toString() + ": " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Permanent Ban"
        );
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack getUnfair3Items() {
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "3RD OFFENSE");
        // Set custom lore for the item
        List<String> lore = Arrays.asList(
                ChatColor.GRAY.toString() + "Cheating (Speedhacks, killaura, autoclicker, unfair advantage clients, glitching, etc.)",
                ChatColor.RED.toString() + "Punishment Type " + ChatColor.GRAY.toString() + ChatColor.BOLD.toString() + ": " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "BAN",
                ChatColor.RED.toString() + "Duration " + ChatColor.GRAY.toString() + ChatColor.BOLD.toString() + ": " + ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Blacklist"
        );
        meta.setLore(lore);

        item.setItemMeta(meta);

        return item;
    }
}
