import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SuperVillainTest {
	private SuperVillain testingSuperVillain;
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
	public void testDecreaseLives() {
		testingSuperVillain = new SuperVillain("Evil", 3, 50, "XandO's");
		testingSuperVillain.decreaseLives();
		assertEquals(testingSuperVillain.lifeCount(), 5);
		
		testingSuperVillain = new SuperVillain("Super Evil", 5, 100, "GuessingGame");
		testingSuperVillain.decreaseLives();
		testingSuperVillain.decreaseLives();
		assertEquals(testingSuperVillain.lifeCount(), 8);

	}

	@Test
	public void testIsAlive() {
		testingSuperVillain = new SuperVillain("Evil", 5, 100, "GuessingGame");
		assertTrue(testingSuperVillain.isAlive());
		
		testingSuperVillain.killVillain();
		assertFalse(testingSuperVillain.isAlive());
	}

	@Test
	public void testLifeCount() {
		testingSuperVillain = new SuperVillain("Evil", 5, 100, "GuessingGame");
		assertEquals(testingSuperVillain.lifeCount(), 10);
		
		testingSuperVillain.decreaseLives();
		assertEquals(testingSuperVillain.lifeCount(), 9);
		
		testingSuperVillain = new SuperVillain("Bad", 1, 20, "GuessingGame");
		testingSuperVillain.decreaseLives();
		testingSuperVillain.decreaseLives();
		assertEquals(testingSuperVillain.lifeCount(), 0);
	}

	@Test
	public void testKillVillain() {
		testingSuperVillain = new SuperVillain("Super Duper Evil", 7, 150, "PaperScissorsRock");
		testingSuperVillain.killVillain();
		assertFalse(testingSuperVillain.isAlive());
	}

	@Test
	public void testSuperVillain() {
		testingSuperVillain = new SuperVillain("Super Evil", 5, 100, "GuessingGame");
		assertEquals(testingSuperVillain.getName(), "Super Evil");
		assertEquals(testingSuperVillain.lifeCount(), 10);
		assertEquals(testingSuperVillain.getDamage(), 100);
		assertEquals(testingSuperVillain.favGame(), "GuessingGame");
	}

	@Test
	public void testChangeFavoriteGame() {
		testingSuperVillain = new SuperVillain("Super Duper Evil", 7, 150, "PaperScissorsRock");
	}

}
