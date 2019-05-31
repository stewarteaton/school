package lab11;

import javax.swing.*;

import java.awt.event.*;//action listener interface

public class phonePlans extends JFrame{
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400; 
	
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField monthsTextField;
	
	private ButtonGroup group;
	private JRadioButton basicButton;
	private JRadioButton averageButton;
	private JRadioButton unlimitedButton; 
	private JRadioButton familyButton;

	
	public phonePlans() {
		setTitle("Cell Phone Plans");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel() {
		messageLabel = new JLabel("Eneter number of months: ");
		monthsTextField = new JTextField(10);
		basicButton = new JRadioButton("Basic (Unlimited minutes and text messages, no data) ");
		basicButton.addActionListener(new RadioButtonListener());
		averageButton = new JRadioButton("Average (5 GB of data, unlimited minutes and text messages)");
		averageButton.addActionListener(new RadioButtonListener());
		unlimitedButton = new JRadioButton("Unlimited (Unlimited minutes, texts, and high-speed data)");
		unlimitedButton.addActionListener(new RadioButtonListener());
		familyButton = new JRadioButton("Family Plan (4 lines, unlimited talk, text, and data) ");
		familyButton.addActionListener(new RadioButtonListener());
		
		group = new ButtonGroup();
		group.add(basicButton);
		group.add(averageButton);
		group.add(unlimitedButton);
		group.add(familyButton);
		
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(monthsTextField);
		panel.add(basicButton);
		panel.add(averageButton);
		panel.add(unlimitedButton);
		panel.add(familyButton);
	}
	
	private class RadioButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = monthsTextField.getText();
		
			if(e.getSource().equals(basicButton)) {
				double price = Double.parseDouble(input) *15;
				JOptionPane.showMessageDialog(null, String.format("%s The cost is = %.2f miles", input ,price));
			}
			else if(e.getSource().equals(averageButton)) {
				double price = Double.parseDouble(input) *35;
				JOptionPane.showMessageDialog(null, String.format("%s The cost is = %.2f miles", input ,price));
			}
			else if(e.getSource().equals(unlimitedButton)) {
				double price = Double.parseDouble(input) *50;
				JOptionPane.showMessageDialog(null, String.format("%s The cost is = %.2f miles", input ,price));
			}
			else if(e.getSource().equals(familyButton)) {
				double price = Double.parseDouble(input) *120;
				JOptionPane.showMessageDialog(null, String.format("%s The cost is = %.2f miles", input ,price));
			}
			
		}
	}
	public static void main(String[]args) {
		new phonePlans();
	}
}
