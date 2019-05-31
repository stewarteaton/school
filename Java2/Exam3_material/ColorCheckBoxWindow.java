package Exam3_material;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ColorCheckBoxWindow extends JFrame{
	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 180;
	
	private JLabel messageLabel;
	private JCheckBox yellowCheckBox;
	private JCheckBox redCheckBox;
	
	public ColorCheckBoxWindow() {
		setTitle("Color Check Boxe");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		messageLabel = new JLabel("Select the check boxes to change backgorund color");
		yellowCheckBox = new JCheckBox("Yellow backgound");
		yellowCheckBox.addItemListener(new CheckBoxListener());
		redCheckBox =  new JCheckBox("Red Background");
		redCheckBox.addItemListener(new CheckBoxListener());
				
		add(messageLabel);
		add(yellowCheckBox);
		add(redCheckBox);
		
		setVisible(true);
		
	}
		
	private class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource().equals(yellowCheckBox)) {
				if(yellowCheckBox.isSelected()) {
					getContentPane().setBackground(Color.YELLOW);
					yellowCheckBox.setBackground(Color.YELLOW);
					redCheckBox.setBackground(Color.YELLOW);
				}
				else {
					getContentPane().setBackground(Color.GRAY);
					yellowCheckBox.setBackground(Color.GRAY);
					redCheckBox.setBackground(Color.GRAY);
				}
			}
			else if(e.getSource().equals(redCheckBox)) {
				if(redCheckBox.isSelected()) {
					getContentPane().setBackground(Color.RED);
					yellowCheckBox.setBackground(Color.RED);
					redCheckBox.setBackground(Color.RED);
				}
				else {
					getContentPane().setBackground(Color.GRAY);
					yellowCheckBox.setBackground(Color.GRAY);
					redCheckBox.setBackground(Color.GRAY);
				}
			}
		}
	}
	public static void main(String[] args) {
		new ColorCheckBoxWindow();
	}
	
}

