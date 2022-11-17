package me.dev.clientbase.hackapi.event;

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
