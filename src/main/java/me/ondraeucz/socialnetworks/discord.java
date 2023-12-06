package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class discord implements CommandExecutor {
    public discord() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.discord")) {
            sender.sendMessage(Util.getString("Discord"));
        }

        return false;
    }
}