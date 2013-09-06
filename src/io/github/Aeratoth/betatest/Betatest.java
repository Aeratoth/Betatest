package io.github.Aeratoth.betatest;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Betatest extends JavaPlugin {
    @Override
    public void onEnable(){
        // TODO Insert logic to be performed when the plugin is enabled
    	getLogger().info("onEnable has been invoked!");
    	// This will throw a NullPointerException if you don't have the command defined in your plugin.yml file!
    	getCommand("basic").setExecutor(new BetatestCommandExecutor(this));
    	getCommand("WhatAmI").setExecutor(new BetatestCommandExecutor(this));
    	getCommand("isonline").setExecutor(new BetatestCommandExecutor(this));
    }
 
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    	getLogger().info("onDisable has been invoked!");
    }
   

}


