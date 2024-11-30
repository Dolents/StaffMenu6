package com.me.java.staffMenu;

import com.me.java.staffMenu.Commands.PunishCommand;
import com.me.java.staffMenu.Items.GameplayMenuItems;
import com.me.java.staffMenu.Menus.GameplayOffensesMenu;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import com.me.java.staffMenu.Menus.punishMenu;
import com.me.java.staffMenu.Commands.PunishCommand;

public final class Main extends JavaPlugin {

    private static Main instance;
    private punishMenu menuManager;
    private GameplayOffensesMenu gmMenuManager;

    @Override
    public void onEnable() {
        instance = this;
        menuManager = new punishMenu(this);
        gmMenuManager = new GameplayOffensesMenu(this);
        System.out.println(ChatColor.GREEN + "StaffMenu has loaded successfully");
        getCommand("punish").setExecutor(new PunishCommand(this, menuManager));
        getServer().getPluginManager().registerEvents(menuManager, this);
        getServer().getPluginManager().registerEvents(gmMenuManager, this);


    }

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "StaffMenu has been disabled");

    }

}
