import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class City {
	
	private ArrayList<Integer> cityDestination = new ArrayList<Integer>(Arrays.asList(null, null, null, null, 4));
	private ArrayList<Integer> knownDestination = new ArrayList<Integer>(Arrays.asList(null, null, null, null, null));
	private boolean villainStatus = true;
	
	public boolean getvillainStatus() {
		return villainStatus;
	}
	
	public ArrayList<Integer> getKnownDestination() {
		return knownDestination;
	}
	
	public void setCityDestination() {
		Random number = new Random();
		for(int counter = 0; counter < 4; counter++) {
			int pos = number.nextInt(4);
			if(cityDestination.get(pos) == null) {
				cityDestination.set(pos, counter);
			} else {
				while(!(cityDestination.get(pos) == null)) {
					pos += 1;
					if(pos >= cityDestination.size()){
						pos = 0;
						if (cityDestination.get(pos) == null) {
							cityDestination.set(pos, counter);
						}
					}
					pos += 1;
			}
		}
		}
	}

	
	public ArrayList<Integer> getCityDestination() {
		return cityDestination;
	}
	
	public static void main(String[] args) {
		City c1 = new City();
		c1.setCityDestination();
		System.out.println(c1.getCityDestination());
	
}
}
