package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu with additional code
 * from victor Udeh
 *
 */
public class Game extends Entity {
	
	private static List<Team> teams = new ArrayList<Team>();

	/**
	 * Hide default constructor to prevent creating empty instances.
	 */
	@SuppressWarnings("unused")
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Team addTeam(String name) {
		
		Team tempTeam = null;

		
		//create a loop to search list players		
		for (Team currTeam : teams) {
			
			if (currTeam.name.equalsIgnoreCase(name)){
		//check if the name is already added and if so return
				
				return currTeam; 
			}			
		}

		//since the player wasn't found create it
		//create the new player
		//first call the GameService to get the new playerID
		GameService tempService = GameService.getGameService();
		
		tempTeam = new Team(tempService.getNextTeamId(), name);
				
		//add the player to the list of players on the team
		teams.add(tempTeam);
		
		return tempTeam;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
