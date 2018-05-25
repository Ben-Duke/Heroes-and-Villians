/**
 * This class implements a Villain that is evil and will kill innocent people.
 * These villain are dangerous.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class Villain {
	/**
	 * The name of the Villain
	 */
	private String name;
	/**
	 * The remaining lives of the Villain
	 */
	private int villainLives;
	/**
	 * The damage of the Villain to the Heroes
	 */
	private int villainDamage;
	/**
	 * The favorite game of the Villain
	 */
	private String villainFaveGame;
	/**
	 * The boolean representation of the condition of the Villain
	 * (whether they are alive (true) or dead (false))
	 */
	private boolean alive = true;
	
	/**
	 * This function returns the favorite game of the Villain
	 * @return Returns the String representation of the Villain's 
	 * favorite Game.
	 */
	public String getVillainGame() {
		return villainFaveGame;
	}
	
	/**
	 * The constructor for the Villain which sets its name, lives, damage and favorite game.
	 * 
	 * @param newName A String that is used to set the name of the Villain.
	 * @param newLives A Integer used to set the number of lives.
	 * @param damage A Integer that sets how much damage the hero will take from losing.
	 * @param faveGame A String that determines the game the Villain will want to play.
	 */
	Villain(String newName, int newLives, int damage, String faveGame){
		name = newName;
		villainLives = newLives;
		villainDamage = damage;
		villainFaveGame = faveGame;
	}
	/**
	 * A function that decrease the lives of the Villain and checks if 
	 * they are dead after subtracting.
	 */
	public void decreaseLives() {
		villainLives -= 1;
		isAlive();
	}
	
	/**
	 * A function to see if the Villain is dead, true if alive and false if not.
	 * @return Returns true or false depending on the condition of the villain.
	 */
	public boolean isAlive() {
		if (villainLives <= 0) {
			alive = false;
		}
		return alive;
	}
	
	/**
	 * A function to check how many lives the Villain has remaining.
	 * @return Returns an Integer value representing the remaining lives of 
	 * the Villain.
	 */
	public int lifeCount() {
		return villainLives;
	}
	
	/**
	 * This function is used to check what the Villains favorite game.
	 * @return Returns the String representation of the Villain's favorite game.
	 */
	public String favGame() {
		return villainFaveGame;
	}
	
	/**
	 * This is a function that is used to kill the Villain. 
	 * Sets the Villain lives to 0.
	 */
	public void killVillain() {
		alive = false;
		villainLives = 0;
	}
	
	/**
	 * This is a function that returns the name of the Villain.
	 * @return Returns a String representation of the Villain's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This function is used to get how much damage is taken when losing
	 * @return Returns an Integer value of how much damage a Villain will deal when they win.
	 */
	public int getDamage() {
		return villainDamage;
	}
}
