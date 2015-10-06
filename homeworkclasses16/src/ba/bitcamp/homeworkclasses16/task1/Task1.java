package ba.bitcamp.homeworkclasses16.task1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Class Task1 extends JFrame, set's up JFrame, and JPanel in it's 
 * constructor. Have one inner protected class MyPanel which set's 
 * up JPanel for drawing circle that can be moved around via keyboard 
 * up, down, left, right buttons. 
 * 
 * @author boris
 *
 */
public class Task1 extends JFrame {
	private static final long serialVersionUID = -6225688672809701617L;
	
	// Declaring and initializing constants used for circle size and movement
	private static final short SIZE = 40;
	protected static final short MOVE = 5;
	
	// Declaring and initializing static variables for circle position
	protected static int x = 10;
	protected static int y = 10;

	/**
	 * Constructor of Task1 class, set's up JFrame, JPanel and KeyListener
	 */
	public Task1() {
		
		add(new MyPanel());
		addKeyListener(new KeyAction());

		setTitle("Moving circle");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * Private inner class MyPanel extends JPanel and uses
	 * paintComponent method to draw circle which will be moved
	 * around by user input via keyboard.
	 * 
	 * @author boris
	 *
	 */
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -2369956813189028966L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.fillOval(x, y, SIZE, SIZE);
			repaint();
		}
		
	}
	
	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Task1();
		
	}

}
