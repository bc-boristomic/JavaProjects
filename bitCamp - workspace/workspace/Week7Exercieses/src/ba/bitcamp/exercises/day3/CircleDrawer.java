package ba.bitcamp.exercises.day3;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CircleDrawer extends JFrame {
	private static final long serialVersionUID = 541494051785916154L;

	private JPanel panel = new JPanel(new BorderLayout());
	private JSlider slider = new JSlider(5, 50, 5);
	private int size;
	
	public CircleDrawer() {
		
		add(panel);
		panel.add(new Panel());
		panel.add(slider, BorderLayout.SOUTH);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				size = slider.getValue();
			}
		});
		
		setTitle("Circle Drawer");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private class Panel extends JPanel {
		private static final long serialVersionUID = 1922296379228941200L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(getX(), getY(), size, size);
		}
	}
	
	
	public static void main(String[] args) {
		
		new CircleDrawer();
		
	}
	
}
