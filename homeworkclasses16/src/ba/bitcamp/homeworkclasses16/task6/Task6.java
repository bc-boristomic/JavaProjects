package ba.bitcamp.homeworkclasses16.task6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class Task6 extends JFrame and have one inner class MyPanel used to setup
 * JPanel. Have one static KeyAdapter field, initialized in constructor as
 * anonymous class. You can move orange circle by pressing up, down, left, right
 * on you keyboard.
 * 
 * @author boris
 *
 */
public class Task6 extends JFrame {
	private static final long serialVersionUID = -995603929028091352L;

	// Declaring and initializing constants used for circle size and movement
	private static final short SIZE = 40;
	private static final short MOVE = 5;

	// Declaring and initializing private variables for circle position
	private int x = 10;
	private int y = 10;

	// Declaring static field action
	private static KeyAdapter action;

	/**
	 * Constructor of Task6 class, set's up JFrame, JPanel and KeyAdapter as
	 * Anonymous class
	 */
	public Task6() {

		add(new MyPanel());

		// Initializing action as anonymous class KeyAdapter which implements
		// one method used to move circle around
		action = new KeyAdapter() {

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
		};

		addKeyListener(action);

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

			g.setColor(Color.ORANGE);
			g.fillOval(x, y, SIZE, SIZE);
		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		new Task6();

	}

}
