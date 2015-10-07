package ba.bitcamp.exercises.day2;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame {
	private static final long serialVersionUID = -3803476997039734802L;
	
	private JLabel text = new JLabel("Not in focus");
	
	public Task1() {
		
		add(text);
		text.setHorizontalAlignment(NORMAL);
		addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				text.setText("Not in focus");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				text.setText("In focus!");
				
			}
		});
		
		
		setTitle("Focus!");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Task1();
		
	}

}
