import java.util.ArrayList;

/**
 * This class implements a Game Model that stores references for the game and hold the core references
 * for the Game Plays. 
 * @author Ben Duke & Angelica Dela Cru
 * @version 1.2, May 2018.
 */
public class GameModel {
	/**
	 * The Team in the Game
	 */
	private Team game_team = null;
	/**
	 * The counts of the City
	 */
	private int cityCount = 1;
	/**
	 * The Game X and O'ss
	 */
	private XAndOs XAndOgame;
	/**
	 * The list of the City
	 */
	private ArrayList<City> citylist; 
	/**
	 * Initializes the Shop
	 */
	private Shop shop = new Shop();
	/**
	 * The current destination list
	 */
	private Destination[] current;
	/**
	 * The current City
	 */
	private int currentCity = 0;
	
	/**
	 * This function moves the City to the next City
	 */
	public void moveCity() {
		currentCity ++;
	}
	
	/**
	 * This function creates the Team for the Game.
	 * @param name The String representation of the name of the Team
	 * @return Returns a boolean value true if the Team is created
	 */
	public boolean createTeam(String name) {
		game_team = new Team();
		game_team.setTeamName(name);
		return true;
	}
	
	/**
	 * This function updates the number of the City Count
	 * @param numOfCity The Integer value that the city count will be changed to.
	 */
	public void updateCityCount(int numOfCity) {
		cityCount = numOfCity;
	}
	
	/**
	 * This function returns the Shop in the City
	 * @return Returns the Shop
	 */
	public Shop getShop() {
		return shop;
	}
	
	/**
	 * This function returns the Team of the Game
	 * @return Returns the Team
	 */
	public Team getTeam() {
		return game_team;
	}
	
	/**
	 * This function initializes the game X and O's
	 */
	public void createXAndOGame() {
		XAndOgame = new XAndOs();
	}
	
	/**
	 * This function returns the game X and O's
	 * @return Returns the X and O's game 
	 */
	public XAndOs getXAndOGame() {
		return XAndOgame;
	}
	
	/**
	 * This function returns the Array List of the Cities
	 * @return Returns the list of Cities
	 */
	public ArrayList<City> getCities() {
		return citylist;
	}
	
	/**
	 * This function returns the Integer value of the Current City
	 * @return Returns the Integer value of the City at the time
	 */
	public int getCurrentCity() {
		return currentCity;
	}
	
	/**
	 * This function sets the number of Cities in the Game.
	 * @param numberOfCities An Integer value that is used to set the number of Cities 
	 * in the Game to.
	 */
	public void setCities(int numberOfCities) {
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
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
