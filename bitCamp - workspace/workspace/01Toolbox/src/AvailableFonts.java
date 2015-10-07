import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class AvailableFonts extends JFrame {
	private static final long serialVersionUID = 3270222772518735392L;

	private static final String TEMPLATE_MSG = "This is how text looks like in ";

	private Font temp;
	private JLabel[] label;
	
	private JPanel panel = new JPanel();
	private JScrollPane scroll = new JScrollPane(panel);

	public AvailableFonts() {

		panel.setLayout(new GridLayout(0, 1));
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();

		label = new JLabel[fonts.length];
		
		for (int i = 0; i < fonts.length; i++) {
			temp = new Font(fonts[i], Font.PLAIN, 22);
			label[i] = new JLabel();
			label[i].setFont(temp);
			label[i].setText(TEMPLATE_MSG + fonts[i] + ", PLAIN, and size 22");
			panel.add(label[i]);
		}

		add(scroll);

		setTitle("Available fonts on computer");
		setSize(1200, 900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new AvailableFonts();
	}

}
