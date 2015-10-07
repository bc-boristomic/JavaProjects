package ba.bitcamp.exercises.day3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class RGBWindow extends JFrame {
	private static final long serialVersionUID = 5641198650868718069L;

	private JSlider red = new JSlider(0, 255, 0);
	private JSlider green = new JSlider(0, 255, 0);
	private JSlider blue = new JSlider(0, 255, 0);
	
	private int r, g, b;
	
	private JLabel selected = new JLabel();
	private JPanel panel = new JPanel();
	
	public RGBWindow() {
		
		add(panel);
		
		selected.setBackground(Color.BLACK);
		selected.setOpaque(true);
		panel.add(selected);
		
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		
		setTitle("RGB Window");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new RGBWindow();
		
	}

}
