import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerUpItemTest {
	private PowerUpItem testingpowerUp;

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
	public void testPowerUpItem() {
		testingpowerUp = new PowerUpItem("Decrease battle damage", 150, "res", 10);
		assertEquals(testingpowerUp.getName(), "Decrease battle damage");
		assertEquals(testingpowerUp.getPrice(), 150);
		assertEquals(testingpowerUp.getPower(), "res");
		assertEquals(testingpowerUp.getPowerAmount(), 10);
		
	}

	@Test
	public void testGetPower() {
		testingpowerUp = new PowerUpItem("Increase max health", 150, "max", 100);
		assertEquals(testingpowerUp.getPower(), "max");
		
		testingpowerUp = new PowerUpItem("Decrease battle damage", 150, "res", 10);
		assertEquals(testingpowerUp.getPower(), "res");
	}
	
	@Test
	public void getPowerAmount() {
		testingpowerUp = new PowerUpItem("Increase max health", 150, "max", 100);
		assertEquals(testingpowerUp.getPowerAmount(), 100);
		
		testingpowerUp = new PowerUpItem("Decrease battle damage maxed", 250, "res", 30);
		assertEquals(testingpowerUp.getPowerAmount(), 30);
	}

	@Test
	public void testUseOn() {
		testingpowerUp = new PowerUpItem("Decrease battle damage maxed", 250, "res", 30);
		Hero hero1 = new Hero("Bob", "Fire");
		testingpowerUp.useOn(hero1);
		assertEquals(hero1.getResistance(), 30);
		
		testingpowerUp = new PowerUpItem("Increase max health", 150, "max", 100);
		assertEquals(testingpowerUp.getPower(), "max");
		Hero hero2 = new Hero("Bob", "Fire");
		testingpowerUp.useOn(hero2);
		assertEquals(hero2.getIncreaseMax(), 100);
		
	}

}
