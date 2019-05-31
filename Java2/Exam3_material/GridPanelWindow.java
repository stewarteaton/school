package Exam3_material;
import javax.swing.*;
import java.awt.*;

public class GridPanelWindow extends JFrame{
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 400;
	
	public GridPanelWindow() {
		setTitle("Border Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 5, 10 vertical and horiz gap
		setLayout(new GridLayout(2,3));
		
		//create 5 panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		JButton button1= new JButton("Button 1");
		JButton button2= new JButton("Button 2");
		JButton button3= new JButton("South Button");
		JButton button4= new JButton("West Button");
		JButton button5= new JButton("Center Button");
		
		//add the buttons to panels
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		panel5.add(button5);
		
		//add panels to 5 regions
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.EAST);
		
		//pack
		pack();
		setVisible(true);
		
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new GridPanelWindow();
	}
}