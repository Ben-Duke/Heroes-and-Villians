/**
 * 
 * @author BenDuke
 *
 */
public class Villian {
	private String name;
	private int villainLives;
	private int villainDamage;
	private String villainFaveGame;
	private boolean alive = true;
	/**
	 * 
	 * @param newName A String that is used to set the name of the Villain.
	 * @param newLives A Integer used to set the number of lives.
	 * @param damage A Integer that sets how much damage the hero will take from losing.
	 * @param faveGame A String that determines the game the Villain will want to play.
	 */
	Villian(String newName, int newLives, int damage, String faveGame){
		name = newName;
		villainLives = newLives;
		villainDamage = damage;
		villainFaveGame = faveGame;
	}
	/**
	 * Decreases the lives of the Villain and checks if they are dead after subtracting.
	 */
	public void decreaseLives() {
		villainLives -= 1;
		if (villainLives <= 0) {
			alive = false;
		}
	}
	
	/**
	 * A function to see if the Villain is dead, true if dead and false if alive.
	 * @return Returns true or false
	 */
	public boolean isAlive() {
		return alive;
	}
	
	/**
	 * A function to check how many lives the Villain has.
	 * @return Returns the Lives of the Villain and is an Integer.
	 */
	public int lifeCount() {
		return villainLives;
	}
	
	/**
	 * This function is used to check what the Villains favorite game.
	 * @return Returns the Villains favorite game.
	 */
	public String favGame() {
		return villainFaveGame;
	}
	
	/**
	 * Gets the name of the Villain.
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This function is used to get how much damage is taken when losing
	 * @return Returns an integer of how much damage a Villain will deal when they win.
	 */
	public int getDamage() {
		return villainDamage;
	}
}
