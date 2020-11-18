import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {
	private static final int HEIGHT = 400;
	private static final int WIDTH = 400;
	
	public static void main(String[] args) {
		// So far, all our program were sequential and
		// they reached the END - finito
		JFrame frame = new JFrame("Dark wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("at goats");
		JButton b52 = new JButton("at code monkeys");
		JButton doNotPushMe = new JButton(" my finger is on the button");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b52);
		frame.add(doNotPushMe);
		
		frame.pack();
		
		frame.setVisible(true);
	}

}
