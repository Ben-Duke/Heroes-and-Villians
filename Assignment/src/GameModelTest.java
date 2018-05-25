import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameModelTest {
	private GameModel game;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMoveCity() {
		game = new GameModel();
		game.moveCity();
		assertEquals(game.getCurrentCity(), 1);
	}

	@Test
	void testCreateTeam() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		assertEquals(game.getTeam().getTeamName(), "P-Rangers");
	}

	@Test
	void testGetGameTime() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		assertEquals(game.getGameTime(), 0);
	}

	@Test
	void testStartTimer() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		assertEquals(game.getGameTime(), 0);
		game.startTimer();
	}

	@Test
	void testUpdateCityCount() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.updateCityCount(2);
		assertEquals(game.getCityCount(), 2);
	}

	@Test
	void testGetShop() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.getShop();
		
	}

	@Test
	void testGetTeam() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.getTeam();
	}

	@Test
	void testCreateXAndOGame() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.createXAndOGame();
	}

	@Test
	void testGetXAndOGame() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.createXAndOGame();
		game.getXAndOGame();
	}

	@Test
	void testCreateNewRPSGame() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.createNewRPSGame();
	}

	@Test
	void testGetPRSGame() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.createNewRPSGame();
		game.getPRSGame();
	}

	@Test
	void testCreateNewGuessingGame() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.createNewGuessingGame();
	}

	@Test
	void testGetGuessingGame() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.createNewGuessingGame();
		game.getGuessingGame();
	}

	@Test
	void testGetCities() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		assertEquals(game.getCities(), null);
	}

	@Test
	void testGetCurrentCity() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		assertEquals(game.getCurrentCity(), 0);
		
		game.moveCity();
		assertEquals(game.getCurrentCity(), 1);
	}

	@Test
	void testSetCities() {
		game = new GameModel();
		game.createTeam("P-Rangers");
		game.setCities(3);
		assertEquals(game.getCities().size(), 3);
	}

}
