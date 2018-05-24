import java.util.ArrayList;
/**
 * This class implements a Team of super heroes that will save the world. 
 * This team of Super Heroes are super strong and determined to kill all the villains.
 *
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.2, May 2018.
 */
public class Team {
	/**
	 * The name of the Team
	 */
	private String teamName;
	/**
	 * The Heroes in the Team
	 */
	private ArrayList<Hero> teamHeroes = new ArrayList<Hero>();
	/**
	 * The Power-up items of the Team
	 */
	private ArrayList<PowerUpItem> teamPowerup = new ArrayList<PowerUpItem>();
	/**
	 * The Healing items of the Team
	 */
	private ArrayList<HealingItem> teamHealingItems = new ArrayList<HealingItem>();
	
	/**
	 * The Map items of the Team
	 */
	private ArrayList<String> teamMapList = new ArrayList<String>();
	/**
	 * The total money of the Team
	 */
	private int teamMoney = 500;
	
	/**
	 * A function that acts like an inventory for whole Team.
	 * @return Returns an Array List of all the items the Team has.
	 */
	public ArrayList<Item> getAllItems(){
		ArrayList<Item> items = new ArrayList<Item>();
		
		for (int i = 0; i < teamHealingItems.size();i++) {
			items.add((Item) teamHealingItems.toArray()[i]);
		}
		for (int j = 0; j < teamPowerup.size();j++) {
			items.add((Item) teamPowerup.toArray()[j]);
		}
		return items;
	}
	
	public ArrayList<Hero> getHealingHeroes(){
		ArrayList<Hero> healing = new ArrayList<Hero>();
		for (int i = 0; i < teamHeroes.size(); i++) {
			if ((teamHeroes.get(i)).herohealingflag()) {
				healing.add(teamHeroes.get(i));
			}
		}
		return healing;
	}
	
	/**
	 * A function that takes a String name that is used to set the name of the Team made.
	 * @param name A String that is used to set the teamName.
	 */
	public void setTeamName(String name) {
		if((name.length() >= 2) && (name.length() <= 10)) {
			teamName = name;
		}
	}
	
	/**
	 * A function that returns the name of the Team created.
	 * @return Returns a String representation of the Team name.
	 */
	public String getTeamName() {
		return teamName;
	}
	
	/**
	 * A function that returns the remaining money of the Team.
	 * @return Returns an Integer value of the total Team money.
	 */
	public int getTeamMoney() {
		return teamMoney;
	}
	
	/**
	 * A function that adds the Hero into the Team. It takes the String parameter name which 
	 * is added to the Array List of teamHeroes. The maximum number of Heroes a Team can have is 3.
	 * @param name A String parameter name that represents the name of the Hero.
	 */
	public String addHeroes(String name, String type) {
		if(teamHeroes.size() != 3){ 
			if (!checkName(name)) {
				Hero temphero = new Hero(name, type);
				teamHeroes.add(temphero);
				return "Success";
			}
		}
		return "Failed";
	}
	
	/**
	 * A function that checks the name of the Hero if it is already in the Team
	 * of Heroes.
	 * @param name The String representation of the name of the Hero
	 * @return Returns true or false depending if the Hero is already in the Team.
	 */
	public boolean checkName(String name) {
		
		for (Hero tempHero: teamHeroes) {
			
			if (tempHero.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * A function that returns the Heroes in the Team.
	 * @return Returns an Array List of Hero that contains the names of the Hero that is part of the Team.
	 */
	public ArrayList<Hero> getHeroes() {
		return teamHeroes;
	}
	
	/**
	 * A function that adds the power-up items into the Team inventory. 
	 * @param item A power-up item
	 */
	public void addPowerUpitem(PowerUpItem item) {
		teamPowerup.add(item);
	}
	
	/**
	 * A function that returns the power-up items the Team have.
	 * @return Returns an Array List of power-up items of the Team.
	 */
	public ArrayList<PowerUpItem> getPowerUpList() {
		return teamPowerup;
	}
	
	/**
	 * A function that adds the healing items into the Team inventory.
	 * @param object A healing item
	 */
	public void addHealingItems(Object object) {
		teamHealingItems.add((HealingItem) object);
	}
	
	/**
	 * A function that returns the healing items the Team have.
	 * @return Returns an Array List of the healing items of the Team.
	 */
	public ArrayList<HealingItem> getHealingItemsList() {
		return teamHealingItems;
	}
	
	/**
	 * A function that adds the map items into the Team inventory. 
	 * @param items A map of a city
	 */
	public void addMapList(String items) {
		teamMapList.add(items);
	}
	
	/**
	 * A function that returns the maps the Team have.
	 * @return Returns an Array List of the maps of the Team.
	 */
	public ArrayList<String> getMapList() {
		return teamMapList;
	}
	
	/**
	 * Once the power-up item is consumed, it gets remove from the inventory.
	 * @param item A power-up item
	 */
	public void removePowerUp(PowerUpItem item) {
		teamPowerup.remove(item);
	}
	
	public void removeHealingItem(HealingItem item) {
		teamHealingItems.remove(item);
	}
	
	/**
	 * A function that increases the money of the Team by the given parameter money.
	 * @param money An integer parameter that is used to increase the money of the Team.
	 */
	public void increaseMoney(int money) {
		if(money > 0) {
			teamMoney += money;	
		}
	}
	
	/**
	 * A function that decreases the money of the Team by the given parameter money.
	 * @param money An Integer value that is used to decrease the Team money.
	 */
	public void decreaseMoney(int money) {
		if(money > 0) {
			teamMoney -= money;
			if(teamMoney <= 0) {
				teamMoney = 0;
		}
		} if(teamMoney <= 0) {
			teamMoney = 0;
		}
	}

//	public static void main(String[] args) {
//		Team testingTeam = new Team();
//		testingTeam.addHeroes("Ruby", "Fire");
//		testingTeam.addHeroes("Wave", "Water");
//		System.out.println(testingTeam.getHeroes());
//		System.out.println(testingTeam.getHealingHeroes());	
//	}
} 


