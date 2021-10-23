package net.pgfmc.discord;

import javax.security.auth.login.LoginException;

import org.bukkit.plugin.java.JavaPlugin;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder; 


public class Main extends JavaPlugin { 
	
	JDA jda;
	
	
	@Override 
	public void onEnable() {
		
		try {
			jda = JDABuilder.createDefault("NzA5NjM4OTQ1MzUyMTg3OTU0.Xro0xQ.oAypvIGsxIrR5rgRM5V87RaLIjY").build();
		} catch (LoginException e) {
			
			System.out.println("JDA failed to load!!! Disabling plugin...");
			e.printStackTrace();
		}
		
		System.out.println(jda.getGuilds());
		
		//Guild server = jda.getGuildById("721951670132801596");
		
		//for (GuildChannel channel : server.getChannels()) {
			//System.out.println(channel.getName());
		//}
	}
}