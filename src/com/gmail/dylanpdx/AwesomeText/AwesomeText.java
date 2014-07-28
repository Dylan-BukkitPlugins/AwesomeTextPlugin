

package com.gmail.dylanpdx.AwesomeText;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;
public final class AwesomeText extends JavaPlugin implements Listener {
	//Defining the texts to use...
    String AweBoldA = "░█▀▀█ ~▒█▄▄█ ~▒█░▒█ "; //Bold uppercase a and so on...
    String AweBoldB = "▒█▀▀█ ~▒█▀▀▄ ~▒█▄▄█ ";
    String AweBoldC = "▒█▀▀█ ~▒█░░░ ~▒█▄▄█ ";
    String AweBoldD = "▒█▀▀▄ ~▒█░▒█ ~▒█▄▄▀ ";
    String AweBoldE = "▒█▀▀▀ ~▒█▀▀▀ ~▒█▄▄▄ ";
    String AweBoldF = "▒█▀▀▀ ~▒█▀▀▀ ~▒█░░░ ";
    String AweBoldG = "▒█▀▀█ ~▒█░▄▄ ~▒█▄▄█ ";
    String AweBoldH = "▒█░▒█ ~▒█▀▀█ ~▒█░▒█ ";
    String AweBoldI = "▀█▀ ~▒█░ ~▄█▄ ";
    String AweBoldJ = "░░░▒█ ~░▄░▒█ ~▒█▄▄█";
    String AweBoldK = "▒█░▄▀ ~▒█▀▄░ ~▒█░▒█ ";
    String AweBoldL = "▒█░░░ ~▒█░░░ ~▒█▄▄█ ";
    String AweBoldM = "▒█▀▄▀█ ~▒█▒█▒█ ~▒█░░▒█ ";
    String AweBoldN = "▒█▄░▒█ ~▒█▒█▒█ ~▒█░░▀█ ";
    String AweBoldO = "▒█▀▀▀█ ~▒█░░▒█ ~▒█▄▄▄█ ";
    String AweBoldP = "▒█▀▀█ ~▒█▄▄█ ~▒█░░░ ";
    String AweBoldQ = "▒█▀▀█ ~▒█░▒█ ~░▀▀█▄ ";
    String AweBoldR = "▒█▀▀█ ~▒█▄▄▀ ~▒█░▒█ ";
    String AweBoldS = "▒█▀▀▀█ ~░▀▀▀▄▄ ~▒█▄▄▄█ ";
    String AweBoldT = "▀▀█▀▀ ~░▒█░░ ~░▒█░░ ";
    String AweBoldU = "▒█░▒█ ~▒█░▒█ ~░▀▄▄▀ ";
    String AweBoldV = "▒█░░▒█ ~░▒█▒█░ ~░░▀▄▀░ ";
    String AweBoldW = "▒█░░▒█ ~▒█▒█▒█ ~▒█▄▀▄█ ";
    String AweBoldX = "▀▄▒▄▀ ~░▒█░░ ~▄▀▒▀▄ ";
    String AweBoldY = "▒█░░▒█ ~▒█▄▄▄█ ~░░▒█░░ ";
    String AweBoldZ = "▒█▀▀▀█ ~░▄▄▄▀▀ ~▒█▄▄▄█ ";
    String AweBoldSmile = "▄ ▀▄ ~░ ░█ ~▀ ▄▀ ";

	Boolean Success = false;
	
    @Override
    public void onEnable(){
    	getLogger().info("AwesomeText Has been enabled.");
    	getServer().getPluginManager().registerEvents(this, this);
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("AwesomeText is now being turned off...");
    }
    @EventHandler
    public void onSignChange(SignChangeEvent event) {
        Player p = event.getPlayer();
        if (p.hasPermission("AwesomeText.create") || p.isOp()){
	        if(event.getLine(0).toUpperCase().contains("[AWESOMETEXT]") || event.getLine(0).toUpperCase().contains("[AT]")) {
	        	if (event.getLine(1).toUpperCase().contains("BOLD") || event.getLine(1).toUpperCase().contains("B")) {
	        		if (event.getLine(2).toUpperCase().contains("A")) {
	        			event.setLine(0, AweBoldA.split("~")[0]);
	        			event.setLine(1, AweBoldA.split("~")[1]);
	        			event.setLine(2, AweBoldA.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("B")) {
	        			event.setLine(0, AweBoldB.split("~")[0]);
	        			event.setLine(1, AweBoldB.split("~")[1]);
	        			event.setLine(2, AweBoldB.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("C")) {
	        			event.setLine(0, AweBoldC.split("~")[0]);
	        			event.setLine(1, AweBoldC.split("~")[1]);
	        			event.setLine(2, AweBoldC.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("D")) {
	        			event.setLine(0, AweBoldD.split("~")[0]);
	        			event.setLine(1, AweBoldD.split("~")[1]);
	        			event.setLine(2, AweBoldD.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("E")) {
	        			event.setLine(0, AweBoldE.split("~")[0]);
	        			event.setLine(1, AweBoldE.split("~")[1]);
	        			event.setLine(2, AweBoldE.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("F")) {
	        			event.setLine(0, AweBoldF.split("~")[0]);
	        			event.setLine(1, AweBoldF.split("~")[1]);
	        			event.setLine(2, AweBoldF.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("G")) {
	        			event.setLine(0, AweBoldG.split("~")[0]);
	        			event.setLine(1, AweBoldG.split("~")[1]);
	        			event.setLine(2, AweBoldG.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("H")) {
	        			event.setLine(0, AweBoldH.split("~")[0]);
	        			event.setLine(1, AweBoldH.split("~")[1]);
	        			event.setLine(2, AweBoldH.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("I")) {
	        			event.setLine(0, AweBoldI.split("~")[0]);
	        			event.setLine(1, AweBoldI.split("~")[1]);
	        			event.setLine(2, AweBoldI.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("J")) {
	        			event.setLine(0, AweBoldJ.split("~")[0]);
	        			event.setLine(1, AweBoldJ.split("~")[1]);
	        			event.setLine(2, AweBoldJ.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("K")) {
	        			event.setLine(0, AweBoldK.split("~")[0]);
	        			event.setLine(1, AweBoldK.split("~")[1]);
	        			event.setLine(2, AweBoldK.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("L")) {
	        			event.setLine(0, AweBoldL.split("~")[0]);
	        			event.setLine(1, AweBoldL.split("~")[1]);
	        			event.setLine(2, AweBoldL.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("M")) {
	        			event.setLine(0, AweBoldM.split("~")[0]);
	        			event.setLine(1, AweBoldM.split("~")[1]);
	        			event.setLine(2, AweBoldM.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("N")) {
	        			event.setLine(0, AweBoldN.split("~")[0]);
	        			event.setLine(1, AweBoldN.split("~")[1]);
	        			event.setLine(2, AweBoldN.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("O")) {
	        			event.setLine(0, AweBoldO.split("~")[0]);
	        			event.setLine(1, AweBoldO.split("~")[1]);
	        			event.setLine(2, AweBoldO.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("P")) {
	        			event.setLine(0, AweBoldP.split("~")[0]);
	        			event.setLine(1, AweBoldP.split("~")[1]);
	        			event.setLine(2, AweBoldP.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("Q")) {
	        			event.setLine(0, AweBoldQ.split("~")[0]);
	        			event.setLine(1, AweBoldQ.split("~")[1]);
	        			event.setLine(2, AweBoldQ.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("R")) {
	        			event.setLine(0, AweBoldR.split("~")[0]);
	        			event.setLine(1, AweBoldR.split("~")[1]);
	        			event.setLine(2, AweBoldR.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("S")) {
	        			event.setLine(0, AweBoldS.split("~")[0]);
	        			event.setLine(1, AweBoldS.split("~")[1]);
	        			event.setLine(2, AweBoldS.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("T")) {
	        			event.setLine(0, AweBoldT.split("~")[0]);
	        			event.setLine(1, AweBoldT.split("~")[1]);
	        			event.setLine(2, AweBoldT.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("U")) {
	        			event.setLine(0, AweBoldU.split("~")[0]);
	        			event.setLine(1, AweBoldU.split("~")[1]);
	        			event.setLine(2, AweBoldU.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("V")) {
	        			event.setLine(0, AweBoldV.split("~")[0]);
	        			event.setLine(1, AweBoldV.split("~")[1]);
	        			event.setLine(2, AweBoldV.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("W")) {
	        			event.setLine(0, AweBoldW.split("~")[0]);
	        			event.setLine(1, AweBoldW.split("~")[1]);
	        			event.setLine(2, AweBoldW.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("X")) {
	        			event.setLine(0, AweBoldX.split("~")[0]);
	        			event.setLine(1, AweBoldX.split("~")[1]);
	        			event.setLine(2, AweBoldX.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("Y")) {
	        			event.setLine(0, AweBoldY.split("~")[0]);
	        			event.setLine(1, AweBoldY.split("~")[1]);
	        			event.setLine(2, AweBoldY.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains("Z")) {
	        			event.setLine(0, AweBoldZ.split("~")[0]);
	        			event.setLine(1, AweBoldZ.split("~")[1]);
	        			event.setLine(2, AweBoldZ.split("~")[2]);
	        		}
	        		else if (event.getLine(2).toUpperCase().contains(":)")) {
	        			event.setLine(0, AweBoldSmile.split("~")[0]);
	        			event.setLine(1, AweBoldSmile.split("~")[1]);
	        			event.setLine(2, AweBoldSmile.split("~")[2]);
	        		}
	        		else {
	        			p.sendMessage(ChatColor.BLUE + "'" + ChatColor.GOLD + event.getLine(2) + ChatColor.BLUE + "' Is not a valid character. I'll probably add it later ;)");
	        		}
	        	}
	        	else{
	        		p.sendMessage(ChatColor.BLUE+"Please specify text type, don't expect me to pick for you "+ChatColor.GOLD+";)");
	        		p.sendMessage(ChatColor.BLUE+"Valid types are: "+ChatColor.GREEN+"Bold (B)");
	        	}
	        }
        }
    }
    //@EventHandler 
    @SuppressWarnings("deprecation")
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("AwesomeText")) {
    		if (args.length == 0) {
    			sender.sendMessage(ChatColor.RED + "Arguments required: <bubble|russ|cool|bat> text");
    			return false;
    		}else{
    			String fulltext = "";
    			for (int i = 1; i < args.length;i++){
    				fulltext = fulltext + args[i];
    				System.out.print("args: "+args[i]);
    				fulltext = fulltext + " ";
    			}
    			if (args[0].equalsIgnoreCase("bubble")){
    				String fina = Converter.AwesomeIfy(fulltext, "bubble");
    				Bukkit.getServer().getPlayer(sender.getName()).chat(fina);
    			}
    			if (args[0].equalsIgnoreCase("russ")){
    				String fina = Converter.AwesomeIfy(fulltext, "russ");
    				Bukkit.getServer().getPlayer(sender.getName()).chat(fina);
    			}
    			return true;
    			
    		}
    	}else return false; 
    	//return false; 
 
    }
    //public boolean PlayerChatEvent(CommandSender sender, Command cmd, String label, String[] args){
    	
    //}
    
}

// TODO: http://forums.bukkit.org/threads/simple-signevent.21721/