import java.util.ArrayList;

/**
 * This class implements a Shop where heroes can buy goodies that will help them defeat the Villain.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class Shop {
	/**
	 * References an instance of Game Model
	 */
	private GameModel modelref;
	/**
	 * Healing Inventory
	 */
	private ArrayList<HealingItem> HealingInventory = new ArrayList<HealingItem>();
	/**
	 * Power-up Inventory
	 */
	private ArrayList<PowerUpItem> PowerUpInventory = new ArrayList<PowerUpItem>();
	
	/**
	 * This function returns an instance of the Team Inventory
	 * @return Returns a Team inventory instance
	 */
	public ArrayList<Item> showTeamInventory() {
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
	
	/**
	 * The constructor for the Shop which initializes all the items in the Shop.
	 */
	Shop(){
		HealingInventory.add(new HealingItem("Heal 25%", 100, 25));
		HealingInventory.add(new HealingItem("Heal 50%", 200, 50));
		HealingInventory.add(new HealingItem("Heal 100%", 300, 100));
		PowerUpInventory.add(new PowerUpItem("Decrease battle damage", 150, "res", 10));
		PowerUpInventory.add(new PowerUpItem("Increase max health", 150, "max", 100));
		PowerUpInventory.add(new PowerUpItem("Decrease battle damage maxed", 250, "res", 30));
	}
	
	/**
	 * This function returns an instance of the Team money.
	 * @return Returns an instance of the money of the Team
	 */
	public int showTeamMoney() {
		return modelref.getTeam().getTeamMoney();
	}
	
	/**
	 * This function returns the Healing items the Heroes can buy
	 * @return Returns an Array List of the Healing Items
	 */
	public ArrayList<HealingItem> getHealingItems(){
		return HealingInventory;
	}
	
	/**
	 * This function returns the Power-up items the Heroes can buy
	 * @return Returns an Array List of the Power-up Items
	 */
	public ArrayList<PowerUpItem> getPowerUpItems(){
		return PowerUpInventory;
	}
	
	/**
	 * This function shows the Attributes of an Object
	 * @return Returns a String representation of the Object's attributes.
	 */
	String showObjectAttributes() {
		return "";
	}

//	public static void main(String[] args) {
//		Shop testingShop = new Shop();
//		System.out.println(testingShop.getPowerUpItems());
//	}

}
