package me.dev.clientbase.api.event;

import me.dev.clientbase.api.event.interfaces.IEvent;

public class Event implements IEvent {

	private boolean cancelled;

	/**
	 * if is cancelled it reutnrn yes
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * cancelled is set to yes
	 */
	public void setCancelled() {
		this.cancelled = true;
	}
	
}
