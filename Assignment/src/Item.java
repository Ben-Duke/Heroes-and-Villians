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
	 * The constructor for class Item that sets the name and the price 
	 * of the Item.
	 * @param newName A String value that is used to set the name of the item.
	 * @param price An Integer value that is used to set the price of the item.
	 */
	Item(String newName, int price){
		name = newName;
		if(price < 0) {
			itemPrice = 0;
		} else {
			itemPrice = price;
		}
	}
	
	/**
	 * Sets the price of the item to the parameter givenPrice
	 * @param givenPrice gives the price of the item
	 */
	public void setPrice(int givenPrice) {
		if(givenPrice > 0) {
			itemPrice = givenPrice;
		} 
	}
	
	/**
	 * A function that takes a String givenName that is used to set the
	 * name of the Item
	 * @param givenName A String value that is used to set the item's name
	 */
	public void setName(String givenName) {
		name = givenName;
	}
	
	/**
	 * A function that gets the name of the Item
	 * @return Returns a String value that represents name of the item
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the price of the Item
	 * @return Returns an Integer value which represents the item price.
	 */
	public int getPrice() {
		return itemPrice;
	}

	/**
	 * A String representation for the class Item that includes the 
	 * name and the price of the item.
	 * @return Returns the string representation of the item.
	 */
	public String toStringShop() {
		return getName() + " " + "$"+getPrice(); 
	}
	
	/**
	 * A String representation for the class Item that includes the 
	 * name of the item.
	 */
	public String toString() {
		return getName(); 
	}

}
