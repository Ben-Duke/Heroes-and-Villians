import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ItemTest {
	private Item testingItem;
	
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
	public void testItem() {
		testingItem = new Item("Power-up", 3);
		assertEquals(testingItem.getName(), "Power-up");
		assertEquals(3, testingItem.getPrice());
	}

	@Test
	public void testSetPrice() {
		testingItem = new Item("Heal-up", 3);
		testingItem.setPrice(50);
		assertEquals(testingItem.getPrice(), 50);
		
		testingItem.setPrice(100);
		assertEquals(testingItem.getPrice(), 100);

	}

	@Test
	public void testSetName() {
		testingItem = new Item("Power up", 800);
		testingItem.setName("Strong");
		assertEquals(testingItem.getName(), "Strong");
		
		testingItem = new Item("Vital", 345);
		testingItem.setName("Qwer");
		assertEquals(testingItem.getName(), "Qwer");

	}

	@Test
	public void testGetName() {
		testingItem = new Item("Power time", 90);
		assertEquals(testingItem.getName(), "Power time");
		
		testingItem = new Item("Healing Pop", 45);
		assertEquals(testingItem.getName(), "Healing Pop");
	}

	@Test
	public void testGetPrice() {
		testingItem = new Item("Party up", -35);
		assertEquals(testingItem.getPrice(), 0);
		
		testingItem = new Item("Heal up", 35);
		assertEquals(testingItem.getPrice(), 35);
		
		testingItem = new Item("Map", 120);
		assertEquals(testingItem.getPrice(), 120);

	}

////	@Test
////	public void testToStringShop() {
////		fail("Not yet implemented");
////	}
//
//	@Test
//	void testToString() {
//		testingItem = new Item("Party up", -35);
//		assertEquals(System.out.println(testingItem), "Party-up");
//	}


}
