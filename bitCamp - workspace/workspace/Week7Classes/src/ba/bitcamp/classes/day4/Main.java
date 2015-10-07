package ba.bitcamp.classes.day4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Layouts");
		JPanel panel = new JPanel();
		
//		panel.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 80)); // Flow layout
		
//		panel.setLayout(new BorderLayout(20, 50)); // Border layout

		panel.setLayout(new GridLayout(2, 3));
		
		
		JButton[] buttons = new JButton[5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button " + i);
			buttons[i].setPreferredSize(new Dimension(20, 20));
			panel.add(buttons[i]);
		}

//		panel.add(buttons[0], BorderLayout.EAST);
//		panel.add(buttons[1], BorderLayout.WEST);
//		panel.add(buttons[2], BorderLayout.NORTH);
//		panel.add(buttons[3], BorderLayout.SOUTH);
//		panel.add(buttons[4], BorderLayout.CENTER);

		window.add(panel);
		window.setSize(400, 400);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
