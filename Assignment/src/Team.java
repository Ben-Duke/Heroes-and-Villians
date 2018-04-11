import java.util.ArrayList;

public class Team {
	private String teamName;
	private ArrayList<String> teamHeroes = new ArrayList<String>();
	private ArrayList<ArrayList<String>> teamPowerup = new ArrayList<ArrayList<String>>();
	private static ArrayList<ArrayList<String>> teamHealingItems = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> teamMapList = new ArrayList<ArrayList<String>>();
	private int teamMoney = 300;

	public void addHero(String name) {
		if(!(teamHeroes.contains(name))) {
			teamHeroes.add(name);
		}
	}
	
	public void addPowerUpList(ArrayList<String> items) {
		teamPowerup.add(items);
	}
	
	public void addHealingItemsList(ArrayList<String> items) {
		teamHealingItems.add(items);
	}
	
	public void addMapList(ArrayList<String> items) {
		teamMapList.add(items);
	}
	
	public void increaseMoney(int money) {
		teamMoney += money;	
	}
	
	public void decreaseMoney(int money) {
		teamMoney -= money;
	}
	
	public int getMoney() {
		return teamMoney;
	}
	
	public static void main(String[] args) {
		Team PowerRangers = new Team();
		Hero c1 = new Hero();
		c1.addHealingItems("Heal1");
		PowerRangers.addHealingItemsList(c1.getHealingItems());
		System.out.println(teamHealingItems);
		Hero c2 = new Hero();
		c1.addHealingItems("Heal2");
		PowerRangers.addHealingItemsList(c2.getHealingItems());
		System.out.println(teamHealingItems);
		
	}

}
