package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class twitter implements CommandExecutor {
    public twitter() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.twitter")) {
            sender.sendMessage(Util.getString("Twitter"));
        }

        return false;
    }
}
