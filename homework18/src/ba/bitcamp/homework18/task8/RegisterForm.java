package ba.bitcamp.homework18.task8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Simple login form.
 * Username and password must be at least 6 characters long.
 * Typed and retyped password must be same.
 * There are two buttons clear and submit.
 * 
 * @author boris
 *
 */
public class RegisterForm extends JFrame {
	private static final long serialVersionUID = -2581064841555054581L;

	private JPanel panel = new JPanel(); 
	private JLabel user = new JLabel("type username");
	private JLabel passOne = new JLabel("type password");
	private JLabel passTwo = new JLabel("retype password");
	private JTextField username = new JTextField(8);
	private JPasswordField passwordOne = new JPasswordField(8);
	private JPasswordField passwordTwo = new JPasswordField(8);
	private JButton clear = new JButton("Clear");
	private JButton submit = new JButton("Submit");
	
	public RegisterForm() {
		
		add(panel);
		panel.setLayout(new FlowLayout(1, 10, 10));
		panel.add(user);
		panel.add(username);
		panel.add(passOne);
		panel.add(passwordOne);
		panel.add(passTwo);
		panel.add(passwordTwo);
		panel.add(clear);
		panel.add(submit);
		
		clear.addActionListener(new Action());
		submit.addActionListener(new Action());
		
		
		setTitle("Login form");
		setSize(250, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == clear) {
				username.setText("");
				passwordOne.setText("");
				passwordTwo.setText("");
			} else if (e.getSource() == submit) {
				char[] passOne = passwordOne.getPassword();
				char[] passTwo = passwordTwo.getPassword();
				
				boolean areComplexPasswords = false;
				for (int i = 0; i < passOne.length; i++) {
					if (passOne[i] >= 48 && passOne[i] <= 57) {
						// there are numbers so check for special characters
					} else if ((passOne[i] >= 33 && passOne[i] <= 47 )|| (passOne[i] >= 58 && passOne[i] <= 64 )||
								(passOne[i] >= 91 && passOne[i] <= 96 )|| (passOne[i] >= 123 && passOne[i] <= 126 )) {
						areComplexPasswords = true;
					}
				}
				if (username.getText().length() < 6 || passOne.length < 6 || passTwo.length < 6) {
					JOptionPane.showMessageDialog(null, "Your username and password must have at least 6 characters.", "Error", JOptionPane.WARNING_MESSAGE);
				} else if (Arrays.equals(passOne, passTwo) && areComplexPasswords) {
					JOptionPane.showMessageDialog(null, "Login accepted.");
					System.exit(DISPOSE_ON_CLOSE);
				} else {
					JOptionPane.showMessageDialog(null, "Your password must contain numbers and special characters.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new RegisterForm();
	}
	
}
