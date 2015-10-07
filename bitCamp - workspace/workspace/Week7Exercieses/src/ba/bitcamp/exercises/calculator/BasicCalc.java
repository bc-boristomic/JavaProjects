package ba.bitcamp.exercises.calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BasicCalc extends JFrame {
	private static final long serialVersionUID = -1576629717955859898L;

	String s = "";
	JPanel top = new JPanel();
	JLabel text = new JLabel("123");
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton[] buttons = new JButton[10];
	JButton button = new JButton("+");
	
	public BasicCalc() {
		
		setLayout(new BorderLayout());
		add(panel, BorderLayout.EAST);
		add(panel2, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH);
		
		top.add(text);
		
		panel.add(button);
		button.addActionListener(new Action());
		panel2.setLayout(new GridLayout(5,5));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(""+i);
			panel2.add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}
		
		
		setTitle("Basic calculator");
		setSize(300, 430);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				text.setText("Plus");
			}
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]){
					s += i;
					text.setText(s);
				} 
			}
			
		}
		
	}

	public static void main(String[] args) {

		new BasicCalc();
		
	}

}
