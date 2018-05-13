import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainGame {
	public GameModel modelref;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame window = new MainGame();
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
	public MainGame() {
		initialize();
	}
	
	void setGameModel (GameModel ref) {
		modelref = ref;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Villain fight
//		JPanel VillainLair = new JPanel();
//		VillainLair.setBounds(6, 6, 571, 413);
//		frame.getContentPane().add(VillainLair);
//		VillainLair.setLayout(null);
//		
//		JButton btnReturnToHero = new JButton("Return to hero base");
//		btnReturnToHero.setBounds(73, 359, 167, 29);
//		VillainLair.add(btnReturnToHero);
//		
//		JButton BattleVillainButton = new JButton("FIGHT!!!");
//		BattleVillainButton.setBounds(306, 359, 187, 29);
//		VillainLair.add(BattleVillainButton);
//		
//		JLabel lblVillainLivesLeft = new JLabel("Villain Lives left: 3");
//		lblVillainLivesLeft.setBounds(317, 331, 133, 16);
//		VillainLair.add(lblVillainLivesLeft);
//		
//		JLabel VillainImage = new JLabel("Villain Image");
//		VillainImage.setIcon(new ImageIcon("/Users/benduke/Desktop/Screen Shot 2018-05-13 at 9.38.55 PM.png"));
//		VillainImage.setBounds(74, 3, 386, 316);
//		VillainLair.add(VillainImage);
		
		if (modelref != null) {
			System.out.println(modelref.getCityCount());
		}
		else {
			System.out.println(99);
		}
		
		
//		MapPanel GUI
		JPanel MapPanel = new JPanel();
		MapPanel.setBounds(6, 6, 571, 419);
		frame.getContentPane().add(MapPanel);
		MapPanel.setLayout(null);
		
		JButton West_button = new JButton("West");
		West_button.setBounds(100, 163, 121, 73);
		MapPanel.add(West_button);
		
		JButton East_Button = new JButton("East");
		East_Button.setBounds(344, 163, 121, 73);
		MapPanel.add(East_Button);
		
		JButton South_Button = new JButton("South");
		South_Button.setBounds(219, 260, 121, 73);
		MapPanel.add(South_Button);
		
		JButton North_Button = new JButton("North");
		North_Button.setBounds(219, 62, 121, 73);
		MapPanel.add(North_Button);
		
		JLabel lblVillainLives = new JLabel("Villain lives :");
		lblVillainLives.setBounds(404, 6, 161, 16);
		MapPanel.add(lblVillainLives);
	}
}
