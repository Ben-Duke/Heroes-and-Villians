import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
/**
 * This class implements a Hero that has a health, type, special ability and 
 * different types of inventories
 * @author Angelica Dela Cruz & Ben Duke
 *
 * @version 1.1, 11 Apr 2018
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
	 * The healing 
	 */
	int orignalhealcount = 30;
	int timer = 30;
	final Timer heroTimer = new Timer();
			//new Timer(1000, this::HealTimer);
	/**
	 * The added increase max health by a power-up item
	 */
	private int increaseMaxHealthBy = 0;
	
	
	/**
	 * This is a constructor for the class Hero that sets the name and the type of Hero.
	 * @param _name A String value that is used as the name of the Hero.
	 * @param type A String value that determines the type of the Hero created.
	 */
	Hero(String _name, String type) {
		heroType = type;
		name = _name;
		setAbility();
	}

	public void givenUsingTimer_whenSchedulingTaskOnce_thenCorrect() {
	    TimerTask task = new TimerTask() {
	        public void run() {
	            System.out.println("Task performed on: " + "n" +
	              "Thread's name: " + Thread.currentThread().getName());
	        }
	    };
	    Timer timer = new Timer("Timer");
	     
	    long delay = 1000L;
	    timer.schedule(task, delay);
	}
	
	public void HealTimer(ActionEvent e)
	  {
	    // do something exciting
		//;
		System.out.println("has been 1 seconds");
		timer--;
		//timer -=1;
		if (timer == 0) {
			//timerOne.stop();
			System.out.println("timer hit zero");
			  // .setText("Yay healed up");
			//timer.stop();
		}
		else{
			System.out.println();
			//getTimerlb().setText(""+timeremaining);
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
		if(damage > 0) {
			currentHealth -= damage;
			if(currentHealth < 0) {
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
	
	public static void main(String[] args) {

		Hero creature = new Hero("Divine", "Brighty");
		System.out.println("Creature type: " + creature.getType());
		System.out.println(creature.getCurrentHealth());
		System.out.println(creature.getMaxHealth());
		creature.setStatus(true);
		System.out.println("Creature is alive: " + creature.getStatus());
		creature.addHealingItems("Healing Potion");
		creature.addHealingItems("Ultra Heal");
		
		Hero c1 = new Hero("Avian", "Air");
		System.out.println(c1.toString());
		System.out.println("Creature type: " + c1.getType());
		System.out.println(c1.getCurrentHealth());
		System.out.println(c1.getMaxHealth());
		System.out.println("Start");
		c1.givenUsingTimer_whenSchedulingTaskOnce_thenCorrect();
		System.out.println("End");
	}
}
