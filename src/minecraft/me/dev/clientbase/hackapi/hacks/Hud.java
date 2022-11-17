package me.dev.clientbase.hackapi.hacks;

import me.dev.clientbase.Client;
import me.dev.clientbase.hackapi.Module;
import me.dev.clientbase.hackapi.ModuleAction;
import me.dev.clientbase.hackapi.event.theevents.EventMotionUpdate;
import me.dev.clientbase.hackapi.event.theevents.EventPacket;
import me.dev.clientbase.hackapi.event.theevents.EventRender2D;
import me.dev.clientbase.hackapi.event.theevents.EventRender3D;

public class Hud extends Module {

	
	public Hud() {
		super("HUD");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModuleAction<EventMotionUpdate> preMotionAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModuleAction<EventMotionUpdate> postMotionAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModuleAction<EventPacket> packetAction() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ModuleAction<EventRender2D> render2DAction = e -> {
		int y = 0;
		for(Module module : Client.CLIENT.getSingleton().getModules().values()) {
			if(module.isToggled()) {
				mc.fontRendererObj.drawStringWithShadow(module.name, 20 + y, 10, -1);
			}
		}
		
	};

	@Override
	public ModuleAction<EventRender2D> render2dAction() {
		return this.render2DAction;
	}

	@Override
	public ModuleAction<EventRender3D> render3DAction() {
		// TODO Auto-generated method stub
		return null;
	}

}
