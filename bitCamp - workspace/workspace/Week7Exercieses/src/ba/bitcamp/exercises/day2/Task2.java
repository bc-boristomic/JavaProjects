package ba.bitcamp.exercises.day2;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {
	private static final long serialVersionUID = 3073327359820178812L;
	
	private JLabel text = new JLabel();
	private StringBuilder sb = new StringBuilder();

	public Task2() {
		
		add(text);
		text.setHorizontalAlignment(NORMAL);
		text.setFont(new Font("Serif", Font.ITALIC, 25));
		
		addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int index = sb.length();
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					sb.setLength(index-1);
					if (sb.length() < 0) {
						throw new StringIndexOutOfBoundsException("Nothing to delete");
					}
				} else {
					sb.append(e.getKeyChar());
				}
				text.setText(sb.toString());
			}
			
		});
		
		setTitle("Typewriter");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		new Task2();
		
	}

}
