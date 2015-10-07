package ba.bitcamp.classes.day1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	private static final long serialVersionUID = 2994780773201257856L;
	
	private Color backgroundColor = Color.RED;
	
	public DrawPanel(int width, int height) {
		setSize(width, height);
		JButton blue = new JButton("Blue");
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				backgroundColor = Color.BLUE;
			}
		});
		add(blue);
		addMouseListener(new MouseAction());
		addMouseMotionListener(new MouseAction());

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(backgroundColor);
		g.fillOval(20, 20, 10, 10);
	}
	
	public void drawSquare(){
		Graphics g = super.getGraphics();
		g.fillRect(50, 50, 100, 100);
		
	}
	
	private class MouseAction implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 30, 30);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Mouse pressed");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse released");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(backgroundColor);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 30, 30);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 30, 30);
		}
		
	}
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Our little program");
		PaintPanel dp = new PaintPanel(500, 500);
		//Color c = new Color(21, 194, 41);
		//dp.setBackground(c);
		
		window.add(dp);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
}
