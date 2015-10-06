package ba.bitcamp.homeworkclasses16.task2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Public class Task2 extends JFrame and have two inner classes, one used to 
 * set up JPanel, and one to set up KeyboardAction by extending KeyAdapeter.
 * You can move red circle around via keyboard up, down, left and right buttons.
 * 
 * @author boris
 *
 */
public class Task2 extends JFrame {
	private static final long serialVersionUID = -9073158308962445598L;

	// Declaring and initializing constants used for circle size and movement
	private static final short SIZE = 40;
	private static final short MOVE = 5;

	// Declaring and initializing private variables for circle position
	private int x = 10;
	private int y = 10;

	/**
	 * Constructor of Task2 class, set's up JFrame, JPanel and KeyListener
	 */
	public Task2() {

		add(new MyPanel());
		addKeyListener(new KeyAction());

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

			g.setColor(Color.RED);
			g.fillOval(x, y, SIZE, SIZE);
		}

	}

	/**
	 * Private inner class KeyAction extends KeyAdapter and uses only one method
	 * keyPressed to check which key is pressed and to direct movement of circle
	 * in every which way user inputed.
	 * 
	 * @author boris
	 *
	 */
	private class KeyAction extends KeyAdapter {

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

	}
	
	/**
	 * main method that runs the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Task2();
		
	}

}
