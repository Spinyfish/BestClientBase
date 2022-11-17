package me.dev.clientbase;

import java.util.HashMap;

import me.dev.clientbase.hackapi.Module;
import me.dev.clientbase.hackapi.ModuleManager;

//Sets client info
@ClientInfo(name = "Client", author = "You")
public class Client implements IClient<Client, Module> {

	//Gets client info
	public static ClientInfo CLIENTINFO = Client.class.getAnnotation(ClientInfo.class);
	
	//The client instance
	public static Client CLIENT = new Client();
	
	//The client name, if this was rise it would be called "Rise"
	public static String NAME = CLIENTINFO.name();
	
	//The author, if the dev was Vince from the hit intent client diablo, it would be said "Vince"
	public static String AUTHOR = CLIENTINFO.author();
	
	//Map of modules, even tho arraylist is faster I like how u can get keys bcz its neat
	public static HashMap<Class<? extends Module>, Module> theMapOfTheModulesThatWeUse = new HashMap<>();
	
	@Override
	/**
	 * Idk what init means but in the client src's ive seen it registers modules, maybe its short for sumn like "Initate. Nice. Inuite. Tonsils" idfk what it is tbh
	 */
	public void init() {
		
		ModuleManager modulem = new ModuleManager();
		
		theMapOfTheModulesThatWeUse.put(modulem.getCriticals().getClass(), modulem.getCriticals());

		theMapOfTheModulesThatWeUse.put(modulem.getSprint().getClass(), modulem.getSprint());

		theMapOfTheModulesThatWeUse.put(modulem.getHUD().getClass(), modulem.getHUD());
		
	}
	
	@Override
	/**
	 * Creates a new instane and gives it to u
	 */
	public Client getSingleton() {
		return new Client();
	}

	@Override
	/**
	 * Gets the name of this the client
	 */
	public String name() {
		return NAME;
	}

	@Override
	/**
	 * Gets the author we set who is u
	 */
	public String author() {
		return AUTHOR;
	}

	@Override
	/**
	 * gets a map of our modules
	 */
	public HashMap<Class<? extends Module>, Module> getModules() {
		return theMapOfTheModulesThatWeUse;
	}
	
}
