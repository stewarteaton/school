package Exam3_material;
import javax.swing.*;

public class SimpleWindow extends JFrame {
	private final int WINDOW_WIDTH = 450;
	private final int WINDOW_HEIGHT = 250;
	
	public SimpleWindow() {
		setTitle("A Simple Window");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SimpleWindow myWindow = new SimpleWindow();
	}
}
