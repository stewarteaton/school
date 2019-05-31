package Exam3_material;
import javax.swing.*;
import java.awt.*;

public class BorderWindow extends JFrame{
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 400;
	
	public BorderWindow() {
		setTitle("Border Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 5, 10 vertical and horiz gap
		setLayout(new BorderLayout(5,10));
		
		JButton button1= new JButton("North Button");
		JButton button2= new JButton("East Button");
		JButton button3= new JButton("South Button");
		JButton button4= new JButton("West Button");
		JButton button5= new JButton("Center Button");
		
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
