package me.dev.clientbase.api.module;

import me.dev.clientbase.Client;
import me.dev.clientbase.api.module.interfaces.IModule;

public abstract class Module implements IModule {

	public boolean toggled;
	
	public int keybind;

	public String name;
	
	public Module(String name) { this.name = name;}
	
	public void toggle() {
		
		if(toggled == true) toggled = false; else toggled = true;
		
		if(this.toggled) {
			this.onEnable();
			Client.CLIENT.eventManager.subscribers.add(this);
		} else {
			Client.CLIENT.eventManager.subscribers.remove(this);
			this.onDisable();
		}
		
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public boolean isToggled() {
		return toggled;
	}

	public void setToggled(boolean toggled) {
		if(toggled != this.isToggled())
			this.toggle();
	}

	public int getKeybind() {
		return keybind;
	}

	public void setKeybind(int keybind) {
		this.keybind = keybind;
	}

	public String getName() {
		return name;
	}
	
}
