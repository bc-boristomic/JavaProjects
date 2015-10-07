package ba.bitcamp.exercises.day3;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnArrayOfFonts extends JFrame {
	private static final long serialVersionUID = 8400348649056147994L;
	
	private JLabel[] labels = new JLabel[39];
	
	public AnArrayOfFonts() {
		setLayout(new GridLayout(7,6));
		for (int i = 0; i < labels.length; i++) {
			Font font = new Font("Monotyped", Font.BOLD, i+1);
			labels[i] = new JLabel("text");
			labels[i].setFont(font);
			add(labels[i]);
		}
				
		setSize(700, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new AnArrayOfFonts();
	}
	
	
}
