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
	private double itemPrice;
	
	/**
	 * Sets the price of the item to the parameter givenPrice
	 * @param givenPrice gives the price of the item
	 */
	public void setPrice(double givenPrice) {
		itemPrice = givenPrice;
	}
	
	/**
	 * Returns the price of the item
	 * @return the item price 
	 */
	public double getPrice() {
		return itemPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item thing = new Item();
		thing.setPrice(3.00);
		System.out.printf("The price is %.2f", thing.getPrice());
	}

}
