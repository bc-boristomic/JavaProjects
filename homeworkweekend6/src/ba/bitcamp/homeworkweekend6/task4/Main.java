package ba.bitcamp.homeworkweekend6.task4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	private static final long serialVersionUID = 5307896016849026393L;
	
	private String[] letters = { "B", "I", "T", "C", "A", "M", "P" };
	private JButton top = new JButton("Char: " + letters[randomNumberGenerator()] );
	private JButton left = new JButton("<");
	private JButton right = new JButton(">");
	private JButton bottom = new JButton("Insert");
	private JLabel text = new JLabel();
	private int index = 0;
	private StringBuilder sb = new StringBuilder();
	private String s = "_";
	

	/**
	 * Constructor of Main class
	 */
	public Main () {
		setLayout(new BorderLayout());
		
		add(top, BorderLayout.NORTH);
		top.addActionListener(new Action());
		
		add(left, BorderLayout.WEST);
		left.addActionListener(new Action());
		
		add(text, BorderLayout.CENTER);
		text.setText(s);
		text.setHorizontalAlignment(NORMAL);
		
		add(right, BorderLayout.EAST);
		right.addActionListener(new Action());
		
		add(bottom, BorderLayout.SOUTH);
		bottom.addActionListener(new Action());
				
		setTitle("Write BITCamp");
		setSize(500, 250);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	/**
	 * Generates random number within letters array range.
	 * 
	 * @return <code>int</code> type value
	 */
	public int randomNumberGenerator() {
		return (int)(Math.random() * 7);

	}
	
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String s1 = "";
			//word[index] = text.getText();
			if (e.getSource() == top) {
				top.setText("Char: " + letters[randomNumberGenerator()]);
			}
			if (e.getSource() == right) {
				index++;
				//word[index] = text.getText();
				s1 = s.charAt(index) + s.substring(0, index) + s.substring(index + 1, s.length());
				text.setText(s);
				if (index == s.length()) {
					index = 0;
				}
				
			}
			if (e.getSource() == left) {
				index--;
				s = s.substring(0, index) + s.substring(index + 1, s.length());
				text.setText(s);
				if (index == 0) {
					index = s.length();
				}
				
			}
			if (e.getSource() == bottom) {
				//sb.append(top.getText().substring(5, 7));
				//text.setText(sb.toString()+s1);
				s = s + top.getText().substring(6, 7);
				text.setText(s);
				//sb.insert(counter, s1);
				//text.setText(sb.toString());
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new Main();
		
	}
}
