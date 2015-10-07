package ba.bitcamp.exercises.day2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Task3 extends JPanel {
	private static final long serialVersionUID = 600377362720672819L;

	private JPanel panel = new JPanel();
	private Timer timer;
	
	private int x = 0;
	private int y = 0;
	
	private int deltaX = 10;
	private int deltaY = 10;
	
	public Task3() {
		
		setSize(350, 350);
		timer = new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x+=deltaX;
				y+=deltaY;
				if (x >= panel.getWidth()-30 && y >= panel.getHeight()-30) {
					x+=deltaX;
					y-=deltaY;
				} else if (x < panel.getWidth() && y + deltaY < panel.getWidth()-30) {
					x+=deltaX;
					y-=deltaY;
				}
				
				repaint();
			}
		});
		timer.start();
		add(panel);
	
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.fillRect(x, y, 30, 30);
	}
	

	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.add(new Task3());
		
		frame.setTitle("Animation in Focus");
		frame.setSize(350, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
