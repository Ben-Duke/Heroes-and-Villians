/**
 * This class implements Item that sets and gets the price of the given
 * item
 * 
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, 6 Apr 2018
 */
public class Item {
	/**
	 * Price of Item
	 */
	private int itemPrice;
	
	/**
	 * The name of the Item
	 */
	private String name;
	
	/**
	 * The constructor class of class Item that sets the name and the price 
	 * of the Item.
	 * @param newName
	 * @param price
	 */
	Item(String newName, int price){
		setName(newName);
		setPrice(price);
	}
	
	/**
	 * Sets the price of the item to the parameter givenPrice
	 * @param givenPrice gives the price of the item
	 */
	public void setPrice(int givenPrice) {
		if(givenPrice < 0) {
			itemPrice = 0;
		} else {
			itemPrice = givenPrice;
		}
	}
	
	/**
	 * A function that takes a String givenName that is used to set the
	 * name of the Item
	 * @param givenName
	 */
	public void setName(String givenName) {
		name = givenName;
	}
	
	/**
	 * A function that gets the name of the Item
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the price of the Item
	 * @return the item price 
	 */
	public int getPrice() {
		return itemPrice;
	}

	/**
	 * The String representation of an object Item.
	 */
	public String toString() {
		return getName() + " " + "$"+getPrice(); 
	}
}
