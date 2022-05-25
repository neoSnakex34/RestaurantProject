package viewPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//in order to use Dimension
import java.awt.*;

public class FirstFrameToTest extends JFrame {


	/**
	 * Create the frame.
	 */
	public FirstFrameToTest(ChefView view) {
		super("RESTAURANT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(720,720));
		setMinimumSize(new Dimension(720,720));
		setContentPane(view);
		getContentPane();
		
		
		
	}

}
