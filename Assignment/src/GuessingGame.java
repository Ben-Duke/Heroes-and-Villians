import java.util.Random;
import java.util.Scanner;

/**
 * This class implements the game Guessing Game which allows user to guess the answer with 3 tries.
 * @author Angelica Dela Cruz & Ben Duke
 *
 */

public class GuessingGame {
	/**
	 * The number of tries 
	 */
	private int tries = 0;
	
	/**
	 * A boolean value which represents win (true) and loss (false)
	 */
	private boolean win = false;
	
	/**
	 * The status of the game, whether the answer is correct or incorrect
	 */
	private String gameStatus;
	
	/**
	 * A function that starts the game of Guessing Game and lets the user
	 * input the guessed answer.
	 */
	public void PlayGame() {
		Random number = new Random();
		int answer = number.nextInt(11);
		
		while ((tries < 3) && (win == false)) {
			System.out.println(answer);
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number between 1 to 10:");
			int guess = scanner.nextInt();
			if(guess == answer) {
				win = true;
				gameStatus = "correct";
				
			} else if(guess != answer) {
				gameStatus = "incorrect";
			}
			System.out.println("Your answer is " + gameStatus + ".");
			tries += 1;	
		}
		if(win == true) {
			System.out.println("You won. Congratulations!");
		} else if(win == false) {
			System.out.println("You lost. Better luck next time!");
		}
	}

	public static void main(String[] args) {
		GuessingGame g1 = new GuessingGame();
		g1.PlayGame();
		// TODO Auto-generated method stub

	}

}
