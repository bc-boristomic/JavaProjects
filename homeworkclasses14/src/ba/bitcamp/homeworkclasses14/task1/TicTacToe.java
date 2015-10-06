package ba.bitcamp.homeworkclasses14.task1;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame {

	private static final long serialVersionUID = -4734294523692947702L;

	private JButton[] buttons = new JButton [9];
	private String s = "X";

	/**
	 * Constructor of TicTacToe Class
	 */
	public TicTacToe() {
		super(); // Call super constructor (JFrame class)
		
		setLayout(new GridLayout(3, 3)); // Layout setup

		for (int i = 0; i < buttons.length; i++) { // Creating and adding buttons, adding listeners to each one
			buttons[i] = new JButton("");
			buttons[i].setFont(new Font("Courier New", Font.BOLD, 20));
			add(buttons[i]);
			buttons[i].addActionListener(new Listen(buttons[i]));
		}

		setName("Dummy Tic Tac Toe"); // Name of windows
		setSize(300, 300); // Size of window
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Exit on x button
		setLocationRelativeTo(null); // Set position on center of screen
		setVisible(true); // Make it visible

	}

	private class Listen implements ActionListener {

		private JButton button;
		
		public Listen(JButton button){
			super();
			this.button = button;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			button.setText(s); // Set button to X
			
			if(s.equals("X")){ // If it is X change to O
				s = "O";
			} else { // Otherwise change to X
				s = "X";
			}
		}
	}

	public static void main(String[] args) {

		new TicTacToe(); // Calling the game

	}

}
