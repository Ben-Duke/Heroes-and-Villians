import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 * This class implements City that has 5 different destinations that heroes can go to.
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, 16 Apr 2018
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
	 * A random generated integer to generate the array list of cityDestination.
	 */
	private Random number;
	
	Villain villain;
	
	void setVillain() {
		villain = new Villain("Dibs", 2, 20, "XAndOs");
	}
	
	/**
	 * A function that returns the life status of villain in the city. 
	 * It returns a boolean value in which true is for alive and false is for dead.
	 * @return Returns the boolean value true or false indicating whether the villain in the city is alive or not.
	 */
	public boolean getvillainStatus() {
		return villainStatus;
	}
	
	void setlocations(int locationindex, int direction) {
		
		 knownDestination.set(locationindex, direction);
		 System.out.println(getKnownDestination());
	}
	
	/**
	 * A function that returns the map of the destinations that the hero knows.
	 * @return Returns the Array List of integers that stands for the destinations and the indices stands for the map directions.
	 */
	public ArrayList<Integer> getKnownDestination() {
		return knownDestination;
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
	
	public static void main(String[] args) {
		City c1 = new City();
		c1.setCityDestination();
		System.out.println(c1.getCityDestination());
		System.out.println("__________");
		c1.setlocations(0, 2);
		System.out.println("__________");
		System.out.println(c1.getKnownDestination());
		
}
}
