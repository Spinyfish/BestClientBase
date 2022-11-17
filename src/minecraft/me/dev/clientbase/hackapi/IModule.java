package me.dev.clientbase.hackapi;

import java.util.function.Consumer;

import me.dev.clientbase.hackapi.event.theevents.EventMotionUpdate;
import me.dev.clientbase.hackapi.event.theevents.EventPacket;
import me.dev.clientbase.hackapi.event.theevents.EventRender2D;
import me.dev.clientbase.hackapi.event.theevents.EventRender3D;
import net.minecraft.client.Minecraft;

public interface IModule {

	Minecraft mc = Minecraft.getMinecraft();
	
	public ModuleAction<EventMotionUpdate> preMotionAction();

	public ModuleAction<EventMotionUpdate> postMotionAction();

	public ModuleAction<EventPacket> packetAction();

	public ModuleAction<EventRender2D> render2dAction();

	public ModuleAction<EventRender3D> render3DAction();
	
}
