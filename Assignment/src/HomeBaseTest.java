import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomeBaseTest {
	private HomeBase testingHome;
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
	public void testViewHeroAttributes() {
		testingHome = new HomeBase();
		Hero hero1 = new Hero("Bob", "Air");
		Hero hero2 = new Hero("Eve", "Divine");
		testingHome.addHero(hero1);
		testingHome.addHero(hero2);
		testingHome.viewHeroAttributes();
	}

	@Test
	public void testViewHeroStatus() {
		testingHome = new HomeBase();
		assertTrue(testingHome.viewHeroStatus());
	}

}
