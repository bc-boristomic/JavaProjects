package ba.bitcamp.classes.day1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private static final long serialVersionUID = -867401816197342407L;

	private PointArray points;
	private Color activeColor;
	private int activeSize = 10;
	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.BLACK,
			Color.CYAN };
	
	private static int[] supportedSizes = new int[] { 10, 15 , 20 };

	public PaintPanel(int height, int width) {
		super();

		points = new PointArray();
		setSize(width, height);
		setBackground(Color.WHITE);

		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);

			color.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];
				}
			});
			add(color);
		}
		addMouseMotionListener(new MouseHandler());
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == clear) {
					points.clearArray();
					repaint();
				}
			}
		});
		add(clear);
		
		JButton undo = new JButton("Undo");
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == undo) {
					points.undo();
					repaint();
				}
			}
		});
		add(undo);
		
		JButton redo = new JButton("Redo");
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == redo) {
					points.redo();
					repaint();
				}
			}
		});
		add(redo);

		for (int i = 0; i < supportedSizes.length; i++) {
			JButton size = new JButton(Integer.toString(supportedSizes[i]));
			
			size.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();
					String label = clicked.getText();
					int size = Integer.parseInt(label);
					activeSize = size;
				}
			});
			
			add(size);
		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.getLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			//g.drawLine(p.getX(), p.getY(), p.getX(), p.getY());
			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
		}
	}

	private class MouseHandler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(), e.getY(), activeSize, activeColor);

			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			}
			points.addPoint(newPoint);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// not used
		}

	}

}
