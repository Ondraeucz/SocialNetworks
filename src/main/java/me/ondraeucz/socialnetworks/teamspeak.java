package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class teamspeak implements CommandExecutor {
    public teamspeak() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.teamspeak")) {
            sender.sendMessage(Util.getString("TeamSpeak"));
        }

        return false;
    }
}
