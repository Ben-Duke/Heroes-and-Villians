
public class PowerUpItem extends Item{
	String power;
	
	PowerUpItem(String newName, int price) {
		super(newName, price);
		// TODO Auto-generated constructor stub
	}
	
	public String getPower() {
		return power;
	}
	
	public void useOn(Hero hero) {
		System.out.println("Using on hero");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
