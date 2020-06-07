package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class VacationSpotAdder extends JFrame {

	public VacationSpotAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelSpot = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldSpot = new JTextField(10);
		labelID.setLabelFor(fieldSpot);
		panel.add(labelSpot);
		panel.add(fieldSpot);
		
		JLabel labelPrice = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelID.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelPhone = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelID.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);	
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));	
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
		
	}
	
}
