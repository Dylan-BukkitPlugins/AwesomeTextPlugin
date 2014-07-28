package com.gmail.dylanpdx.AwesomeText;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class AwesomeTalkCommands implements CommandExecutor {
	private AwesomeText AwesomeText;
	boolean Success = false;
	
	public AwesomeTalkCommands(AwesomeText AwesomeText){
		
	
	}
	
	
	 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    	Success = false;
	    	if (sender instanceof Player) {
	               Player player = (Player) sender;
	               if (cmd.getName().toString().toUpperCase() == "AWESOMETEXT"){
	            	   if (args[0].toString().toUpperCase() == "TALK"){
	            		   player.chat("pootis"); // just testing
	            		   Success = true;
	            	   }else { Success = false; }
	               }
	              // player.chat("I AM A GOD!");
	            } else {
	               sender.sendMessage("Only players can speak AwesomeText!");
	               Success = true;
	            }
	            // do something
	    		if (Success == true) { 
	    			return true;} 
	    		else {return false;}
	    }
}
