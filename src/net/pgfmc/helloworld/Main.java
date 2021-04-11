package net.pgfmc.helloworld;

import org.bukkit.plugin.java.JavaPlugin; // These are your imports

import net.pgfmc.helloworld.commands.Hi;
import net.pgfmc.helloworld.events.PlayerEvents;

public class Main extends JavaPlugin { // exentends JavaPlugin from the Spigot library/API
	
	@Override // Needed
	public void onEnable() // Runs when the plugin first starts
	{
		getCommand("hi").setExecutor(new Hi()); // Registers Hi command class
		getServer().getPluginManager().registerEvents(new PlayerEvents(), this); // Registers PlayerEvents event listener class
		
		System.out.print("Hello World has started successfully."); // Prints to the console
	}
	
	@Override // Needed
	public void onDisable()
	{
		// You can leave this empty or just don't write the method
	}

}