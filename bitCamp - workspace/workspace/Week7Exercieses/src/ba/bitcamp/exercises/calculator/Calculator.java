package ba.bitcamp.exercises.calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 8358076364473338521L;

	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenuItem clear = new JMenuItem("Clear");
	private JMenuItem exit = new JMenuItem("Exit");

	private JPanel top = new JPanel(); // Set on top of frame
	private JPanel center = new JPanel(); // Set on center of frame
	
	private JLabel sumText = new JLabel("0"); // Displays sum
	private JLabel insertText = new JLabel("0"); // Displays inserted numbers
	
	private static final int BUTTON_HEIGHT = 45;
	private static final int BUTTON_LENGTH = 95;

	private JButton[] buttons = new JButton[17];
	private String[] buttonText = { "7", "8", "9", "Clear", "4", "5", "6", "/", "*", "1", "2", "3", "-", "+", "0", ".", "=" };
	private JLabel version = new JLabel("v 1.0");
	
	private Dimension regular = new Dimension(BUTTON_HEIGHT, BUTTON_HEIGHT);
	private Dimension streched = new Dimension(BUTTON_LENGTH, BUTTON_HEIGHT);

	private String number = "", mathExpression = "", math = "";

	private double sum = 0.0, num;
	
	private boolean isParsable = false, isFirstPlus = true, isFirstMinus = true, isFirstMultiply = true, isFirstDivide = true, commaCount = false;

	public Calculator() {
		setLayout(new BorderLayout());
		
		file.add(exit);
		file.add(clear);
		bar.add(file);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Are you sure", "", JOptionPane.YES_NO_OPTION);
				if (a == JOptionPane.YES_OPTION) {
					System.exit(EXIT_ON_CLOSE);
				}
				
			}
		});
		top.add(bar, BorderLayout.NORTH);
		
		initPanels();
		initTopLabels();
		initButtons();
		initFrame();
	}

	private void initFrame() {
		setTitle("Basic calculator");
		setSize(265, 320);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
	}

	private void initPanels() {
		top.setBorder(BorderFactory.createTitledBorder("Result"));
		center.setBorder(BorderFactory.createTitledBorder("Operations"));
		add(top, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		center.setLayout(new FlowLayout());
		
	}

	private void initTopLabels() {

		sumText.setFont(new Font("Serif", Font.PLAIN, 20));
		sumText.setHorizontalAlignment(SwingConstants.RIGHT);
		top.setLayout(new BorderLayout());
		top.add(sumText, BorderLayout.CENTER);

		insertText.setFont(new Font("Serif", Font.PLAIN, 16));
		insertText.setHorizontalAlignment(SwingConstants.RIGHT);
		insertText.setBorder(BorderFactory.createTitledBorder(""));
		top.add(insertText, BorderLayout.SOUTH);

	}

	private void initButtons() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonText[i]);
			buttons[i].setPreferredSize(regular);
			if (i == 3) {
				buttons[i].setPreferredSize(streched);
				center.add(buttons[i]);
			}
			if (i == 14) {
				version.setPreferredSize(regular);
				version.setHorizontalAlignment(SwingConstants.CENTER);
				version.setFont(new Font("Serif", Font.PLAIN, 10));
				center.add(version);
			}
			if (i == 16) {
				buttons[i].setPreferredSize(streched);
				center.add(buttons[i]);
			}
			center.add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			for (int i = 0; i < buttons.length; i++) {
				if (i == 0 || i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 9 || i == 10 || i == 11 || i == 14) {
					if (e.getSource() == buttons[i]) {
						number += buttons[i].getText();
						mathExpression += buttons [i].getText();
						insertText.setText(mathExpression);
						
						if (isParsable) {
							num = Double.parseDouble(number);
						}
						commaCount = true; 
					}
				}
			}
			

			if (e.getSource() == buttons[15]) { // Comma
				if (commaCount) {
					commaCount = false;
					number += buttons[15].getText();
					mathExpression += buttons [15].getText();
					insertText.setText(mathExpression);
				}
			} else if (e.getSource() == buttons[13]) { // Plus operation
				mathExpression += buttons [13].getText();
				insertText.setText(mathExpression);
				if (isFirstPlus) {
					sum = Double.parseDouble(number);
					isFirstPlus = false;
				}
								
				isParsable = true;
				sumText.setText("" + sum);
				math = "+";
				number = "";
				
			} else if (e.getSource() == buttons[12]) { // Minus operation
				mathExpression += buttons [12].getText();
				insertText.setText(mathExpression);
				if (isFirstMinus) {
					sum = Double.parseDouble(number);
					isFirstMinus = false;
				}
				
				isParsable = true;
				sumText.setText("" + sum);
				math = "-";
				number = "";
			
			} else if (e.getSource() == buttons[8]) { // Multiply operation
				mathExpression += buttons [8].getText();
				insertText.setText(mathExpression);
				if (isFirstMultiply) {
					sum = Double.parseDouble(number);
					isFirstMultiply = false;
				}
				
				isParsable = true;
				sumText.setText("" + sum);
				math = "*";
				number = "";
			
			} else if (e.getSource() == buttons[7]) { // Divide operation
				mathExpression += buttons [7].getText();
				insertText.setText(mathExpression);
				if (isFirstDivide) {
					sum = Double.parseDouble(number);
					isFirstDivide = false;
				}
				
				isParsable = true;
				sumText.setText("" + sum);
				math = "/";
				number = "";
			
			} else if (e.getSource() == buttons[16]) { // Equals
				switch (math) {
				case "+":
					sum += num;
					break;
				case "-":
					sum -= num;
					break;
				case "*":
					sum *= num;
					break;
				case "/":
					sum /= num;
					break;
					default: System.out.println("a");
			
			}
			sumText.setText("" + sum);
			} else if (e.getSource() == buttons[3]) { // Clear button
				insertText.setText("0");
				sumText.setText("0");
				number = "";
				mathExpression = "";
				sum = 0.0;
				commaCount = false; 
				isParsable = false;
				isFirstPlus = true;
				isFirstMinus = true;
				isFirstMultiply = true;
				isFirstDivide = true;
				
			}
					
		}
		
	}

	public static void main(String[] args) {

		new Calculator();

	}

}
