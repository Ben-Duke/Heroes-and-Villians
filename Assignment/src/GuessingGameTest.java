import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GuessingGameTest {
	private GuessingGame game;
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
	public void testWhoWin() {
		game = new GuessingGame();
		game.whoWin();
	}
	
	@Test
	public void testGetAnswer() {
		ArrayList<Integer> ans = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		game = new GuessingGame();
		assertTrue(ans.contains(game.getAnswer()));
	}
	
	@Test
	public void testGetTries() {
		game = new GuessingGame();
		assertEquals(game.getTries(), 3);
	}

	@Test
	public void testUserInput() {
		game = new GuessingGame();
	}

	@Test
	public void testPlayGame() {
		game = new GuessingGame();
	}

}