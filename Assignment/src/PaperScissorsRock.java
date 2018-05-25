import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * This class implements Paper Scissors Rock game.
 * 
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, May 2018.
 */
public class PaperScissorsRock {
	
	/**
	 * The win condition
	 */
	private boolean win = false;
	/**
	 * The Integer answer of the Computer
	 */
	private int compAnswer;
	/**
	 * The Integer answer of the player
	 */
	private int choice;
	/**
	 * The String answer of the Computer
	 */
	private String computerChoice;
	/**
	 * The String answer of the player
	 */
	private String userChoice;
	
	/**
	 * This function initializes the computer's choice of answer.
	 * @return Returns the String answer of the computer
	 */
	public String computerMove() {
		Random number = new Random();
		int answer = number.nextInt(3) + 1;
		if(answer == 1) {
			computerChoice = "Paper";
			compAnswer = 1;
		} else if(answer == 2) {
			computerChoice = "Scissors";
			compAnswer = 2;
		} else if(answer == 3) {
			computerChoice = "Rock";
			compAnswer = 3;
		}
		return computerChoice;
	}
	
	/**
	 * This function returns the Integer answer of the Computer
	 * @return Returns the Integer answer of the Computer
	 */
	public int getAnswer() {
		return compAnswer;
	}
	
	/**
	 * This function initializes the move of the Player.
	 */
	public void userMove() {
		ArrayList<Integer> choices = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose between the three weapons:");
		System.out.println("1. Paper");
		System.out.println("2. Scissors");
		System.out.println("3. Rock");
		System.out.println("Input the number corresponding to your choice.");
		while(!scanner.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.println("----------------------------------");
			System.out.println("Choose between the three weapons:");
			System.out.println("1. Paper");
			System.out.println("2. Scissors");
			System.out.println("3. Rock");
			System.out.println("Input the number corresponding to your choice.");
			scanner.next();
		} choice = scanner.nextInt();
		if(choices.contains(choice)) {
			if(choice == 1) {
				userChoice ="Paper";
			} else if(choice == 2) {
				userChoice = "Scissors";
			} else if(choice == 3) {
				userChoice = "Rock";
			}
		} else {
			System.out.println("Invalid input.");
			System.out.println("----------------------------------");
			userMove();
		}
	}
	
	/**
	 * This function determines if either the Player or the Computer wins
	 * @param compMove The String move of the Computer
	 * @param userMove The String move of the Player
	 */
	public void whoWin(String compMove, String userMove) {
		System.out.println("Villain move is: " + compMove);
		System.out.println("Your move is: " + userMove);
		 
		if(compMove.equals("Paper") && userMove.equals("Rock")) {
			win = true;
			System.out.println("Villain wins! Better luck next time!");
		} else if(compMove.equals("Rock") && userMove.equals("Paper")) {
			win = true;
			System.out.println("You win!");
		} else if(compMove.equals("Paper") && userMove.equals("Scissors")) {
			win = true;
			System.out.println("You win!");
		} else if(compMove.equals("Scissors") && userMove.equals("Paper")) {
			win = true;
			System.out.println("Villain wins! Better luck next time!");
		} else if(compMove.equals("Scissors") && userMove.equals("Rock")) {
			win = true;
			System.out.println("You win!");
		} else if(compMove.equals("Rock") && userMove.equals("Scissors")) {
			win = true;
			System.out.println("Villain wins! Better luck next time!");
		} else if(compMove.equals(userMove)) {
			System.out.println("It's a tie! Try again!");
			System.out.println("----------------------");
		}
	}
	
	/**
	 * This function initialize the Game to play.
	 */
	public void playGame() {
		while (win == false) {
			computerMove();
			userMove();
			whoWin(computerChoice, userChoice);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperScissorsRock game = new PaperScissorsRock();
		System.out.println((game.getAnswer()));
	}
}
