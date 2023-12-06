package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class instagram implements CommandExecutor {
    public instagram() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.instagram")) {
            sender.sendMessage(Util.getString("Instagram"));
        }

        return false;
    }
}