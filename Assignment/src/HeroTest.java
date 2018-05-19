import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeroTest {
	private Hero testingHero;
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
	public void testHero() {
		testingHero = new Hero("Wind", "Fire");
		assertEquals(testingHero.getType(), "Fire");
		assertEquals(testingHero.getAbility(), "Lower Price in Shops");
		
		testingHero = new Hero("Lion", "Demonic");
		assertEquals(testingHero.getType(), "Demonic");
		assertEquals(testingHero.getAbility(), "Subtracts 2 lives to a Villain per win");
	}

	@Test
	public void testGetCurrentHealth() {
		testingHero = new Hero("Bubbles", "Air");
		assertEquals(testingHero.getCurrentHealth(), 100);
		
		testingHero.decreaseHealth(30);
		assertEquals(testingHero.getCurrentHealth(), 70);
		
		testingHero.increaseHealth(50);
		assertEquals(testingHero.getCurrentHealth(), 100);

	}

	@Test
	public void testGetMaxHealth() {
		testingHero = new Hero("Angel", "Divine");
		// result must equal to 200
		assertEquals(testingHero.getMaxHealth(), 200);
		// result must equal to 100
		testingHero = new Hero("Brown", "Earth");
		assertEquals(testingHero.getMaxHealth(), 100);

	}

	@Test
	public void testIncreaseHealth() {
		testingHero = new Hero("Angel", "Divine");
		//health must be 200 at this stage
		assertEquals(testingHero.getCurrentHealth(), 200);

		//max health must only be 200
		testingHero.increaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 200);
		
		testingHero.increaseHealth(100000);
		assertEquals(testingHero.getCurrentHealth(), 200);

	}

	@Test
	public void testDecreaseHealth() {
		testingHero = new Hero("Blue", "Water");
		testingHero.decreaseHealth(60);
		assertEquals(testingHero.getCurrentHealth(), 40);
		
		testingHero.decreaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 0);
	}

	@Test
	public void testGetName() {
		testingHero = new Hero("Blue", "Water");
		assertEquals(testingHero.getName(), "Blue");
		
		testingHero = new Hero("Fred", "Water");
		assertEquals(testingHero.getName(), "Blue");
	}

	@Test
	public void testSetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAbility() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAbility() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPowerUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPowerUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddHealingItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHealingItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStatus() {
		fail("Not yet implemented");
	}

}
