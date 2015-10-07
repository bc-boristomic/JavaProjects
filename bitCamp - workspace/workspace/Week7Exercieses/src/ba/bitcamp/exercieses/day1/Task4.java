package ba.bitcamp.exercieses.day1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * When mouse enters panel, text changes color from black to white, when mouse
 * exit panel it changes back to black.
 * <p>
 * When mouse is pressed text changes to bold, when released changes back to
 * normal.
 * 
 * 
 * @author boris.tomic
 *
 */
public class Task4 extends JFrame {
	private static final long serialVersionUID = -2675933281691445423L;

	private JLabel label = new JLabel("Task 4 Label");
	private Font font1 = new Font("Sans", Font.PLAIN, 20);
	private Font font2 = new Font("Sans", Font.BOLD, 22);

	public Task4() {

		add(label);
		label.setHorizontalAlignment(NORMAL);
		label.setFont(font1);
		label.addMouseListener(new Mouse());
		setTitle("Task 4");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			label.setForeground(Color.BLACK);
			label.setFont(font2);

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			label.setForeground(Color.BLACK);
			label.setFont(font1);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			label.setForeground(Color.WHITE);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			label.setForeground(Color.BLACK);

		}

	}

	public static void main(String[] args) {
		new Task4();
	}
}
