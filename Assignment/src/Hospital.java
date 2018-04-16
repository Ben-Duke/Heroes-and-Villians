
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

