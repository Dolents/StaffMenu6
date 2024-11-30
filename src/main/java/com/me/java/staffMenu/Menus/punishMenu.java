package com.me.java.staffMenu.Menus;

import com.me.java.staffMenu.Items.PunishMenuItems;
import com.me.java.staffMenu.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import com.me.java.staffMenu.Menus.GameplayOffensesMenu;

import java.net.http.WebSocket;

public class punishMenu implements Listener {
    private Main plugin;
    private GameplayOffensesMenu gmMenuManager;

    public punishMenu(Main plugin) {
        this.plugin = plugin;
    }

    public void openGUI(Player player) {

        Inventory gui = Bukkit.createInventory(null, 54, "Punishment Menu");

        gui.setItem(21, PunishMenuItems.getBanItems());
        gui.setItem(23, PunishMenuItems.getMuteItems());

        player.openInventory(gui);

    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        Inventory inventory = event.getInventory();
        Player player = (Player) event.getWhoClicked();

        if (event.getView().getTitle().equals("Punishment Menu")) {
            // Prevent taking the item out of the inventory
            if (event.getClickedInventory() != null && event.getClickedInventory().equals(inventory)) {
                event.setCancelled(true); // Prevent taking items out of the inventory
            }

            // Handle specific item clicks (custom actions)
            if (event.getSlot() == 21) { // Example: handle the first slot
                player.openInventory(openGMGUI);
                // You can add more actions here based on the item clicked
                // e.g., open another menu, perform actions, etc.
            }
            if (event.getSlot() == 23) { // Example: handle the first slot
                player.openInventory(ChatOffensesMenu);
                // You can add more actions here based on the item clicked
                // e.g., open another menu, perform actions, etc.
            }
        }
    }


}
