import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeamTest {
	private Team testingTeam;
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
	public void testGetAllItems() {
		testingTeam = new Team();
		assertEquals(testingTeam.getAllItems().size(), 0);
		
		testingTeam = new Team();
		HealingItem healUp = new HealingItem("Heal 25%", 100, 25);
		testingTeam.addHealingItems(healUp);
		PowerUpItem powerUp = new PowerUpItem("Decrease battle damage", 150, "res", 10);
		testingTeam.addPowerUpitem(powerUp);
		ArrayList<Item> items = new ArrayList<Item>(Arrays.asList(healUp, powerUp));
		assertEquals(testingTeam.getAllItems(), items);
		
		testingTeam = new Team();
		PowerUpItem powerUp1 = new PowerUpItem("Increase max health", 150, "max", 100);
		testingTeam.addPowerUpitem(powerUp1);
		ArrayList<Item> items1 = new ArrayList<Item>(Arrays.asList(powerUp1));
		assertEquals(testingTeam.getAllItems(), items1);
	}

	@Test
	public void testGetHealingHeroes() {
		ArrayList<Hero> healing = new ArrayList<Hero>();
		Hero hero1 = new Hero("Ruby", "Fire");
		Hero hero2 = new Hero("Wave", "Water");
		testingTeam = new Team();
		testingTeam.addHeroes("Ruby", "Fire");
		testingTeam.addHeroes("Wave", "Water");
		assertEquals(testingTeam.getHealingHeroes(), healing);
		
		for (int i = 0; i < testingTeam.getHeroes().size(); i++) {
			testingTeam.getHeroes().get(i).startHealTimer();
		}
		ArrayList<Hero> healing1 = new ArrayList<Hero>();
		healing1.add(hero1);
		healing1.add(hero2);
		assertEquals(testingTeam.getHealingHeroes().size(), healing1.size());
	}
	
	@Test
	public void testSetTeamName() {
		testingTeam = new Team();
		testingTeam.setTeamName("P-Rangers");
		assertEquals(testingTeam.getTeamName(), "P-Rangers");
		
		testingTeam = new Team();
		testingTeam.setTeamName("Power Rangers");
		assertEquals(testingTeam.getTeamName(), null);
		
		testingTeam = new Team();
		testingTeam.setTeamName("P");
		assertEquals(testingTeam.getTeamName(), null);
	}

	@Test
	public void testGetTeamName() {
		testingTeam = new Team();
		testingTeam.setTeamName("Super Hero");
		assertEquals(testingTeam.getTeamName(), "Super Hero");
	}

	@Test
	public void testGetTeamMoney() {
		testingTeam = new Team();
		assertEquals(testingTeam.getTeamMoney(), 500);
		
		testingTeam.decreaseMoney(200);
		assertEquals(testingTeam.getTeamMoney(), 300);
		
		testingTeam.increaseMoney(400);
		assertEquals(testingTeam.getTeamMoney(), 700);
	}

	@Test
	public void testAddHeroes() {
		testingTeam = new Team();
		testingTeam.addHeroes("Rob", "Devil");
		testingTeam.addHeroes("Ace", "Air");
		testingTeam.addHeroes("Ace", "Fire");
		testingTeam.addHeroes("Ila", "Water");
		testingTeam.addHeroes("Fairy", "Divine");
		Hero hero1 = new Hero("Rob", "Devil");
		Hero hero2 = new Hero("Ace", "Air");
		Hero hero3 = new Hero("Ila", "Water");
		ArrayList<Hero> superheroes = new ArrayList<Hero>(Arrays.asList(hero1, hero2, hero3));
		assertEquals(superheroes.size(), testingTeam.getHeroes().size());
	}

	@Test
	public void testCheckName() {
		testingTeam = new Team();
		testingTeam.addHeroes("Bob", "Fire");
		assertTrue(testingTeam.checkName("Bob"));
		
		testingTeam.addHeroes("Pop", "Water");
		assertTrue(testingTeam.checkName("Pop"));
	}

	@Test
	public void testGetHeroes() {
		testingTeam = new Team();
		testingTeam.addHeroes("Eva", "Divine");
		testingTeam.addHeroes("Shrek", "Earth");
		Hero hero1 = new Hero("Eva", "Divine");
		Hero hero2 = new Hero("Shrek", "Earth");
		ArrayList<Hero> superhero = new ArrayList<Hero>(Arrays.asList(hero1, hero2));
		assertEquals(testingTeam.getHeroes().size(), superhero.size());
	}

	@Test
	public void testAddPowerUpitem() {
		testingTeam = new Team();
		PowerUpItem powerUp50 = new PowerUpItem("Decrease battle damage maxed", 250, "res", 30);
		PowerUpItem powerUp100 = new PowerUpItem("Increase max health", 150, "max", 100);
		testingTeam.addPowerUpitem(powerUp50);
		testingTeam.addPowerUpitem(powerUp100);
		ArrayList<PowerUpItem> powerUpItems = new ArrayList<PowerUpItem>(Arrays.asList(powerUp50, powerUp100));
		assertEquals(testingTeam.getPowerUpList(), powerUpItems);
	}

	@Test
	public void testGetPowerUpList() {
		testingTeam = new Team();
		PowerUpItem powerUp10 = new PowerUpItem("Decrease battle damage", 150, "res", 10);
		PowerUpItem powerUp50 = new PowerUpItem("Decrease battle damage maxed", 250, "res", 30);
		PowerUpItem powerUp100 = new PowerUpItem("Increase max health", 150, "max", 100);
		testingTeam.addPowerUpitem(powerUp10);
		testingTeam.addPowerUpitem(powerUp50);
		testingTeam.addPowerUpitem(powerUp100);
		ArrayList<PowerUpItem> powerUps = new ArrayList<PowerUpItem>(Arrays.asList(powerUp10, powerUp50, powerUp100));
		assertEquals(testingTeam.getPowerUpList(), powerUps);
	}

	@Test
	public void testAddHealingItems() {
		testingTeam = new Team();
		HealingItem healUp50 = new HealingItem("Heal 25%", 100, 25);
		HealingItem healUp100 = new HealingItem("Heal 50%", 200, 50);
		testingTeam.addHealingItems(healUp50);
		testingTeam.addHealingItems(healUp100);
		ArrayList<HealingItem> healUps = new ArrayList<HealingItem>(Arrays.asList(healUp50, healUp100));
		assertEquals(testingTeam.getHealingItemsList(), healUps);
	}

	@Test
	public void testGetHealingItemsList() {
		testingTeam = new Team();
		HealingItem healUp40 = new HealingItem("Heal 50%", 200, 50);
		HealingItem healUp50 = new HealingItem("Heal 100%", 300, 100);
		testingTeam.addHealingItems(healUp40);
		testingTeam.addHealingItems(healUp50);
		ArrayList<HealingItem> healUps = new ArrayList<HealingItem>(Arrays.asList(healUp40, healUp50));
		assertEquals(testingTeam.getHealingItemsList(), healUps);
	}

	@Test
	public void testAddMapList() {
		ArrayList<String> maps = new ArrayList<String>(Arrays.asList("Map 1", "Map 2"));
		testingTeam = new Team();
		testingTeam.addMapList("Map 1");
		testingTeam.addMapList("Map 2");
		assertEquals(testingTeam.getMapList(), maps);
		}

	@Test
	public void testGetMapList() {
		ArrayList<String> maps = new ArrayList<String>(Arrays.asList("Map 1","Map 5", "Map 2"));
		testingTeam = new Team();
		testingTeam.addMapList("Map 1");
		testingTeam.addMapList("Map 5");
		testingTeam.addMapList("Map 2");
		assertEquals(testingTeam.getMapList(), maps);
	}
	
	@Test
	public void testCheckLifeOfTeam() {
		testingTeam = new Team();
		testingTeam.addHeroes("Rob", "Devil");
		testingTeam.addHeroes("Ace", "Air");
		testingTeam.checkLifeOfTeam();
		assertEquals(testingTeam.getHeroes().size(), 2);
		
		testingTeam = new Team();
		testingTeam.addHeroes("Rob", "Devil");
		testingTeam.addHeroes("Ace", "Air");
		for (int i = 0; i < testingTeam.getHeroes().size();i++) {
			testingTeam.getHeroes().get(i).decreaseHealth(1000);
		}
		testingTeam.checkLifeOfTeam();
	}

	@Test
	public void testCheckTypeInTeam() {
		testingTeam = new Team();
		testingTeam.addHeroes("Rob", "Devil");
		testingTeam.addHeroes("Ace", "Air");
		testingTeam.checkTypeInTeam("Devil");
		testingTeam.checkTypeInTeam("Divine");
	}
	
	@Test
	public void testRemovePowerUp() {
		testingTeam = new Team();
		PowerUpItem powerUp10 = new PowerUpItem("Decrease battle damage", 150, "res", 10);
		PowerUpItem powerUp50 = new PowerUpItem("Increase max health", 150, "max", 100);
		PowerUpItem powerUp100 = new PowerUpItem("Decrease battle damage maxed", 250, "res", 30);
		testingTeam.addPowerUpitem(powerUp10);
		testingTeam.addPowerUpitem(powerUp50);
		testingTeam.addPowerUpitem(powerUp100);
		testingTeam.removePowerUp(powerUp50);
		ArrayList<PowerUpItem> powerUps = new ArrayList<PowerUpItem>(Arrays.asList(powerUp10, powerUp100));
		assertEquals(testingTeam.getPowerUpList(), powerUps);
	}
	
	@Test
	public void testRemoveHealingItem() {
		testingTeam = new Team();
		HealingItem healUp40 = new HealingItem("Heal 50%", 200, 50);
		HealingItem healUp50 = new HealingItem("Heal 100%", 300, 100);
		ArrayList<HealingItem> healUps = new ArrayList<HealingItem>(Arrays.asList(healUp50));
		testingTeam.addHealingItems(healUp40);
		testingTeam.addHealingItems(healUp50);
		testingTeam.removeHealingItem(healUp40);
		assertEquals(testingTeam.getHealingItemsList(), healUps);
	}

	@Test
	public void testIncreaseMoney() {
		testingTeam = new Team();
		testingTeam.increaseMoney(100);
		assertEquals(testingTeam.getTeamMoney(), 600);
		
		testingTeam.increaseMoney(1000);
		assertEquals(testingTeam.getTeamMoney(), 1600);
		
		testingTeam.increaseMoney(-1000);
		assertEquals(testingTeam.getTeamMoney(), 1600);
	}

	@Test
	public void testDecreaseMoney() {
		testingTeam = new Team();
		testingTeam.decreaseMoney(100);
		assertEquals(testingTeam.getTeamMoney(), 400);
		
		testingTeam.decreaseMoney(-500);
		assertEquals(testingTeam.getTeamMoney(), 400);
		
		testingTeam.decreaseMoney(1000);
		assertEquals(testingTeam.getTeamMoney(), 0);
		
		testingTeam = new Team();
		testingTeam.decreaseMoney(500);
		assertEquals(testingTeam.getTeamMoney(), 0);
	}

}
