import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CityTest {
	private City testCity;
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
	public void testGetvillainStatus() {
		testCity = new City();
		assertTrue(testCity.getvillainStatus() == true);

	}

	@Test
	public void testSetVillainStatus() {
		testCity = new City();
		testCity.setVillainStatus(false);
		assertFalse(testCity.getvillainStatus() == false);
		
		testCity.setVillainStatus(true);
		assertTrue(testCity.getvillainStatus() == true);

	}

}
