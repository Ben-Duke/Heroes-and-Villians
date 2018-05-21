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
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.Panel;
import java.awt.Button;
import javax.swing.SwingConstants;

public class GameView {

	private JFrame frame;
	private JTextField textField;
	public GameModel modelref = new GameModel();
	private JLabel lblNewLabel;
	private JLabel lblErrormessage;
	private JLayeredPane TeamNamePanel;
	
	private JTextField HeroName;
	private JButton btnAddHero;
	private JList HeroList;
	private JList<String> list;
	private JList cityCount;
	
	//Panel refs
	JPanel VillainLair = new JPanel();
	JPanel HospitalPanel = new JPanel();
	JPanel PowerUpDenPanel = new JPanel();
	JPanel ShopPanel = new JPanel();
	JPanel MapPanel = new JPanel();
	JPanel XandOPanel = new JPanel();
		
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
	private JList PlayerItems_list;
	
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
		modelref.setCities();
		
		
		//delete after!!!!!!!!!
		modelref.createTeam("AA");
		
		
		System.out.println(modelref.getCities()[0].getCityDestination());
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//Power up den panel
//		PowerUpDenPanel.setVisible(false);
//		PowerUpDenPanel.setBounds(6, 6, 571, 398);
//		frame.getContentPane().add(PowerUpDenPanel);
//		PowerUpDenPanel.setLayout(null);
//		
//		JLabel lblPowerUpDen = new JLabel("Power Up Den");
//		lblPowerUpDen.setBounds(243, 6, 98, 16);
//		PowerUpDenPanel.add(lblPowerUpDen);
//		
//		JButton btnReturnToBase = new JButton("Return to base");
//		btnReturnToBase.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				MapPanel.setVisible(true);
//				PowerUpDenPanel.setVisible(false);
//			}
//		});
//		btnReturnToBase.setBounds(428, 312, 117, 29);
//		PowerUpDenPanel.add(btnReturnToBase);
//		
//		JList PowerUpList = new JList();
//		PowerUpList.setBounds(28, 83, 176, 222);
//		PowerUpDenPanel.add(PowerUpList);
//		
//		JLabel lblTeamPowerUps = new JLabel("Team power ups");
//		lblTeamPowerUps.setHorizontalAlignment(SwingConstants.CENTER);
//		lblTeamPowerUps.setBounds(28, 53, 176, 16);
//		PowerUpDenPanel.add(lblTeamPowerUps);
//		
//		JList list_3 = new JList();
//		list_3.setBounds(340, 83, 225, 208);
//		PowerUpDenPanel.add(list_3);
//		
//		JLabel lblTeamHeros = new JLabel("Team Heros");
//		lblTeamHeros.setBounds(340, 55, 225, 16);
//		PowerUpDenPanel.add(lblTeamHeros);
//		
//		JButton btnUse = new JButton("Use");
//		btnUse.setBounds(211, 153, 117, 29);
//		PowerUpDenPanel.add(btnUse);
		
		
		
		//Shop panel
		ShopPanel.setVisible(true);
		ShopPanel.setBounds(6, 6, 571, 398);
		frame.getContentPane().add(ShopPanel);
		ShopPanel.setLayout(null);
		
		JLabel lblShopPanel = new JLabel("Shop");
		lblShopPanel.setBounds(243, 6, 98, 16);
		ShopPanel.add(lblShopPanel);
		
		JButton btnShopReturnToBase = new JButton("Return to base");
		btnShopReturnToBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapPanel.setVisible(true);
				ShopPanel.setVisible(false);
			}
		});
		btnShopReturnToBase.setBounds(425, 350, 117, 29);
		ShopPanel.add(btnShopReturnToBase);
		
		Team_items = new JList<String>();
		Team_items.setBounds(303, 44, 223, 276);
		ShopPanel.add(Team_items);
		PlayerItems_list = new JList();
		ShopPanel.add(PlayerItems_list);
		PlayerItems_list.setBounds(335, 75, 210, 227);
		
		ShopItems_list = new JList<String>();
		ShopItems_list.setBounds(22, 44, 223, 115);
		ShopPanel.add(ShopItems_list);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HealingItem buyingitem = new HealingItem("Item", 0, 0);
				getShopItems_list().getSelectedIndex();
				modelref.getTeam().addHealingItemsList(buyingitem);
				UpdatePlayeritems();
				updateShopUI();
				
			}
		});
		btnBuy.setBounds(128, 171, 117, 29);
		ShopPanel.add(btnBuy);
		
		PowerUpList = new JList<String>();
		PowerUpList.setBounds(22, 205, 223, 115);
		ShopPanel.add(PowerUpList);
		
		JButton buttonpowerup = new JButton("Buy");
		buttonpowerup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PowerUpItem buyingitem = new PowerUpItem("powerup", 250);
				getShopItems_list().getSelectedIndex();
				modelref.getTeam().addPowerUpitem(buyingitem);
				UpdatePlayeritems();
				updateShopUI();
			}
		});
		buttonpowerup.setBounds(128, 332, 117, 29);
		ShopPanel.add(buttonpowerup);
		UpdatePlayeritems();
		updateShopUI();
		
		
		
		
		
		
		//Hospital Panel
//		HospitalPanel.setVisible(false);
//		HospitalPanel.setBounds(6, 6, 571, 395);
//		frame.getContentPane().add(HospitalPanel);
//		HospitalPanel.setLayout(null);
////		
//		JButton btnhospitolReturnToBase = new JButton("Return to base");
//		btnhospitolReturnToBase.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				HospitalPanel.setVisible(false);
//				MapPanel.setVisible(true);
////				
//			}
//		});
//		btnhospitolReturnToBase.setBounds(386, 314, 117, 29);
//		HospitalPanel.add(btnhospitolReturnToBase);
////		
//		JLabel lblHospital = new JLabel("Hospital");
//		lblHospital.setBounds(246, 17, 61, 16);
//		HospitalPanel.add(lblHospital);
//		
		
		//Xandos game panel
//		XandOPanel.setVisible(false);
//		XandOPanel.setBounds(6, 6, 571, 390);
//		frame.getContentPane().add(XandOPanel);
//		XandOPanel.setLayout(null);
//		modelref.createXAndOGame();
//		
//		button_0.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(0, 0);
//			}
//		});
//		button_0.setBounds(26, 40, 144, 81);
//		XandOPanel.add(button_0);
//		
//		button_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(0, 1);
//			}
//		});
//		button_1.setBounds(200, 40, 144, 81);
//		XandOPanel.add(button_1);
//		
//		button_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(0, 2);
//			}
//		});
//		button_2.setBounds(367, 40, 144, 81);
//		XandOPanel.add(button_2);
//		
//		button_3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(1, 0);
//			}
//		});
//		button_3.setBounds(26, 133, 144, 81);
//		XandOPanel.add(button_3);
//		
//		button_4.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(1, 1);
//			}
//		});
//		button_4.setBounds(200, 140, 144, 81);
//		XandOPanel.add(button_4);
//		
//		button_5.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(1, 2);
//			}
//		});
//		button_5.setBounds(367, 133, 144, 81);
//		XandOPanel.add(button_5);
//		
//		button_6.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(2, 0);
//			}
//		});
//		button_6.setBounds(26, 226, 144, 81);
//		XandOPanel.add(button_6);
//		
//		button_7.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(2, 1);
//			}
//		});
//		button_7.setBounds(199, 230, 144, 81);
//		XandOPanel.add(button_7);
//		
//		button_8.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOButtonfunction(2, 2);
//			}
//		});
//		button_8.setBounds(367, 226, 144, 81);
//		XandOPanel.add(button_8);
//		
//		JLabel lblYouAreX = new JLabel("You are X, you need to get 3 in a row to win");
//		lblYouAreX.setBounds(28, 8, 294, 16);
//		XandOPanel.add(lblYouAreX);
//		
//		
//		WinnerLabel.setBounds(167, 334, 188, 39);
//		XandOPanel.add(WinnerLabel);
//		
//		JButton btnReturnToHomebase = new JButton("Return to homebase");
//		btnReturnToHomebase.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				MapPanel.setVisible(true);
//				modelref.createXAndOGame();
//				updateUI(modelref.XAndOgame.getGameState());
//				WinnerLabel.setText("Winner is ");
//				XandOPanel.setVisible(false);
//				
//			}
//		});
//		btnReturnToHomebase.setBounds(392, 340, 152, 29);
//		XandOPanel.add(btnReturnToHomebase);
//		modelref.createTeam("Team 1");
		//Panel end
		
		
		
		String[] types = {"Earth", "Air", "Water", "Fire", "Divine", "Demonic"}; 
		DefaultListModel<String> typeslist = new DefaultListModel<>();
		for(int i = 0; i < types.length; i++) {
			typeslist.addElement(types[i]);
		}
	}		
		//Villain fight
//		VillainLair.setVisible(false);
//		VillainLair.setBounds(6, 6, 571, 413);
//		frame.getContentPane().add(VillainLair);
//		VillainLair.setLayout(null);
//		
//		JButton btnReturnToHero = new JButton("Return to hero base");
//		btnReturnToHero.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				MapPanel.setVisible(true);
//				VillainLair.setVisible(false);
//			}
//		});
//		btnReturnToHero.setBounds(73, 359, 167, 29);
//		VillainLair.add(btnReturnToHero);
//		
//		JButton BattleVillainButton = new JButton("FIGHT!!!");
//		BattleVillainButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				XandOPanel.setVisible(true);
//				VillainLair.setVisible(false);
//			}
//		});
//		BattleVillainButton.setBounds(306, 359, 187, 29);
//		VillainLair.add(BattleVillainButton);
//		
//		JLabel lblVillainLivesLeft = new JLabel("Villain Lives left: 3");
//		lblVillainLivesLeft.setBounds(317, 331, 133, 16);
//		VillainLair.add(lblVillainLivesLeft);
//		
		
//		JLabel lblVillainLivesLeft = new JLabel("Welcome to your doom taunt");
//		lblVillainLivesLeft.setBounds(317, 270, 133, 16);
//		VillainLair.add(lblVillainLivesLeft);
//		JLabel VillainImage = new JLabel("Villain Image");
//		//VillainImage.setIcon(new ImageIcon("/Users/benduke/Desktop/Screen Shot 2018-05-13 at 9.38.55 PM.png"));
//		VillainImage.setBounds(74, 3, 386, 316);
//		VillainLair.add(VillainImage);




		//MapPanel GUI
		//Add in team and inventory of team
//		MapPanel.setBounds(6, 6, 571, 419);
//		frame.getContentPane().add(MapPanel);
//		MapPanel.setVisible(true);
//		MapPanel.setLayout(null);
//
//		JButton West_button = new JButton("West");
//		West_button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				movetoDestination(3);
//			}
//		});
//		West_button.setBounds(100, 163, 121, 73);
//		MapPanel.add(West_button);
//
//		JButton East_Button = new JButton("East");
//		East_Button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				movetoDestination(1);
//			}
//		});
//		East_Button.setBounds(344, 163, 121, 73);
//		MapPanel.add(East_Button);
//
//		JButton South_Button = new JButton("South");
//		South_Button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				movetoDestination(2);
//			}
//		});
//		South_Button.setBounds(219, 260, 121, 73);
//		MapPanel.add(South_Button);
//
//		JButton North_Button = new JButton("North");
//		North_Button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				movetoDestination(0);
//			}
//		});
//		North_Button.setBounds(219, 62, 121, 73);
//		MapPanel.add(North_Button);
//
//		JLabel lblVillainLives = new JLabel("Villain lives :");
//		lblVillainLives.setBounds(404, 6, 161, 16);
//		MapPanel.add(lblVillainLives);
//		
		
//		Team Panel Gui
		
//		TeamNamePanel = new JLayeredPane();
//		TeamNamePanel.setBounds(40, 35, 512, 368);
//		frame.getContentPane().add(TeamNamePanel);
//		
//		lblNewLabel = new JLabel("Please enter a name between 2 - 10 characters long");
//		lblNewLabel.setBounds(59, 37, 332, 16);
//		TeamNamePanel.add(lblNewLabel);
//		
//		lblErrormessage = new JLabel("ErrorMessage");
//		lblErrormessage.setBounds(136, 65, 193, 16);
//		TeamNamePanel.add(lblErrormessage);
//		lblErrormessage.setVisible(false);
//		lblErrormessage.setForeground(Color.RED);
//		
//		textField = new JTextField();
//		textField.setBounds(163, 79, 130, 26);
//		TeamNamePanel.add(textField);
//		textField.setColumns(10);
//		
//		JButton Done = new JButton("Done");
//		Done.setBounds(379, 310, 95, 29);
//		TeamNamePanel.add(Done);
//		
//		JLabel lblSelectHowMany = new JLabel("Select how many heros in the team");
//		lblSelectHowMany.setBounds(40, 111, 289, 16);
//		TeamNamePanel.add(lblSelectHowMany);
//		
//		HeroName = new JTextField();
//		HeroName.setBounds(121, 139, 130, 26);
//		TeamNamePanel.add(HeroName);
//		HeroName.setColumns(10);
//		
//		JLabel lblHeroName = new JLabel("Hero Name:");
//		lblHeroName.setBounds(44, 141, 86, 16);
//		TeamNamePanel.add(lblHeroName);
//		
//		list = new JList<>(typeslist);
//		list.setBounds(119, 176, 161, 122);
//		TeamNamePanel.add(list);
//		
//		btnAddHero = new JButton("Add Hero");
//		btnAddHero.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (GetHeroType() != null && HeroName != null) {
//					if(!HeroName.getText().equals("")) {
//					modelref.game_team.addHeroes(HeroName.getText(), types[GetHeroType().getSelectedIndex()]);
//					HeroName.setText("");
//					list.clearSelection();
//					updateHeroes();
//					modelref.updateCityCount(cityCount.getSelectedIndex()+1);
//					System.out.println(modelref.cityCount);
//					}
//				}
//				else {
//					System.out.println("No value");
//				}
//				
//			}
//		});
//		btnAddHero.setBounds(134, 310, 117, 29);
//		TeamNamePanel.add(btnAddHero);
//		
//		HeroList = new JList();
//		HeroList.setBounds(341, 167, 149, 131);
//		TeamNamePanel.add(HeroList);
//		
//		String[] cities= {"1","2","3" };
//		cityCount = new JList(cities);
//		cityCount.setBounds(341, 84, 149, 59);
//		cityCount.setSelectedIndex(0);
//		TeamNamePanel.add(cityCount);
//		
//		JLabel lblHowManyCities = new JLabel("How many cities?");
//		lblHowManyCities.setBounds(341, 65, 149, 16);
//		TeamNamePanel.add(lblHowManyCities);
//		
//		Done.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (getTeamNameTextField().getText().length() < 2) {
//					System.out.println("Needs to be longer name");
//					lblErrormessage.setText("Needs to be a longer name");
//					lblErrormessage.setVisible(true);
//				}
//				else if (getTeamNameTextField().getText().length() > 10) {
//					System.out.println("Needs to be shorter name");
//					lblErrormessage.setText("Needs to be a shorter name");
//					lblErrormessage.setVisible(true);
//				}
//				
//				else {
//						if (modelref.getTeam().getHeroes().size() == 0) {
//							System.out.println("Print out that you need more heros");
//						}
//						else {
//							modelref.getTeam().setTeamName(getTeamNameTextField().getText());
//							System.out.println(modelref.getTeam().getTeamName());
//							
//							for (Hero tempHero: modelref.getTeam().getHeroes()) {
//								System.out.println(tempHero.getName());
//							}
//							TeamNamePanel.setVisible(false);
//							MapPanel.setVisible(true);
//						}
//						
//					
//					
//				}
//			}
//		});
//	}
//	
	public void updateHeroes() {
		String[] heroNames = new String[modelref.getTeam().getHeroes().size()];
		int index = 0;
		for (Hero temp: modelref.getTeam().getHeroes()) {
			heroNames[index] = temp.getName() + " " + temp.getType();
			index +=1;
		}
		HeroList = new JList(heroNames);
		HeroList.setBounds(341, 167, 149, 131);
		TeamNamePanel.add(HeroList);
		if (modelref.getTeam().getHeroes().size() == 3) {
			btnAddHero.setEnabled(false);
		}
		
		updateShopUI();
	}
	
	void movetoDestination(int direction) {
		//System.out.println(modelref.getCities()[0].getCityDestination().toArray()[0]);
		City cityref = modelref.getCities()[modelref.getCurrentCity()];
		cityref.setlocations(direction, cityref.getCityDestination().get(direction));
		System.out.println(cityref.getCityDestination().get(direction));
		//The indices of the Array List stands for the map directions 0 - North, 1 - South, 2 - East, 3 - West and 4 - Center
		// * The elements in the Array List stands for the destination 0 - Shop, 1 - Power up den, 2 - Hospital, 3 - Villain's Lair and 4 - Home Base.
		int switchCase = cityref.getCityDestination().get(direction);
		System.out.println(switchCase);
		switch(switchCase +1) {		
		
		
		case 1:
		System.out.println("Shop Found");
		MapPanel.setVisible(false);
		ShopPanel.setVisible(true);
		break;
		case 2:
		System.out.println("Den Found");
		MapPanel.setVisible(false);
		PowerUpDenPanel.setVisible(true);
		break;	
					
		case 3: 
		System.out.println("Hospital Found");
		MapPanel.setVisible(false);
		HospitalPanel.setVisible(true);
		break;
			
			
		case 4:
		System.out.println("Lair Found");
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
		updateUI(modelref.getXAndOGame().getGameState());
		modelref.getXAndOGame().printState();
	}
	
	void UpdatePlayeritems(){
		ArrayList<String> PlayerItems = new ArrayList<String>();
		DefaultListModel<String> Playeritemlist = new DefaultListModel<String>();
		
		for (int i_playeritemstring = 0; i_playeritemstring < modelref.getTeam().getAllItems().size();i_playeritemstring++) {
			PlayerItems.add(modelref.getTeam().getAllItems().toArray()[i_playeritemstring].toString());
		}
		
		
		for (int j_playeritemtolist = 0; j_playeritemtolist < PlayerItems.size();j_playeritemtolist++) {
			if (modelref.getTeam().getAllItems().size() != 0) {
				Playeritemlist.addElement(modelref.getTeam().getAllItems().toArray()[j_playeritemtolist].toString());
			}else {
				System.out.print("Less than 1 item in player items");
			}
		
		Team_items = new JList(Playeritemlist);
		//getTeam_items().setModel(Playeritemlist);
		ShopPanel.add(Team_items);
	    Team_items.setBounds(303, 44, 223, 276);
		
		}
	}
	
	void updateShopUI() {
		Shop shopref = modelref.shop;
		ArrayList<String> shopItems = new ArrayList<String>();
		DefaultListModel<String> itemlist = new DefaultListModel<String>();
		
		ArrayList<String> shopPowerUpItems = new ArrayList<String>();
		DefaultListModel<String> itemPowerUplist = new DefaultListModel<String>();
		
		
		
		//Load healinhitems
		for (int i_string = 0; i_string < shopref.HealingInventory.size();i_string++) {
			shopItems.add(shopref.HealingInventory.toArray()[i_string].toString());
		}
		
		for (int j_tolist = 0; j_tolist < shopref.HealingInventory.size();j_tolist++) {
			
			itemlist.addElement(shopref.HealingInventory.toArray()[j_tolist].toString());
		}
		//Power Up item
		for (int i_powerupstring = 0; i_powerupstring < shopref.PowerUpInventory.size();i_powerupstring++) {
			shopItems.add(shopref.PowerUpInventory.toArray()[i_powerupstring].toString());
		}
		
		for (int j_poweruptolist = 0; j_poweruptolist < shopref.PowerUpInventory.size();j_poweruptolist++) {
			
			itemPowerUplist.addElement(shopref.PowerUpInventory.toArray()[j_poweruptolist].toString());
		}

		
		ShopItems_list.setModel(itemlist);
		
		getPowerUpList().setModel(itemPowerUplist);
		
		//private JList<String> ShopItems_list;
		//private JList<String> PowerUpList;
	    
	}
	
	void updateUI(String[][] board) {
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
			int index = 0;
			for (int k = 0; k < row.length; k++) {
				//System.out.println(boardrow[k]);
				row[k].setText(boardrow[k]) ;
				
			}
		}
		
		System.out.println("updating ui");
	}
	public JTextField getTeamNameTextField() {
		return textField;
	}
	public JTextField getHeroName() {
		return HeroName;
	}
	public JList GetHeroType() {
		return list;
	}
	public JList getPlayerItems_list() {
		return PlayerItems_list;
	}
	public JList getShopItems_list() {
		return ShopItems_list;
	}
	public JList getPowerUpList() {
		return PowerUpList;
	}
	public JList getTeam_items() {
		return Team_items;
	}
}
	
	