package io.github.Aeratoth.betatest;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class BetatestCommandExecutor implements CommandExecutor {
private Betatest plugin; 
//pointer to your main class, unrequired if you don't need methods from the main class

public BetatestCommandExecutor(Betatest plugin){
	this.plugin = plugin;
}

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	  
	  
	  
	  if (cmd.getName().equalsIgnoreCase("isonline")){
		  
		  if (args.length > 0){
			  Player target = (Bukkit.getServer().getPlayer(args[0]));
			  if (target == null) {
				  sender.sendMessage(args[0] + " is not online.");
				  return true;
			  } else {
				  sender.sendMessage(args[0] + " is online");
				  return true;
			  }
		  } else {
			  sender.sendMessage("§cPlease specify a player.");
			  return false;
		  }
	  
	  
	  
	  
	  
  } else if (cmd.getName().equalsIgnoreCase("WhatAmI")){
		  if (sender instanceof Player){
			  //Show whether the one who placed the command is a player or is on the console.
			  Player player = (Player) sender;
			  sender.sendMessage("You are a player.");
			  //tells you you are a player
			  return true;
			  } else {
				  sender.sendMessage("You are an admin on the console.");
				  //tells you that you are using the console.
				  return true;
				  
			  }
		  
		  
		  
		  
	  }else if (cmd.getName().equalsIgnoreCase("basic")){
	  	// If the player typed /basic then do the following...
	  	if (!(sender instanceof Player)) {
	  		sender.sendMessage("This command can only be run by a player!");
	  		// send message that you can't do that.
	  		return false;
	  	} else {
	  		if (args.length > 1){
	  			sender.sendMessage("Too many Arguments!");
	  			return false;
	  		} else if (args.length < 1){
	  			sender.sendMessage("Too few arguments!");
	  			return false;
	  		} else {
	  		
	  		Player player = (Player) sender;
	  		sender.sendMessage("This command works.");
	  		// doSomething
	  		return true;
	  		}
	  	}
	  	
	  } //If this has happened the function will return true. 
          // If this hasn't happened the a value of false will be returned.
	  sender.sendMessage("I do not understand.");
	  return false; 
  }
}
