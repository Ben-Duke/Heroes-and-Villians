import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

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
		assertEquals(testingHero.getName(), "Fred");
	}

	@Test
	public void testSetType() {
		testingHero = new Hero("Aj", "Air");
		testingHero.setType("Fire");
		assertEquals(testingHero.getType(), "Fire");
		
		testingHero.setType("Demonic");
		assertEquals(testingHero.getType(), "Demonic");
		
		testingHero.setType("Divine");
		assertEquals(testingHero.getType(), "Divine");
	}

	@Test
	public void testGetType() {
		testingHero = new Hero("Illo", "Earth");
		assertEquals(testingHero.getType(), "Earth");
		
		testingHero = new Hero("Greed", "Water");
		assertEquals(testingHero.getType(), "Water");
		
		testingHero = new Hero("Blake", "Divine");
		assertEquals(testingHero.getType(), "Divine");

	}

	@Test
	public void testSetAbility() {
		testingHero = new Hero("Bubbles", "Water");
		testingHero.setAbility();
		assertEquals(testingHero.getAbility(), "Faster Recovery Rates");
		
		testingHero = new Hero("Bob", "Earth");
		testingHero.setAbility();
		assertEquals(testingHero.getAbility(), "Takes less Damage");

		testingHero = new Hero("Eva", "Divine");
		testingHero.setAbility();
		assertEquals(testingHero.getAbility(), "Double Maximum Health");
	}

	@Test
	public void testGetAbility() {
		testingHero = new Hero("Mos", "Demonic");
		assertEquals(testingHero.getAbility(), "Subtracts 2 lives to a Villain per win");
		
		testingHero = new Hero("Plane", "Air");
		assertEquals(testingHero.getAbility(), "Map Expertise");
	}

	@Test
	public void testAddPowerUp() {
		testingHero = new Hero("Fairy", "Air");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Increase Max Health"));
		testingHero.addPowerUp("Increase Max Health");
		assertTrue(testingHero.getPowerUp().equals(expected));
		
		testingHero = new Hero("Alice", "Earth");
		ArrayList<String> expected1 = new ArrayList<String>(Arrays.asList("Damage Reduction", "Increase Max Health"));
		testingHero.addPowerUp("Damage Reduction");
		testingHero.addPowerUp("Increase Max Health");
		assertTrue(testingHero.getPowerUp().equals(expected1));
	}

	@Test
	public void testGetPowerUp() {
		testingHero = new Hero("Monk", "Fire");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Damage Reduction"));
		testingHero.addPowerUp("Damage Reduction");
		assertTrue(testingHero.getPowerUp().equals(expected));
		
		testingHero.addPowerUp("Increase Max Health");
		ArrayList<String> expected1 = new ArrayList<String>(Arrays.asList("Damage Reduction", "Increase Max Health"));
		assertTrue(testingHero.getPowerUp().equals(expected1));
	}

	@Test
	public void testAddHealingItems() {
		testingHero = new Hero("Fairy", "Air");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("100% Health Heal"));
		testingHero.addHealingItems("100% Health Heal");
		assertTrue(testingHero.getHealingItems().equals(expected));
		
		testingHero = new Hero("Dora", "Earth");
		testingHero.addHealingItems("100% Health Heal");
		testingHero.addHealingItems("50% Health Heal");
		ArrayList<String> expected1 = new ArrayList<String>(Arrays.asList("100% Health Heal", "50% Health Heal"));
		assertTrue(testingHero.getHealingItems().equals(expected1));
	}

	@Test
	public void testGetHealingItems() {
		testingHero = new Hero("Mola", "Divine");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("100% Health Heal"));
		testingHero.addHealingItems("100% Health Heal");
		assertTrue(testingHero.getHealingItems().equals(expected));
		
		testingHero = new Hero("Monk", "Earth");
		testingHero.addHealingItems("50% Health Heal");
		ArrayList<String> expected1 = new ArrayList<String>(Arrays.asList("50% Health Heal"));
		assertTrue(testingHero.getHealingItems().equals(expected1));
	}

	@Test
	public void testAddMap() {
		testingHero = new Hero("Fierce", "Fire");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Map1"));
		testingHero.addMap("Map1");
		assertTrue(testingHero.getMap().equals(expected));
		
		testingHero = new Hero("Dora", "Earth");
		testingHero.addMap("Map2");
		testingHero.addMap("Map4");
		ArrayList<String> expected1 = new ArrayList<String>(Arrays.asList("Map2", "Map4"));
		assertTrue(testingHero.getMap().equals(expected1));
	}

	@Test
	public void testGetMap() {
		testingHero = new Hero("Pho", "Air");
		testingHero.addMap("Map1");
		testingHero.addMap("Map4");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Map1", "Map4"));
		assertTrue(testingHero.getMap().equals(expected));
		
		testingHero = new Hero("Too", "Water");
		testingHero.addMap("Map2");
		testingHero.addMap("Map3");
		ArrayList<String> expected1 = new ArrayList<String>(Arrays.asList("Map2", "Map3"));
		assertTrue(testingHero.getMap().equals(expected1));
	}

	@Test
	public void testSetStatus() {
		testingHero = new Hero("Eric", "Fire");
		testingHero.setStatus(true);
		assertTrue(testingHero.getStatus());
		
		testingHero.setStatus(false);
		assertFalse(testingHero.getStatus());
	}

	@Test
	public void testGetStatus() {
		testingHero = new Hero("Steph", "Earth");
		testingHero.setStatus(false);
		assertFalse(testingHero.getStatus());
		
		testingHero.setStatus(true);
		assertTrue(testingHero.getStatus());
	}

}
