package Exam3_material;
import javax.swing.*;
import java.awt.*;

public class FlowWindow extends JFrame{
	private final int WINDOW_WIDTH = 250;
	private final int WINDOW_HEIGHT = 150;
	
	public FlowWindow() {
		setTitle("Flow Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton button1= new JButton("Button 1");
		JButton button2= new JButton("Button 2");
		JButton button3= new JButton("Button 3");
		
		add(button1);
		add(button2);
		add(button3);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new FlowWindow();
	}
}
