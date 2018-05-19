import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that plays a game of Xs and Os.
 * @author BenDuke
 *
 */
public class XAndOs {
	private String sep = "*";
	private String[][] game = { 
			{"-","-","-"},
			{"-","-","-"},
			{"-","-","-"}
	};
	private String winner = "None";
	
	/**
	 * Starts the game loop for Xs and Os.
	 */
	
	public String[][] getGameState(){
		return game;
	}
	
	public void playGame() {
	
		boolean valid = false;
		
		for (int i = 0; i < 10; i++) {
			sep = sep + "*";
		}
		
		while (ableToPlay() && winner == "None") {
			printState();
			
			while (valid == false) {
				Scanner scanner = new Scanner (System.in);
				System.out.println("Please enter the row in the range of 0-2");
				int row = scanner.nextInt();
				System.out.println("Please enter the col in the range of 0-2");
				int col = scanner.nextInt();
				if (placeMarker("X", row, col) == "Failed" && row < 3 && col < 3) {
					System.out.println("Please put in different coordinates");
				}
				else {
					
					valid = true;
					cpuMove();
				}
			}
			//Changes valid to false so the user can pick again.
			valid = false;
			winner = checkforWinner();
		}
			
	}
	
	void makeMove(int[] move) {
				
				
				if (placeMarker("X", move[0], move[1]) == "Failed" && move[0] < 3 && move[1] < 3) {
					System.out.println("MoveFailed");
				}
				else {
					winner = checkforWinner();
					if (winner == "X"){
						System.out.println(winner);
					}
					else {
						if (winner != "X" || winner != "O") {
						cpuMove();
						}
					}
					
					
				}
			
			//Changes valid to false so the user can pick again.
			
			winner = checkforWinner();
			System.out.println(winner);
		
	}
	
	/**
	 * Checks the game string array to see if there is a winner based
	 * on rows.
	 * @return 
	 * @return Returns who won, otherwise returns none as a string.
	 */
	
	public ArrayList<Integer[]> cpuMoveHelper(){
		
		
		ArrayList<Integer[]> moves = new ArrayList<Integer[]>();
		
		for(int row = 0; row < game.length; row++) {
			for (int column = 0; column < game[row].length; column++) {
				if (game[row][column] == "-") {
					
					Integer[] co = {row,column};
					moves.add(co);
				}
			}
		}
		return moves;
	}
	
	public void cpuMove() {
		if (ableToPlay()) {
			ArrayList<Integer[]> moves = cpuMoveHelper();
			Random rand = new Random();
			int placement = (int)rand.nextInt(moves.size());
			placeMarker("O", moves.get(placement)[0], moves.get(placement)[1]);
			
		}
		
		
	}
	
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
		return "None";
	}
	
	/**
	 * A function to return the winner string usually when the game has ended.
	 * @return
	 */
	public String getWinner() {
		return winner;
	}
	
	/**
	 * Checks the game string array to see if there is a winner based
	 * on columns.
	 * @return Returns who won, otherwise returns none as a string.
	 */
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
		return "None";
	}
	
	/**
	 * A helper class for checkDiag() to check if there is a diagonal of either Xs or Os
	 * None otherwise.
	 * @param marker A string of the marker either X or O
	 * @return returns who the winner is or will return None if there is no winner
	 */
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
	
	/**
	 * This is run to check the Diagonal lines on the game board.
	 * This function makes a call to a helper function called checkMarker(String marker).
	 * checkMarker takes a String this function passes X or O to checkMarker 
	 * @return Return type is a String and will be one of: None, X or O
	 */
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
	/**
	 * This function is used to update the board with the player and CPUs marker
	 * and expects a row and column input to be passed to this function to operate.
	 * a check will be done to make sure the coordinates are pointing to a empty 
	 * slot marked by "-"
	 * @param marker X or O as a String will be required as input.
	 * @param row A number from 0 to 2 this will say which row of the board to place the marker,
	 * 0 is top row, 1 is middle and 2 is the last row
	 * @param col a number from 0 to 2 this will say which column of the board to place the marker,
	 * 0 is the first column, 1 is middle column and 2 is the last column.
	 * @return Returns "Successful" if marker placement found a empty slot. 
	 * Returns "Failed" if not able to place this is due to the requested slot being filled. 
	 */
	public String placeMarker(String marker, int row, int col) {
		
		if (game[row][col] == "-") {
			game[row][col] = marker;
			return "Successful";
		}
		System.out.println("Failed");
		return "Failed";
	}
	
	/**
	 * Prints out the current state of the board in the form of 
	 * ********
	 * |-|-|-|
	 * |-|-|-|
	 * |-|-|-|
	 * ********
	 */
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
	
	/**
	 * Runs checks on rows, columns and diagonals to check for a winner.
	 * @return Returns the winners marker in a string format.
	 */
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
		winner = marker;
		return marker;
	}
	
	/**
	 * This function is used to see if there are any moves left
	 * @return If there are no moves left then false is returned 
	 * otherwise returns true.
	 */
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
//		int[] move = {0,1};
//		game.makeMove(move);
//		
//		move = new int[]{0,2};
//		game.makeMove(move);
//		
//		move = new int[]{0,0};
//		game.makeMove(move);
//		for(int row = 0; row < 3; row++) {
//			game.placeMarker("X", row, 0);
//		}
//		ArrayList<Integer[]> x = game.cpuMoveHelper();
//		
//		
//		for(int index = 0; index < x.size(); index++) {
//			System.out.println(x.get(index)[0]+ "," + x.get(index)[1]);
//		}
//		
//		game.printState();
//		game.placeMarker("O", 0, 1);
//		x = game.cpuMoveHelper();
//		
//		
//		for(int index = 0; index < x.size(); index++) {
//			System.out.println(x.get(index)[0]+ "," + x.get(index)[1]);
//		}
		game.printState();
		
	}

}
