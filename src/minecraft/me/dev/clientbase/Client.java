package me.dev.clientbase;

import me.dev.clientbase.api.event.EventManager;
import me.dev.clientbase.api.module.Module;
import me.dev.clientbase.api.module.manager.ModuleManager;
import me.dev.clientbase.client.IClient;
import me.dev.clientbase.client.interfaces.ClientInfo;

//Sets client info
@ClientInfo(name = "Client", author = "You")
public class Client implements IClient<Client, Module> {

	//Gets client info
	public static ClientInfo CLIENTINFO = Client.class.getAnnotation(ClientInfo.class);
	
	//The client instance
	public static Client CLIENT = new Client();
	
	//The client name, if this was wurst it would be called "Wurst"
	public static String NAME = CLIENTINFO.name();
	
	//The author, if this was wurst this would be "Alexander"
	public static String AUTHOR = CLIENTINFO.author();
	
	public ModuleManager moduleManager;
	public EventManager eventManager;

	@Override
	/**
	 * Executes at the start of the client
	 */
	public void startup() {
		
		System.out.println(String.format("Welcome to %s by %s", this.CLIENTINFO.name(), this.CLIENTINFO.author()));
		
		// If you remove this i will steal your lungs
		System.out.println("Based on https://github.com/Spinyfish/BestClientBase");
				
		this.eventManager = new EventManager();

		this.moduleManager = new ModuleManager();
		this.moduleManager.init();

	}
	
	@Override
	/**
	 * Executes at the end of the client
	 */
	public void end() {
		System.out.println("Goodbye!");
	}

	@Override
	/**
	 * Gets the client info (name + author)
	 */
	public ClientInfo getClientInfo() {
		return this.CLIENTINFO;
	}

}
