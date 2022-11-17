package me.dev.clientbase.hackapi;

import java.util.HashMap;

public interface IModuleManager<Module> {

	/**
	 * Gets criticals instance
	 */
	Module getCriticals();

	/**
	 * Gets sprint instance
	 */
	Module getSprint();

	/**
	 * Gets HUD instance
	 */
	Module getHUD();
	
}
