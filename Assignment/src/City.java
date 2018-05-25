import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 * This class implements City that has 5 different destinations that heroes can go to.
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, Apr 2018.
 */
public class City {
	/**
	 * An array list of integers that determines where the destinations are. 
	 * The indices of the Array List stands for the map directions 0 - North, 1 - South, 2 - East, 3 - West and 4 - Center
	 * The elements in the Array List stands for the destination 0 - Shop, 1 - Power up den, 2 - Hospital, 3 - Villain's Lair and 4 - Home Base.
	 */
	private ArrayList<Integer> cityDestination = new ArrayList<Integer>(Arrays.asList(null, null, null, null, 4));
	
	/**
	 * An array list of integers in which the hero knows the locations of the destinations.
	 */
	private ArrayList<Integer> knownDestination = new ArrayList<Integer>(Arrays.asList(null, null, null, null, 4));
	
	/**
	 * The boolean status of the villain in which true if they are alive and false if they are dead.
	 */
	private boolean villainStatus = true;
	/**
	 * The name of the City
	 */
	private String cityName;
	
	/**
	 * A random generated integer to generate the array list of cityDestination.
	 */
	private Random number;
	
	/**
	 * The constructor for the class Villain to the class City
	 */
	private Villain villain;
	
	/**
	 * The constructor for the City that sets its name.
	 */
	public City(String string) {
		cityName = string;
	}

	/**
	 * The constructor for the class Villain that sets the name, number of lives,
	 * damage and the favorite game of the Villain in the city.
	 */
	public void setVillain() {
		villain = new Villain("Dibs", 2, 20, "XAndOs");
	}
	
	/**
	 * The constructor for the Super Villain in the City
	 */
	public void setSuperVillain() {
		villain = new SuperVillain("Lord of death Reaper", 3, 80, "XAndOs");
	}

	/**
	 * This function returns the name of the City
	 * @return Returns String representation of the City's name.
	 */
	public String getName() {
		return cityName;
	}
	
	/**
	 * This function returns the Villain of the City
	 * @return Returns the City's Villain.
	 */
	Villain getCityVillain() {
		return villain;
	}
	
	/**
	 * A function that sets the life status of the villain in the city.
	 */
	public void setVillainStatus() {
		villainStatus = villain.isAlive();
	}
	
	/**
	 * A function that returns the life status of the villain in the city. 
	 * It returns a boolean value in which true is for alive and false is for dead.
	 * @return Returns the boolean value true or false indicating whether the villain in the city is alive or not.
	 */
	public boolean getVillainStatus() {
		return villainStatus;
	}
	
	/**
	 * A function that sets the location of known Destinations in the Team map.
	 * @param locationindex An integer parameter that represents the index of the array.
	 * The indices of the Array List stands for the map directions 0 - North, 1 - South, 2 - East, 3 - West and 4 - Center
	 * @param direction An integer parameter that indicates which destination is in the given index.
	 * The elements in the Array List stands for the destination 0 - Shop, 1 - Power up den, 2 - Hospital, 3 - Villain's Lair and 4 - Home Base.
	 */
	void setlocations(int locationindex, int direction) {
		 knownDestination.set(locationindex, direction);
	}
	
	/**
	 * A function that returns the map of the destinations that the hero knows.
	 * @return Returns the Array List of integers that stands for the destinations and the indices stands for the map directions.
	 */
	public ArrayList<Integer> getKnownDestination() {
		return knownDestination;
	}
	
	/**
	 * A function that copies the location in the given direction.
	 * @param index An integer that represents the map direction.
	 * Map directions 0 - North, 1 - South, 2 - East, 3 - West and 4 - Center
	 */
	public boolean knowCityDestination(int index) {
		if((index > cityDestination.size()) || (index < 0)) {
			System.out.println("Index is out of range.");
			return false;
		} 
		int element = cityDestination.get(index);
		setlocations(index, element);
		return true;
	}
	
	/**
	 * A function that generates the map of the city using a random generator.
	 * It results to an Array List of integers that stands for the destinations 
	 * and the indices of the Array List stands for the map directions.
	 */
	public void setCityDestination() {
		number = new Random();
		int index = 0;
		while(cityDestination.contains(null)) {
			int pos = number.nextInt(4);
			if(!(cityDestination.contains(pos))) {
				cityDestination.set(index, pos);
			}
			index += 1;
			if(index > 3) {
				index = 0;
			}
		}
	}
	
	/**
	 * A function that returns the map of the city.
	 * @return Returns an Array List of Integers in which the Integers stands for the destinations
	 * while the indices of the Array List stands for the map direction.
	 */
	public ArrayList<Integer> getCityDestination() {
		return cityDestination;
	}
}