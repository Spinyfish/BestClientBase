package me.dev.clientbase.hackapi;

import me.dev.clientbase.hackapi.hacks.Criticals;
import me.dev.clientbase.hackapi.hacks.Hud;
import me.dev.clientbase.hackapi.hacks.Sprint;

public class ModuleManager implements IModuleManager<Module> {

	public static Criticals criticalsHack;
	
	public static Sprint sprint;
	
	public static Hud HUD;
	
	public static ModuleManager getInstance() {
		return new ModuleManager();
	}
	
	@Override
	public Criticals getCriticals() {
		if(criticalsHack == null) {
			try {
				criticalsHack = Criticals.class.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return criticalsHack;
	}
	

	@Override
	public Sprint getSprint() {
		if(sprint == null) {
			try {
				sprint = Sprint.class.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return sprint;
	}

	@Override
	public Hud getHUD() {
		if(HUD == null) {
			try {
				HUD = Hud.class.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return HUD;
	}

}
