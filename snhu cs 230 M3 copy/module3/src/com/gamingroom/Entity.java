package com.gamingroom;

/**
 * A simple Superclass to hold all of the player, team, and 
 * game entities
 * @author Victor Udeh
 */

public class Entity {
	
	//set attributes to protected so subclasses can inherit
	protected long id;	
	protected String name;
	
	//set to protected so subclasses can call
	@SuppressWarnings("unused")
	protected Entity() {}
	
	public Entity(long id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}	

}
