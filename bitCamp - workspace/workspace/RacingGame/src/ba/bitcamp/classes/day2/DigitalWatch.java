package ba.bitcamp.classes.day2;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DigitalWatch extends JFrame {
	private static final long serialVersionUID = -1836063912137973287L;
	
	private JPanel panel = new MyPanel();
	private int hours = 10;
	private int minutes = 20;
	private int seconds = 30;
	private Timer timer1;
	
	public DigitalWatch(){
		
		add(panel);
		timer1 = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (seconds > 59) {
					seconds = 0;
					minutes += 1;
				}
				if (minutes > 59) {
					minutes = 0;
					hours += 1;
				}
				seconds += 1;
				repaint();
			}
		});
		timer1.start();

		setTitle("Digital watch");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 4244355320405919569L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setFont(new Font("Serif", Font.BOLD, 20));
			g2d.drawString("Current time", 155, 180);
			g2d.drawString(String.format("%02d:%02d:%02d", hours, minutes, seconds), 180, 200);
		}
	}

	public static void main(String[] args) {
		
		new DigitalWatch();
		
	}
	
}
