
public class XAndOs {
	private String sep = "*";
	private String[][] game = { 
			{"-","-","-"},
			{"-","-","-"},
			{"-","-","-"}
	};
	
	public String playGame() {
		for (int i = 0; i < 10; i++) {
			sep = sep + "*";
		}
		return "";
	}
	/**
	 * Checks the game string array to see if there is a winner based
	 * on rows.
	 * @return Returns who won, otherwise returns none as a string.
	 */
	public String checkRows() {
		int x = 0;
		int o = 0;
		for(int row = 0; row < game.length; row++) {
			for(int index = 0; index < game.length; index++) {
				if(game[row][index].equals("X")) {
					x += 1;
				}
				else if(game[row][index].equals("O")){
					o += 1;
				}
			}
		}
		if(x == 3) {
			return "X";
		}
		else if (o == 3) {
			return "O";
		}
		return "no winner";
	}
	
	public void placeMarker(String marker, int row, int col) {
		game[row][col] = marker;
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
		System.out.println("Next player is player 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XAndOs game = new XAndOs();
		game.playGame();
		game.printState();
		game.placeMarker("X", 0, 0);
		game.placeMarker("X", 0, 1);
		game.placeMarker("X", 0, 2);
		game.printState();
		System.out.println("Winner is " + game.checkRows());
	}

}
