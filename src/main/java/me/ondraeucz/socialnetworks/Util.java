package me.ondraeucz.socialnetworks;

import org.bukkit.ChatColor;

public class Util {
    public Util() {
    }

    public static String getString(String path) {
        return ChatColor.translateAlternateColorCodes('&', SocialNetworks.getInstance().getConfig().getString("Prefix") + " " + SocialNetworks.getInstance().getConfig().getString(path));
    }
}