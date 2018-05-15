
public class GameModel {
	
	Team game_team = null;
	int cityCount = 1;
	XAndOs XAndOgame;
	City[] citylist; 
	Destination[] current;
	int currentCity = 0;
	
	
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
	
	void createXAndOGame() {
		XAndOgame = new XAndOs();
	}
	
	XAndOs getXAndOGame() {
		return XAndOgame;
	}
	
	City[] getCities() {
		return citylist;
	}
	
	int getCurrentCity() {
		return currentCity;
	}
	void setCities() {
		City city1 = new City();
		city1.setCityDestination();
		citylist = new City[]{city1};
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
