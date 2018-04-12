
public class SuperVillain extends Villain{
	private int lives;
	private String favoriteGame;
	
	SuperVillain(String newName, int newLives, int damage, String faveGame) {
		super(newName, newLives, damage, faveGame);
		lives = newLives * 2;
		favoriteGame = faveGame;
		// TODO Auto-generated constructor stub
	}
	
	
	public void changeFavoriteGame() {
		System.out.println("would change game");
	}
	
	public void decreaseLives() {
		lives -= 1;
		changeFavoriteGame();
		if (lives <= 0) {
			super.killVillain();
		}
	}
	}

