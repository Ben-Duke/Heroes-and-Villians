import java.util.ArrayList;

public class HomeBase {
	private ArrayList<Hero> teamHeroes = new ArrayList<Hero>();

	public String viewHeroAttributes() {
		for(Hero hero: teamHeroes) {
			System.out.println(hero + "The attributes of the Hero is" + hero.getAbility());
		}
		return "";
		
	}
	
	public boolean viewHeroStatus() {
		
		//if()
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
