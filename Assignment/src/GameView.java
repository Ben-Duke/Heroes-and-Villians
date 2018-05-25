import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.Timer;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
/**
 * This class implements a Game View which controls the whole state of the game 
 * and controls what the player can and cannot see.
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.2, May 2018.
 */
public class GameView {

	private JFrame frame;
	private JTextField textField;
	private GameModel modelref = new GameModel();
	private JLabel lblNewLabel;
	private JLabel lblErrormessage;
	//private JLayeredPane TeamNamePanel;
	
	private JTextField HeroName;
	private JButton btnAddHero;
	private JList HeroList;
	private JList<String> list;
	private JList cityCount;
	
	//Panel refs
	JPanel GuessingGamePanel = new JPanel();
	JPanel RockPaperSissorsPanel = new JPanel();
	JLayeredPane TeamNamePanel = new JLayeredPane();
	JPanel VillainLair = new JPanel();
	JPanel HospitalPanel = new JPanel();
	JPanel PowerUpDenPanel = new JPanel();
	JPanel ShopPanel = new JPanel();
	JPanel MapPanel = new JPanel();
	JPanel XandOPanel = new JPanel();
	JPanel battleOutComePanel = new JPanel();
//		
	//button refrences
	JButton button_0 = new JButton("-");
	JButton button_1 = new JButton("-");
	JButton button_2 = new JButton("-");
	JButton button_3 = new JButton("-");
	JButton button_4 = new JButton("-");
	JButton button_5 = new JButton("-");
	JButton button_6 = new JButton("-");
	JButton button_7 = new JButton("-");
	JButton button_8 = new JButton("-");
	
	JLabel WinnerLabel = new JLabel("Winner is ");
	
	
	private JList<String> ShopItems_list;
	private JList<String> PowerUpList;
	private JList<String> Team_items;
	private JList<String> teamOfHerosList;
	private JList<String> PowerUpListDen;
	private JLabel lblTeamMoney;
	private JLabel lblNeedMoreMoney;
	private JList HospitalHeroList;
	private JList healingItemsList;
	private JList<String> currenthealingheroes;
	private JLabel OutComeLabel;
	private JLabel lblVillainLives;
	private JList<String> MapHeroList;
	private JList VillainLairHeroselect;
	private JLabel lblVillainLivesLeft;
	
	/**
	 * The Hero battling
	 */
	Hero battlingHero = null;
	/**
	 * The possible number of Cities
	 */
	String[] cities= {"3","4","5","6" };
	private JButton btnOk;
	private JLabel lbl50offlabel;
	/**
	 * The Map
	 */
	private JList<String> PlayerItemsMap;
	private JButton West_button;
	private JButton North_Button;
	private JButton East_Button;
	private JButton South_Button;
	private JLabel lblYouHave;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameView window = new GameView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		

		frame = new JFrame();
		frame.setBounds(100, 100, 583, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Guessing Game panel
		
		GuessingGamePanel.setBounds(6, 6, 571, 419);
		frame.getContentPane().add(GuessingGamePanel);
		GuessingGamePanel.setLayout(null);
		
		JLabel lblGuessTheNumber = new JLabel("Guess the number between 1 to 10.");
		lblGuessTheNumber.setBounds(18, 11, 223, 16);
		lblGuessTheNumber.setHorizontalAlignment(SwingConstants.CENTER);
		GuessingGamePanel.add(lblGuessTheNumber);
		
		lblYouHave = new JLabel("You have 3 tries remaining");
		lblYouHave.setBounds(345, 11, 177, 16);
		GuessingGamePanel.add(lblYouHave);
		GuessingGamePanel.setVisible(false);
		JButton gbutton = new JButton("1");
		gbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(1);
				
			}
		});
		gbutton.setBounds(18, 39, 152, 82);
		GuessingGamePanel.add(gbutton);
		
		JButton gbutton_1 = new JButton("2");
		gbutton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(2);
				
			}
		});
		gbutton_1.setBounds(178, 39, 152, 80);
		GuessingGamePanel.add(gbutton_1);
		
		JButton gbutton_2 = new JButton("3");
		gbutton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(3);
				
			}
		});
		gbutton_2.setBounds(342, 39, 152, 80);
		GuessingGamePanel.add(gbutton_2);
		
		JButton gbutton_3 = new JButton("4");
		gbutton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(4);
				
			}
		});
		gbutton_3.setBounds(18, 126, 152, 80);
		GuessingGamePanel.add(gbutton_3);
		
		JButton gbutton_4 = new JButton("5");
		gbutton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(5);
				
			}
		});
		gbutton_4.setBounds(178, 126, 152, 80);
		GuessingGamePanel.add(gbutton_4);
		
		JButton gbutton_5 = new JButton("6");
		gbutton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(5);
				
			}
		});
		gbutton_5.setBounds(342, 126, 152, 80);
		GuessingGamePanel.add(gbutton_5);
		
		JButton gbutton_6 = new JButton("7");
		gbutton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(7);
				
			}
		});
		gbutton_6.setBounds(18, 210, 152, 80);
		GuessingGamePanel.add(gbutton_6);
		
		JButton gbutton_7 = new JButton("8");
		gbutton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(8);
				
			}
		});
		gbutton_7.setBounds(178, 210, 152, 80);
		GuessingGamePanel.add(gbutton_7);
		
		JButton gbutton_8 = new JButton("9");
		gbutton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(9);
				
			}
		});
		gbutton_8.setBounds(342, 210, 152, 80);
		GuessingGamePanel.add(gbutton_8);
		
		JButton gbutton_9 = new JButton("10");
		gbutton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateWinGuessing(10);
				
			}
		});
		gbutton_9.setBounds(18, 293, 152, 80);
		GuessingGamePanel.add(gbutton_9);
		

		///RPS
				RockPaperSissorsPanel.setVisible(false);
				RockPaperSissorsPanel.setBounds(6, 6, 538, 374);
				frame.getContentPane().add(RockPaperSissorsPanel);
				RockPaperSissorsPanel.setLayout(null);
				
				JButton btnRock = new JButton("Rock");
				btnRock.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String outcome = "";
						PaperScissorsRock game = modelref.getPRSGame();
						String CPUmove = game.computerMove();
						game.whoWin(CPUmove, "Rock");
						if (game.getWinner() == "X" || game.getWinner() == "O") {
							RockPaperSissorsPanel.setVisible(false);
							openbattleoutcomescreen(game.getWinner());
						}
						else {
							
							RockPaperSissorsPanel.setVisible(false);
							MapPanel.setVisible(true);
							modelref.createNewRPSGame();
						}
						
					}
				});
				btnRock.setBounds(23, 138, 150, 110);
				RockPaperSissorsPanel.add(btnRock);
				
				JButton Paper = new JButton("Paper");
				Paper.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String outcome = "";
						PaperScissorsRock game = modelref.getPRSGame();
						String CPUmove = game.computerMove();
						game.whoWin(CPUmove, "Rock");
						if (game.getWinner() == "X" || game.getWinner() == "O") {
							RockPaperSissorsPanel.setVisible(false);
							openbattleoutcomescreen(game.getWinner());
						}
						else {
							RockPaperSissorsPanel.setVisible(false);
							MapPanel.setVisible(true);
							modelref.createNewRPSGame();
						}
						
					}
				});
				Paper.setBounds(194, 140, 150, 110);
				RockPaperSissorsPanel.add(Paper);
				
				JButton scissors = new JButton("Scissors");
				scissors.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String outcome = "";
						PaperScissorsRock game = modelref.getPRSGame();
						String CPUmove = game.computerMove();
						game.whoWin(CPUmove, "Scissors");
						if (game.getWinner() == "X" || game.getWinner() == "O") {
							RockPaperSissorsPanel.setVisible(false);
							openbattleoutcomescreen(game.getWinner());
						}
						else {
							RockPaperSissorsPanel.setVisible(false);
							MapPanel.setVisible(true);
							modelref.createNewRPSGame();
						}
						
					}
				});
				scissors.setBounds(362, 140, 150, 110);
				RockPaperSissorsPanel.add(scissors);
				
				JLabel lblPlayTheVillain = new JLabel("Play the Villain in a game of Rock Paper Scissors");
				lblPlayTheVillain.setBounds(114, 62, 344, 16);
				RockPaperSissorsPanel.add(lblPlayTheVillain);
				
				JLabel lblIfThereIs = new JLabel("If there is a tie, then you will be transported back to homebase");
				lblIfThereIs.setBounds(76, 90, 456, 16);
				RockPaperSissorsPanel.add(lblIfThereIs);
		
		
		//Power up den panel
	PowerUpDenPanel.setVisible(false);
	PowerUpDenPanel.setBounds(6, 6, 571, 398);
	frame.getContentPane().add(PowerUpDenPanel);
	PowerUpDenPanel.setLayout(null);
////		
	JLabel lblPowerUpDen = new JLabel("Power Up Den");
		lblPowerUpDen.setBounds(243, 6, 98, 16);
		PowerUpDenPanel.add(lblPowerUpDen);
////		
		JButton btnReturnToBase = new JButton("Return to base");
     	btnReturnToBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshUIs();
				MapPanel.setVisible(true);
				PowerUpDenPanel.setVisible(false);
			}
		});
		btnReturnToBase.setBounds(428, 312, 117, 29);
		PowerUpDenPanel.add(btnReturnToBase);
////		
		PowerUpListDen = new JList();
		PowerUpListDen.setBounds(28, 83, 176, 222);
		PowerUpDenPanel.add(PowerUpListDen);
////		
	JLabel lblTeamPowerUps = new JLabel("Team power ups");
		lblTeamPowerUps.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamPowerUps.setBounds(28, 53, 176, 16);
		PowerUpDenPanel.add(lblTeamPowerUps);
////		
		teamOfHerosList = new JList();
		teamOfHerosList.setBounds(261, 83, 284, 77);
		PowerUpDenPanel.add(teamOfHerosList);
////		
		JLabel lblTeamHeros = new JLabel("Team Heros");
		lblTeamHeros.setBounds(340, 55, 225, 16);
//		PowerUpDenPanel.add(lblTeamHeros);
////		
	JButton btnUse = new JButton("Use");
	btnUse.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
//				
				ArrayList<PowerUpItem> powerUps = modelref.getTeam().getPowerUpList();
//				
//					
				if (!getPowerUpListDen().isSelectionEmpty() && !getTeamOfHeros().isSelectionEmpty()) {
					System.out.println(powerUps.size());
//					
					if ( powerUps.size() > 0) {
						PowerUpItem item = (PowerUpItem) powerUps.toArray()[getPowerUpListDen().getSelectedIndex()];
						item.useOn((Hero) modelref.getTeam().getHeroes().toArray()[getTeamOfHeros().getSelectedIndex()]);
						int index = getPowerUpListDen().getSelectedIndex();
						getPowerUpListDen().clearSelection();
						getTeamOfHeros().clearSelection();
						
						System.out.println(index);
						modelref.getTeam().removePowerUp((PowerUpItem) powerUps.toArray()[index]);
						updateDenUI();
						updateShopUI();
						UpdatePlayeritems();
					}
					else {
						System.out.println("No Items");
					}
//					
				}
//				
			}
		});
		btnUse.setBounds(340, 169, 117, 29);
		PowerUpDenPanel.add(btnUse);
		
		
		
		//Shop panel
		ShopPanel.setVisible(false);
		ShopPanel.setBounds(6, 6, 571, 398);
		frame.getContentPane().add(ShopPanel);
		ShopPanel.setLayout(null);
		Shop shopref = modelref.getShop();
		
		JLabel lblShopPanel = new JLabel("Shop");
		lblShopPanel.setBounds(243, 6, 98, 16);
		ShopPanel.add(lblShopPanel);
		
		JButton btnShopReturnToBase = new JButton("Return to base");
		btnShopReturnToBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowLowMoneyError().setVisible(false);
				updateDenUI();
				UpdateHospitalUI();
				UpdatePlayeritems();
				refreshUIs();
				MapPanel.setVisible(true);
				ShopPanel.setVisible(false);
				
			}
		});
		btnShopReturnToBase.setBounds(425, 350, 117, 29);
		ShopPanel.add(btnShopReturnToBase);
//		
		Team_items = new JList<String>();
		Team_items.setBounds(303, 93, 223, 245);
		ShopPanel.add(Team_items);
//		
		ShopItems_list = new JList<String>();
		ShopItems_list.setBounds(22, 44, 269, 115);
		ShopPanel.add(ShopItems_list);
//		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowLowMoneyError().setVisible(false);
				int index = getShopItems_list().getSelectedIndex();
				getShopItems_list().clearSelection();
				if (index > -1) {
					
					if (modelref.getTeam().checkTypeInTeam("Fire") == true) {
						if (modelref.getTeam().getTeamMoney() - (((HealingItem) shopref.getHealingItems().toArray()[index]).getPrice())/2 >= 0 ) {
							modelref.getTeam().decreaseMoney((((HealingItem) shopref.getHealingItems().toArray()[index]).getPrice())/2);
							modelref.getTeam().addHealingItems((HealingItem) shopref.getHealingItems().toArray()[index]);
						}else {
							ShowLowMoneyError().setVisible(true);
						}
					}
					else {
						if (modelref.getTeam().getTeamMoney() - ((HealingItem) shopref.getHealingItems().toArray()[index]).getPrice() >= 0 ) {
							modelref.getTeam().decreaseMoney(((HealingItem) shopref.getHealingItems().toArray()[index]).getPrice());
							modelref.getTeam().addHealingItems((HealingItem) shopref.getHealingItems().toArray()[index]);
						}else {
							ShowLowMoneyError().setVisible(true);
						}
					}
					
//						
					UpdatePlayeritems();
					updateShopUI();	
					
				
				}
				UpdatePlayeritems();
				updateShopUI();
				refreshUIs();
			}
		});
		btnBuy.setBounds(174, 171, 117, 29);
		ShopPanel.add(btnBuy);
//		
		PowerUpList = new JList<String>();
		PowerUpList.setBounds(22, 205, 269, 115);
		ShopPanel.add(PowerUpList);
		
		JButton buttonpowerup = new JButton("Buy");
		buttonpowerup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowLowMoneyError().setVisible(false);
				int index = getPowerUpList().getSelectedIndex();
				getShopItems_list().clearSelection();
				if (index > -1) {
				if(modelref.getTeam().checkTypeInTeam("Fire")) {
					if (modelref.getTeam().getTeamMoney() - (((PowerUpItem) shopref.getPowerUpItems().toArray()[index]).getPrice())/2 >= 0 ) {
						modelref.getTeam().decreaseMoney((((PowerUpItem) shopref.getPowerUpItems().toArray()[index]).getPrice())/2);
						modelref.getTeam().addPowerUpitem((PowerUpItem) shopref.getPowerUpItems().toArray()[index]);
		
					}else {
						ShowLowMoneyError().setVisible(true);
					}
				}
				else {
					
						if (modelref.getTeam().getTeamMoney() - ((PowerUpItem) shopref.getPowerUpItems().toArray()[index]).getPrice() >= 0 ) {
							modelref.getTeam().decreaseMoney(((PowerUpItem) shopref.getPowerUpItems().toArray()[index]).getPrice());
							modelref.getTeam().addPowerUpitem((PowerUpItem) shopref.getPowerUpItems().toArray()[index]);
			
						}else {
							ShowLowMoneyError().setVisible(true);
						}
											
						
						
					}
				}
				
				UpdatePlayeritems();
				updateShopUI();
			}
			
		});
		buttonpowerup.setBounds(174, 332, 117, 29);
		ShopPanel.add(buttonpowerup);
//		
		lblTeamMoney = new JLabel("Team Money:");
		lblTeamMoney.setBounds(303, 47, 223, 16);
		ShopPanel.add(lblTeamMoney);
		
		lblNeedMoreMoney = new JLabel("Need More money");
		lblNeedMoreMoney.setVisible(false);
		lblNeedMoreMoney.setForeground(Color.RED);
		lblNeedMoreMoney.setBounds(303, 65, 123, 16);
		ShopPanel.add(lblNeedMoreMoney);
		
		lbl50offlabel = new JLabel("Fire ability: 50% off!!");
		lbl50offlabel.setForeground(Color.GREEN);
		lbl50offlabel.setBounds(303, 22, 227, 16);
		ShopPanel.add(lbl50offlabel);
		//UpdatePlayeritems();
		//updateShopUI();
//		
		
		
		
		
		
		//Hospital Panel
		HospitalPanel.setVisible(false);
		HospitalPanel.setBounds(6, 6, 571, 395);
		frame.getContentPane().add(HospitalPanel);
		HospitalPanel.setLayout(null);
		final Timer hospitalrefresh = new Timer(1000, this::refreshheros);
		JButton btnhospitolReturnToBase = new JButton("Return to base");
		btnhospitolReturnToBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HospitalPanel.setVisible(false);
				MapPanel.setVisible(true);
				refreshUIs();
//				
			}
		});
		btnhospitolReturnToBase.setBounds(386, 314, 117, 29);
		HospitalPanel.add(btnhospitolReturnToBase);
//		
		JLabel lblHospital = new JLabel("Hospital");
		lblHospital.setBounds(246, 17, 61, 16);
		HospitalPanel.add(lblHospital);
		
		HospitalHeroList = new JList<String>();
		HospitalHeroList.setBounds(214, 78, 351, 95);
		HospitalPanel.add(HospitalHeroList);
		
		healingItemsList = new JList<String>();
		healingItemsList.setBounds(6, 78, 188, 188);
		HospitalPanel.add(healingItemsList);
		
		JButton btnUseHealing = new JButton("Use");
		btnUseHealing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<HealingItem> healingitems = modelref.getTeam().getHealingItemsList();
				
				if (!getHealingItemsList().isSelectionEmpty() && !getHospitalHeroList().isSelectionEmpty()) {
					
					if ( healingitems.size() > 0) {
						
						if(modelref.getTeam().getHeroes().get(getHospitalHeroList().getSelectedIndex()).herohealingflag() != true) {
							HealingItem item = (HealingItem) healingitems.toArray()[getHealingItemsList().getSelectedIndex()];
							item.useOn(modelref.getTeam().getHeroes().get(getHospitalHeroList().getSelectedIndex()), item.healAmount());
							
							int index = getHealingItemsList().getSelectedIndex();
							getHealingItemsList().clearSelection();
							getHospitalHeroList().clearSelection();
							UpdateHospitalUI();
							refreshUIs();
							modelref.getTeam().removeHealingItem((HealingItem) healingitems.toArray()[index]);
							System.out.println(modelref.getTeam().getHeroes().get(0).getCurrentHealth());
							UpdateHospitalUI();
							hospitalrefresh.start();
						}
						
					}
					else {
						System.out.println("No Items");
				
			}
		}
		}
		});
		btnUseHealing.setBounds(56, 278, 82, 29);
		HospitalPanel.add(btnUseHealing);
		
		currenthealingheroes = new JList<String>();
		currenthealingheroes.setBounds(214, 185, 351, 95);
		HospitalPanel.add(currenthealingheroes);
		
		///UpdateHospitalUI();
		//
		
		
		
		//Xandos game panel
		XandOPanel.setVisible(false);
		XandOPanel.setBounds(6, 6, 571, 390);
		frame.getContentPane().add(XandOPanel);
		XandOPanel.setLayout(null);
		modelref.createXAndOGame();
		
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(0, 0);
			}
		});
		button_0.setBounds(26, 40, 144, 81);
		XandOPanel.add(button_0);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(0, 1);
			}
		});
		button_1.setBounds(200, 40, 144, 81);
		XandOPanel.add(button_1);
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(0, 2);
			}
		});
		button_2.setBounds(367, 40, 144, 81);
		XandOPanel.add(button_2);
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(1, 0);
			}
		});
		button_3.setBounds(26, 133, 144, 81);
		XandOPanel.add(button_3);
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(1, 1);
			}
		});
		button_4.setBounds(200, 140, 144, 81);
		XandOPanel.add(button_4);
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(1, 2);
			}
		});
		button_5.setBounds(367, 133, 144, 81);
		XandOPanel.add(button_5);
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(2, 0);
			}
		});
		button_6.setBounds(26, 226, 144, 81);
		XandOPanel.add(button_6);
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(2, 1);
			}
		});
		button_7.setBounds(199, 230, 144, 81);
		XandOPanel.add(button_7);
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOButtonfunction(2, 2);
			}
		});
		button_8.setBounds(367, 226, 144, 81);
		XandOPanel.add(button_8);
		
		JLabel lblYouAreX = new JLabel("You are X, you need to get 3 in a row to win");
		lblYouAreX.setBounds(28, 8, 294, 16);
		XandOPanel.add(lblYouAreX);
		
		
		WinnerLabel.setBounds(167, 334, 188, 39);
		XandOPanel.add(WinnerLabel);
		
		JButton btnReturnToHomebase = new JButton("Return to homebase");
		btnReturnToHomebase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapPanel.setVisible(true);
				modelref.createXAndOGame();
				updateXandOsUI(modelref.getXAndOGame().getGameState());
				WinnerLabel.setText("Winner is ");
				refreshUIs();
				XandOPanel.setVisible(false);
				
			}
		});
		btnReturnToHomebase.setBounds(392, 340, 152, 29);
		XandOPanel.add(btnReturnToHomebase);
		//Used for loading but will be overwritten
		modelref.createTeam("Team 1");
		//Panel end
		
		
		
		String[] types = {"Earth", "Air", "Water", "Fire", "Divine", "Demonic"}; 
		DefaultListModel<String> typeslist = new DefaultListModel<>();
		for(int i = 0; i < types.length; i++) {
			typeslist.addElement(types[i]);
		}
		updateDenUI();
			
		
		
		//Villain fight
		VillainLair.setVisible(false);
		VillainLair.setBounds(6, 6, 571, 413);
		frame.getContentPane().add(VillainLair);
		VillainLair.setLayout(null);
//		
		JButton btnReturnToHero = new JButton("Return to base");
		btnReturnToHero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapPanel.setVisible(true);
				VillainLair.setVisible(false);
				refreshUIs();
			}
		});
		btnReturnToHero.setBounds(73, 359, 167, 29);
		VillainLair.add(btnReturnToHero);
//		
		
		JLabel lblChooseahero = new JLabel("Choose a Hero to do battle");
		lblChooseahero.setBounds(300, 26, 246, 16);
		VillainLair.add(lblChooseahero);
		
		JButton BattleVillainButton = new JButton("FIGHT!!!");
		BattleVillainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = getVillainLairHeroselect().getSelectedIndex();
				if (index > -1) {
					battlingHero = modelref.getTeam().getHeroes().get(index);
					//System.out.println(modelref.getTeam().getHeroes().get(index).toString());
					lblChooseahero.setForeground(Color.black);
					if(modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().getVillainGame() == "XAndOs") {
						XandOPanel.setVisible(true);
						VillainLair.setVisible(false);
					}
					else if(modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().getVillainGame() == "Guessing") {
						GuessingGamePanel.setVisible(true);
						VillainLair.setVisible(false);
					}
					else {
						RockPaperSissorsPanel.setVisible(true);
						VillainLair.setVisible(false);
					}
				
					
				}else {
					lblChooseahero.setForeground(Color.RED);
				}
				
				
				
			}
		});
		BattleVillainButton.setBounds(306, 359, 187, 29);
		VillainLair.add(BattleVillainButton);
//		
		lblVillainLivesLeft = new JLabel("Villain Lives left: 3");
		lblVillainLivesLeft.setBounds(317, 331, 133, 16);
		VillainLair.add(lblVillainLivesLeft);
		
		JLabel lblVillainTaunt = new JLabel("Welcome to your doom!!!");
		lblVillainTaunt.setForeground(Color.RED);
		lblVillainTaunt.setBounds(46, 97, 233, 16);
		VillainLair.add(lblVillainTaunt);
		
		VillainLairHeroselect = new JList();
		VillainLairHeroselect.setBounds(300, 54, 246, 248);
		VillainLair.add(VillainLairHeroselect);
		
		




		//MapPanel GUI
		//Add in team and inventory of team
		MapPanel.setBounds(6, 6, 571, 419);
		frame.getContentPane().add(MapPanel);
		MapPanel.setVisible(false);
		MapPanel.setLayout(null);

		West_button = new JButton("West");
		West_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(3);
			}
		});
		West_button.setBounds(6, 133, 121, 73);
		MapPanel.add(West_button);

		East_Button = new JButton("East");
		East_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(1);
			}
		});
		East_Button.setBounds(219, 133, 121, 73);
		MapPanel.add(East_Button);

		South_Button = new JButton("South");
		South_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(2);
			}
		});
		South_Button.setBounds(114, 204, 121, 73);
		MapPanel.add(South_Button);

		North_Button = new JButton("North");
		North_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(0);
			}
		});
		North_Button.setBounds(114, 62, 121, 73);
		MapPanel.add(North_Button);

		lblVillainLives = new JLabel("Villain lives :");
		lblVillainLives.setBounds(114, 17, 161, 16);
		MapPanel.add(lblVillainLives);
		
		MapHeroList = new JList();
		MapHeroList.setBounds(6, 303, 334, 73);
		MapPanel.add(MapHeroList);
		
		PlayerItemsMap = new JList();
		PlayerItemsMap.setBounds(374, 55, 169, 310);
		MapPanel.add(PlayerItemsMap);
		
		JLabel lblPlayerItems = new JLabel("Player Items");
		lblPlayerItems.setBounds(374, 27, 169, 16);
		MapPanel.add(lblPlayerItems);
		
		JLabel lblCurrentTeam = new JLabel("Current Team");
		lblCurrentTeam.setBounds(6, 275, 96, 16);
		MapPanel.add(lblCurrentTeam);
//		
//		Battle out come panel
		
		battleOutComePanel.setBounds(6, 6, 571, 403);
		frame.getContentPane().add(battleOutComePanel);
		battleOutComePanel.setLayout(null);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Reset Game
				modelref.createXAndOGame();
				updateXandOsUI(modelref.getXAndOGame().getGameState());
				WinnerLabel.setText("Winner is ");
				MapPanel.setVisible(true);
				battleOutComePanel.setVisible(false);
				XandOPanel.setVisible(false);
			}
		});
		btnOk.setBounds(222, 345, 117, 29);
		battleOutComePanel.add(btnOk);
		
		OutComeLabel = new JLabel("Congrats!!");
		OutComeLabel.setBounds(129, 84, 348, 180);
		battleOutComePanel.add(OutComeLabel);
		battleOutComePanel.setVisible(false);
		
		
		
//		Team Panel Gui
		
		
		TeamNamePanel.setBounds(40, 35, 512, 368);
		frame.getContentPane().add(TeamNamePanel);
		lblNewLabel = new JLabel("Please enter a name between 2 - 10 characters long");
		lblNewLabel.setBounds(59, 37, 332, 16);
		TeamNamePanel.add(lblNewLabel);
		
		lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setBounds(136, 65, 193, 16);
		TeamNamePanel.add(lblErrormessage);
		lblErrormessage.setVisible(false);
		lblErrormessage.setForeground(Color.RED);
		
		textField = new JTextField();
		textField.setBounds(163, 79, 130, 26);
		TeamNamePanel.add(textField);
		textField.setColumns(10);
		
		JButton Done = new JButton("Done");
		Done.setBounds(379, 310, 95, 29);
		TeamNamePanel.add(Done);
		
		JLabel lblSelectHowMany = new JLabel("Select how many heros in the team");
		lblSelectHowMany.setBounds(40, 111, 289, 16);
		TeamNamePanel.add(lblSelectHowMany);
		
		HeroName = new JTextField();
		HeroName.setBounds(121, 139, 130, 26);
		TeamNamePanel.add(HeroName);
		HeroName.setColumns(10);
		
		JLabel lblHeroName = new JLabel("Hero Name:");
		lblHeroName.setBounds(44, 141, 86, 16);
		TeamNamePanel.add(lblHeroName);
		
		list = new JList<>(typeslist);
		list.setBounds(119, 176, 161, 122);
		TeamNamePanel.add(list);
		
		btnAddHero = new JButton("Add Hero");
		btnAddHero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (GetHeroType() != null && HeroName != null && list.getSelectedIndex() > -1) {
					if(!HeroName.getText().equals("")) {
					modelref.getTeam().addHeroes(HeroName.getText(), types[GetHeroType().getSelectedIndex()]);
					HeroName.setText("");
					list.clearSelection();
					updateHeroes();
					modelref.updateCityCount(cityCount.getSelectedIndex()+1);
					
					}
				}
				
			}
		});
		btnAddHero.setBounds(134, 310, 117, 29);
		TeamNamePanel.add(btnAddHero);
		
		HeroList = new JList();
		HeroList.setBounds(341, 167, 149, 131);
		TeamNamePanel.add(HeroList);
		
		
		cityCount = new JList(cities);
		cityCount.setBounds(341, 84, 149, 68);
		cityCount.setModel(new AbstractListModel() {
			String[] values = new String[] {"3", "4", "5", "6"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		cityCount.setSelectedIndex(0);
		TeamNamePanel.add(cityCount);
		
		JLabel lblHowManyCities = new JLabel("How many cities?");
		lblHowManyCities.setBounds(341, 65, 149, 16);
		TeamNamePanel.add(lblHowManyCities);
		
		Done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getTeamNameTextField().getText().length() < 2) {
					//System.out.println("Needs to be longer name");
					lblErrormessage.setText("Needs to be a longer name");
					lblErrormessage.setVisible(true);
				}
				else if (getTeamNameTextField().getText().length() > 10) {
					//System.out.println("Needs to be shorter name");
					lblErrormessage.setText("Needs to be a shorter name");
					lblErrormessage.setVisible(true);
				}
				
				else {
						if (modelref.getTeam().getHeroes().size() == 0) {
							System.out.println("Print out that you need more heros");
						}
						else {
							modelref.getTeam().setTeamName(getTeamNameTextField().getText());
							modelref.createNewRPSGame();
							modelref.createNewGuessingGame();
							modelref.setCities(Integer.parseInt(cities[getCityCountList().getSelectedIndex()]));
							refreshUIs();
							TeamNamePanel.setVisible(false);
							MapPanel.setVisible(true);
						}
						
					
					
				}
			}
		});
		modelref.startTimer();
	}	
	public void updateHeroes() {
		String[] heroNames = new String[modelref.getTeam().getHeroes().size()];
		int index = 0;
		for (Hero temp: modelref.getTeam().getHeroes()) {
			heroNames[index] = temp.getName() + " " + temp.getType();
			index +=1;
		}
		HeroList = new JList<Object>(heroNames);
		HeroList.setBounds(341, 167, 149, 131);
		TeamNamePanel.add(HeroList);
		if (modelref.getTeam().getHeroes().size() == 3) {
			btnAddHero.setEnabled(false);
		}
		//Crashes without/ misses items
		updateShopUI();
		
	}
	/**
	 * This function moves to the Destination
	 * @param direction An Integer value of the Direction
	 */
	void movetoDestination(int direction) {
		//System.out.println(modelref.getCities()[0].getCityDestination().toArray()[0]);
		City cityref = modelref.getCities().get(modelref.getCurrentCity());
		cityref.setlocations(direction, cityref.getCityDestination().get(direction));
		//System.out.println(cityref.getCityDestination().get(direction));
		//The indices of the Array List stands for the map directions 0 - North, 1 - South, 2 - East, 3 - West and 4 - Center
		// * The elements in the Array List stands for the destination 0 - Shop, 1 - Power up den, 2 - Hospital, 3 - Villain's Lair and 4 - Home Base.
		int switchCase = cityref.getCityDestination().get(direction);
		//System.out.println(switchCase);
		switch(switchCase +1) {		
		
		
		case 1:
		//System.out.println("Shop Found");
		MapPanel.setVisible(false);
		ShopPanel.setVisible(true);
		break;
		case 2:
		//System.out.println("Den Found");
		MapPanel.setVisible(false);
		PowerUpDenPanel.setVisible(true);
		break;	
					
		case 3: 
		//System.out.println("Hospital Found");
		MapPanel.setVisible(false);
		HospitalPanel.setVisible(true);
		break;
			
			
		case 4:
		//System.out.println("Lair Found");
		MapPanel.setVisible(false);
		VillainLair.setVisible(true);
		break;
		default:
			System.out.println("Default happend on the switch statement");
			break;
		}
	}
	
	void XandOButtonfunction(int row, int col) {
		int[] move = {row,col};
		modelref.getXAndOGame().makeMove(move);
		updateXandOsUI(modelref.getXAndOGame().getGameState());
		//modelref.getXAndOGame().printState();
		openbattleoutcomescreen (modelref.getXAndOGame().checkforWinner());
	}
	/*
	 * Updates the hospital UI 
	 */
	void UpdateHospitalUI(){
		//ArrayList<String> PlayerItems = new ArrayList<String>();
		DefaultListModel<String> Playeritemlist = new DefaultListModel<String>();
		for (int i_playeritemstring = 0; i_playeritemstring < modelref.getTeam().getHealingItemsList().size();i_playeritemstring++) {
			Playeritemlist.addElement(modelref.getTeam().getHealingItemsList().toArray()[i_playeritemstring].toString());
			
		}
		getHealingItemsList().setModel(Playeritemlist);
		UpdateHospitalHerosUI();
		UpdateHospitalHealingHerosUI();
		}
	
	
	void UpdateLairHerosUI(){		
		DefaultListModel<String> Team = new DefaultListModel<String>();
		
		for (int heroindex = 0; heroindex < modelref.getTeam().getHeroes().size(); heroindex++) {
			if (modelref.getTeam().getHeroes().size() != 0) {
				Team.addElement(modelref.getTeam().getHeroes().get(heroindex).toString());
			}
		getMapHeroList().setModel(Team);
		getVillainLairHeroselect().setModel(Team);
		}
	}
	
	public void openbattleoutcomescreen (String marker){
		//System.out.println("Opening");
		if (marker == "X" | marker == "O") { 
			if (marker == "X") {
				
				if(battlingHero.getType() == "Demonic") {
					modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().decreaseLives();
					modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().decreaseLives();
				}
				else {
					modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().decreaseLives();
				}
				
				if (modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().isAlive() == false) {
					//System.out.println(""+modelref.getCurrentCity() + " size is " + modelref.getCities().size()) ;
					if(modelref.getCurrentCity()+1 == modelref.getCities().size()) {
						
						
						getOutComeLabel().setText("<html>You won the Game the world is safe for now <br> <br> Thanks for playing!"
								+ "<br>"
								+ "<br>"
								+ "Total Game time in minutes " + modelref.getGameTime() 
								+ " <html>");
						getBtnOkBattleScreen().setVisible(false);
					}
					else {
						getOutComeLabel().setText("<html>Yay you defeated the Villain,<br> Time for the next city</html>");
						modelref.getTeam().increaseMoney(1000);
						modelref.moveCity();
						UpdateLairUI();
					}			
					
				}
				else {
					getOutComeLabel().setText("<html>Congratulations but the Villain <br> is still kicking get back in there</html>");
					UpdateLairUI();
				}
				
			}
			else {
				int damage = 0;
				//damage = 
				
				battlingHero.decreaseHealth(modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().getDamage());
				modelref.getTeam().checkLifeOfTeam();
				refreshUIs();
				if (modelref.getTeam().getHeroes().size() == 0) {
					getOutComeLabel().setText("<html>The heroes have been all been killed,<br> evil will now rule the world!</html>");
					refreshUIs();
					getBtnOkBattleScreen().setVisible(false);
				}
				else if (battlingHero.getStatus() == false) {
					getOutComeLabel().setText("<html> hero " + battlingHero.getName() +",<br> was killed in this battle<br>"
							+ "avenge this defeat. </html>");
					refreshUIs();
				}
				else {
					getOutComeLabel().setText("<html>You may have lost this one,<br> but keep fighting you can do this!</html>");
					refreshUIs();
				}
				
			}
			
			//battlingHero = null;
			refreshUIs();
			battleOutComePanel.setVisible(true);
			XandOPanel.setVisible(false);
			
		}
		
	}
	
	void UpdateHospitalHerosUI(){		
		DefaultListModel<String> Team = new DefaultListModel<String>();
		
		for (int heroindex = 0; heroindex < modelref.getTeam().getHeroes().size(); heroindex++) {
			if (modelref.getTeam().getHeroes().size() != 0) {
				Team.addElement(modelref.getTeam().getHeroes().get(heroindex).getName());
			}
		getHospitalHeroList().setModel(Team);
		}
	}
	
	
	void UpdateHospitalHealingHerosUI(){		
		DefaultListModel<String> Team = new DefaultListModel<String>();
		for (int heroindex = 0; heroindex < modelref.getTeam().getHeroes().size(); heroindex++) {
			if (modelref.getTeam().getHeroes().size() != 0) {
				Team.addElement(modelref.getTeam().getHeroes().get(heroindex).toStringHospitalTimer());
				}
			
		if (Team.size() < 1) {
			Team = new DefaultListModel<String>();
			//System.out.println("Should be empty");
		}
		getCurrenthealingheroes().setModel(Team);
		}
	}
	/**
	 * Updates player items in the power up den
	 */
	void UpdatePlayeritems(){
		ArrayList<String> PlayerItems = new ArrayList<String>();
		DefaultListModel<String> Playeritemlist = new DefaultListModel<String>();
		
		for (int i_playeritemstring = 0; i_playeritemstring < modelref.getTeam().getAllItems().size();i_playeritemstring++) {
			PlayerItems.add(modelref.getTeam().getAllItems().toArray()[i_playeritemstring].toString());
		}
		
		if (PlayerItems.size() > 0) {
			for (int j_playeritemtolist = 0; j_playeritemtolist < PlayerItems.size();j_playeritemtolist++) {
				if (modelref.getTeam().getAllItems().size() != 0) {
					Playeritemlist.addElement(modelref.getTeam().getAllItems().toArray()[j_playeritemtolist].toString());
				}
		}
		
		
		System.out.println("Player Items should update");
		getPlayerItemsMap().setModel(Playeritemlist);
		Team_items.setModel(Playeritemlist); 
	
		}
	}
	
	void updateShopUI() {
		Shop shopref = modelref.getShop();
		ArrayList<String> shopItems = new ArrayList<String>();
		DefaultListModel<String> itemlist = new DefaultListModel<String>();
		
		DefaultListModel<String> itemPowerUplist = new DefaultListModel<String>();
		getLbl50offlabel().setVisible(false);
		getLblTeamMoney().setText("Team Money: $" + modelref.getTeam().getTeamMoney());
		
		if(modelref.getTeam().checkTypeInTeam("Fire")) {
			getLbl50offlabel().setVisible(true);
		}
		
		//Load healinhitems
		for (int i_string = 0; i_string < shopref.getHealingItems().size();i_string++) {
			shopItems.add(shopref.getHealingItems().toArray()[i_string].toString());
		}
		
		for (int j_tolist = 0; j_tolist < shopref.getHealingItems().size();j_tolist++) {
			
			itemlist.addElement(((Item) shopref.getHealingItems().toArray()[j_tolist]).toStringShop());
		}
		//Power Up item
		for (int i_powerupstring = 0; i_powerupstring < shopref.getHealingItems().size();i_powerupstring++) {
			shopItems.add(((Item) shopref.getPowerUpItems().toArray()[i_powerupstring]).toStringShop());
		}
		
		for (int j_poweruptolist = 0; j_poweruptolist < shopref.getPowerUpItems().size();j_poweruptolist++) {
			
			itemPowerUplist.addElement(((Item) shopref.getPowerUpItems().toArray()[j_poweruptolist]).toStringShop());
		}

		
		ShopItems_list.setModel(itemlist);
		
		getPowerUpList().setModel(itemPowerUplist);
		
		//private JList<String> ShopItems_list;
		//private JList<String> PowerUpList;
	    
	}
	/*
	 * Updates the XAndOs game board
	 */
	void updateXandOsUI(String[][] board) {
		ArrayList<JButton[]> boardarray = new ArrayList<JButton[]>(); 
		JButton[] row0 = new JButton[3];
		JButton[] row1 = new JButton[3];
		JButton[] row2 = new JButton[3];
		row0[0] = (button_0);
		row0[1] = (button_1);		
		row0[2] = (button_2);
		row1[0] = (button_3);
		row1[1] = (button_4);
		row1[2] = (button_5);
		row2[0] = (button_6);
		row2[1] = (button_7);
		row2[2] = (button_8);

		boardarray.add(row0);
		boardarray.add(row1);
		boardarray.add(row2); 

		String winner = modelref.getXAndOGame().checkforWinner();
		
		if (!winner.equals("None") && WinnerLabel != null) {
			WinnerLabel.setText("Winner is " + winner);
		}
		
		for (int i = 0; i < boardarray.size(); i++) {
			String[] boardrow = board[i];
			//System.out.println(i);
			JButton[] row = (JButton[]) boardarray.toArray()[i];
			for (int k = 0; k < row.length; k++) {
				//System.out.println(boardrow[k]);
				row[k].setText(boardrow[k]) ;
				
			}
		}
		
		//System.out.println("updating ui");
	}
	public JTextField getTeamNameTextField() {
		return textField;
	}
	
	/**
	 * This function updates the Map
	 */
	void updateMapUI() {
		//System.out.println("Size is " + modelref.getCities().size());
		City currentcity = modelref.getCities().get(modelref.getCurrentCity());
		System.out.println(currentcity.getKnownDestination());
//		 * The indices of the Array List stands for the map directions 0 - North, 1 - South, 2 - East, 3 - West and 4 - Center
//		 * The elements in the Array List stands for the destination 0 - Shop, 1 - Power up den, 2 - Hospital, 3 - Villain's Lair and 4 - Home Base.
		
		ArrayList<Integer> directionList = new ArrayList<Integer>();
		
		for (int i = 0; i < currentcity.getKnownDestination().size(); i++) {
			if(currentcity.getKnownDestination().get(i) == null) {
				Integer temp = 9999;
				directionList.add(temp);
			}else {
				directionList.add(currentcity.getKnownDestination().get(i));
			}
		}
		
		getNorth_Button().setText(getLocation(directionList.get(0)));
		
		getEast_Button().setText(getLocation(directionList.get(1)));
		
		getSouth_Button().setText(getLocation(directionList.get(2)));
		
		
		//int x = currentcity.getKnownDestination().get(2);
		getWest_button().setText(getLocation(directionList.get(3)));
		
		getLblVillainLives().setText("Villains Lifes : "+ modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().lifeCount());
		getMapHeroList();
	}
	
	void refreshUIs() {
		UpdateLairHerosUI();
		updateDenUI();
		UpdateLairUI();
		updateXandOsUI(modelref.getXAndOGame().getGameState());
		updateShopUI();
		updateMapUI();
		UpdatePlayeritems();
		UpdateHospitalHealingHerosUI();
		UpdateHospitalHerosUI();
		UpdateHospitalUI();
		
		
	}
	
	void updateGuessingUI() {
		getLbltrieslabel().setText("You have " + modelref.getGuessingGame().getTries() + " remaining");
	}
	
	void updateDenUI() {
		
		ArrayList<String> PlayerItems = new ArrayList<String>();
		DefaultListModel<String> Playeritemlist = new DefaultListModel<String>();
		DefaultListModel<String> Team = new DefaultListModel<String>();
		
		//System.out.println("UpdateDen " + (modelref.getTeam().getPowerUpList().toArray().length) + " items");
		for (int i_playeritemstring = 0; i_playeritemstring < modelref.getTeam().getPowerUpList().size();i_playeritemstring++) {
			PlayerItems.add(modelref.getTeam().getPowerUpList().toArray()[i_playeritemstring].toString());
		}

		
			if (modelref.getTeam().getAllItems().size() != 0) {
				for (int j_playeritemtolist = 0; j_playeritemtolist < PlayerItems.size();j_playeritemtolist++) {
				//System.out.println(modelref.getTeam().getPowerUpList().toArray()[j_playeritemtolist].toString());
				Playeritemlist.addElement(modelref.getTeam().getPowerUpList().toArray()[j_playeritemtolist].toString());}
			}
		
		for (int heroindex = 0; heroindex < modelref.getTeam().getHeroes().size(); heroindex++) {
			if (modelref.getTeam().getHeroes().size() != 0) {
				//System.out.println(modelref.getTeam().getPowerUpList().toArray()[heroindex].toString());
				Team.addElement(modelref.getTeam().getHeroes().toArray()[heroindex].toString());
			}
		}
		
		PowerUpListDen.setModel(Playeritemlist);
		teamOfHerosList.setModel(Team);
		}
	
	void UpdateLairUI() {
		getLblVillainLivesLeft().setText("Villian Lives Left: " + modelref.getCities().get(modelref.getCurrentCity()).getCityVillain().lifeCount());
	}
	/**
	 * Converts the area value into a string name of the destination it is keyed to.
	 * @param location an int number 0-3 will turn into a string number not in this range return ?????
	 * @return a string based on the number given.
	 */
	String getLocation(int location) {
		String out = "";
		
		switch(location +1) {		

		case 1:
		//System.out.println("Shop Found");
			out = "Shop";
		break;
		case 2:
		//System.out.println("Den Found");
			out = "PowerUp Den";
		break;	
					
		case 3: 
		//System.out.println("Hospital Found");
		out = "Hospital";
		break;

		case 4:
		//System.out.println("Lair Found");
		out = "Villain Lair";
		break;
		default:
			out = "?????";
			break;
		}
		return out;
	}
	
	public void calculateWinGuessing(int guess) {
		System.out.println(modelref.getGuessingGame().getAnswer());
		System.out.println(modelref.getGuessingGame().getTries());
		if(modelref.getGuessingGame().userGuess(guess)) {
			GuessingGamePanel.setVisible(false);
			System.out.println("Player won");
			openbattleoutcomescreen ("X");
			modelref.createNewGuessingGame();
			updateGuessingUI();
		}else {
			if (modelref.getGuessingGame().playerLost() && modelref.getGuessingGame().getTries() == 0  ) {
				GuessingGamePanel.setVisible(false);
				openbattleoutcomescreen("O");
				modelref.createNewGuessingGame();
				updateGuessingUI();
			}
			else {
				System.out.println("Player not dead");
				updateGuessingUI();
			}
			
		}
	}
	
	public JTextField getHeroName() {
		return HeroName;
	}
	
	public JList<String> GetHeroType() {
		return list;
	}
//	public JList getPlayerItems_list() {
//		return PlayerItems_list;
//	}
	public JList<String> getShopItems_list() {
		return ShopItems_list;
	}
	public JList<String> getPowerUpList() {
		return PowerUpList;
	}
	public JList<String> getTeam_items() {
		return Team_items;
	}
	public JList<String> getTeamOfHeros() {
		return teamOfHerosList;
	}
	public JList<String> getPowerUpListDen() {
		return PowerUpListDen;
	}
	public JLabel getLblTeamMoney() {
		return lblTeamMoney;
	}
	
	/*
	 * Returns a reference to the too low money error
	 */
	public JLabel ShowLowMoneyError() {
		return lblNeedMoreMoney;
	}
	/** 
	 * @return the Hero list for the hospital
	 */
	public JList<String> getHospitalHeroList() {
		return HospitalHeroList;
	}
	
	public void refreshheros(ActionEvent e)
	  {
		UpdateHospitalHealingHerosUI();
	  }
	/**
	 * Returns the healing list for the hospital
	 * @return
	 */
	public JList<String> getHealingItemsList() {
		return healingItemsList;
	}
	
	public JList getCurrenthealingheroes() {
		return currenthealingheroes;
	}
	public JLabel getOutComeLabel() {
		return OutComeLabel;
	}
	public JLabel getLblVillainLives() {
		return lblVillainLives;
	}
	public JList getMapHeroList() {
		return MapHeroList;
	}
	public JList getVillainLairHeroselect() {
		return VillainLairHeroselect;
	}
	public JLabel getLblVillainLivesLeft() {
		return lblVillainLivesLeft;
	}
	public JList getCityCountList() {
		return cityCount;
	}
	public JButton getBtnOkBattleScreen() {
		return btnOk;
	}
	public JLabel getLbl50offlabel() {
		return lbl50offlabel;
	}
	public JList getPlayerItemsMap() {
		return PlayerItemsMap;
	}
	public JButton getWest_button() {
		return West_button;
	}
	public JButton getNorth_Button() {
		return North_Button;
	}
	public JButton getEast_Button() {
		return East_Button;
	}
	public JButton getSouth_Button() {
		return South_Button;
	}
	public JLabel getLbltrieslabel() {
		return lblYouHave;
	}
}
	
	
