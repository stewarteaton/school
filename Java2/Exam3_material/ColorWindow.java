package Exam3_material;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class ColorWindow extends JFrame{

	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 150;
	
	private JPanel panel;
	private JLabel message;
	private JButton redButton;
	
	public ColorWindow() {
		setTitle("Color");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		message = new JLabel("click button: ");
		redButton = new JButton("Red");
		redButton.addActionListener(new RedButtonListener());
		
		panel = new JPanel();
		panel.add(message);
		panel.add(redButton);
		
		add(panel);
		setVisible(true);
		
	}
	
	private class RedButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Red"))
				JOptionPane.showMessageDialog(null, "You clicked red buttn");
			//if (e.getSource().equals(redButton))
			//	JOptionPane.showMessageDialog(null, "You clicked red buttn");
			//panel.setBackground(Color.red);
			//message.setForeground(Color.blue);
			
		}
	}
	
	public static void main(String[] args) {
		new ColorWindow();
	}
}
