
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
		assertEquals(testingCity.getCityVillain().getName(), "Dibs");
		assertEquals(testingCity.getCityVillain().lifeCount(), 3);
		assertEquals(testingCity.getCityVillain().getDamage(), 20);
		assertEquals(testingCity.getCityVillain().favGame(), "RPS");
	}
	
	@Test
	public void testSetSuperVillain() {
		testingCity = new City("City 6");
		testingCity.setSuperVillain();
		assertEquals(testingCity.getCityVillain().getName(), "Lord of death");
		assertEquals(testingCity.getCityVillain().lifeCount(), 6);
		assertEquals(testingCity.getCityVillain().getDamage(), 80);
		assertEquals(testingCity.getCityVillain().favGame(), "XAndOs");
	}
	
	@Test 
	public void testGetCityVillain() {
		testingCity = new City("City 1");
		testingCity.setVillain();
		assertEquals(testingCity.getCityVillain().getName(), "Dibs");
		assertEquals(testingCity.getCityVillain().lifeCount(), 3);
		assertEquals(testingCity.getCityVillain().getDamage(), 20);
		assertEquals(testingCity.getCityVillain().favGame(), "RPS");
	}

	@Test
	public void testGetvillainStatus() {
		testingCity = new City("City 2");
		testingCity.setVillain();
		testingCity.getCityVillain().killVillain();
		testingCity.setVillainStatus();
		assertFalse(testingCity.getVillainStatus());
		
		testingCity = new City("City 3");
		testingCity.setVillain();
		assertTrue(testingCity.getVillainStatus());
	}

	@Test
	public void testSetVillainStatus1() {
		testingCity = new City("City 4");
		testingCity.setVillain();
		assertTrue(testingCity.getVillainStatus());
		
		testingCity = new City("City 4");
		testingCity.setVillain();
		testingCity.getCityVillain().killVillain();
		testingCity.setVillainStatus();
		assertFalse(testingCity.getVillainStatus());
	}

	@Test
	public void testSetlocations() {
		testingCity = new City("City 5");
		testingCity.setlocations(0, 2);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, null, null, null, 4));
		assertTrue(testingCity.getKnownDestination().equals(expected));
		
		testingCity.setlocations(2, 3);
		ArrayList<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(2, null, 3, null, 4));
		assertTrue(testingCity.getKnownDestination().equals(expected1));
	}

	@Test
	public void testGetKnownDestination() {
		testingCity = new City("City 6");
		testingCity.setlocations(0, 1);
		testingCity.setlocations(1, 3);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, null, null, 4));
		assertTrue(testingCity.getKnownDestination().equals(expected));
	}


	@Test
	public void testKnowCityDestination() {
		testingCity = new City("City 1");
		testingCity.setCityDestination();
		testingCity.knowCityDestination(0);
		testingCity.knowCityDestination(1);
		testingCity.knowCityDestination(2);
		testingCity.knowCityDestination(3);
		assertEquals(testingCity.getCityDestination(), testingCity.getKnownDestination());
		
		testingCity = new City("City 2");
		testingCity.setCityDestination();
		assertFalse(testingCity.knowCityDestination(-1));
		assertFalse(testingCity.knowCityDestination(6));
		
		testingCity = new City("City 3");
		testingCity.setCityDestination();
		assertTrue(testingCity.knowCityDestination(0));
	}
	
	@Test
	public void testSetCityDestination() {
		testingCity = new City("City 4");
		testingCity.setCityDestination();
		testingCity.knowCityDestination(0);
		testingCity.knowCityDestination(1);
		testingCity.knowCityDestination(2);
		testingCity.knowCityDestination(3);
		assertEquals(testingCity.getCityDestination(), testingCity.getKnownDestination());
	}

	@Test
	public void testGetCityDestination() {
		testingCity = new City("City 5");
		testingCity.setCityDestination();
		testingCity.knowCityDestination(0);
		testingCity.knowCityDestination(1);
		testingCity.knowCityDestination(2);
		testingCity.knowCityDestination(3);
		assertEquals(testingCity.getCityDestination(), testingCity.getKnownDestination());
	}

}
