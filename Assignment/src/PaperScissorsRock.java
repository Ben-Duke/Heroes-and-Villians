import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PaperScissorsRock {
	
	private boolean win = false;
	private int choice;
	private String computerChoice;
	private String userChoice;
	
	public String computerMove() {
		Random number = new Random();
		int answer = number.nextInt(3) + 1;
		if(answer == 1) {
			computerChoice = "Paper";
		} else if(answer == 2) {
			computerChoice = "Scissors";
		} else if(answer == 3) {
			computerChoice = "Rock";
		}
		return computerChoice;
	}
	
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
		game.playGame();
	}
}
