/**
 * 
 * @author angelicadelacruz
 * @version 1.1, 20 May 18
 */
public class Hospital implements Destination {
	private String name = "Hospital";
	
	
	@Override
	public String getDestinationName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void healHero(Hero hero) {
		hero.increaseHealth(25);
	}
	
}

