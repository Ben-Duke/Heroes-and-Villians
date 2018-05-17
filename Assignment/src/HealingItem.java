
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
