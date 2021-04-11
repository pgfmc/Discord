package net.pgfmc.helloworld.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerEvents implements Listener { // implements Listener (for event listeners)
	
	@EventHandler // Needed
	public void onEggThrow(PlayerEggThrowEvent e) // returns nothing, you can name it whatever you want (onEggThrow is a pretty good name for it), e is the variable name for PlayerEggThrowEvent
	{
		Player p = e.getPlayer(); // type Player with name p, gets the player who threw the egg
		String playerName = p.getName(); // Gets the name of the Player p
		
		p.sendMessage(ChatColor.GOLD + playerName + " has thrown an egg!"); // Sends a message to the playerName
		
		Location loc = e.getEgg().getLocation(); // Gets the location of the egg and stores it in a variable
		
		p.teleport(loc); // Teleports the player who threw the egg to the location of the egg (including the direction the egg was looking)
	}
	
	
}
