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
		name = newName;
		itemPrice = price;
	}
	
	/**
	 * Sets the price of the item to the parameter givenPrice
	 * @param givenPrice gives the price of the item
	 */
	public void setPrice(int givenPrice) {
		itemPrice = givenPrice;
	}
	
	public String getName() {
		return name;
	}
	/**
	 * Returns the price of the item
	 * @return the item price 
	 */
	public double getPrice() {
		return itemPrice;
	}

	public String toString() {
		return getName() + " " + getPrice(); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item thing = new Item("dib dob", 3);
		thing.setPrice(3);
		System.out.printf("The price is ", thing.getPrice());
	}

}
