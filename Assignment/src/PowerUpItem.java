
public class PowerUpItem extends Item{
	String power;
	int powerAmount;
	PowerUpItem(String newName, int price , String type, int value) {
		super(newName, price);
		// TODO Auto-generated constructor stub
		power = type;
		powerAmount = value;
	}
	
	public String getPower() {
		return power;
	}
	
	public void useOn(Hero hero) {
		System.out.println("Using on hero");
		if (power == "res") {
			hero.applyResistance(powerAmount);
		}
		else if(power == "max") {
			hero.increaseMax(powerAmount);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
