
public class Hospital implements Destination {
	private String name;
	
	
	@Override
	public String getDestinationName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void healHero(Hero hero) {
		hero.increaseHealth(25);
	}
}

