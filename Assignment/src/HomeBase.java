import java.util.ArrayList;
/**
 * This class implements a Home Base where the Heroes meet up and relax before going to 
 * another adventure.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class HomeBase {
	/**
	 * Array List of Heroes in the Team
	 */
	private ArrayList<Hero> teamHeroes = new ArrayList<Hero>();

	/**
	 * This function allows us to see the attributes of each Hero based on their type.
	 * @return Returns the String representation of the attributes of the Hero.
	 */
	public String viewHeroAttributes() {
		for(Hero hero: teamHeroes) {
			System.out.println(hero + "The attributes of the Hero is" + hero.getAbility());
		}
		return "";
		
	}
	
	/**
	 * This function returns the Status of the Hero.
	 * @return Returns a boolean value of the Hero's condition status.
	 */
	public boolean viewHeroStatus() {
		
		//if()
		return true;
	}
	
//	public static void main(String[] args) {
//		HomeBase testingHome = new HomeBase();
//		Team heroes = new Team();
//		heroes.addHeroes("Bob", "Air");
//		heroes.addHeroes("Eve", "Divine");
//		System.out.println(testingHome.viewHeroAttributes());
//
//	}

}
