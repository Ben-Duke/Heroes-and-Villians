import java.util.ArrayList;

public class Shop {
	GameModel modelref;
	ArrayList<HealingItem> HealingInventory = new ArrayList<HealingItem>();
	ArrayList<PowerUpItem> PowerUpInventory = new ArrayList<PowerUpItem>();
	
	ArrayList<Item> showTeamInventory() {
		ArrayList<Item> temp = new ArrayList<Item>();
		ArrayList<HealingItem> tempheal = modelref.getTeam().getHealingItemsList();
		ArrayList<PowerUpItem> temppower = modelref.getTeam().getPowerUpList();
		for (int i = 0; i < tempheal.size(); i ++) {
			temp.add(tempheal.get(i));
		}
		
		for (int j = 0; j < tempheal.size(); j ++) {
			temp.add(temppower.get(j));
		}
		return temp;
	}
	
	
	Shop(){
		HealingInventory.add(new HealingItem("Heal 25%", 100, 25));
		HealingInventory.add(new HealingItem("Heal 50%", 200, 50));
		HealingInventory.add(new HealingItem("Heal 100%", 300, 100));
		PowerUpInventory.add(new PowerUpItem("Decrease battle damage", 150, "res", 10));
		PowerUpInventory.add(new PowerUpItem("Increase max health", 150, "max", 100));
		PowerUpInventory.add(new PowerUpItem("Decrease battle damage maxed", 250, "res", 30));
	}
	int showTeamMoney() {
		return modelref.game_team.getTeamMoney();
	}
	
	ArrayList<HealingItem> getHealingItems(){
		return HealingInventory;
	}
	
	ArrayList<PowerUpItem> getPowerUpItems(){
		return PowerUpInventory;
	}
	
	String showObjectAttributes() {
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
