import java.util.ArrayList;

public class GameModel {
	
	Team game_team = null;
	int cityCount = 1;
	XAndOs XAndOgame;
	ArrayList<City> citylist; 
	Shop shop = new Shop();
	Destination[] current;
	int currentCity = 0;
	
	void moveCity() {
		currentCity ++;
	}
	
	boolean createTeam(String name) {
		game_team = new Team();
		game_team.setTeamName(name);
		return true;
	}
	
	void updateCityCount(int numOfCity) {
		cityCount = numOfCity;
	}
	
	Shop getShop() {
		return shop;
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
	
	ArrayList<City> getCities() {
		return citylist;
	}
	
	int getCurrentCity() {
		return currentCity;
	}
	void setCities(int numberOfCities) {
		ArrayList<City> templist = new ArrayList<City>();
		
		for (int i =0;i< numberOfCities; i ++ ) {
			City tempcity = new City("City "+i);
			
			tempcity.setCityDestination();
			if (i+1 == numberOfCities) {
				tempcity.setSuperVillain();
			}else {
				tempcity.setVillain();
			}
			
			templist.add(tempcity);
		}
		
		citylist = templist;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
