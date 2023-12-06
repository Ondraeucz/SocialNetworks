package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class facebook implements CommandExecutor {
    public facebook() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.facebook")) {
            sender.sendMessage(Util.getString("Facebook"));
        }

        return false;
    }
}