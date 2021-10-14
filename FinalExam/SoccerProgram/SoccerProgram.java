package SoccerProgram;

public class SoccerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Player firstPlayer=new Player(1, "Susan",2);
		Player secondPlayer =new Player (2, "Jeff",0);
		Player thirdPlayer=new Player(3, "David",2);
		
		firstPlayer.addGoals(3);
		System.out.println(firstPlayer.toString());
		
		Team firstTeam=new Team("Barcelona");
		Team secondTeam=new Team("Arsenal");
		
		System.out.println();
		System.out.println(firstTeam);
		System.out.println(secondTeam);
		
		firstTeam.addPlayer(firstPlayer);
		secondTeam.addPlayer(secondPlayer);
		secondTeam.addPlayer(thirdPlayer);
		
		System.out.println();
		System.out.println(firstTeam);
		System.out.println();
		System.out.println(secondTeam);
		
		secondPlayer.addGoals(1);
		thirdPlayer.addGoals(4);
		
		System.out.println();
		System.out.println(firstTeam);
		System.out.println();
		System.out.println(secondTeam);
		
		System.out.println();
		System.out.println(secondTeam.getName()+" has "+ secondTeam.getPlayerCount()+" players.");
	}

}
