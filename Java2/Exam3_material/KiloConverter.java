package Exam3_material;
import javax.swing.*;
import java.awt.event.*;


public class KiloConverter extends JFrame {
	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 150;
	
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	
	public KiloConverter() {
		setTitle("Kilo Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
		
		
	}
	
	private void buildPanel() {
		messageLabel = new JLabel("Enter a distance in kilometers");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		//add event listener
		calcButton.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
	}
	
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			final double CONVERSION = 0.6214;
			String input = kiloTextField.getText();
			double miles = Double.parseDouble(input) *CONVERSION;
			JOptionPane.showMessageDialog(null,String.format("%s kilos = %.2f miles", input,miles));
		}
	}
	
	public static void main(String[] arg) {
		new KiloConverter();
	}
}
