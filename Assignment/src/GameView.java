import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		
		
		String[] types = {"Earth", "Air", "Water", "Fire", "Divine", "Demonic"}; 
		DefaultListModel<String> typeslist = new DefaultListModel<>();
		for(int i = 0; i < types.length; i++) {
			typeslist.addElement(types[i]);
		}
		
	
//		Team Panel Gui
		
		TeamNamePanel = new JLayeredPane();
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
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBounds(379, 310, 95, 29);
		TeamNamePanel.add(btnNewButton);
		
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
				if (GetHeroType() != null) {
					System.out.println(GetHeroType().getSelectedIndex());
				}
				else {
					System.out.println("No value");
				}
				
			}
		});
		btnAddHero.setBounds(134, 310, 117, 29);
		TeamNamePanel.add(btnAddHero);
		
		HeroList = new JList();
		HeroList.setBounds(341, 167, 149, 131);
		TeamNamePanel.add(HeroList);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getTeamNameTextField().getText().length() < 2) {
					System.out.println("Needs to be longer name");
					lblErrormessage.setText("Needs to be a longer name");
					lblErrormessage.setVisible(true);
				}
				else if (getTeamNameTextField().getText().length() > 10) {
					System.out.println("Needs to be shorter name");
					lblErrormessage.setText("Needs to be a shorter name");
					lblErrormessage.setVisible(true);
				}
				else {
					
						System.out.println(modelref.createTeam(getTeamNameTextField().getText()));
						System.out.println(999);
						System.out.println(modelref.getTeam().getTeamName());
						TeamNamePanel.setVisible(false);
					
					
				}
			}
		});
	}
	
	public void updateHeroes() {
		HeroList = new JList();
		HeroList.setBounds(341, 167, 149, 131);
		//TeamNamePanel.add(HeroList);
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
