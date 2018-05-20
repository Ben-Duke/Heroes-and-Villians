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
		HealingItem tempItem = new HealingItem("Heal 25%", 100, 25);
		HealingInventory.add(tempItem);
		PowerUpItem tempPowerUpItem = new PowerUpItem("Decrease battle damage", 150);
		PowerUpInventory.add(tempPowerUpItem);
	}
	int showTeamMoney() {
		return modelref.game_team.getTeamMoney();
	}
	
	
	String showObjectAttributes() {
		return "";
	}
	
	void purchasePowerUps() {
		
	}
	
	void purchaseMaps(){
		
	}
	
	void purchaseHealingItems(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
