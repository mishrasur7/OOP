package SoccerProgram;

public class Player {

	private int id;
	private String name;
	private int goals;

	Player(int id, String name, int goals) {
		this.id = id;
		this.name = name;
		this.goals = goals;
	}

	public int getGoals() {

		return this.goals;
	}

	public void addGoals(int goals) {

		this.goals += goals;
	}

	public String toString() {

		return id + " " + name + " (" + goals + " goals)";
	}
}
