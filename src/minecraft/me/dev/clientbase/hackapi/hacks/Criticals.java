package me.dev.clientbase.hackapi.hacks;

import me.dev.clientbase.hackapi.Module;
import me.dev.clientbase.hackapi.ModuleAction;
import me.dev.clientbase.hackapi.event.theevents.EventMotionUpdate;
import me.dev.clientbase.hackapi.event.theevents.EventPacket;
import me.dev.clientbase.hackapi.event.theevents.EventRender2D;
import me.dev.clientbase.hackapi.event.theevents.EventRender3D;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition;

public class Criticals extends Module {

	
	public Criticals() {
		super("Criticals");
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

	public ModuleAction<EventPacket> packetAction = e -> {
		
		if(e.getPacket() instanceof C02PacketUseEntity) {
			
			C02PacketUseEntity c02 = (C02PacketUseEntity) e.getPacket();
			
			if(c02.getAction().equals(C02PacketUseEntity.Action.ATTACK)) {
				System.out.println("Triggered");
				mc.thePlayer
				.sendQueue.addToSendQueue
				(new C04PacketPlayerPosition
						(mc.thePlayer.posX,
						mc.thePlayer.posY + 0.05,
						mc.thePlayer.posZ,
						false));
				
				mc.thePlayer
				.sendQueue.addToSendQueue
				(new C04PacketPlayerPosition
						(mc.thePlayer.posX,
						mc.thePlayer.posY + 0D,
						mc.thePlayer.posZ,
						false));
				
				mc.thePlayer
				.sendQueue.addToSendQueue
				(new C04PacketPlayerPosition
						(mc.thePlayer.posX,
						mc.thePlayer.posY - 0.01D,
						mc.thePlayer.posZ,
						false));
				System.out.println("Crit hitted!");
			}
			
		}
		
	};
	
	@Override
	public ModuleAction<EventPacket> packetAction() {
		return this.packetAction;
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
