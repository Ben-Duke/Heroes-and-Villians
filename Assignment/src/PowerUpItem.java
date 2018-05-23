/**
 * This class implements a Power up Item that makes the Heroes stronger.
 * The stronger the Heroes are, the easier it is to defeat a Villain.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class PowerUpItem extends Item{
	/**
	 * The type of the power-up item
	 */
	String power;
	/**
	 * The amount of boost the power-up item gives
	 */
	int powerAmount;
	
	/**
	 * The constructor for the class PowerUpItem which sets the name, price, type and power-up boost
	 * for the item.
	 * @param newName A String value that is used to set the name of the item.
	 * @param price An Integer value that is used to set the price of the item.
	 * @param type A String value that indicates the type of the item.
	 * @param value An Integer value that sets the power-up boost of the item.
	 */
	PowerUpItem(String newName, int price , String type, int value) {
		super(newName, price);
		power = type;
		powerAmount = value;
	}
	
	/**
	 * This function returns the type of the power-up item.
	 * @return Returns a String representation of the type of the power-up item.
	 */
	public String getPower() {
		return power;
	}
	
	/**
	 * This function returns the amount of boost the power-up item gives to the Hero.
	 * @return Returns an Integer value representing the power-up boost.
	 */
	public int getPowerAmount() {
		return powerAmount;
	}
	
	/**
	 * This function uses the power-up item on the Hero and applies the effects of it on the Hero.
	 * @param hero The Hero character that the power-up item is used on.
	 */
	public void useOn(Hero hero) {
		System.out.println("Using on hero");
		if (power == "res") {
			hero.applyResistance(powerAmount);
		}if(power == "max") {
			hero.increaseMax(powerAmount);
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		PowerUpItem testingpowerUp = new PowerUpItem("Decrease battle damage", 150, "res", 10);
//		System.out.println(testingpowerUp.getName());
//		System.out.println(testingpowerUp.getPrice());
//	}

}
