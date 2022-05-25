package viewPackage;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class userSelectionView extends JPanel {

	/**
	 * Defining the constructor that
	 * will create a JPanel subObject to handle
	 * the GUI part of choosing which user is which 
	 * 
	 */
	public userSelectionView() {
		
		//TODO handle resizing options 
		
		/**
		 * decided to adopt this standard in which every 
		 * graphic element is "preferribly" put into a 720x720 square
		 * in order to fit most devices (most likely restaurant monitors 
		 * and tablets)
		 * 
		 * the arrangement of the gui elements is made with that in mind 
		 * giving window managers and swing the task of rearranging elements
		 * when resized 
		 * 
		 */
		setPreferredSize(new Dimension(720,720));
		setMinimumSize(new Dimension(400, 400));
		setLayout(new BorderLayout(0, 0));
		
		
		
		JButton chefButton = new JButton("Chef");
		add(chefButton, BorderLayout.WEST);
		
		JButton waiterButton = new JButton("Cameriere");
		add(waiterButton, BorderLayout.CENTER);
		
		JButton cookButton = new JButton("Cuoco");
		add(cookButton, BorderLayout.EAST);
		
		JButton kitchenButton = new JButton("Cucina");
		add(kitchenButton, BorderLayout.NORTH);
		
		
		JLabel lblSelezionaRuolo = new JLabel("Seleziona ruolo");
		
		// centering the jlabel in order to look appealing 
		lblSelezionaRuolo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSelezionaRuolo.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(lblSelezionaRuolo, BorderLayout.SOUTH);
		
	}
}
