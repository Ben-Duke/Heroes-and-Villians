/**
 * This class implements Healing Item which the doctors can use in the Hospital to heal the
 * injured Heroes and to even revive some of them that are in the verge of death.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class HealingItem extends Item{
	/**
	 * The amount of healing boost the item gives
	 */
	private int heal = 10;
	
	/**
	 * The constructor for the class Healing Item that sets the name, price and the healing
	 * boost the item gives to the Hero.
	 * @param newName A String value that is used to represent the name of the healing item
	 * @param price An Integer value that determines the price for the healing item.
	 * @param _heal An Integer value that sets the healing boost of the healing item.
	 */
	HealingItem(String newName, int price, int _heal) {
		super(newName, price);
		heal = _heal;
	}
	
	/**
	 * This function returns the healing boost of the healing item.
	 * @return Returns an Integer value which represents the healing boost from the special item.
	 */
	public int healAmount() {
		return heal;
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	public void useOn(Hero hero, int amount) {
		//hero
		hero.increaseHealth(amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
