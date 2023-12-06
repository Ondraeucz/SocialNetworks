package me.ondraeucz.socialnetworks;

import org.bukkit.plugin.java.JavaPlugin;

public final class SocialNetworks extends JavaPlugin {
    private static SocialNetworks instance;

    public SocialNetworks() {
    }

    public void onEnable() {
        System.out.println("Plugin has started!");
        System.out.println("[WARN] There is a new configuration on version 1.1, to update remove the old config");
        instance = this;
        this.saveDefaultConfig();
        this.getCommand("discord").setExecutor(new discord());
        this.getCommand("facebook").setExecutor(new facebook());
        this.getCommand("instagram").setExecutor(new instagram());
        this.getCommand("tiktok").setExecutor(new tiktok());
        this.getCommand("twitter").setExecutor(new twitter());
        this.getCommand("website").setExecutor(new website());
        this.getCommand("youtube").setExecutor(new youtube());
        this.getCommand("store").setExecutor(new store());
        this.getCommand("teamspeak").setExecutor(new teamspeak());
        this.getCommand("socialnetworks").setExecutor(new reload());
    }

    public void onDisable() {
        System.out.println("Plugin has stopped!");
    }

    public static SocialNetworks getInstance() {
        return instance;
    }
}
