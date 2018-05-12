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
	private ArrayList<String> heroTypes = new ArrayList<String>(Arrays.asList("Earth", "Air", "Water", "Fire", "Divine", "Demonic"));
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
	private ArrayList<String> heroPowerUp = new ArrayList<String>();
	/**
	 * The inventory for the healing items
	 */
	private ArrayList<String> heroHealingItems = new ArrayList<String>(); 
	/**
	 * The inventory for the map list
	 */
	private ArrayList<String> heroMapList = new ArrayList<String>();
	/**
	 * The status of the hero; if they are alive (true)
	 * and if they are dead (false)
	 */
	private boolean heroStatus = true;
	
	/**
	 * This is a constructor for the class Hero.
	 * @param type A String that determines the type of the Hero created.
	 */
	
	private String name = "";
	
	Hero(String _name, String type) {
		heroType = type;
		name = _name;
		setAbility();
	}
	
	/**
	 * A function that returns the current health of the Hero.
	 * @return Returns the Hero's health at the time and is an integer.
	 */
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	/**
	 * A function that returns the maximum health of the Hero.
	 * @return Returns the Hero's maximum possible health and is an integer.
	 */
	public int getMaxHealth() {
		return maxHealth;
	}
	
	/**
	 * A function that increases the health of the Hero by the given health
	 * once the timer is done.
	 * @param health The given health to increase the health of a Hero from its current health.
	 */
	public void increaseHealth(int health) {
		if(currentHealth < maxHealth) {
			currentHealth += health;
		}
	}
	
	/**
	 * A function that decreases the health of the Hero by the given damage.
	 * @param damage The given damage that decreases the health of a Hero from its current health.
	 */
	public void decreaseHealth(int damage) {
		if(currentHealth < maxHealth) {
			currentHealth -= damage;
		}
		
		if(currentHealth < 1) {
			heroStatus = false;
		}
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the type of the Hero given the parameter type.
	 * @param type A string that is used to set the type of the Hero.
	 */
	public void setType(String type) {
		if(heroTypes.contains(type)) {
			heroType = type;
		}
		setAbility();
	}
	
	/**
	 * A function that returns the type of the Hero.
	 * @return Returns the Hero's type.
	 */
	public String getType() {
		return heroType;
	}
	
	/**
	 * A function that sets the ability of the Hero based on its type.
	 */
	public void setAbility() {
		if(heroType == "Air") {
			heroAbility = "Map Expertise";
		}
		if(heroType == "Fire") {
			heroAbility = "Lower Price in Shops";
		}
		if(heroType == "Water") {
			heroAbility = "Faster Recovery Rates";
		}
		if(heroType == "Earth") {
			heroAbility = "Takes less Damage";
		}
		if(heroType == "Divine") {
			heroAbility = "Double Maximum Health";
			maxHealth = 200;
			currentHealth = 200;
		}
		if(heroType == "Demonic") {
			heroAbility = "Subtracts 2 lives to a Villain per win";
		}
		
		
	}
	
	/**
	 * A function that gets the ability of the Hero based on its type.
	 * @return Returns the ability of Hero.
	 */
	public String getAbility() {
		return heroAbility;
	}
	
	/**
	 * A function that adds the power-up item in an Array List.
	 * @param item A String that names the power-up item.
	 */
	public void addPowerUp(String item) {
		heroPowerUp.add(item);
	}
	
	/**
	 * A function that returns the power up items in the Array List of heroPowerUp.
	 * @return Returns an ArrayList of the power up items of the Hero.
	 */
	public ArrayList<String> getPowerUp() {
		return heroPowerUp;
	}
	
	/**
	 * A function that adds the healing item in an Array List.
	 * @param item A String that names the healing item.
	 */
	public void addHealingItems(String item) {
		heroHealingItems.add(item);
		System.out.println(heroHealingItems);
	}
	
	/**
	 * A function that returns the healing items in the Array List of heroHealingItems.
	 * @return Returns an ArrayList of the healing items of the Hero.
	 */
	public ArrayList<String> getHealingItems() {
		return heroHealingItems;
	}
	
	/**
	 * A function that adds the map of a city in an Array List.
	 * @param item A String that names the map of a given city.
	 */
	public void addMap(String item) {
		heroMapList.add(item);
	}
	
	/**
	 * A function that returns the maps in the Array List of heroMapList.
	 * @return Returns an ArrayList of the map items of the Hero.
	 */
	public ArrayList<String> getMap() {
		return heroMapList;
	}
	
	/**
	 * Sets the status of the Hero whether they are alive (true) or dead (false).
	 * @param stats A boolean value that states whether the Hero is alive or not.
	 */
	public void setStatus(boolean stats) {
		heroStatus = stats;
	}
	
	/**
	 * Returns the status of the Hero whether they are alive (true) or dead (false)
	 * @return Returns the status of the Hero; if they are alive or not.
	 */
	public boolean getStatus() {
		return heroStatus;
	}
	
	public static void main(String[] args) {
		Hero creature = new Hero("Divine", "Brighty");
		System.out.println("Creature type: " + creature.getType());
		System.out.println(creature.getCurrentHealth());
		System.out.println(creature.getMaxHealth());
		creature.setStatus(true);
		System.out.println("Creature is alive: " + creature.getStatus());
		creature.addHealingItems("Healing Potion");
		creature.addHealingItems("Ultra Heal");
		Hero c1 = new Hero("Air", "Avian");
		System.out.println("Creature type: " + c1.getType());
		System.out.println(c1.getCurrentHealth());
		System.out.println(c1.getMaxHealth());
		/*
		System.out.println("Healing Items: " + heroHealingItems);
		creature.addPowerUp("Power Up");
		System.out.println("Power-up Items: " + heroPowerUp);
		creature.addPowerUp("Increase Max Health");
		System.out.println("Power-up Items: " + heroPowerUp);
		creature.addMap("City 1");
		System.out.println("Map List: " + heroMapList);
		creature.addMap("City 2");
		System.out.println("Map List: " + heroMapList);
		*/
	}
}
