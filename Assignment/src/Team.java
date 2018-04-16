import java.util.ArrayList;

/**
 * This class implements Team where it consists of a team name, a list of heroes, 
 * inventories of the whole team and their money.
 * @author Angelica Dela Cruz & Ben Duke
 *
 */
public class Team {
	
	/**
	 * The name of the Team
	 */
	private String teamName;
	
	/**
	 * The Array List of Strings that contains the heroes in the Team
	 */
	private ArrayList<Hero> teamHeroes = new ArrayList<Hero>();
	
	/**
	 * The Array List of an Array List that contains Strings which represents the power up items found within the Team.
	 */
	private ArrayList<ArrayList<String>> teamPowerup = new ArrayList<ArrayList<String>>();
	
	/**
	 * The Array List of an Array List that contains Strings which represents the healing items found within the Team.
	 */
	private ArrayList<ArrayList<String>> teamHealingItems = new ArrayList<ArrayList<String>>();
	
	/**
	 * The Array List of an Array List that contains Strings which represents the map items found within the Team.
	 */
	private ArrayList<ArrayList<String>> teamMapList = new ArrayList<ArrayList<String>>();
	
	/**
	 * The overall money of the Team.
	 */
	private int teamMoney = 300;
	
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
	 * @return Returns a String representation of the name of the Team.
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * A function that adds the Heroes into the Team. It takes the String parameter name which 
	 * is added to the Array List of teamHeroes. The maximum number of Heroes a Team can have is 3.
	 * @param name A String parameter name that represents the name of the Hero.
	 */
	public void addHeroes(Hero name) {
		if(!(teamHeroes.contains(name)) && (teamHeroes.size() != 3)) { 
			teamHeroes.add(name);
		}
	}
	
	/**
	 * A function that returns the list of Heroes in the team.
	 * @return Returns an Array List of String that represents the names of the Hero that is part of the Team.
	 */
	public ArrayList<Hero> getHeroes() {
		return teamHeroes;
	}
	
	/**
	 * A function that adds the power up items into the Team inventory. It takes an Array List of String items
	 * which is added to the Team inventory of Power up items: teamPowerup.
	 * @param items An Array List of String that represents the power up items a Hero has.
	 */
	public void addPowerUpList(ArrayList<String> items) {
		teamPowerup.add(items);
	}
	
	/**
	 * A function that returns the power up items the Team has overall.
	 * @return Returns an Array List of an Array List of String that represents 
	 * the power up items the Team owns.
	 */
	public ArrayList<ArrayList<String>> getPowerUpList() {
		return teamPowerup;
	}
	
	/**
	 * A function that adds the healing items into the Team inventory. It takes an Array List of String items
	 * which is added to the Team inventory of Healing Items: teamHealingItems.
	 * @param items An Array List of String that represents the healing items a Hero has.
	 */
	public void addHealingItemsList(ArrayList<String> items) {
		teamHealingItems.add(items);
	}
	
	/**
	 * A function that returns the healing items the Team has overall.
	 * @return Returns an Array List of an Array List of String that represents
	 * the healing items the Team owns.
	 */
	public ArrayList<ArrayList<String>> getHealingItemsList() {
		return teamHealingItems;
	}
	
	/**
	 * A function that adds the map list into the Team inventory. It takes an Array List of String items
	 * which is added to the Team inventory of Map Items: teamMapList.
	 * @param items An Array List of String that represents the map items a Hero has.
	 */
	public void addMapList(ArrayList<String> items) {
		teamMapList.add(items);
	}
	
	/**
	 * A function that returns the map list the Team has overall.
	 * @return Returns an Array List of an Array List of String that represents
	 * the map list the Team owns.
	 */
	public ArrayList<ArrayList<String>> getMapList() {
		return teamMapList;
	}
	
	/**
	 * A function that increases the money of the Team by the given parameter money.
	 * @param money An integer parameter that is used to increase the money of the Team.
	 */
	public void increaseMoney(int money) {
		teamMoney += money;	
	}
	
	/**
	 * A function that decreases the money of the Team by the given parameter money.
	 * @param money An integer parameter that is used to decrease the money of the Team.
	 */
	public void decreaseMoney(int money) {
		if(teamMoney > 0) {
			teamMoney -= money;
		} if((teamMoney == 0) || (teamMoney < 1)) {
			teamMoney = 0;
		}
	}
	
	/**
	 * A function that returns the money of the Team at the time.
	 * @return Returns an integer which represents the remaining money the Team has currently.
	 */
	public int getMoney() {
		return teamMoney;
	}

	public static void main(String[] args) {
		Team PowerRangers = new Team();
		PowerRangers.setTeamName("Poweranger");
		System.out.println(PowerRangers.getTeamName());
		
		//Trying out by adding the inventories of each hero 
		// to the overall inventory
		Hero c1 = new Hero("Air");
		c1.addHealingItems("Heal1");
		c1.addHealingItems("Heal2");
		PowerRangers.addHealingItemsList(c1.getHealingItems());
		
		Hero c2 = new Hero("Divine");
		c2.addHealingItems("Heal3");
		c2.addHealingItems("Heal4");
		PowerRangers.addHealingItemsList(c2.getHealingItems());
		System.out.println(PowerRangers.getHealingItemsList());
		
		PowerRangers.getMoney();
		PowerRangers.increaseMoney(100);
		PowerRangers.decreaseMoney(200);
		System.out.println(PowerRangers.getMoney());
		
	}

}
