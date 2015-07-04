package ba.bitcamp.homework18.task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Login screen pops up and you need to enter Mujo 1234 to login.
 * 
 * @author boris
 *
 */
public class Login extends JFrame {
	private static final long serialVersionUID = 4829943298665450484L;

	private JTextField username = new JTextField(10);
	private JPasswordField password = new JPasswordField(10);
	private JPanel panel = new JPanel();
	private JLabel user = new JLabel("Username");
	private JLabel pass = new JLabel("Password");

	private Login() {

		add(panel);
		panel.add(user);
		panel.add(username);
		panel.add(pass);
		panel.add(password);

		password.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String right = "1234";
				String given = String.valueOf(password.getPassword());
				if (right.equals(given) && username.getText().equals("Mujo")) {
					System.exit(EXIT_ON_CLOSE);
				} else {
					JOptionPane.showMessageDialog(null,
							"Wrong username or password");
				}

			}
		});

		setTitle("Login");
		setSize(250, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Login();

	}

}
