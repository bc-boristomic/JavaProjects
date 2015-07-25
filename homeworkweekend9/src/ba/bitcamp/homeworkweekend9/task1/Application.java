package ba.bitcamp.homeworkweekend9.task1;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Class Application extends JFrame and is used to create simple GUI interface
 * for program.
 * 
 * @author boris
 *
 */
public class Application extends JFrame {
	private static final long serialVersionUID = -6862798072909149410L;

	// Declaring and initializing static variables used for action
	protected static JButton browse = new JButton("browse file");
	protected static JButton folder = new JButton("Select master folder");
	protected static JButton delete = new JButton("Delete files");
	protected static JLabel list = new JLabel();

	// Declaring and initializing private variables used to setup GUI
	private JPanel panel = new JPanel();
	private JPanel buttons = new JPanel();
	private JLabel name = new JLabel("LIST OF FILES");
	private JScrollPane scroll = new JScrollPane(list);

	/**
	 * Default constructor of Application class, calls method that setups and
	 * add action to different components.
	 */
	public Application() {
		initPanelsAndLabels();
		initButtons();
		initFrame();
	}

	/**
	 * Setups panels to different positions on frame, adds appropriate component
	 * to them.
	 */
	private void initPanelsAndLabels() {
		panel.setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		add(buttons, BorderLayout.EAST);
		panel.add(name, BorderLayout.NORTH);
		panel.add(scroll, BorderLayout.CENTER);
		panel.add(delete, BorderLayout.SOUTH);
		buttons.add(folder);
		buttons.add(browse);
		buttons.setPreferredSize(new Dimension(200, 0));
		name.setHorizontalAlignment(NORMAL);
	}

	/**
	 * Adds <tt>ActionListener</tt> to buttons, disables browse button at start.
	 */
	private void initButtons() {
		delete.addActionListener(new ButtonAction());
		folder.addActionListener(new ButtonAction());
		browse.addActionListener(new ButtonAction());
		browse.setEnabled(false);
	}

	/**
	 * Setups JFrame options such as title, size, location, close action, and
	 * visibility.
	 */
	private void initFrame() {
		setTitle("Organize your files");
		setSize(900, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
