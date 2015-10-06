package ba.bitcamp.homework18.task2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * You can change text to bold or italic or both bold and italic by checking box
 * and clicking update button.
 * 
 * @author boris
 *
 */
public class AdjustableFontStyle extends JFrame {
	private static final long serialVersionUID = -705957139755224934L;

	private JPanel panel = new JPanel(new BorderLayout());
	private JLabel text = new JLabel("Some text");
	private JCheckBox bold = new JCheckBox("Bold");
	private JCheckBox italic = new JCheckBox("Italic");
	private JButton update = new JButton("Update");
	private int font = Font.PLAIN;

	public AdjustableFontStyle() {

		text.setHorizontalAlignment(NORMAL);
		text.setFont(new Font("Serif", font, 25));

		add(panel);
		panel.add(text, BorderLayout.NORTH);
		panel.add(bold, BorderLayout.EAST);
		panel.add(italic, BorderLayout.WEST);
		panel.add(update, BorderLayout.SOUTH);

		bold.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (bold.isSelected()) {
					font = Font.BOLD;
				}
				if (bold.isSelected() && italic.isSelected()) {
					font = Font.ITALIC + Font.BOLD;
				}
				if (!bold.isSelected()) {
					font = Font.PLAIN;
				}
			}
		});

		italic.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (italic.isSelected()) {
					font = Font.ITALIC;
				}
				if (italic.isSelected() && bold.isSelected()) {
					font = Font.ITALIC + Font.BOLD;
				}
				if (!italic.isSelected()) {
					font = Font.PLAIN;
				}

			}
		});

		update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Serif", font, 25));

			}
		});

		setTitle("AdjustableFontStyle");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {

		new AdjustableFontStyle();

	}

}
