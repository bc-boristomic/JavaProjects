package ba.bitcamp.classes.day3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * ColorPicker class lets you pick RGB color. When you click on a button it
 * copies a value to clipboard in 0,0,0 format so you can paste it.
 * 
 * @author boris.tomic
 *
 */
public class ColorPicker extends JPanel {
	private static final long serialVersionUID = -1668083138521576033L;

	private static final int MIN = 0;
	private static final int MAX = 255;

	private JButton button = new JButton("Click to copy color value");

	private JSlider redSlider = new JSlider(MIN, MAX);
	private JSlider greenSlider = new JSlider(MIN, MAX);
	private JSlider blueSlider = new JSlider(MIN, MAX);

	private JLabel redLabel = new JLabel("Red");
	private JLabel greenLabel = new JLabel("Green");
	private JLabel blueLabel = new JLabel("Blue");

	private int red;
	private int green;
	private int blue;

	public ColorPicker(int width, int height) {

		initButton(width, height);

		int sliderHeight = height / 7;
		Dimension sliderDimension = new Dimension(width, sliderHeight);

		initSlider(redSlider, "red", sliderDimension);
		add(redLabel);
		add(redSlider);

		initSlider(greenSlider, "green", sliderDimension);
		add(greenLabel);
		add(greenSlider);

		initSlider(blueSlider, "blue", sliderDimension);
		add(blueLabel);
		add(blueSlider);
	}

	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
		slider.setInverted(true);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider) e.getSource();
				// String name = changed.getName();

				switch (name) {
				case "red":
					red = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
				}
				updateButton();
			}
		});
	}

	private void initButton(int width, int height) {
		button.setPreferredSize(new Dimension(width, height / 3));
		button.setFont(new Font("Serif", Font.BOLD, 18));
		button.setOpaque(true);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard clip = Toolkit.getDefaultToolkit()
						.getSystemClipboard();
				String copy = String.format("%d,%d,%d", red, green, blue);
				clip.setContents(new StringSelection(copy), null);
			}
		});
		updateButton();
		add(button);
	}

	private void updateButton() {
		button.setBackground(new Color(red, green, blue));
		button.setForeground(new Color(255 - red, 255 - green, 255 - blue));
	}

	public static void main(String[] args) {

		int width = 500, height = 500;

		JFrame window = new JFrame("Pick a color");
		window.add(new ColorPicker(width, height));
		window.setSize(width, height);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
