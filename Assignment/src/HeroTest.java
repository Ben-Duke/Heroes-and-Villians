import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroTest {
	private Hero testingHero;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHero() {
		testingHero = new Hero("Air");
		assertEquals(testingHero.getType(), "Air");
	}

	@Test
	void testGetCurrentHealth() {
		testingHero = new Hero("Air");
		assertEquals(testingHero.getCurrentHealth(), 100);
		// max health must still be 100
		testingHero.decreaseHealth(30);
		assertEquals(testingHero.getCurrentHealth(), 70);
		
		testingHero.increaseHealth(50);
		assertEquals(testingHero.getCurrentHealth(), 100);
	}

	@Test
	void testGetMaxHealth() {
		testingHero = new Hero("Divine");
		// result must equal to 200
		assertEquals(testingHero.getMaxHealth(), 200);
		// result must equal to 100
		testingHero = new Hero("Earth");
		assertEquals(testingHero.getMaxHealth(), 100);
	}

	@Test
	void testIncreaseHealth() {
		testingHero = new Hero("Divine");
		//health must be 200 at this stage
		assertEquals(testingHero.getCurrentHealth(), 200);

		//max health must only be 200
		testingHero.increaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 200);
		
		testingHero.increaseHealth(100000);
		assertEquals(testingHero.getCurrentHealth(), 200);
	}

	@Test
	void testDecreaseHealth() {
		testingHero = new Hero("Water");
		testingHero.decreaseHealth(60);
		assertEquals(testingHero.getCurrentHealth(), 40);
		
		testingHero.decreaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 0);
		
	}

	@Test
	void testSetType() {
		testingHero = new Hero("Air");
		testingHero.setType("Fire");
		assertEquals(testingHero.getType(), "Fire");
		
		testingHero.setType("Demonic");
		assertEquals(testingHero.getType(), "Demonic");
		
		testingHero.setType("Divine");
		assertEquals(testingHero.getType(), "Divine");
		
		
	}

	@Test
	void testGetType() {
		testingHero = new Hero("Air");
		assertEquals(testingHero.getType(), "Air");
		
		testingHero = new Hero("Demonic");
		assertEquals(testingHero.getType(), "Demonic");
		
		testingHero = new Hero("Divine");
		assertEquals(testingHero.getType(), "Divine");
	}

	@Test
	void testSetAbility() {
		testingHero = new Hero("Air");
		assertEquals(testingHero.getAbility(), "Map Expertise");
		
		testingHero = new Hero("Earth");
		assertEquals(testingHero.getAbility(), "Takes less Damage");
	}

	@Test
	void testGetAbility() {
		testingHero = new Hero("Demonic");
		assertEquals(testingHero.getAbility(), "Subtracts 2 lives to a Villain per win");
		
		testingHero = new Hero("Divine");
		assertEquals(testingHero.getAbility(), "Double Maximum Health");
	}

	@Test
	void testAddPowerUp() {
		testingHero = new Hero("Demonic");
		
	}

	@Test
	void testGetPowerUp() {
		fail("Not yet implemented");
	}

	@Test
	void testAddHealingItems() {
		fail("Not yet implemented");
	}

	@Test
	void testGetHealingItems() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMap() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMap() {
		fail("Not yet implemented");
	}

	@Test
	void testSetStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStatus() {
		fail("Not yet implemented");
	}

}
