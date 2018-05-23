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


public class Timertest {
	private int timer = 0;
	int timeremaining = 30;
	private JFrame frame;
	final Timer timerOne = new Timer(1000, this::timerOneMethod);
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

	public JLabel getTimerlb() {
		return timerlb;
	}
}
