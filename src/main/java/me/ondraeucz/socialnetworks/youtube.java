package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class youtube implements CommandExecutor {
    public youtube() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.youtube")) {
            sender.sendMessage(Util.getString("Youtube"));
        }

        return false;
    }
}