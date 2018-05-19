import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

//	@Test
//	public void testSetVillain() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetvillainStatus() {
		testCity = new City();
		assertEquals(testCity.getvillainStatus(), true);
		
		testCity.setVillainStatus(false);
		assertEquals(testCity.getvillainStatus(), false);
	}

	@Test
	public void testSetVillainStatus() {
		testCity = new City();
		testCity.setVillainStatus(false);
		assertEquals(testCity.getvillainStatus(), false);
		
		testCity = new City();
		testCity.setVillainStatus(true);
		assertTrue(testCity.getvillainStatus() == true);
	}

	@Test
	public void testSetlocations() {
		testCity = new City();
		testCity.setlocations(0, 2);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, null, null, null, 4));
		assertTrue(testCity.getKnownDestination().equals(expected));
		
		testCity.setlocations(2, 3);
		ArrayList<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(2, null, 3, null, 4));
		assertTrue(testCity.getKnownDestination().equals(expected1));
		
	
	}

	@Test
	public void testGetKnownDestination() {
		testCity = new City();
		testCity.setlocations(0, 1);
		testCity.setlocations(1, 3);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, null, null, 4));
		assertTrue(testCity.getKnownDestination().equals(expected));
	}

	@Test
	public void testSetCityDestination() {
		testCity = new City();
		testCity.setCityDestination();
		//need to edit this
		assertEquals(testCity.getCityDestination(), testCity.getCityDestination());
		
	}

//	@Test
//	public void testGetCityDestination() {
//		fail("Not yet implemented");
//	}

}
