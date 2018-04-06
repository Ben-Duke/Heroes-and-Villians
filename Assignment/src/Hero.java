import java.util.ArrayList;
/**
 * 
 * @author Angelica Dela Cruz & Ben Duke
 *
 */
public class Hero {
	private String[] heroTypes = {"Earth", "Air", "Water", "Fire"};
	private int maxHealth = 100;
	private int currentHealth = 100;
	private String heroType;
	private String heroAbility;
	private ArrayList<String> heroPowerup;
	private ArrayList<String> heroHealingItems; 
	private ArrayList<String> heroMapList;
	private boolean heroStatus = true;
	
	public void increaseHealth(int health) {
		if(currentHealth < maxHealth) {
			currentHealth += health;
		}
	}
	public void decreaseHealth(int damage) {
		if(currentHealth < maxHealth) {
			currentHealth -= damage;
		}
		
		if(currentHealth < 1) {
			heroStatus = false;
		}
	}
	
	public void setType(string type) {
		if()
	}
	
	
	
	

	public static void main(String[] args) {

	}

}
