package viewPackage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CookView extends JPanel {

	/**
	 * Create the panel.
	 */
	public CookView() {
		setBackground(new Color(240, 240, 240));
		setPreferredSize(new Dimension(720,720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 157, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 595, 0, 0, 0, 0, 388, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Component leftPaddingRigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_leftPaddingRigidArea = new GridBagConstraints();
		gbc_leftPaddingRigidArea.gridheight = 9;
		gbc_leftPaddingRigidArea.insets = new Insets(0, 0, 0, 5);
		gbc_leftPaddingRigidArea.gridx = 0;
		gbc_leftPaddingRigidArea.gridy = 0;
		add(leftPaddingRigidArea, gbc_leftPaddingRigidArea);
		
		Component topPaddingRigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_topPaddingRigidArea = new GridBagConstraints();
		gbc_topPaddingRigidArea.gridwidth = 3;
		gbc_topPaddingRigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_topPaddingRigidArea.gridx = 2;
		gbc_topPaddingRigidArea.gridy = 0;
		add(topPaddingRigidArea, gbc_topPaddingRigidArea);
		
		Component rightPaddingRigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rightPaddingRigidArea = new GridBagConstraints();
		gbc_rightPaddingRigidArea.gridheight = 9;
		gbc_rightPaddingRigidArea.gridx = 6;
		gbc_rightPaddingRigidArea.gridy = 0;
		add(rightPaddingRigidArea, gbc_rightPaddingRigidArea);
		
		JLabel tableLabel = new JLabel("Tavoli");
		GridBagConstraints gbc_tableLabel = new GridBagConstraints();
		gbc_tableLabel.insets = new Insets(0, 0, 5, 5);
		gbc_tableLabel.gridx = 3;
		gbc_tableLabel.gridy = 2;
		add(tableLabel, gbc_tableLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 3;
		add(scrollPane, gbc_scrollPane);
		
		JList tableList = new JList();
		scrollPane.setViewportView(tableList);
		
		JScrollPane secondScrollPane = new JScrollPane();
		GridBagConstraints gbc_secondScrollPane = new GridBagConstraints();
		gbc_secondScrollPane.fill = GridBagConstraints.BOTH;
		gbc_secondScrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_secondScrollPane.gridx = 4;
		gbc_secondScrollPane.gridy = 3;
		add(secondScrollPane, gbc_secondScrollPane);
		
		//TODO manage if useful or not
		JList rawPaymentList = new JList();
		secondScrollPane.setViewportView(rawPaymentList);
		
		JButton openOrderButton = new JButton("Apri Ordine");
		GridBagConstraints gbc_openOrderButton = new GridBagConstraints();
		gbc_openOrderButton.insets = new Insets(0, 0, 5, 5);
		gbc_openOrderButton.gridx = 3;
		gbc_openOrderButton.gridy = 4;
		add(openOrderButton, gbc_openOrderButton);
	
		
		JButton finishedTableBtn = new JButton("Tavolo Evaso");
		finishedTableBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_finishedTableBtn = new GridBagConstraints();
		gbc_finishedTableBtn.insets = new Insets(0, 0, 5, 5);
		gbc_finishedTableBtn.gridx = 4;
		gbc_finishedTableBtn.gridy = 4;
		add(finishedTableBtn, gbc_finishedTableBtn);
		
		JButton goBackButton = new JButton("Go Back");
		GridBagConstraints gbc_goBackButton = new GridBagConstraints();
		gbc_goBackButton.insets = new Insets(0, 0, 5, 5);
		gbc_goBackButton.gridx = 5;
		gbc_goBackButton.gridy = 5;
		add(goBackButton, gbc_goBackButton);
		
		Component bottomPaddingRigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_bottomPaddingRigidArea = new GridBagConstraints();
		gbc_bottomPaddingRigidArea.gridwidth = 5;
		gbc_bottomPaddingRigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_bottomPaddingRigidArea.gridx = 1;
		gbc_bottomPaddingRigidArea.gridy = 6;
		add(bottomPaddingRigidArea, gbc_bottomPaddingRigidArea);
		
		

	}

}
