package me.ondraeucz.socialnetworks;

import me.ondraeucz.socialnetworks.org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialNetworks extends JavaPlugin {
    private static SocialNetworks instance;

    public SocialNetworks() {
    }

    public void onEnable() {
        System.out.println("Plugin has started!");
        this.getLogger().warning("There is a new configuration on version 1.1, to update remove the old config");
        //start plugin and information

        this.getLogger().info("---------------------------------------");
        this.getLogger().info("SocialNetworks 1.4 version - ENABLE");
        this.getLogger().info("---------------------------------------");
        //annoucement console

        instance = this;
        this.saveDefaultConfig();

        int pluginId = 20471;
        Metrics metrics = new Metrics(this, pluginId);
        metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));
        //plugin data

        this.getCommand("discord").setExecutor(new discord());
        this.getCommand("facebook").setExecutor(new facebook());
        this.getCommand("instagram").setExecutor(new instagram());
        this.getCommand("tiktok").setExecutor(new tiktok());
        this.getCommand("twitter").setExecutor(new twitter());
        this.getCommand("website").setExecutor(new website());
        this.getCommand("youtube").setExecutor(new youtube());
        this.getCommand("store").setExecutor(new store());
        this.getCommand("teamspeak").setExecutor(new teamspeak());
        this.getCommand("hosting").setExecutor(new hosting());
        this.getCommand("socialnetworks").setExecutor(new reload());

        new UpdateCheck ( this , 113828 ) . getVersion ( version -> {
            if ( this . getDescription ( ) . getVersion ( ) . equals ( version ) ) {
                getLogger ( ) . info ( "There is not a new update available." ) ;
            } else {
                getLogger ( ) . info ( "There is a new update available." ) ;
                //Update check plugin
            }
        } ) ;
    }

    public void onDisable() {

        this.getLogger().info("---------------------------------------");
        this.getLogger().info("SocialNetworks 1.4 version - DISABLE");
        this.getLogger().info("---------------------------------------");
        //annoucement console {
    }

    public static SocialNetworks getInstance() {
        return instance;
    }
}
