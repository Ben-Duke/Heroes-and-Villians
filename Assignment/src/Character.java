/**
 * This class implements a Character that has a name
 * 
 * @author Angelica Dela Cruz & Ben Duke
 * @version 1.1, 5 Apr 2018.
 */
public class Character {
	/** 
	 * The name of the Character
	 */
	private String characterName; 
	
	/**
	 * The constructor for the class Character
	 * @param name A String that is used to set the name of the Character.
	 */
	Character(String name) {
		characterName = name;
	}
	
	/**
	 * A function that sets the name of the Character to the parameter givenName.
	 * @param givenName A String that gives the name of the Character created.
	 */
	public void setName(String givenName) {
		characterName = givenName;
	}
	/**
	 * A function that returns the name of the Character.
	 * @return Return the Character's name.
	 */
	public String getName() {
		return characterName;
	}
	
	public static void main(String[] args) {
		Character charac = new Character("Abby");
		System.out.println(charac.getName());
		charac.setName("Marie");
		System.out.println(charac.getName());
	}
	
}