package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class hosting implements CommandExecutor {
    public hosting() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.hosting")) {
            sender.sendMessage(Util.getString("Hosting"));
        }

        return false;
    }
}