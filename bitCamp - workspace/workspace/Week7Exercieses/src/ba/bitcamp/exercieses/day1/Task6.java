package ba.bitcamp.exercieses.day1;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task6 extends JFrame {
	private static final long serialVersionUID = 7520421217335869350L;
	
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	
	public Task6() {
		
		setLayout(new BorderLayout());

		
		add(panel);
		panel.addMouseMotionListener(new Mouse());
		panel.add(label, BorderLayout.SOUTH);
		
		setTitle("Task 6");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	private class Mouse implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			label.setText("x = " + e.getX() + ", " + "y = " + e.getY());
			
			
		}
		
	}
	
	public static void main(String[] args) {
		new Task6();
	}
}
