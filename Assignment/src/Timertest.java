import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//from ww  w  . j  a  va  2 s .  c o m
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * This class implements a Timer 
 * 
 * @author Ben Duke & Angelica Dela Cruz
 * @version 1.1, May 2018.
 */
public class Timertest {
	/**
	 * The Timer
	 */
	private int timer = 0;
	/**
	 * Remaining time
	 */
	private int timeremaining = 30;
	/**
	 * The Frame
	 */
	private JFrame frame;
	/**
	 * The Timer initializer
	 */
	private final Timer timerOne = new Timer(1000, this::timerOneMethod);
	/**
	 * The timer label
	 */
	private JLabel timerlb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timertest window = new Timertest();
					
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
	public Timertest() {
		initialize();
		
	}
	/**
	 * This function gets the Timer going
	 * @param e An action event
	 */
	public void timerOneMethod(ActionEvent e)
	  {
	    // do something exciting
		//;
		System.out.println("has been 1 seconds");
		timer++;
		timeremaining -=1;
		if (timeremaining == 0) {
			//timerOne.stop();
			
			getTimerlb().setText("Yay healed up");
			timerOne.stop();
		}
		else{
			getTimerlb().setText(""+timeremaining);
		}
	  }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		timerlb = new JLabel("New label");
		timerlb.setBounds(182, 28, 185, 16);
		frame.getContentPane().add(timerlb);
		timerOne.start();		
	}

	/**
	 * The label of the Timer
	 * @return Returns the Timer label
	 */
	public JLabel getTimerlb() {
		return timerlb;
	}
}
