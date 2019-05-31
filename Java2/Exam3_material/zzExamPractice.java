package Exam3_material;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class zzExamPractice extends JFrame{
	private JPanel panel;
	
	private JButton list,cost;
	
	public zzExamPractice () {
		setTitle("Exam Practice");
		setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel() {
		list = new JButton("List Producers");
		list.setForeground(Color.RED);
		list.setBackground(Color.BLUE);
		
		list.addActionListener(new ButtonListener());
		
		cost = new JButton("Cost Producers");
		cost.addActionListener(new ButtonListener());
		
		panel = new JPanel();
		panel.add(list);
		panel.add(cost);
		panel.setBackground(Color.BLUE);
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(list)) {
				
				JOptionPane.showMessageDialog(null,"list selected");
			}
			if(e.getSource().equals(cost)) {
				JOptionPane.showMessageDialog(null,"cost selected");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new zzExamPractice();
	}
}
