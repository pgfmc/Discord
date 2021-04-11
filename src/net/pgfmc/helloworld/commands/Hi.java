package net.pgfmc.helloworld.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.command.Command; // Imports
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Hi implements CommandExecutor { // implements CommandExecutor

	@Override // Needed
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) { // be sure to rename arg0, arg1, arg2, arg3 to sender, cmd, label, args
		if (!(sender instanceof Player)) // If the command sender "sender" isn't an instanceof Player type
		{
			sender.sendMessage(ChatColor.RED + "Hey! You aren't supposed to run this code -- Players ONLY."); // Sends to the sender (most likely the console)
		}
		
		Player p = (Player) sender; // Converts (casts) CommandSender to Player
		
		List<String> r = new ArrayList<>(); // Creates a list of String (holds multiple String values in a list)
		
		// Adds these String values to the list "r"
		r.add(ChatColor.GOLD + "Hi!");
		r.add(ChatColor.GOLD + "Hello!");
		r.add(ChatColor.GOLD + "Hey, there!");
		r.add(ChatColor.GOLD + "Hola, amigo!");
		r.add(ChatColor.GOLD + "oi");
		
		Random ran = new Random(); // Creates a new Random
		
		
		p.sendMessage(r.get(ran.nextInt(5))); // Generates a random number from 0 to 4, then gets the corresponding String in the list "r"
		
		return true; // Remember that we need to return a boolean (true or false)
	}
	
}
