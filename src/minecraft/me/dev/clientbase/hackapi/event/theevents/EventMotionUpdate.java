package me.dev.clientbase.hackapi.event.theevents;

import me.dev.clientbase.hackapi.event.Event;

public class EventMotionUpdate extends Event {

	public double x, y, z;
	
	public float yaw, pitch;
	
	public boolean ground, post;
	
	public EventMotionUpdate(double x, double y, double z, float yaw, float pitch, boolean ground) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
		this.ground = ground;
		this.post = false;
		
	}

	/**
	 * gets x
	 */
	public double getX() {
		return x;
	}

	/**
	 * set x
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * gets y
	 */
	public double getY() {
		return y;
	}

	/**
	 * sets y
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * gets x
	 */
	public double getZ() {
		return z;
	}
	
	/**
	 * sets z
	 */
	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * gets yaw
	 */
	public float getYaw() {
		return yaw;
	}

	/**
	 * sets yaw
	 */
	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	/**
	 * gets pitch
	 */
	public float getPitch() {
		return pitch;
	}

	/**
	 * sets pitch
	 */
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	/**
	 * gets ground
	 */
	public boolean isGround() {
		return ground;
	}

	/**
	 * sets ground
	 */
	public void setGround(boolean ground) {
		this.ground = ground;
	}

	/**
	 * if its post it return yes
	 */
	public boolean isPost() {
		return post;
	}

	/**
	 * sets post state
	 */
	public void setPost(boolean post) {
		this.post = post;
	}
	
}
