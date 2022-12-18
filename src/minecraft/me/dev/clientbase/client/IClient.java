package me.dev.clientbase.client;

import java.util.HashMap;

import me.dev.clientbase.client.interfaces.ClientInfo;
import net.minecraft.client.Minecraft;

@SuppressWarnings("hiding")
public interface IClient<Client, Module> {

	Minecraft mc = Minecraft.getMinecraft();
		
	ClientInfo getClientInfo();
	
	void startup();
	
	void end();
	
}
