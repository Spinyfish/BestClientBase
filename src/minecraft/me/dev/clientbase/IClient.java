package me.dev.clientbase;

import java.util.HashMap;

import net.minecraft.client.Minecraft;

@SuppressWarnings("hiding")
public interface IClient<Tutorial, Module> {

	Minecraft mc = Minecraft.getMinecraft();
	
	String name();
	
	String author();
	
	void init();
	
	Tutorial getSingleton();
	
	HashMap<Class<? extends Module>, Module> getModules();
	
}
