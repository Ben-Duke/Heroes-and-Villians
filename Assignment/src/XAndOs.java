import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;;
public class XAndOs {
	private String sep = "*";
	private String[][] game = { 
			{"-","-","-"},
			{"-","-","-"},
			{"-","-","-"}
	};
	private String winner = "";
	
	public String playGame() {
		for (int i = 0; i < 10; i++) {
			sep = sep + "*";
		}
		boolean valid = false;
		while (ableToPlay() || winner == "") {
			
			System.out.println("***___***");
			printState();
			
			while (valid == false) {
				Scanner scanner = new Scanner (System.in);
				System.out.println("Please enter coordinate x");
				int row = scanner.nextInt();
				System.out.println("Please enter coordinate y");
				int col = scanner.nextInt();
				if (placeMarker("X", row, col) == "failed") {
					System.out.println("Please put in different coordinates");
				}
				else {
					
					valid = true;
					scanner.close();
				}
				
				System.out.println(valid);
			}
			valid = false;
			System.out.println(valid);
		}
			
		return "Done";
	}
	
	/**
	 * Checks the game string array to see if there is a winner based
	 * on rows.
	 * @return Returns who won, otherwise returns none as a string.
	 */
	public String checkRows() {
		for(int row = 0; row < game.length; row++) {
			int x = 0;
			int o = 0;
			for(int index = 0; index < game.length; index++) {
				if(game[row][index].equals("X")) {
					x += 1;
				}
				else if(game[row][index].equals("O")){
					o += 1;
				}
			}
			if(x == 3) {
				return "X";
			}
			else if (o == 3) {
				return "O";
			}
		}
		return "no winner";
	}
	
	public String getWinner() {
		return winner;
	}
	
	public String checkCols() {
	for(int col = 0; col < game.length; col++) {
		int x = 0;
		int o = 0;
		 for( int row = 0; row < game.length; row++) {
			 
			 if(game[row][col].equals("X")) {
					x += 1;
				}
				else if(game[row][col].equals("O")){
					o += 1;
				}
		 }	
		 if(x == 3) {
				return "X";
			}
			else if (o == 3) {
				return "O";
			}
		}
		return "no winner";
	}
	
	
	public String checkMarker(String marker) {
		String winner = "None";
		if (game[0][0] == marker && game[1][1] == marker && game[2][2] == marker) {
			winner = marker;
		}
		if (game[0][2] == marker && game[1][1] == marker && game[2][0] == marker) {
			winner = marker;
		}
		return winner;
	}
	
	public String checkDiag() {
		String returnString = "None";
		
		if (checkMarker("X") == "X") {
			returnString = "X";
		}
		else if (checkMarker("O") == "O"){
			returnString = "O";
		}
		return returnString;
	}
	
	public String placeMarker(String marker, int row, int col) {
		
		if (game[row][col] == "-") {
			game[row][col] = marker;
			return "Successful";
		}
		System.out.println("Failed");
		return "Failed";
	}
	
	public void printState() {
		System.out.println(sep);
		for(int index = 0; index < game.length; index++) {
			String line = "|";
			for (int underloop = 0; underloop < game[index].length; underloop++) {
				line += (game[index][underloop]);
				line += "|";
			}
			
			System.out.println(line);
		}
		System.out.println(sep);	
	}
	
	public String checkforWinner() {
		String marker = "None";
		if (checkDiag() != "None") {
			marker = checkDiag();
		}
		if (checkRows() != "None") {
			marker = checkRows();
		}
		if (checkCols() != "None") {
			marker = checkCols();
		}
		
		if (marker == "X" || marker == "O") {
			winner = marker;
		}
		return marker;
	}
	
	public boolean ableToPlay() {
		ArrayList<Boolean> moves = new ArrayList<Boolean>();
		for(int row = 0; row < game.length; row++) {
			if(Arrays.asList(game[row]).contains("-")) {
				moves.add(true);
			}
			else {
				moves.add(false);
			}
		}
		if (moves.contains(true)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XAndOs game = new XAndOs();
		game.playGame();
	}

}
