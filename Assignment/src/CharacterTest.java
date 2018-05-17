import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CharacterTest {
	private Character testCharacter;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCharacter() {
		testCharacter = new Character();
		assertEquals(testCharacter.getName(), "Abby");
	}

	@Test
	public void testCharacterString() {
		testCharacter = new Character("Bob");
		assertEquals(testCharacter.getName(), "Bob");
	}

	@Test
	public void testSetName() {
		testCharacter = new Character("Bob");
		testCharacter.setName("Angel");
		assertEquals(testCharacter.getName(), "Angel");
	}

	@Test
	public void testGetName() {
		testCharacter = new Character("Bob");
		testCharacter.setName("Aj");
		assertEquals(testCharacter.getName(), "Aj");
		
		testCharacter.setName("Miles");
		assertEquals(testCharacter.getName(), "Miles");
	}

}
