package ba.bitcamp.homework18.task5;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * Slide three rgb sliders to change background color.
 * 
 * @author boris
 *
 */
public class RGBWindow extends JFrame {
	private static final long serialVersionUID = 5641198650868718069L;

	
	private static final int MIN = 0;
	private static final int MAX = 255;

	private int r, g, b;
	private JPanel panel = new JPanel();
	private JSlider redSlider = new JSlider(MIN, MAX);
	private JSlider greenSlider = new JSlider(MIN, MAX);
	private JSlider blueSlider = new JSlider(MIN, MAX);
	
	public RGBWindow() {
		
		add(panel);
		panel.add(redSlider);
		panel.add(greenSlider);
		panel.add(blueSlider);
		
		
		
		redSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == redSlider) {
					r = redSlider.getValue();
				}
				previewColor();
			}
		});

		greenSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == greenSlider) {
					g = greenSlider.getValue();
				}
				previewColor();
			}
		});

		blueSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == blueSlider) {
					b = blueSlider.getValue();
				}
				previewColor();
			}
		});
		
		
		setTitle("RGB Window");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void previewColor() {
		panel.setBackground(new Color(r, g, b));
	}
	
	
	public static void main(String[] args) {
		
		new RGBWindow();
		
	}

}
