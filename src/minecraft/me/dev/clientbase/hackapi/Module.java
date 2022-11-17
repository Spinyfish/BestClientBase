package me.dev.clientbase.hackapi;

public abstract class Module implements IModule {

	public boolean toggled;
	
	public int keybind;

	public String name;
	
	public Module(String name) { this.name = name;}
	
	public void toggle() {
		
		if(toggled == true) toggled = false; else toggled = true;
		
		int state = toggled ? 1 : 0;
		
		switch(state) {
		
		case 1: onEnable();
			
			break;
			
		case 0: onDisable();
		
			break;
			
		default:
			System.out.println("This shouldnt happen");
			break;
		
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
		this.toggled = toggled;
	}

	public int getKeybind() {
		return keybind;
	}

	public void setKeybind(int keybind) {
		this.keybind = keybind;
	}
	
}
