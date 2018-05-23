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
	public void testApplyResistance() {
		testingHero = new Hero("Bob", "Earth");
		testingHero.applyResistance(20);
		assertEquals(testingHero.getResistance(), 20);
		
		testingHero = new Hero("Eva", "Divine");
		testingHero.applyResistance(-20);
		assertEquals(testingHero.getResistance(), 0);
	}
	
	@Test
	public void testGetResistance() {
		testingHero = new Hero("Ilo", "Wind");
		testingHero.applyResistance(120);
		assertEquals(testingHero.getResistance(), 120);
		
		testingHero = new Hero("Ruby", "Fire");
		testingHero.applyResistance(-100);
		assertEquals(testingHero.getResistance(), 0);
	}

	@Test
	public void testGetCurrentHealth() {
		testingHero = new Hero("Bubbles", "Air");
		testingHero.decreaseHealth(60);
		testingHero.increaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 100);
		
		testingHero.decreaseHealth(30);
		assertEquals(testingHero.getCurrentHealth(), 70);
		
		testingHero = new Hero("Soil", "Earth");
		testingHero.decreaseHealth(50);
		testingHero.increaseHealth(30);
		assertEquals(testingHero.getCurrentHealth(), 80);
	}

	@Test
	public void testGetMaxHealth() {
		testingHero = new Hero("Crystal", "Air");
		assertEquals(testingHero.getMaxHealth(), 100);
		
		testingHero = new Hero("Rock", "Divine");
		assertEquals(testingHero.getMaxHealth(), 200);
	}

	@Test
	public void testIncreaseHealth() {
		testingHero = new Hero("Luigi", "Divine");
		assertEquals(testingHero.getCurrentHealth(), 200);
		testingHero.increaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 200);
		
		testingHero = new Hero("Maya", "Earth");
		testingHero.decreaseHealth(-60);
		testingHero.increaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 100);
	}

	@Test
	public void testDecreaseHealth() {
		testingHero = new Hero("Blue", "Water");
		testingHero.decreaseHealth(60);
		assertEquals(testingHero.getCurrentHealth(), 40);
		
		testingHero.decreaseHealth(100);
		assertEquals(testingHero.getCurrentHealth(), 0);
		
		testingHero = new Hero("Red", "Fire");
		testingHero.decreaseHealth(30);
		testingHero.increaseHealth(10);
		testingHero.decreaseHealth(30);
		assertEquals(testingHero.getCurrentHealth(), 50);
		
		
	}

	@Test
	public void testIncreaseMax() {
		testingHero = new Hero("Luigi", "Divine");
		testingHero.increaseMax(25);
		assertEquals(testingHero.getIncreaseMax(), 25);
	}

	@Test
	public void testGetIncreaseMax() {
		testingHero = new Hero("Brownie", "Earth");
		testingHero.increaseMax(50);
		assertEquals(testingHero.getIncreaseMax(), 50);
	}

	@Test
	public void testGetName() {
		testingHero = new Hero("Ruby", "Fire");
		assertEquals(testingHero.getName(), "Ruby");
		
		testingHero = new Hero("Fred", "Water");
		assertEquals(testingHero.getName(), "Fred");

	}

	@Test
	public void testSetType() {
		testingHero = new Hero("Aj", "Air");
		testingHero.setType("Fire");
		assertEquals(testingHero.getType(), "Fire");
		
		testingHero = new Hero("Fate", "Divine");
		testingHero.setType("Mocha");
		assertEquals(testingHero.getType(), "Divine");
	}

	@Test
	public void testGetType() {
		testingHero = new Hero("Eva", "Earth");
		assertEquals(testingHero.getType(), "Earth");

	}

	@Test
	public void testSetAbility() {
		testingHero = new Hero("Bubbles", "Water");
		testingHero.setType("Earth");
		testingHero.setAbility();
		assertEquals(testingHero.getAbility(), "Takes less Damage");
	}

	@Test
	public void testGetAbility() {
		testingHero = new Hero("Tranquility", "Air");
		assertEquals(testingHero.getAbility(), "Map Expertise");

	}

	@Test
	public void testAddPowerUp() {
		testingHero = new Hero("Alice", "Earth");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Damage Reduction", "Increase Max Health"));
		testingHero.addPowerUp("Damage Reduction");
		testingHero.addPowerUp("Increase Max Health");
		assertTrue(testingHero.getPowerUp().equals(expected));

	}

	@Test
	public void testGetPowerUp() {
		testingHero = new Hero("Rage", "Fire");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Damage Reduction"));
		testingHero.addPowerUp("Damage Reduction");
		assertTrue(testingHero.getPowerUp().equals(expected));
	}

	@Test
	public void testAddHealingItems() {
		testingHero = new Hero("Fair", "Air");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("100% Health Heal"));
		testingHero.addHealingItems("100% Health Heal");
		assertTrue(testingHero.getHealingItems().equals(expected));
	}

	@Test
	public void testGetHealingItems() {
		testingHero = new Hero("Mola", "Divine");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("100% Health Heal"));
		testingHero.addHealingItems("100% Health Heal");
		assertTrue(testingHero.getHealingItems().equals(expected));
	}

	@Test
	public void testAddMap() {
		testingHero = new Hero("Explorer", "Earth");
		testingHero.addMap("Map2");
		testingHero.addMap("Map4");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Map2", "Map4"));
		assertTrue(testingHero.getMap().equals(expected));
	}

	@Test
	public void testGetMap() {
		testingHero = new Hero("Surf", "Water");
		testingHero.addMap("Map2");
		testingHero.addMap("Map3");
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Map2", "Map3"));
		assertTrue(testingHero.getMap().equals(expected));
	}

	@Test
	public void testSetStatus() {
		testingHero = new Hero("Flare", "Fire");
		testingHero.setStatus(true);
		assertTrue(testingHero.getStatus());
		
		testingHero.setStatus(false);
		assertFalse(testingHero.getStatus());
	}

	@Test
	public void testGetStatus() {
		testingHero = new Hero("Anger", "Earth");
		testingHero.setStatus(false);
		assertFalse(testingHero.getStatus());
	}

	@Test
	public void testToString() {
		testingHero = new Hero("Tranquility", "Air");
		assertEquals(testingHero.toString(), "Hero: Tranquility Health: 100/100 Res: 0");
	}

}
