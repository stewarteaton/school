package Exam3_material;
import javax.swing.*;
//On TEST!
import java.awt.event.*; //needed for ActionListener Interface

public class MetricConverter extends JFrame{
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 180;
	
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	
	private ButtonGroup group;
	private JRadioButton milesButton;
	private JRadioButton feetButton;
	private JRadioButton inchesButton;
	
	public MetricConverter() {
		setTitle("Meteric Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel() {
		messageLabel = new JLabel("Eneter a distance in kilometers");
		kiloTextField = new JTextField(10);
		milesButton = new JRadioButton("Convert to miles");
		milesButton.addActionListener(new RadioButtonListener());
		feetButton = new JRadioButton("Convert to feet");
		feetButton.addActionListener(new RadioButtonListener());
		inchesButton = new JRadioButton("Convert to inches");
		inchesButton.addActionListener(new RadioButtonListener());
		
		group = new ButtonGroup();
		group.add(milesButton);
		group.add(inchesButton);
		group.add(feetButton);
		
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(feetButton);
		panel.add(inchesButton);
		panel.add(milesButton);
	}
	
	private class RadioButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = kiloTextField.getText();
			//if(milesButton.isSelected()) is another way of doing it
			if(e.getSource().equals(milesButton)) {
				double miles = Double.parseDouble(input) *.0624;
				JOptionPane.showMessageDialog(null, String.format("%s kilos = %.2f miles", input ,miles));
			}
			else if(e.getSource().equals(feetButton)) {
				double feet = Double.parseDouble(input) * 3281;
				JOptionPane.showMessageDialog(null, String.format("%s kilos = %.2f feet", input ,feet));
			}
			else {
				double inches = Double.parseDouble(input) * 3281*12;
				JOptionPane.showMessageDialog(null, String.format("%s kilos = %.2f feet", input ,inches));
			}
		}
	}
	
	
	public static void main(String[]args) {
		new MetricConverter();
	}
	
}
