
public class GameModel {
	
	Team game_team = null;

	
	
	boolean createTeam(String name) {
		game_team = new Team();
		game_team.setTeamName(name);
		return true;
	}
	
	Team getTeam() {
		return game_team;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
