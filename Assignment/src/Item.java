import java.text.DecimalFormat;

/**
 * This class implements Item that sets and gets the price of the given
 * item
 * 
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, 6 Apr 2018
 */
public class Item {
	/**
	 * Price of item
	 */
	private int itemPrice;
	private String name;
	
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
	
	public void setName(String givenName) {
		name = givenName;
	}
	
	public String getName() {
		return name;
	}
	/**
	 * Returns the price of the item
	 * @return the item price 
	 */
	public int getPrice() {
		return itemPrice;
	}

}
