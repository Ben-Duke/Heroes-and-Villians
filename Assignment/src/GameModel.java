
public class GameModel {
	
	Team game_team = null;
	int cityCount = 1;
	GameView session;
	
	boolean createTeam(String name) {
		game_team = new Team();
		game_team.setTeamName(name);
		return true;
	}
	
	void setgame(MainGame game) {
		
	}
	
	void updateCityCount(int numOfCity) {
		cityCount = numOfCity;
	}
	
	int getCityCount() {
		return cityCount;
	}
	
	Team getTeam() {
		return game_team;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
