/**
 * This class implements a Super Villain that is stronger than all the other Villains 
 * that has ever lived.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class SuperVillain extends Villain {
	/**
	 * The remaining lives of the Super Villain
	 */
	private int lives;
	
	/**
	 * The favorite game of the Super Villain
	 */
	private String favoriteGame;
	
	/**
	 * The boolean representation of the condition of the Villain
	 * (whether they are alive (true) or dead (false))
	 */
	private boolean alive = true;
	
	/**
	 * The constructor for the class Super Villain that sets the name, number of lives,
	 * damage and favorite game of it.
	 * @param newName A String that is used to set the name of the Super Villain.
	 * @param newLives A Integer used to set the number of lives.
	 * @param damage A Integer that sets how much damage the hero will take from losing.
	 * @param faveGame A String that determines the game the Villain will want to play.
	 */
	SuperVillain(String newName, int newLives, int damage, String faveGame) {
		super(newName, newLives, damage, faveGame);
		lives = newLives * 2;
		favoriteGame = faveGame;
	}
	
	/**
	 * This function returns the integer value of the number of lives remaining for the Super Villain
	 */
	@Override
	public int lifeCount() {
		return lives;
	}
	
	/**
	 * This is a function that is used to kill the Villain. 
	 * Sets the Villain lives to 0.
	 */
	@Override
	public void killVillain() {
		alive = false;
		lives = 0;
	}
	
	@Override
	/**
	 * A function to see if the Villain is dead, true if alive and false if not.
	 * @return Returns true or false depending on the condition of the villain.
	 */
	public boolean isAlive() {
		if (lives <= 0) {
			alive = false;
		}
		return alive;
	}
	
	/**
	 * This function changes the favorite game played by Super Villain.
	 */
	public void changeFavoriteGame() {
		System.out.println("would change game");
	}
	
	/**
	 * This function decreases the number of the lives of the Super Villain by 1.
	 */
	public void decreaseLives() {
		lives -= 1;
		changeFavoriteGame();
		if (lives <= 0) {
			killVillain();
		}
	}
	
//	public static void main(String[] args) {
//		SuperVillain testingSuperVillain = new SuperVillain("Evil", 3, 50, "XandO's");
//		testingSuperVillain.decreaseLives();
//		System.out.println(testingSuperVillain.lifeCount());
//	}
	
	}

