package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class tiktok implements CommandExecutor {
    public tiktok() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetworks.tiktok")) {
            sender.sendMessage(Util.getString("TikTok"));
        }

        return false;
    }
}