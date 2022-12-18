package me.dev.clientbase.api.module.interfaces;

import java.util.function.Consumer;

import me.dev.clientbase.api.module.action.ModuleAction;
import me.dev.clientbase.impl.event.EventMotionUpdate;
import me.dev.clientbase.impl.event.EventPacket;
import me.dev.clientbase.impl.event.EventRender2D;
import me.dev.clientbase.impl.event.EventRender3D;
import net.minecraft.client.Minecraft;

public interface IModule {

	Minecraft mc = Minecraft.getMinecraft();
	
	public ModuleAction<EventMotionUpdate> preMotionAction();

	public ModuleAction<EventMotionUpdate> postMotionAction();

	public ModuleAction<EventPacket> packetAction();

	public ModuleAction<EventRender2D> render2dAction();

	public ModuleAction<EventRender3D> render3DAction();
	
}
