package me.dev.clientbase.api.module.manager;

import java.util.HashMap;

import me.dev.clientbase.api.interfaces.IManager;
import me.dev.clientbase.api.module.Module;
import me.dev.clientbase.impl.module.Criticals;
import me.dev.clientbase.impl.module.Hud;
import me.dev.clientbase.impl.module.Sprint;

public class ModuleManager implements IManager<Module> {

	private final IManager instance;
	
	HashMap<Class, Module> modules = new HashMap<>();
	
	public ModuleManager() {
		this.instance = this;
	}
	
	public void init() {
		this.modules.put(Criticals.class, new Criticals());
		this.modules.put(Hud.class, new Hud());
		this.modules.put(Sprint.class, new Sprint());
	}
	
	@Override
	public HashMap<Class, Module> getElements() {
		return this.modules;
	}

}
