package Exam3_material;
import java.awt.*;
import javax.swing.*;

public class ZExamPracticeLayout extends JFrame{
	private JLabel label;
	private JTextField text;
	private ButtonGroup genre;
	private JRadioButton rock;
	private JRadioButton hip;
	private JCheckBox favs;
	
	public ZExamPracticeLayout () {
		setTitle("Practice");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Enter DVD title");
		text = new JTextField(10);
		
		rock = new JRadioButton("rock");
		hip = new JRadioButton("hip hop");
		
////		genre = new ButtonGroup();
////		genre.add(rock);
////		genre.add(hip);
//		
		favs = new JCheckBox("My Favorites", true);
	
//		
//		setLayout(new FlowLayout());
//		add(label);
//		add(text);
//		add(rock);
//		add(hip);
//		add(favs);
		
		
//		setLayout(new BorderLayout());
//		add(label,BorderLayout.WEST);
//		add(text,BorderLayout.CENTER);
//		add(rock,BorderLayout.SOUTH);
//		add(hip,BorderLayout.NORTH);
//		add(favs,BorderLayout.EAST);
		
		setLayout(new GridLayout(3,2));
		add(label);
		add(text);
		add(rock);
		add(hip);
		add(favs);
//		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ZExamPracticeLayout();
	}
}
