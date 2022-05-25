package viewPackage;
import controllerPackage.*;
import modelPackage.Meal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChefView extends JPanel {
	
	
	private JTextField mealTextField;
	private JTextField priceTextField;
	private JList chefList;
	private DefaultListModel listModel = new DefaultListModel();
	/**
	 * Create the panel.
	 */
	public ChefView(ChefController controller) {
		//TODO handle resizing options 
		
				/**
				 * decided to adopt this standard in which every 
				 * graphic element is "preferribly" put into a 720x720 square
				 * in order to fit most devices (most likely restaurant monitors 
				 * and tablets)
				 * 
				 * i personally decided to do so thinking of most modern devices 
				 * 
				 * (you gonna think that into a restaurant that uses digital devices
				 * to manage orders every piece of hardware with a monitor plugged in 
				 * has a minimum resolution of standard hdready -> https://it.wikipedia.org/wiki/720p)
				 * 
				 * the arrangement of the gui elements is made with that in mind 
				 * giving window managers and swing the task of rearranging elements
				 * when upper sized
				 * 
				 */
		
				//managed most righteously by the jframe extended class 
				setPreferredSize(new Dimension(720,720));
				
				
				
				//gridbaglayout stuff managed by windowbuilder
				GridBagLayout gridBagLayout = new GridBagLayout();
				gridBagLayout.columnWidths = new int[]{53, 194, 333, 84, 0, 0};
				gridBagLayout.rowHeights = new int[]{107, 0, 0, 0, 0, 0, -44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -46, 0, 0};
				gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
				gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				setLayout(gridBagLayout);
				
				/**
				 * defining some labels to guide the user in using the panel
				 * 
				 */
				JLabel lblChefMenu = new JLabel("CHEF MENU");
				GridBagConstraints gbc_lblChefMenu = new GridBagConstraints();
				gbc_lblChefMenu.insets = new Insets(0, 0, 5, 5);
				gbc_lblChefMenu.gridx = 2;
				gbc_lblChefMenu.gridy = 0;
				add(lblChefMenu, gbc_lblChefMenu);
				
				JLabel selectOperationLabel = new JLabel("Seleziona operazione");
				GridBagConstraints gbc_selectOperationLabel = new GridBagConstraints();
				gbc_selectOperationLabel.insets = new Insets(0, 0, 5, 5);
				gbc_selectOperationLabel.gridx = 1;
				gbc_selectOperationLabel.gridy = 1;
				add(selectOperationLabel, gbc_selectOperationLabel);
				
				
				JScrollPane chefListScrollPane = new JScrollPane();
				GridBagConstraints gbc_chefListScrollPane = new GridBagConstraints();
				gbc_chefListScrollPane.fill = GridBagConstraints.BOTH;
				gbc_chefListScrollPane.gridheight = 16;
				gbc_chefListScrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_chefListScrollPane.gridx = 2;
				gbc_chefListScrollPane.gridy = 2;
				add(chefListScrollPane, gbc_chefListScrollPane);
				
				
				
				
				JLabel lblPietanze = new JLabel("Pietanze");
				GridBagConstraints gbc_lblPietanze = new GridBagConstraints();
				gbc_lblPietanze.insets = new Insets(0, 0, 5, 5);
				gbc_lblPietanze.gridx = 2;
				gbc_lblPietanze.gridy = 1;
				add(lblPietanze, gbc_lblPietanze);
				
				Component leftPaddingRigidArea = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_leftPaddingRigidArea = new GridBagConstraints();
				gbc_leftPaddingRigidArea.gridheight = 19;
				gbc_leftPaddingRigidArea.insets = new Insets(0, 0, 5, 5);
				gbc_leftPaddingRigidArea.gridx = 0;
				gbc_leftPaddingRigidArea.gridy = 2;
				add(leftPaddingRigidArea, gbc_leftPaddingRigidArea);
				
				JButton chefAddButton = new JButton("Aggiungi");
				
			
				
				chefAddButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						controller.addMeal(new Meal(mealTextField.getText(), Double.parseDouble(priceTextField.getText())));
						
						int i = 0;
						for(Meal m:controller.getMenu()) {
							listModel.add(i, m.getName());
							i++;
						}
						//chefJList = new JList(listModel);
					}
				});
				
				
				
				
				chefList = new JList(listModel);
				chefListScrollPane.setViewportView(chefList);
				
				
				chefAddButton.setPreferredSize(new Dimension(200, 50));
				chefAddButton.setMinimumSize(new Dimension(200, 50));
				chefAddButton.setMaximumSize(new Dimension(200, 50));
				GridBagConstraints gbc_chefAddButton = new GridBagConstraints();
				gbc_chefAddButton.insets = new Insets(0, 0, 5, 5);
				gbc_chefAddButton.gridx = 1;
				gbc_chefAddButton.gridy = 2;
				add(chefAddButton, gbc_chefAddButton);
				
				
				
				
				Component rightPAddingRigidArea = Box.createRigidArea(new Dimension(20, 20));
				GridBagConstraints gbc_rightPAddingRigidArea = new GridBagConstraints();
				gbc_rightPAddingRigidArea.gridheight = 21;
				gbc_rightPAddingRigidArea.insets = new Insets(0, 0, 5, 0);
				gbc_rightPAddingRigidArea.gridx = 4;
				gbc_rightPAddingRigidArea.gridy = 0;
				add(rightPAddingRigidArea, gbc_rightPAddingRigidArea);
				
				JButton chefRemoveButton = new JButton("Rimuovi");
				chefRemoveButton.setPreferredSize(new Dimension(200, 50));
				chefRemoveButton.setMinimumSize(new Dimension(200, 50));
				chefRemoveButton.setMaximumSize(new Dimension(200, 50));
				GridBagConstraints gbc_chefRemoveButton = new GridBagConstraints();
				gbc_chefRemoveButton.insets = new Insets(0, 0, 5, 5);
				gbc_chefRemoveButton.gridx = 1;
				gbc_chefRemoveButton.gridy = 3;
				add(chefRemoveButton, gbc_chefRemoveButton);
				
				JButton chefModifyButton = new JButton("Modifica");
				chefModifyButton.setPreferredSize(new Dimension(200, 50));
				chefModifyButton.setMaximumSize(new Dimension(200, 50));
				chefModifyButton.setMinimumSize(new Dimension(200, 50));
				GridBagConstraints gbc_chefModifyButton = new GridBagConstraints();
				gbc_chefModifyButton.insets = new Insets(0, 0, 5, 5);
				gbc_chefModifyButton.gridx = 1;
				gbc_chefModifyButton.gridy = 4;
				add(chefModifyButton, gbc_chefModifyButton);
				
				JLabel mealLabel = new JLabel("Pietanza");
				GridBagConstraints gbc_mealLabel = new GridBagConstraints();
				gbc_mealLabel.insets = new Insets(0, 0, 5, 5);
				gbc_mealLabel.gridx = 1;
				gbc_mealLabel.gridy = 6;
				add(mealLabel, gbc_mealLabel);
				
				mealTextField = new JTextField();
				GridBagConstraints gbc_mealTextField = new GridBagConstraints();
				gbc_mealTextField.insets = new Insets(0, 0, 5, 5);
				gbc_mealTextField.fill = GridBagConstraints.HORIZONTAL;
				gbc_mealTextField.gridx = 1;
				gbc_mealTextField.gridy = 7;
				add(mealTextField, gbc_mealTextField);
				mealTextField.setColumns(10);
				
				JLabel priceLabel = new JLabel("Prezzo");
				GridBagConstraints gbc_priceLabel = new GridBagConstraints();
				gbc_priceLabel.insets = new Insets(0, 0, 5, 5);
				gbc_priceLabel.gridx = 1;
				gbc_priceLabel.gridy = 8;
				add(priceLabel, gbc_priceLabel);
				
				priceTextField = new JTextField();
				GridBagConstraints gbc_priceTextField = new GridBagConstraints();
				gbc_priceTextField.insets = new Insets(0, 0, 5, 5);
				gbc_priceTextField.fill = GridBagConstraints.HORIZONTAL;
				gbc_priceTextField.gridx = 1;
				gbc_priceTextField.gridy = 9;
				add(priceTextField, gbc_priceTextField);
				priceTextField.setColumns(10);
				
				JButton backToMainMenuBtn = new JButton("Back");
				backToMainMenuBtn.setMinimumSize(new Dimension(200, 30));
				backToMainMenuBtn.setMaximumSize(new Dimension(200, 30));
				GridBagConstraints gbc_backToMainMenuBtn = new GridBagConstraints();
				gbc_backToMainMenuBtn.gridheight = 2;
				gbc_backToMainMenuBtn.insets = new Insets(0, 0, 5, 5);
				gbc_backToMainMenuBtn.gridx = 3;
				gbc_backToMainMenuBtn.gridy = 18;
				add(backToMainMenuBtn, gbc_backToMainMenuBtn);
				
				
	}

}
