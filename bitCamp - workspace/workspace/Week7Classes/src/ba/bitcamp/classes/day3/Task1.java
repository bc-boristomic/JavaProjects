package ba.bitcamp.classes.day3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task1 extends JPanel {
	private static final long serialVersionUID = 7645661224172486625L;

	private JLabel name = new JLabel("Name");
	private JLabel email = new JLabel("Email");
	private JButton button = new JButton("Send");
	private JCheckBox box = new JCheckBox("Accept");
	private JTextField textName = new JTextField("enter name", 20);
	private JTextField textEmail = new JTextField("enter email", 20);
	private JTextArea text = new JTextArea("Some text", 10, 25); 
	
	public Task1(){
		
		
		text.setLineWrap(true);
		text.setEditable(false);
		
		//button.setEnabled(false);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if (box.isSelected() == false) {
					textName.setText("");
					textEmail.setText("");

					JOptionPane.showMessageDialog(null, "You didn't accept");
					
				} else {
					JOptionPane.showMessageDialog(null, "Got it");
				}
			}
		});
		
		box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JCheckBox cb = (JCheckBox)e.getSource(); // moze i preko kastanja
				button.setEnabled(box.isSelected());
			}
		});
		
		add(name);
		add(textName);
		add(email);
		add(textEmail);
		add(text);
		add(box);
		add(button);
	}
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.add(new Task1());
		window.setTitle("Basic components");
		window.setSize(320, 350);
		window.setLocationRelativeTo(null);
		//window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
