import java.util.Scanner;

public class GameEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		
		
		while (exit == false) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Press q to exit");
			String i = reader.nextLine();
			System.out.println(i);

			if(i.equals("q")) {
				System.out.println("Exiting");
				exit = true;
				    
				reader.close();
			}
			else {
				System.out.println("Else happend");
			}
			
		}
		System.out.println("Hello tiddles");
		System.out.println("Yay end of the day");
	}

}
