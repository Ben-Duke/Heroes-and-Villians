import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class implements a Hero that has a health, type, special ability and 
 * different types of inventories
 * @author Angelica Dela Cruz & Ben Duke
 *
 * @version 1.1, Apr 2018.
 */
public class Hero {
	/**
	 * The name of the Hero
	 */
	private String name = "";
	/**
	 * The types of Heroes
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
	
	private boolean healingflag = false;
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
	 * The status of the hero; if they are alive (true) and if they are dead (false)
	 */
	private boolean heroStatus = true;
	/**
	 * The added damage reduction in battle for Hero
	 */
	private int resistance = 0;
	/**
	 * Reference to bring the counter back to the original Count
	 */
	private int orignalhealcount = 30;
	/**
	 * Count-down of the Timer
	 */
	private int healtimer = 30;
	/**
	 * Timer of the Hero
	 */
	private final Timer herotimer = new Timer(1000, this::HealTimer);
	/**
	 * The added increase max health by a power-up item
	 */
	private int increaseMaxHealthBy = 0;
	/**
	 * The amount the Hero is healed by
	 */
	private int healingAmount = 0;
	
	/**
	 * This is a constructor for the class Hero that sets the name and the type of Hero.
	 * @param _name A String value that is used as the name of the Hero.
	 * @param type A String value that determines the type of the Hero created.
	 */
	Hero(String _name, String type) {
		heroType = type;
		name = _name;
		setAbility();
		if(type == "Water") {
			//Ability bonus
			orignalhealcount = 15;
			healtimer = 15;
		}
	}

	/**
	 * This function gives the current time on the Timer.
	 * @return Returns the time of the Timer.
	 */
	public int currentTime() {
		return healtimer;
	}

	/**
	 * This function sets the healing amount by the specified amount.
	 * @param amount An Integer value that represents the health boost that is 
	 * given to the Hero.
	 */
	public void setHealingAmount(int amount) {
		healingAmount = amount;
	}
	
	/**
	 * This function returns the healing amount 
	 * @return Returns an Integer value that represents the health boost given to
	 * the Hero.
	 */
	public int getHealingAmount() {
		return healingAmount;
	}
	
	/**
	 * This function starts the healing time for the Hero.
	 */
	public void startHealTimer() {
		herotimer.start();
		healingflag = true;
	}
	
	/**
	 * This function tags the Hero as healing so they can be added to the list later on.
	 * @return Returns a boolean value, true if Hero's healing, otherwise false.
	 */
	public boolean herohealingflag() {
		return healingflag;
	}
	
	/**
	 * This function times the Healing for the Hero.
	 * @param e An action event
	 */
	public void HealTimer(ActionEvent e)
	  {
	    // do something exciting
		//;
		System.out.println("has been 1 seconds");
		healtimer--;
		if (healtimer == 0) {
			herotimer.stop();
			healingflag = false;
			increaseHealth(healingAmount);
			System.out.println("timer hit zero");
			healtimer = orignalhealcount;
		}
		else{
			System.out.println();
		}
	  }
	
	
	/**
	 * This function applies the added damage reduction in battles to the health of the Hero.
	 * @param amount An Integer value that reduces the damage of the Villain to the Hero's health.
	 */
	public void applyResistance(int amount) {
		if(amount > 0) {
			resistance += amount;
		}
	}
	
	/**
	 * This function returns the added damage reduction in battles to the health of the Hero.
	 * @return Returns an Integer value that represents the reduction in the damage 
	 * of the Villain to the Hero's health.
	 */
	public int getResistance() {
		return resistance;
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
			if(currentHealth > maxHealth) {
				currentHealth = maxHealth;
			}
		}
	}
	
	/**
	 * A function that decreases the health of the Hero by the given damage.
	 * @param damage The given damage that decreases the health of a Hero from its current health.
	 */
	public void decreaseHealth(int damage) {
		damage = damage - resistance;
		if(damage > 0) {
			currentHealth -= damage;
			if(currentHealth <= 0) {
				currentHealth = 0;
				heroStatus = false;
			}
		}
	}
	
	/**
	 * This function increases the overall health of the Hero by the given amount.
	 * @param amount An Integer value that represents the health boost given by special items.
	 */
	public void increaseMax(int amount) {
		increaseMaxHealthBy = amount;
		maxHealth += amount;
		currentHealth += amount;
	}
	
	/**
	 * This function returns the increase maximum health resulted by special items.
	 * @return Returns an Integer value that represents the health boost given by special items.
	 */
	public int getIncreaseMax() {
		return increaseMaxHealthBy;
	}
	
	/**
	 * This function returns the name of the Hero
	 * @return Returns a String that represents name of the Hero.
	 */
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
	 * This function returns the type of the Hero.
	 * @return Returns the Hero's type.
	 */
	public String getType() {
		return heroType;
	}
	
	/**
	 * This function sets the ability of the Hero based on its type.
	 */
	public void setAbility() {
		if(heroType == "Air") {
			heroAbility = "Map Expertise";
		}
		if(heroType == "Fire") {
			heroAbility = "Lower Price in Shops";
		}
		if(heroType == "Water") {
			maxHealth = 70;
			currentHealth = 70;
			heroAbility = "Faster Recovery Rates";
		}
		if(heroType == "Earth") {
			heroAbility = "Takes less Damage";
			applyResistance(20);
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
	 * This function gets the ability of the Hero based on its type.
	 * @return Returns the ability of Hero.
	 */
	public String getAbility() {
		return heroAbility;
	}
	
	/**
	 * This function adds the power-up item in an Array List.
	 * @param item A String that names the power-up item.
	 */
	public void addPowerUp(String item) {
		heroPowerUp.add(item);
	}
	
	/**
	 * This function returns the power-up items in the Array List of heroPowerUp.
	 * @return Returns an ArrayList of the power up items of the Hero.
	 */
	public ArrayList<String> getPowerUp() {
		return heroPowerUp;
	}
	
	/**
	 * This function adds the healing item in an Array List.
	 * @param item A String that names the healing item.
	 */
	public void addHealingItems(String item) {
		heroHealingItems.add(item);
		System.out.println(heroHealingItems);
	}
	
	/**
	 * This function returns the healing items in the Array List of heroHealingItems.
	 * @return Returns an ArrayList of the healing items of the Hero.
	 */
	public ArrayList<String> getHealingItems() {
		return heroHealingItems;
	}
	
	/**
	 * This function adds the map of a city in an Array List.
	 * @param item A String that names the map of a given city.
	 */
	public void addMap(String item) {
		heroMapList.add(item);
	}
	
	/**
	 * This function returns the maps in the Array List of heroMapList.
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
	
	/**
	 * The string representation of a Hero
	 */
	public String toString() {
		return "Hero: " + name + " Health: " + currentHealth + "/" + maxHealth + " Res: " + resistance;
	}
	
	
	/**
	 * The string representation of a Hero
	 */
	public String toStringHospitalTimer() {
		return "Hero: " + name + " Health: " + currentHealth + "/" + maxHealth + " Time to heal: " +  healtimer + " Seconds";
	}
	
//	public static void main(String[] args) {
//		Hero testingHero = new Hero("Soil", "Earth");
//		System.out.println(testingHero.getCurrentHealth());
//		testingHero.decreaseHealth(50);
//		testingHero.increaseHealth(30);
//		System.out.println(testingHero.getCurrentHealth());
//		
////		Hero creature = new Hero("Divine", "Brighty");
////		System.out.println("Creature type: " + creature.getType());
////		System.out.println(creature.getCurrentHealth());
////		System.out.println(creature.getMaxHealth());
////		creature.setStatus(true);
////		System.out.println("Creature is alive: " + creature.getStatus());
////		creature.addHealingItems("Healing Potion");
////		creature.addHealingItems("Ultra Heal");
////		
////		Hero c1 = new Hero("Avian", "Air");
////		System.out.println(c1.toString());
////		System.out.println("Creature type: " + c1.getType());
////		System.out.println(c1.getCurrentHealth());
////		System.out.println(c1.getMaxHealth());
////		System.out.println("Start");
////		//c1.givenUsingTimer_whenSchedulingTaskOnce_thenCorrect();
////		System.out.println("End");
//}
}
