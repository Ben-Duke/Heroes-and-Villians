import java.util.ArrayList;

public class Shop {
	GameModel modelref;
	ArrayList<Item> Inventory = new ArrayList<Item>();
	
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
