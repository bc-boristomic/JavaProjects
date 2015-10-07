package ba.bitcamp.classes.day2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class RacingGame extends JPanel implements ActionListener {
	private static final long serialVersionUID = 288880891681500762L;
	
	private int roadWidth;
	private int roadHeight;
	private Vehicle myVehicle;
	private AnimatedVehicle otherVehicle;
	private Timer timer;

	
	public RacingGame(int roadWidth, int roadHeight){
		this.roadWidth = roadWidth;
		this.roadHeight = roadHeight;
		this.myVehicle = new Vehicle(roadWidth / 2, roadHeight - 110, Color.BLUE);
		this.otherVehicle = new AnimatedVehicle(Color.GREEN, roadWidth, roadHeight);
		
		
		addKeyListener(new MyVehicleControl());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((Component)e.getSource()).requestFocus();
				timer.start();
			}
		});
		
		timer = new Timer(1000 / 25, this); // use this class as event
	}
	
	/**
	 * Moves vehicle downwards.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		otherVehicle.moveDown();
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (myVehicle.collide(otherVehicle)) {
			myVehicle.crash();
			otherVehicle.resetPosition();
		}
		myVehicle.draw(g);
		otherVehicle.draw(g);
		
	}
	
	
	private class MyVehicleControl extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (myVehicle.x > 30) {
					myVehicle.moveLeft();
				}
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (myVehicle.x +80 < roadWidth) {
					myVehicle.moveRight();
				}
			}
			repaint();
		}
	}
}
