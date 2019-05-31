package Exam3_material;
import javax.swing.*;
import java.awt.*;

public class GridWindow extends JFrame{
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 400;
	
	public  GridWindow(){
		setTitle("Border Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 5, 10 vertical and horiz gap
		setLayout(new GridLayout(2,3));
		
		JButton button1= new JButton("Button 1");
		JButton button2= new JButton("Button 2");
		JButton button3= new JButton("Button 3");
		JButton button4= new JButton("Button 4");
		JButton button5= new JButton("Button 5");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new BorderWindow();
	}
}