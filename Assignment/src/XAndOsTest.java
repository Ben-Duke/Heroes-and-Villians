import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XAndOsTest {
	private XAndOs game;
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
	public void testGetGameState() {
		game = new XAndOs();
		game.getGameState();
	}

	@Test
	public void testSetViewRef() {
		game = new XAndOs();
		game.getGameState();
	}

	@Test
	public void testPlayGame() {
		game = new XAndOs();
		game.getGameState();
	}

	@Test
	public void testMakeMove() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {0, 1};
		game.makeMove(list1);
		int[] list2 = {0, 2};
		game.makeMove(list2);
		
		game = new XAndOs();
		game.getGameState();
		int[] list3 = {1, 0};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {1, 2};
		game.makeMove(list5);
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {2, 0};
		game.makeMove(list6);
		int[] list7 = {2, 1};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		
		game = new XAndOs();
		game.getGameState();
		int[] list9 = {0, 0};
		game.makeMove(list9);
		int[] list10 = {1, 1};
		game.makeMove(list10);
		int[] list11 = {2, 2};
		game.makeMove(list11);
		
		game = new XAndOs();
		game.getGameState();
		int[] list12 = {0, 2};
		game.makeMove(list12);
		int[] list13 = {1, 1};
		game.makeMove(list13);
		int[] list14 = {2, 0};
		game.makeMove(list14);
	}

	@Test
	public void testCpuMoveHelper() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		game.cpuMove();
		int[] list1 = {1, 1};
		game.makeMove(list1);
		game.cpuMove();
		int[] list2 = {2, 2};
		game.makeMove(list2);
		game.cpuMove();
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {0, 0};
		game.makeMove(list6);
		int[] list7 = {1, 0};
		game.makeMove(list7);
		int[] list8 = {2, 0};
		game.makeMove(list8);
		game.cpuMove();
	}

	@Test
	public void testCpuMove() {
		game = new XAndOs();
		game.getGameState();
		game.cpuMove();
	}

	@Test
	public void testCheckRows() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {0, 1};
		game.makeMove(list1);
		int[] list2 = {0, 2};
		game.makeMove(list2);
		game.checkRows();
		
		game = new XAndOs();
		game.getGameState();
		int[] list3 = {1, 0};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {1, 2};
		game.makeMove(list5);
		game.checkRows();
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {2, 0};
		game.makeMove(list6);
		int[] list7 = {2, 1};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		game.checkRows();
	}

	@Test
	public void testGetWinner() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {0, 1};
		game.makeMove(list1);
		int[] list2 = {0, 2};
		game.makeMove(list2);
		game.checkCols();
		game.checkRows();
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list3 = {1, 0};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {1, 2};
		game.makeMove(list5);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {2, 0};
		game.makeMove(list6);
		int[] list7 = {2, 1};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list9 = {0, 0};
		game.makeMove(list9);
		int[] list10 = {1, 1};
		game.makeMove(list10);
		int[] list11 = {2, 2};
		game.makeMove(list11);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list12 = {0, 2};
		game.makeMove(list12);
		int[] list13 = {1, 1};
		game.makeMove(list13);
		int[] list14 = {2, 0};
		game.makeMove(list14);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
	}

	@Test
	public void testCheckCols() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {1, 0};
		game.makeMove(list1);
		int[] list2 = {2, 0};
		game.makeMove(list2);
		game.checkCols();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list3 = {0, 1};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {2, 1};
		game.makeMove(list5);
		game.checkCols();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {0, 2};
		game.makeMove(list6);
		int[] list7 = {1, 2};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		game.checkCols();
		game.checkMarker("X");
		game.getWinner();
	}

	@Test
	public void testCheckMarker() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {1, 0};
		game.makeMove(list1);
		int[] list2 = {2, 0};
		game.makeMove(list2);
		game.checkCols();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list3 = {0, 1};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {2, 1};
		game.makeMove(list5);
		game.checkCols();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {0, 2};
		game.makeMove(list6);
		int[] list7 = {1, 2};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		game.checkCols();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list9 = {0, 0};
		game.makeMove(list9);
		int[] list10 = {1, 1};
		game.makeMove(list10);
		int[] list11 = {2, 2};
		game.makeMove(list11);
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list12 = {0, 2};
		game.makeMove(list12);
		int[] list13 = {1, 1};
		game.makeMove(list13);
		int[] list14 = {2, 0};
		game.makeMove(list14);
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
	}

	@Test
	public void testCheckDiag() {
		game = new XAndOs();
		game.getGameState();
		int[] list9 = {0, 0};
		game.makeMove(list9);
		int[] list10 = {1, 1};
		game.makeMove(list10);
		int[] list11 = {2, 2};
		game.makeMove(list11);
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list12 = {0, 2};
		game.makeMove(list12);
		int[] list13 = {1, 1};
		game.makeMove(list13);
		int[] list14 = {2, 0};
		game.makeMove(list14);
		game.checkDiag();
		game.checkMarker("X");
		game.getWinner();
	}

	@Test
	public void testPlaceMarker() {
		game = new XAndOs();
		game.getGameState();
		game.placeMarker("X", 0, 0);
		game.placeMarker("X", 0, 1);
		game.placeMarker("X", 0, 2);
		
		game = new XAndOs();
		game.getGameState();
		game.placeMarker("X", 1, 0);
		game.placeMarker("X", 1, 1);
		game.placeMarker("X", 1, 2);
		
		game = new XAndOs();
		game.getGameState();
		game.placeMarker("X", 2, 0);
		game.placeMarker("X", 2, 1);
		game.placeMarker("X", 2, 2);
		
		game = new XAndOs();
		game.getGameState();
		game.placeMarker("O", 0, 0);
		game.placeMarker("O", 0, 1);
		game.placeMarker("O", 0, 2);
		
		game = new XAndOs();
		game.getGameState();
		game.placeMarker("O", 1, 0);
		game.placeMarker("O", 1, 1);
		game.placeMarker("O", 1, 2);
		
		game = new XAndOs();
		game.getGameState();
		game.placeMarker("O", 2, 0);
		game.placeMarker("O", 2, 1);
		game.placeMarker("O", 2, 2);
	}

	@Test
	public void testPrintState() {
		game = new XAndOs();
		game.getGameState();
		game.printState();
		
		game = new XAndOs();
		game.getGameState();
		int[] list12 = {0, 2};
		game.makeMove(list12);
		int[] list13 = {1, 1};
		game.makeMove(list13);
		int[] list14 = {2, 0};
		game.makeMove(list14);
		game.printState();
	}

	@Test
	public void testCheckforWinner() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {0, 1};
		game.makeMove(list1);
		int[] list2 = {0, 2};
		game.makeMove(list2);
		game.checkCols();
		game.checkRows();
		game.checkDiag();
		game.checkMarker("X");
		game.checkforWinner();
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list3 = {1, 0};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {1, 2};
		game.makeMove(list5);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.checkforWinner();
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list6 = {2, 0};
		game.makeMove(list6);
		int[] list7 = {2, 1};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.checkforWinner();
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list9 = {0, 0};
		game.makeMove(list9);
		int[] list10 = {1, 1};
		game.makeMove(list10);
		int[] list11 = {2, 2};
		game.makeMove(list11);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.checkforWinner();
		game.getWinner();
		
		game = new XAndOs();
		game.getGameState();
		int[] list12 = {0, 2};
		game.makeMove(list12);
		int[] list13 = {1, 1};
		game.makeMove(list13);
		int[] list14 = {2, 0};
		game.makeMove(list14);
		game.checkRows();
		game.checkCols();
		game.checkDiag();
		game.checkMarker("X");
		game.checkforWinner();
		game.getWinner();
	}

	@Test
	public void testAbleToPlay() {
		game = new XAndOs();
		game.getGameState();
		int[] list = {0, 0};
		game.makeMove(list);
		int[] list1 = {0, 1};
		game.makeMove(list1);
		int[] list2 = {0, 2};
		game.makeMove(list2);
		int[] list3 = {1, 0};
		game.makeMove(list3);
		int[] list4 = {1, 1};
		game.makeMove(list4);
		int[] list5 = {1, 2};
		game.makeMove(list5);
		int[] list6 = {2, 0};
		game.makeMove(list6);
		int[] list7 = {2, 1};
		game.makeMove(list7);
		int[] list8 = {2, 2};
		game.makeMove(list8);
		game.ableToPlay();
	
	}

}
