
public class GameModel {
	
	Team game_team = null;
	int cityCount = 1;
	
	
	boolean createTeam(String name) {
		game_team = new Team();
		game_team.setTeamName(name);
		return true;
	}
	
	void updateCityCount(int numOfCity) {
		cityCount = numOfCity;
	}
	
	Team getTeam() {
		return game_team;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
