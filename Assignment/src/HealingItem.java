/**
 * The class Healing Item inherits from the class Item and contains
 * a name, given price and healing amount
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, 20 May 18
 */
public class HealingItem extends Item{

	int heal = 10;
	HealingItem(String newName, int price, int _heal) {
		super(newName, price);
		// TODO Auto-generated constructor stub
		heal = _heal;
	}
	
	int healAmount() {
		return heal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
