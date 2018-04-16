import java.util.ArrayList;

public class Team {
	private String teamName;
	private ArrayList<String> teamHeroes = new ArrayList<String>();
	private ArrayList<ArrayList<String>> teamPowerup = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> teamHealingItems = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> teamMapList = new ArrayList<ArrayList<String>>();
	private int teamMoney = 300;
	
	public void setTeamName(String name) {
		if((name.length() >= 2) && (name.length() <= 10)) {
			teamName = name;
		}
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void addHeroes(String name) {
		if(!(teamHeroes.contains(name))) {
			teamHeroes.add(name);
		}
	}
	
	public ArrayList<String> getHeroes() {
		return teamHeroes;
	}
	
	public void addPowerUpList(ArrayList<String> items) {
		teamPowerup.add(items);
	}
	
	public ArrayList<ArrayList<String>> getPowerUpList() {
		return teamPowerup;
	}
	
	public void addHealingItemsList(ArrayList<String> items) {
		teamHealingItems.add(items);
	}
	
	public ArrayList<ArrayList<String>> getHealingItemsList() {
		return teamHealingItems;
	}
	
	public void addMapList(ArrayList<String> items) {
		teamMapList.add(items);
	}
	
	public ArrayList<ArrayList<String>> getMapList() {
		return teamMapList;
	}
	
	public void increaseMoney(int money) {
		teamMoney += money;	
	}
	
	public void decreaseMoney(int money) {
		if(teamMoney > 0) {
			teamMoney -= money;
		} if((teamMoney == 0) || (teamMoney < 1)) {
			teamMoney = 0;
		}
	}
	
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
