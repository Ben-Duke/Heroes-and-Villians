
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CityTest {
	private City testingCity;
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
	public void testCity() {
		testingCity = new City("City 1");
		assertEquals(testingCity.getName(), "City 1");
	}
	
	@Test
	public void testSetVillain() {
		testingCity = new City("City 1");
		testingCity.setVillain();
		assertEquals(testingCity.villain.getName(), "Dibs");
		assertEquals(testingCity.villain.lifeCount(), 2);
		assertEquals(testingCity.villain.getDamage(), 20);
		assertEquals(testingCity.villain.favGame(), "XAndOs");
	}

	@Test
	public void testGetvillainStatus() {
		testCity = new City("City 2");
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
	public void testKnowCityDestination() {
		testCity = new City();
		testCity.setCityDestination();
		testCity.knowCityDestination(0);
		testCity.knowCityDestination(1);
		testCity.knowCityDestination(2);
		testCity.knowCityDestination(3);
		assertEquals(testCity.getCityDestination(), testCity.getKnownDestination());
		
		testCity = new City();
		testCity.setCityDestination();
		assertFalse(testCity.knowCityDestination(-1));
		assertFalse(testCity.knowCityDestination(6));
		
		testCity = new City();
		testCity.setCityDestination();
		assertTrue(testCity.knowCityDestination(0));
	}
	
	@Test
	public void testSetCityDestination() {
		testCity = new City();
		testCity.setCityDestination();
		testCity.knowCityDestination(0);
		testCity.knowCityDestination(1);
		testCity.knowCityDestination(2);
		testCity.knowCityDestination(3);
		assertEquals(testCity.getCityDestination(), testCity.getKnownDestination());
		
	}

	@Test
	public void testGetCityDestination() {
		testCity = new City();
		testCity.setCityDestination();
		testCity.knowCityDestination(0);
		testCity.knowCityDestination(1);
		testCity.knowCityDestination(2);
		testCity.knowCityDestination(3);
		assertEquals(testCity.getCityDestination(), testCity.getKnownDestination());
	}

}
