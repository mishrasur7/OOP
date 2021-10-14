package SoccerProgram;

import java.util.ArrayList;

public class Team {

	ArrayList<Player> team = new ArrayList<Player>();
	String name;

	Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addPlayer(Player player) {
		team.add(player);
	}

	public int getGoals() {
		int goals = 0;

		for (Player player : team) {
			goals += player.getGoals();
		}
		return goals;
	}

	public int getPlayerCount() {
		int count = 0;
		for (Player player : team) {
			count++;
		}
		return count;
	}

	public String toString() {

		String x = this.name + ": " + getGoals() + " goals";
		for (Player player : team) {
			x += "\n" + player;
		}

		return x;
	}
}
