package me.dev.clientbase.api.module.action;

public interface ModuleAction<Event> {

	void accept(Event event);
	
}
