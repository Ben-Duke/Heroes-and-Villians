import java.util.Scanner;

public class GameEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		
		
		while (exit == false) {
			
			XAndOs game = new XAndOs();
			game.playGame();
			System.out.println("Player "+game.getWinner()+ " won the Game");
			
			Scanner reader = new Scanner(System.in);
			System.out.println("Press q to quit or any other button to play.");
			String i = reader.nextLine();
			
			if(i.equals("q")) {
				exit = true;
				
				reader.close();
			}
			else {
				System.out.println("Else happend");
			}
			
		}
	}

}
