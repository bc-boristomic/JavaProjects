package ba.bitcamp.homework18.task1;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * You can change the font size of displayed text just by moving slider right or
 * left
 * 
 * @author boris
 *
 */
public class AdjustableFontSize extends JFrame {
	private static final long serialVersionUID = 3670968379386140923L;

	private JPanel panel = new JPanel();
	private JLabel text = new JLabel("some text");
	private JSlider slider = new JSlider(10, 30, 10);
	private int fontSize = 10;

	public AdjustableFontSize() {

		panel.setLayout(new BorderLayout());

		text.setHorizontalAlignment(NORMAL);

		add(panel);
		panel.add(text, BorderLayout.NORTH);
		panel.add(slider, BorderLayout.SOUTH);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == slider) {
					fontSize = slider.getValue();
				}
				text.setFont(new Font("Serif", Font.BOLD, fontSize));

			}
		});

		setTitle("AdjustableFontSize");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {

		new AdjustableFontSize();

	}

}
