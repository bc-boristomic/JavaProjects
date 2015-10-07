package ba.bitcamp.classes.day4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow extends JFrame {
	private static final long serialVersionUID = -3747860711338251578L;
	
	private JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
	private JButton[] buttons = new JButton [6];
	
	
	public Flow() {
		
		add(panel);
		
		for (int i = 0; i < buttons.length; i++) {
			
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);
			
			buttons[i] = new JButton("Button " + i);
			buttons[i].setOpaque(true);
			//buttons[i].setBorder(BorderFactory.createEmptyBorder(2, 7, 30, 2));
			//buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
			//buttons[i].setBorder(BorderFactory.createMatteBorder(5, 0, 0, 10, Color.BLACK)); // 3D simuliranje
			//buttons[i].setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.WHITE));
			if (i % 2 == 0) {
				buttons[i].setBorder(BorderFactory.createRaisedSoftBevelBorder()); // izdignuto dugme
			} else {
				buttons[i].setBorder(BorderFactory.createLoweredSoftBevelBorder()); // utisnuto dugme
			}
			//buttons[i].setBorderPainted(false);
			buttons[i].setPreferredSize(new Dimension(100, 100));
			buttons[i].setBackground(new Color(red, green, blue));
			buttons[i].setForeground(new Color(255-red, 255-green, 255-blue));
			panel.add(buttons[i]);
		}
		
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Flow();
		
	}
	
	

}
