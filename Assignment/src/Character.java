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
	 * 
	 * @param name The String name of s
	 */
	Character(String name) {
		characterName = name;
	}
	
	/**
	 * Sets the name of the alien to the parameter givenName
	 * @param givenName gives the name of the Character
	 */
	public void setName(String givenName) {
		characterName = givenName;
	}
	/**
	 * Returns the Character's name
	 * @return the name of Character
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