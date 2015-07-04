package ba.bitcamp.homework18.task7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Draws a circle at location pressed by mouse. Slide slider to enlarge circle.
 * 
 * @author boris
 *
 */
public class CircleDrawer extends JFrame {
	private static final long serialVersionUID = 541494051785916154L;

	private JPanel panel = new Panel();
	private JSlider slider = new JSlider(30, 300, 70);
	private int size = 30, x, y;

	public CircleDrawer() {
		add(panel);
		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
		panel.add(slider);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				size = slider.getValue();
				repaint();
			}
		});

		setTitle("Circle Drawer");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Panel extends JPanel {
		private static final long serialVersionUID = 1922296379228941200L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillOval(x - size / 2, y - size / 2, size, size);
		}
	}

	public static void main(String[] args) {

		new CircleDrawer();

	}

}
