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
		testingItem = new Item("Decrease battle damage maxed", 250);
		assertEquals(testingItem.getName(), "Decrease battle damage maxed");
		assertEquals(250, testingItem.getPrice());
	}

	@Test
	public void testSetPrice() {
		testingItem = new Item("Heal 25%", 100);
		testingItem.setPrice(-50);
		assertEquals(testingItem.getPrice(), 100);
		
		testingItem = new Item("Heal 50%", 20);
		testingItem.setPrice(200);
		assertEquals(testingItem.getPrice(), 200);

	}

	@Test
	public void testSetName() {
		testingItem = new Item("Heal 100%", 300);
		testingItem.setName("Strong");
		assertEquals(testingItem.getName(), "Strong");
		
		testingItem = new Item("Heal 50%", 200);
		testingItem.setName("Weak");
		assertEquals(testingItem.getName(), "Weak");

	}

	@Test
	public void testGetName() {
		testingItem = new Item("Increase max health", 150);
		assertEquals(testingItem.getName(), "Increase max health");
		
		testingItem = new Item("Decrease battle damage", 150);
		assertEquals(testingItem.getName(), "Decrease battle damage");
	}

	@Test
	public void testGetPrice() {
		testingItem = new Item("Decrease battle damage", -150);
		assertEquals(testingItem.getPrice(), 0);
		
		testingItem = new Item("Heal 100%", 300);
		assertEquals(testingItem.getPrice(), 300);

	}

	@Test
	public void testToStringShop() {
		testingItem = new Item("Heal 25%", 100);
		assertEquals(testingItem.toStringShop(), "Heal 25% $100");
	}

	@Test
	public void testToString() {
		testingItem = new Item("Increase max health", 150);
		assertEquals(testingItem.toString(), "Increase max health");
	}


}
