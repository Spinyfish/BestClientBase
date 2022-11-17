package me.dev.clientbase.hackapi.event.theevents;

import me.dev.clientbase.hackapi.event.Event;
import net.minecraft.network.Packet;

public class EventPacket extends Event {
	
	public Packet packet;
	
	public EventPacket(Packet packet) {
		this.packet = packet;
	}

	/**
	 * gets packet
	 */
	public Packet getPacket() {
		return packet;
	}

	/**
	 * sets packet NEVER DO THIS
	 */
	public void setPacket(Packet packet) {
		this.packet = packet;
	}

}
