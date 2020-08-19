package io.github.homelyseven250.firstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello! This is a test.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("hello")){
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("hello.use")) {
                    player.sendMessage(ChatColor.AQUA + "Hello!");
                    return true;
                }
            player.sendMessage(ChatColor.RED + "You do not have permission!");
            }
            else {
                //console
                sender.sendMessage("Hey console!");
            }
            return true;
        }
        return false;
    }
}
