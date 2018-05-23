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
		Team heroes = new Team();
		heroes.addHeroes("Bob", "Air");
		heroes.addHeroes("Eve", "Divine");
		
		
	}

	@Test
	public void testViewHeroStatus() {
		fail("Not yet implemented");
	}

}
