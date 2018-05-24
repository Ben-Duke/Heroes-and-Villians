import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShopTest {
	private GameModel modelref;
	private Shop testingShop;
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
	public void testShowTeamInventory() {
		testingShop = new Shop();
	}

	@Test
	public void testShop() {
		testingShop = new Shop();
	}
	
	@Test 
	public void testShowTeamMoney() {
		testingShop = new Shop();
	}
	
	@Test
	public void testGetHealingItems() {
		testingShop = new Shop();
		assertEquals(testingShop.getHealingItems().size(), 3);
	}

	@Test
	public void testGetPowerUpItems() {
		testingShop = new Shop();
		assertEquals(testingShop.getPowerUpItems().size(), 3);
	}

	@Test
	public void testShowObjectAttributes() {
		testingShop = new Shop();
		assertEquals(testingShop.showObjectAttributes(), "");
	}

}
