package me.dev.clientbase.impl.event;

import me.dev.clientbase.api.event.Event;
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
