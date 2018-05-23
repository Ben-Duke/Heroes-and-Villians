/**
 * This class implements a Hospital where Heroes are healed.
 * The doctors tries to best to heal the injuries of Heroes so that they could save the world.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class Hospital implements Destination {
	private String name = "Hospital";
	
	/**
	 * This function returns the destination name of the Hospital.
	 */
	@Override
	public String getDestinationName() {
		return name;
	}
	
	/**
	 * This function heals the Hero's health by a certain amount
	 * @param hero The Hero character to be healed.
	 */
	public void healHero(Hero hero) {
		hero.increaseHealth(25);
	}
	
}

