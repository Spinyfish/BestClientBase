package me.dev.clientbase.hackapi;

public interface ModuleAction<Event> {

	void accept(Event event);
	
}
