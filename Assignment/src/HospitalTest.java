import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HospitalTest {
	private Hospital testingHospital;
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
	public void testGetDestinationName() {
		testingHospital = new Hospital();
		assertEquals(testingHospital.getDestinationName(), "Hospital");
	}

	@Test
	public void testHealHero() {
		testingHospital = new Hospital();
		Hero hero = new Hero("Bob", "Air");
		hero.decreaseHealth(25);
		assertEquals(hero.getCurrentHealth(), 75);
		testingHospital.healHero(hero);
		assertEquals(hero.getCurrentHealth(), 100);
	}

}
