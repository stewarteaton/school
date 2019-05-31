package lab10;
import javax.swing.*;

import java.awt.event.*;

public class GUIDemo extends JFrame{
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 250;
	
	private JPanel panel;
	private JLabel amountLabel;
	private JLabel taxLabel;
	private JTextField amountTextField;
	private JTextField taxTextField;
	private JButton calcButton;
	
	public GUIDemo() {
		setTitle("Grocery Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
		
		
	}
	
	private void buildPanel() {
		amountLabel = new JLabel("Enter the amount of your purchase:$");
		amountTextField = new JTextField(10);
		taxLabel = new JLabel("Enter your state tax rate(enter 6 for 6%):");
		taxTextField = new JTextField(10);
		calcButton = new JButton("Calculate Payment");
		//add event listener
		calcButton.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		panel.add(amountLabel);
		panel.add(amountTextField);
		panel.add(taxLabel);
		panel.add(taxTextField);
		panel.add(calcButton);
	}
	
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String amount = amountTextField.getText();
			String tax = taxTextField.getText();
			
			double total = Double.parseDouble(amount) *Double.parseDouble(tax)/100 + Double.parseDouble(amount);
			JOptionPane.showMessageDialog(null,String.format("You need to pay %.2f", total));
		}
	}
	
	public static void main(String[] arg) {
		new GUIDemo();
	}
}
