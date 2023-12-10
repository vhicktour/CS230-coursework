package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu with additional Code from
 * Victor Udeh
 *
 */
public class Team extends Entity {
	
	private static List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Player addPlayer(String name) {
		
		Player tempPlayer = null;

		
		//create a loop to search list players		
		for (Player currPlayer : players) {
			
			if (currPlayer.name.equalsIgnoreCase(name)){//check if the name is already added and if so return
				
				return currPlayer; 
			}			
		}

		//since the player wasn't found create it
		//create the new player
		//first call the GameService to get the new playerID
		GameService tempService = GameService.getGameService();
		
		tempPlayer = new Player(tempService.getNextPlayerId(), name);
				
		//add the player to the list of players on the team
		players.add(tempPlayer);
		
		return tempPlayer;
	}
	
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
