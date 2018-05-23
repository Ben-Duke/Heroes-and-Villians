import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VillainTest {
	private Villain testingVillain;
	
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
	public void testVillain() {
		testingVillain = new Villain("Evil", 3, 20, "XandO's");
		assertEquals(testingVillain.getName(), "Evil");
		assertEquals(testingVillain.lifeCount(), 3);
		assertEquals(testingVillain.getDamage(), 20);
		assertEquals(testingVillain.favGame(), "XandO's");
	}

	@Test
	public void testDecreaseLives() {
		testingVillain = new Villain("Roo", 3, 30, "XandO's");
		testingVillain.decreaseLives();
		assertEquals(testingVillain.lifeCount(), 2);
		
		testingVillain.decreaseLives();
		assertEquals(testingVillain.lifeCount(), 1);
		
		testingVillain.decreaseLives();
		assertEquals(testingVillain.lifeCount(), 0);
	}

	@Test
	public void testIsAlive() {
		testingVillain = new Villain("Bad", 3, 25, "PaperScissorsRock");
		assertTrue(testingVillain.isAlive());
		
		testingVillain.killVillain();
		assertFalse(testingVillain.isAlive());
	}

	@Test
	public void testLifeCount() {
		testingVillain = new Villain("Evil", 3, 20, "XandO's");
		assertEquals(testingVillain.lifeCount(), 3);
		
		testingVillain.decreaseLives();
		assertEquals(testingVillain.lifeCount(), 2);
		
		testingVillain = new Villain("Super Evil", 3, 40, "PaperScissorsRock");
		testingVillain.killVillain();
		assertEquals(testingVillain.lifeCount(), 0);
	}

	@Test
	public void testFavGame() {
		testingVillain = new Villain("Bad", 3, 25, "XandO's");
		assertEquals(testingVillain.favGame(), "XandO's");
		
		testingVillain = new Villain("Super Evil", 3, 40, "GuessingGame");
		assertEquals(testingVillain.favGame(), "GuessingGame");
	}

	@Test
	public void testKillVillain() {
		testingVillain = new Villain("Evil", 3, 20, "XandO's");
		testingVillain.killVillain();
		assertFalse(testingVillain.isAlive());
		
		testingVillain = new Villain("Super Evil", 3, 40, "GuessingGame");
		testingVillain.decreaseLives();
		testingVillain.killVillain();
		assertFalse(testingVillain.isAlive());
	}

	@Test
	public void testGetName() {
		testingVillain = new Villain("Bad", 3, 25, "PaperScissorsRock");
		assertEquals(testingVillain.getName(), "Bad");
		
		testingVillain = new Villain("Super Evil", 3, 40, "XandO's");
		assertEquals(testingVillain.getName(), "Super Evil");
	}

	@Test
	public void testGetDamage() {
		testingVillain = new Villain("Evil", 3, 20, "XandO's");
		assertEquals(testingVillain.getDamage(), 20);
		
		testingVillain = new Villain("Super Evil", 3, 40, "GuessingGame");
		assertEquals(testingVillain.getDamage(), 40);
	}

}
