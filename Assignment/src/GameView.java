import java.awt.Color;
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
		modelref.setCities();
		System.out.println(modelref.getCities()[0].getCityDestination());
		
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
				XandOPanel.setVisible(false);
				
			}
		});
		btnReturnToHomebase.setBounds(392, 340, 152, 29);
		XandOPanel.add(btnReturnToHomebase);
		modelref.createTeam("Team 1");
		//Panel end
		
		
		
//		String[] types = {"Earth", "Air", "Water", "Fire", "Divine", "Demonic"}; 
//		DefaultListModel<String> typeslist = new DefaultListModel<>();
//		for(int i = 0; i < types.length; i++) {
//			typeslist.addElement(types[i]);
//		}
		
		//Villain fight
		VillainLair.setVisible(false);
		VillainLair.setBounds(6, 6, 571, 413);
		frame.getContentPane().add(VillainLair);
		VillainLair.setLayout(null);
		
		JButton btnReturnToHero = new JButton("Return to hero base");
		btnReturnToHero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MapPanel.setVisible(true);
				VillainLair.setVisible(false);
			}
		});
		btnReturnToHero.setBounds(73, 359, 167, 29);
		VillainLair.add(btnReturnToHero);
		
		JButton BattleVillainButton = new JButton("FIGHT!!!");
		BattleVillainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XandOPanel.setVisible(true);
				VillainLair.setVisible(false);
			}
		});
		BattleVillainButton.setBounds(306, 359, 187, 29);
		VillainLair.add(BattleVillainButton);
		
		JLabel lblVillainLivesLeft = new JLabel("Villain Lives left: 3");
		lblVillainLivesLeft.setBounds(317, 331, 133, 16);
		VillainLair.add(lblVillainLivesLeft);
		
		JLabel VillainImage = new JLabel("Villain Image");
		//VillainImage.setIcon(new ImageIcon("/Users/benduke/Desktop/Screen Shot 2018-05-13 at 9.38.55 PM.png"));
		VillainImage.setBounds(74, 3, 386, 316);
		VillainLair.add(VillainImage);




		//MapPanel GUI
		
		MapPanel.setBounds(6, 6, 571, 419);
		frame.getContentPane().add(MapPanel);
		MapPanel.setVisible(true);
		MapPanel.setLayout(null);

		JButton West_button = new JButton("West");
		West_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(3);
			}
		});
		West_button.setBounds(100, 163, 121, 73);
		MapPanel.add(West_button);

		JButton East_Button = new JButton("East");
		East_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(1);
			}
		});
		East_Button.setBounds(344, 163, 121, 73);
		MapPanel.add(East_Button);

		JButton South_Button = new JButton("South");
		South_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(2);
			}
		});
		South_Button.setBounds(219, 260, 121, 73);
		MapPanel.add(South_Button);

		JButton North_Button = new JButton("North");
		North_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movetoDestination(0);
			}
		});
		North_Button.setBounds(219, 62, 121, 73);
		MapPanel.add(North_Button);

		JLabel lblVillainLives = new JLabel("Villain lives :");
		lblVillainLives.setBounds(404, 6, 161, 16);
		MapPanel.add(lblVillainLives);
		
		
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
//							//MapPanel.setVisible(true);
//						}
//						
//					
//					
//				}
//			}
//		});
//	}
//	
//	public void updateHeroes() {
//		String[] heroNames = new String[modelref.getTeam().getHeroes().size()];
//		int index = 0;
//		for (Hero temp: modelref.getTeam().getHeroes()) {
//			heroNames[index] = temp.getName() + " " + temp.getType();
//			index +=1;
//		}
//		HeroList = new JList(heroNames);
//		HeroList.setBounds(341, 167, 149, 131);
//		TeamNamePanel.add(HeroList);
//		if (modelref.getTeam().getHeroes().size() == 3) {
//			btnAddHero.setEnabled(false);
//		}
	}
	
	void movetoDestination(int direction) {
		//System.out.println(modelref.getCities()[0].getCityDestination().toArray()[0]);
		City cityref = modelref.getCities()[modelref.getCurrentCity()];
		cityref.setlocations(direction, cityref.getCityDestination().get(direction));
		System.out.println(cityref.getCityDestination().get(direction));
		
		int switchCase = cityref.getCityDestination().get(direction);
		switch(switchCase) {
		case 1: switchCase = 3;
			System.out.println("Lair Found");
			MapPanel.setVisible(false);
			VillainLair.setVisible(true);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
	
	void XandOButtonfunction(int row, int col) {
		int[] move = {row,col};
		modelref.getXAndOGame().makeMove(move);
		updateUI(modelref.getXAndOGame().getGameState());
		modelref.getXAndOGame().printState();
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
}
	
	
