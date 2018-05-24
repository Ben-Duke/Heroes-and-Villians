
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaperScissorsRockTest {
	private PaperScissorsRock game;
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
	public void testComputerMove() {
		ArrayList<String> choice = new ArrayList<String>(Arrays.asList("Paper", "Scissors", "Rock"));
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		game = new PaperScissorsRock();
		assertTrue(choice.contains(game.computerMove()));
		assertTrue(nums.contains(game.getAnswer()));
	}

	@Test
	public void testUserMove() {
		game = new PaperScissorsRock();
	}

	@Test
	public void testWhoWin() {
		game = new PaperScissorsRock();
	}

	@Test
	public void testPlayGame() {
		game = new PaperScissorsRock();
	}
}
