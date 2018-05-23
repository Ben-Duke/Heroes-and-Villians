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
	
	private int resistance = 0;
	
	int orignalhealcount = 30;
	int timer = 30;
	final Timer heroTimer = new Timer();
			//new Timer(1000, this::HealTimer);
	/**
	 * This is a constructor for the class Hero.
	 * @param type A String that determines the type of the Hero created.
	 */
	
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
	
	private String name = "";
	
	public String toString() {
		return "Hero: " + name + " Health: " + currentHealth + "/" + maxHealth + " Res: " + resistance;
	}
	
	int getResistance() {
		return resistance;
	}
	void applyResistance(int amount) {
		resistance += amount;
	}
	
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
		if(currentHealth <= maxHealth) {
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
		if(currentHealth <= maxHealth) {
			currentHealth -= damage;
			if(currentHealth < 0) {
				currentHealth = 0;
			}
		}
		if(currentHealth < 1) {
			currentHealth = 0;
			heroStatus = false;
		}
	}
	
	public void increaseMax(int amount) {
		maxHealth += amount;
		currentHealth += amount;
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
