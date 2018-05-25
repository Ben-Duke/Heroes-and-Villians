import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JLabel;

public class GGuessingGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GGuessingGame window = new GGuessingGame();
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
	public GGuessingGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGuessTheNumber = new JLabel("Guess the number between 1 to 10.");
		lblGuessTheNumber.setBounds(18, 11, 223, 16);
		lblGuessTheNumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblGuessTheNumber);
		
		JLabel lblYouHave = new JLabel("You have 3 tries.");
		lblYouHave.setBounds(246, 11, 105, 16);
		panel.add(lblYouHave);
		
		JButton button = new JButton("1");
		button.setBounds(18, 39, 75, 49);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(105, 39, 75, 49);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(192, 39, 75, 49);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(279, 39, 75, 49);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(363, 39, 75, 49);
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(18, 105, 75, 49);
		panel.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(105, 105, 75, 49);
		panel.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(192, 104, 75, 50);
		panel.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(279, 105, 75, 49);
		panel.add(button_8);
		
		JButton button_9 = new JButton("10");
		button_9.setBounds(363, 105, 75, 49);
		panel.add(button_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(92, 92, -58, -24);
		panel.add(panel_1);
	}
}
