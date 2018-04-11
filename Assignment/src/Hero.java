import java.util.ArrayList;
import java.util.Arrays;
/**
 * This class implements a Hero that has a health, type, special ability and 
 * different types of inventories
 * @author Angelica Dela Cruz & Ben Duke
 *
 * @version 1.1, 11 Apr 2018
 */
public class Hero {
	/**
	 * 
	 */
	private ArrayList<String> heroTypes = new ArrayList<String>(Arrays.asList("Earth", "Air", "Water", "Fire"));
	/**
	 * The maximum health of the Hero
	 */
	private int maxHealth = 100;
	/**
	 * The current health of the Hero
	 */
	private int currentHealth = 100;
	/**
	 * The type of the Hero
	 */
	private String heroType;
	/**
	 * The special abilities of the Hero based on its type
	 */
	private String heroAbility;
	/**
	 * The inventory for the power-up items
	 */
	private static ArrayList<String> heroPowerUp = new ArrayList<String>();
	/**
	 * The inventory for the healing items
	 */
	private static ArrayList<String> heroHealingItems = new ArrayList<String>(); 
	/**
	 * The inventory for the map list
	 */
	private static ArrayList<String> heroMapList = new ArrayList<String>();
	/**
	 * The status of the hero; if they are alive (true)
	 * and if they are dead (false)
	 */
	private boolean heroStatus = true;
	
	/**
	 * Makes the health of the Hero increase to the given health
	 * @param health The given health to increase the health of a Hero
	 */
	public void increaseHealth(int health) {
		if(currentHealth < maxHealth) {
			currentHealth += health;
		}
	}
	
	/**
	 * Makes the health of the Hero decrease by the given damage
	 * @param damage The given damage that decrease the health of a Hero
	 */
	public void decreaseHealth(int damage) {
		if(currentHealth < maxHealth) {
			currentHealth -= damage;
		}
		
		if(currentHealth < 1) {
			heroStatus = false;
		}
	}
	
	/**
	 * Sets the Hero type
	 * @param type Gives the given type of the Hero
	 */
	public void setType(String type) {
		if(heroTypes.contains(type)) {
			heroType = type;
		}
	}
	
	/**
	 * Returns the Hero type
	 * @return the type of the Hero
	 */
	public String getType() {
		return heroType;
	}
	
	/**
	 * Sets the ability of the Hero based on its type
	 */
	public void setAbility() {
		
	}
	
	/**
	 * Returns the ability of the Hero based on its type
	 * @return The Hero ability
	 */
	public String getAbility() {
		return heroAbility;
	}
	
	/**
	 * Adds the power-up item in an Array List
	 * @param item The power-up item
	 */
	public void addPowerUp(String item) {
		heroPowerUp.add(item);
	}
	
	/**
	 * Returns power up items in the Array List of heroPowerUp
	 * @return The power up items Hero has
	 */
	public ArrayList<String> getPowerUp() {
		return heroPowerUp;
	}
	
	/**
	 * Adds the healing item in an Array List
	 * @param item The healing item purchased
	 */
	public void addHealingItems(String item) {
		heroHealingItems.add(item);
	}
	
	/**
	 * Returns healing items in the Array List of heroHealingItems
	 * @return The healing items Hero has
	 */
	public ArrayList<String> getHealingItems() {
		return heroHealingItems;
	}
	
	/**
	 * Adds the map in an Array List
	 * @param item The map 
	 */
	public void addMap(String item) {
		heroMapList.add(item);
	}
	
	/**
	 * Returns the maps in the Array List of heroMapList
	 * @return The Maps the Hero has
	 */
	public ArrayList<String> getMap() {
		return heroMapList;
	}
	
	/**
	 * Sets the status of the Hero whether they are 
	 * alive (true) or dead (false)
	 * @param stats The status of the Hero
	 */
	public void setStatus(boolean stats) {
		heroStatus = stats;
	}
	
	/**
	 * Returns the status of the Hero whether they are
	 * alive (true) or dead (false)
	 * @return The status of the Hero
	 */
	public boolean getStatus() {
		return heroStatus;
	}
	
	public static void main(String[] args) {
		Hero creature = new Hero();
		creature.setType("Air");
		System.out.println("Creature type: " + creature.getType());
		creature.setStatus(true);
		System.out.println("Creature is alive: " + creature.getStatus());
		creature.addHealingItems("Healing Potion");
		System.out.println("Healing Items: " + heroHealingItems);
		creature.addHealingItems("Ultra Heal");
		System.out.println("Healing Items: " + heroHealingItems);
		creature.addPowerUp("Power Up");
		System.out.println("Power-up Items: " + heroPowerUp);
		creature.addPowerUp("Increase Max Health");
		System.out.println("Power-up Items: " + heroPowerUp);
		creature.addMap("City 1");
		System.out.println("Map List: " + heroMapList);
		creature.addMap("City 2");
		System.out.println("Map List: " + heroMapList);
	}
}
