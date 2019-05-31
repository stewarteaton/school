package Exam3_material;
import javax.swing.*;
import java.awt.*;

public class BorderPanelWindow extends JFrame{
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 400;
	
	public BorderPanelWindow() {
		setTitle("Border Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 5, 10 vertical and horiz gap
		setLayout(new BorderLayout(5,10));
		
		//create 5 panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JButton button1= new JButton("North Button");
		JButton button2= new JButton("East Button");
		JButton button3= new JButton("South Button");
		JButton button4= new JButton("West Button");
		JButton button5= new JButton("Center Button");
		
		//add the buttons to panels
		panel1.add(button1);
		panel2.add(button2);
		
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
		new BorderWindow();
	}
}