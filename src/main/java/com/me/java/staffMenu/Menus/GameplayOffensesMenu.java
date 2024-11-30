package com.me.java.staffMenu.Menus;

import com.me.java.staffMenu.Items.GameplayMenuItems;
import com.me.java.staffMenu.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class GameplayOffensesMenu implements Listener {

    private String targetPlayer;
    private Main plugin;
    private GameplayOffensesMenu gmMenuManager;

    public GameplayOffensesMenu(Main plugin) {
        this.plugin = plugin;
        this.gmMenuManager = gmMenuManager;
    }

    public void openGMGUI(Player player) {

        Inventory gmgui = Bukkit.createInventory(null, 54, "Gameplay Offenses");

        gmgui.setItem(22, GameplayMenuItems.getUnfair1Items());
        gmgui.setItem(31, GameplayMenuItems.getUnfair2Items());
        gmgui.setItem(40, GameplayMenuItems.getUnfair3Items());
        gmgui.setItem(13, GameplayMenuItems.getGmSummary());

        player.openInventory(gmgui);

    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        Inventory inventory = event.getInventory();
        Player player = (Player) event.getWhoClicked();

        if (event.getView().getTitle().equals("Gameplay Offenses")) {
            // Prevent taking the item out of the inventory
            if (event.getClickedInventory() != null && event.getClickedInventory().equals(inventory)) {
                event.setCancelled(true); // Prevent taking items out of the inventory
            }

            // Handle specific item clicks (custom actions)
            if (event.getSlot() == 22) { // Example: handle the first slot
                player.performCommand(command);
                // You can add more actions here based on the item clicked
                // e.g., open another menu, perform actions, etc.
            }
            if (event.getSlot() == 31) {
                player.openInventory(command);
                String targetPlayer =
            }
            if (event.getSlot() == 40) { // Example: handle the first slot
                player.openInventory(command);
                // You can add more actions here based on the item clicked
                // e.g., open another menu, perform actions, etc.
            }
            if (event.getSlot() == 13) { // Example: handle the first slot
                event.setCancelled(true);
                // You can add more actions here based on the item clicked
                // e.g., open another menu, perform actions, etc.
            }
        }
    }


}