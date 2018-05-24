import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HealingItemTest {
	private HealingItem testingHealing;
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
	public void testHealingItem() {
		testingHealing = new HealingItem("Heal 25%", 100, 25);
		assertEquals(testingHealing.getName(), "Heal 25%");
		assertEquals(testingHealing.getPrice(), 100);
		assertEquals(testingHealing.healAmount(), 25);
	}

	@Test
	public void testHealAmount() {
		testingHealing = new HealingItem("Heal 100%", 300, 100);
		assertEquals(testingHealing.healAmount(), 100);
	}
	
	@Test
	public void testUseOn() {
		testingHealing = new HealingItem("Heal 50%", 200, 50);
		Hero hero = new Hero("Ruby", "Fire");
		hero.decreaseHealth(70);
		testingHealing.useOn(hero, 50);
		assertEquals(hero.getCurrentHealth(), 80);
	}

}
