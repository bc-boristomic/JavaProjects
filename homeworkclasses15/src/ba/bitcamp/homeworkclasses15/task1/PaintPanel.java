package ba.bitcamp.homeworkclasses15.task1;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private static final long serialVersionUID = -867401816197342407L;

	private LineArray lines;
	private Color activeColor;
	private int activeSize = 1;
	
	private JButton plus = new JButton("+");
	private JButton minus = new JButton("-");
	private JButton text = new JButton("Enter text");
	private String txt;
	private int sX, sY;
	private boolean b = false;
	
	private int x, y;     
    
	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.BLACK,
			Color.CYAN };
	

	public PaintPanel(int height, int width) {
		super();

		lines = new LineArray();
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
					lines.clearArray();
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
					lines.undo();
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
					lines.redo();
					repaint();
				}
			}
		});
		add(redo);

		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				activeSize += 1;
				
			}
		});
		add(plus);
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (activeSize == 0) {
					JOptionPane.showMessageDialog(null, "Illegal size");
				} else {
					activeSize -= 1;
				}
				
			}
		});
		add(minus);
		
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt = JOptionPane.showInputDialog("Enter text to display");
				String s = JOptionPane.showInputDialog("Enter values xx,yy in that order");
				sX = Integer.parseInt(s.substring(0, 2));
				sY = Integer.parseInt(s.substring(3, 5));
				b = true;
				repaint();
			}
		});
		add(text);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(activeSize));

		for (int i = 0; i < lines.getLength(); i++) {
			Line l = lines.elementAt(i);
			g2.setColor(l.getColor());
			g2.drawLine(x, y, l.getX(), l.getY());
		}
		if (b == true) {
			g2.setFont(new Font("Serif", Font.BOLD, 25));
			g2.setColor(Color.RED);
			g2.drawString(txt, sX, sY);
		}
		
	}

	private class MouseHandler extends MouseAdapter {


		@Override
		public void mouseDragged(MouseEvent e) {
			int newX = e.getX();
			int newY = e.getY();
			Line l = new Line(newX, newY, activeColor);
			x = newX;
			y = newY;
			lines.addPoint(l);
			repaint();
		}


	}
	
	
public static void main(String[] args) {
		
		JFrame window = new JFrame("Weird Paint");
		PaintPanel dp = new PaintPanel(500, 500);
		
		window.add(dp);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}

}