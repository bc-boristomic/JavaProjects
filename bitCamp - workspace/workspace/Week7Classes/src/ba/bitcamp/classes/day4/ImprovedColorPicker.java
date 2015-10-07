package ba.bitcamp.classes.day4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ImprovedColorPicker extends JFrame {
	private static final long serialVersionUID = -7292368314010724919L;

	private static final int MIN = 0;
	private static final int MAX = 255;

	private JPanel available = new JPanel();
	private JPanel preview = new JPanel();
	private JPanel sliders = new JPanel();

	private Color[] availableColors = { Color.BLACK, Color.BLUE, Color.CYAN,
			Color.GRAY, Color.DARK_GRAY, Color.LIGHT_GRAY, Color.GREEN,
			Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
			Color.YELLOW };
	
	private JButton[] buttons = new JButton[availableColors.length];

	private int red;
	private int green;
	private int blue;

	private JSlider redSlider = new JSlider(MIN, MAX);
	private JSlider greenSlider = new JSlider(MIN, MAX);
	private JSlider blueSlider = new JSlider(MIN, MAX);

	private JLabel redLabel = new JLabel("red");
	private JLabel greenLabel = new JLabel("green");
	private JLabel blueLabel = new JLabel("blue");

	/**
	 * Constructor of ImprovedColorPicker class
	 */
	public ImprovedColorPicker() {

		setLayout(new BorderLayout());

		add(available, BorderLayout.WEST);
		available.setLayout(new GridLayout(5, 3));
		add(preview, BorderLayout.CENTER);
		add(sliders, BorderLayout.EAST);

		initButtons();

		initSliders();

		setTitle("Java color picker");
		setSize(700, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Creates 13 buttons with different background colors.
	 */
	private void initButtons() {

		for (int i = 0; i < availableColors.length; i++) {

			buttons[i] = new JButton();
			buttons[i].setOpaque(true);
			buttons[i].setBackground(availableColors[i]);
			buttons[i].setPreferredSize(new Dimension(70, 70));
			buttons[i].setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK)); // 3D simuliranje
						
			available.add(buttons[i]);
			buttons[i].addMouseListener(new Action());
		}
	}

	private void initSliders() {

		preview.setBackground(Color.BLACK);

		sliders.add(redSlider);
		sliders.add(redLabel);
		redSlider.setOrientation(JSlider.VERTICAL);
		redSlider.setInverted(false);
		redSlider.setValue(0);

		sliders.add(greenSlider);
		sliders.add(greenLabel);
		greenSlider.setOrientation(JSlider.VERTICAL);
		greenSlider.setInverted(false);
		greenSlider.setValue(0);

		sliders.add(blueSlider);
		sliders.add(blueLabel);
		blueSlider.setOrientation(JSlider.VERTICAL);
		blueSlider.setInverted(false);
		blueSlider.setValue(0);

		redSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == redSlider) {
					red = redSlider.getValue();
				}
				previewColor();
			}
		});

		greenSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == greenSlider) {
					green = greenSlider.getValue();
				}
				previewColor();
			}
		});

		blueSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == blueSlider) {
					blue = blueSlider.getValue();
				}
				previewColor();
			}
		});
	}

	/**
	 * Changes background color of preview panel.
	 */
	private void previewColor() {
		preview.setBackground(new Color(red, green, blue));
	}

	/**
	 * Nested class Action listens to mouse and acts accordingly.
	 * 
	 * @author boris.tomic
	 *
	 */
	private class Action extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {

			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					preview.setBackground(availableColors[i]);
				}
			}

		}
	}

	public static void main(String[] args) {

		new ImprovedColorPicker();
		
	}

}
