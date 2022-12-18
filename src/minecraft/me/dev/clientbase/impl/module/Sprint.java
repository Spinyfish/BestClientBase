package me.dev.clientbase.impl.module;

import me.dev.clientbase.api.module.Module;
import me.dev.clientbase.api.module.action.ModuleAction;
import me.dev.clientbase.impl.event.EventMotionUpdate;
import me.dev.clientbase.impl.event.EventPacket;
import me.dev.clientbase.impl.event.EventRender2D;
import me.dev.clientbase.impl.event.EventRender3D;

public class Sprint extends Module {

	public Sprint() {
		super("Sprint");
		// TODO Auto-generated constructor stub
	}

	public ModuleAction<EventMotionUpdate> preAction = e -> {
		mc.thePlayer.setSprinting(true);
	};
	
	@Override
	public ModuleAction<EventMotionUpdate> preMotionAction() {
		return this.preAction;
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

	@Override
	public ModuleAction<EventRender2D> render2dAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModuleAction<EventRender3D> render3DAction() {
		// TODO Auto-generated method stub
		return null;
	}


}
