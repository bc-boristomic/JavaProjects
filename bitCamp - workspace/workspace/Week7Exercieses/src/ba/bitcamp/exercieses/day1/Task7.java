package ba.bitcamp.exercieses.day1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task7 extends JFrame {
	private static final long serialVersionUID = -8016006722506264147L;
	
	private JPanel panel = new MyPanel();
	private int[] values = { 10, 20, 50, 30, 80, 40, 30, 20, 0, 40 };
	
	public Task7(){
		add(panel);
		
		setTitle("Task 7");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int x = 30;
			
			for (int i = 0; i < values.length; i++) {
				g.fillRect(x, 200-values[i], 30, values[i]);
				x += 31;
			}
			g.drawLine(30, 200, 340, 200);
		}
	}
	
	

	public static void main(String[] args) {
		
		new Task7();
		
	}
}
