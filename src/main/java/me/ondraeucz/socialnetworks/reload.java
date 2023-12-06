package me.ondraeucz.socialnetworks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class reload implements CommandExecutor {
    public reload() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("socialnetwork.reload") && args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            SocialNetworks.getInstance().reloadConfig();
            sender.sendMessage(Util.getString("Reload"));
        }

        return false;
    }
}