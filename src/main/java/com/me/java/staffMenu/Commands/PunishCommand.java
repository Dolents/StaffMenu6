package com.me.java.staffMenu.Commands;

import com.me.java.staffMenu.Main;
import com.me.java.staffMenu.Menus.GameplayOffensesMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.me.java.staffMenu.Menus.punishMenu;

public class PunishCommand implements CommandExecutor {
    private Main plugin;
    private punishMenu menuManager;
    private GameplayOffensesMenu gmMenuManager;

    public PunishCommand(Main plugin, punishMenu menuManager) {
        this.plugin = plugin;
        this.menuManager = menuManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Check if the sender is a player
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Check if the player has the permission to use this command
            if (!player.hasPermission("staffmenu.punish")) {
                player.sendMessage("You do not have permission to use this command.");
                return false; // Return false to indicate command wasn't executed
            }

            // Ensure the player has provided enough arguments
            if (args.length < 1) {
                player.sendMessage("Usage: /punish <player>");
                return false;
            }

            // First argument is the target player's name
            String targetPlayerName = args[0];

            // Add your punishment logic here (e.g., ban, kick, etc.)
            return true; // Command executed successfully
        }

        // If the sender is not a player (e.g., console), inform them
        sender.sendMessage("This command can only be used by a player.");
        return false; // Return false for non-player senders
    }
}

