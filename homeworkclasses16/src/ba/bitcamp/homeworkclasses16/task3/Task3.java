package ba.bitcamp.homeworkclasses16.task3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Task3 class have one inner class used to set up JPanel, and one anonymous
 * class used to implement KeyListener interface responsible for reacting to
 * keyboard buttons. You can move green circle by pressing up, down, left, right
 * on you keyboard.
 * 
 * @author boris
 *
 */
public class Task3 extends JFrame {
	private static final long serialVersionUID = -3421716455884709791L;

	// Declaring and initializing constants used for circle size and movement
	private static final short SIZE = 40;
	private static final short MOVE = 5;

	// Declaring and initializing private variables for circle position
	private int x = 10;
	private int y = 10;

	/**
	 * Constructor of Task3 class, set's up JFrame, JPanel and KeyListener as
	 * Anonymous class
	 */
	public Task3() {

		add(new MyPanel());

		/**
		 * Anonymous class KeyListener implements KeyListener interface and uses
		 * only one method keyPressed to check which key is pressed and to
		 * direct movement of circle from in every which way user inputed. Other
		 * methods are implemented but not used.
		 */
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// unused method, must be implemented because interface is used
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// unused method, must be implemented because interface is used

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					moveLeft();
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					moveRight();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					moveUp();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					moveDown();
				}
			}
		});

		setTitle("Moving circle");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Method used to move circle upwards.
	 */
	private void moveUp() {
		y -= MOVE;
		repaint();
	}

	/**
	 * Method used to move circle downwards.
	 */
	private void moveDown() {
		y += MOVE;
		repaint();
	}

	/**
	 * Method used to move circle left.
	 */
	private void moveLeft() {
		x -= MOVE;
		repaint();
	}

	/**
	 * Method used to move circle right.
	 */
	private void moveRight() {
		x += MOVE;
		repaint();
	}

	/**
	 * Private inner class MyPanel extends JPanel and uses paintComponent method
	 * to draw circle which will be moved around by user input via keyboard.
	 * 
	 * @author boris
	 *
	 */
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -2369956813189028966L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.GREEN);
			g.fillOval(x, y, SIZE, SIZE);
		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		new Task3();

	}

}
