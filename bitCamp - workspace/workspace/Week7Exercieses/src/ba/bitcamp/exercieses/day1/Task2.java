package ba.bitcamp.exercieses.day1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Draws two diagonal lines in window. 
 * When window is resized lines are maintained at corners.
 * 
 * @author boris.tomic
 *
 */
public class Task2 extends JFrame {
	private static final long serialVersionUID = 2152531800569491833L;

	private JPanel lines = new Panel();
	
	public Task2(){
		
		add(lines);
		
		
		setTitle("Task 2");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Panel extends JPanel {
		private static final long serialVersionUID = -273348729292929794L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponents(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.BLACK);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(20));
			
			g2d.drawLine(0, 0, getWidth(), getHeight());
			g2d.drawLine(getWidth(), 0, 0, getHeight());
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new Task2();
	}
}
