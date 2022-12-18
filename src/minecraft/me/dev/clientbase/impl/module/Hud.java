package me.dev.clientbase.impl.module;

import me.dev.clientbase.Client;
import me.dev.clientbase.api.module.Module;
import me.dev.clientbase.api.module.action.ModuleAction;
import me.dev.clientbase.impl.event.EventMotionUpdate;
import me.dev.clientbase.impl.event.EventPacket;
import me.dev.clientbase.impl.event.EventRender2D;
import me.dev.clientbase.impl.event.EventRender3D;

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
		for(Module module : Client.CLIENT.moduleManager.getElements().values()) {
			if(module.isToggled()) {
				mc.fontRendererObj.drawStringWithShadow(module.name, 2, 2 + y, -1);
				y += 11;
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
