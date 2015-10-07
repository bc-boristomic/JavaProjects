package ba.bitcamp.exercises.calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Class calculator creates simple GUI calculator using javax.swing components.
 * Available operators are +, -, *, /.
 * 
 * If buttons in calculator look misplaced go to initFrame() method 
 * and change size since size varies from OS to OS.
 * 
 * Read more in about if you run the program.
 * 
 * @author boris
 *
 */
public class Calc extends JFrame {
	private static final long serialVersionUID = 8358076364473338521L;

	// Constants used to make button dimensions
	private static final int BUTTON_HEIGHT = 45;
	private static final int BUTTON_LENGTH = 95;

	// Dimensions used to set buttons size
	private Dimension regular = new Dimension(BUTTON_HEIGHT, BUTTON_HEIGHT);
	private Dimension stretched = new Dimension(BUTTON_LENGTH, BUTTON_HEIGHT);

	// JMenuBar along with all the Menus and Items
	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenuItem clear = new JMenuItem("Clear");
	private JMenuItem exit = new JMenuItem("Exit");
	private JMenu edit = new JMenu("Edit");
	private JMenuItem copy = new JMenuItem("Copy");
	private JMenu help = new JMenu("Help");
	private JMenuItem about = new JMenuItem("About");

	// Top panel for display and center panel for buttons
	private JPanel top = new JPanel();
	private JPanel center = new JPanel();
	
	// TextFields for result display and input display
	private JTextField sumText = new JTextField("0");
	private JTextField insertText = new JTextField("0");
	
	// All the buttons and array of string with names of buttons
	private JButton[] buttons = new JButton[17];
	private String[] buttonText = { "7", "8", "9", "Clear", "4", "5", "6", "/", "*", "1", "2", "3", "-", "+", "0", ".", "=" };
	
	// Label used to make buttons arrangement look good, used instead of another button
	private JLabel java = new JLabel("Java");
	
	// Variables used for operations
	private String number = "", mathExpression = "", math = "";
	private double sum = 0.0, num;
	private boolean isParsable = false, isFirstNum = true, commaCount = false, isFirstOp = true;
	private int counterOperations = 0, counterEquals = 0, commaCounter = 0;
		
	/**
	 * Constructor of Calculator class.
	 */
	public Calc() {
		initBarMenu();
		initPanels();
		initCalculationFields();
		initButtons();
		initFrame();
	}

	/**
	 * Sets JMenuBar adds all of the components and adds ActionListeners.
	 */
	private void initBarMenu() {
		setJMenuBar(bar);
		bar.add(file);
		bar.add(edit);
		bar.add(help);
		file.add(clear);
		file.add(exit);
		edit.add(copy);
		help.add(about);
				
		exit.addActionListener(new ActionBar());
		clear.addActionListener(new ActionBar());
		copy.addActionListener(new ActionBar());
		about.addActionListener(new ActionBar());
	}
	
	/**
	 * Sets JPanel and adds addition JPanels with appropriate Layout.
	 * Creates TitledBorder arount them.
	 */
	private void initPanels() {
		add(top, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		top.setBorder(BorderFactory.createTitledBorder("Result"));
		center.setBorder(BorderFactory.createTitledBorder("Operations"));
		center.setLayout(new FlowLayout());

	}

	/**
	 * Sets JTextFields, makes them uneditable and sets appropriate font.
	 */
	private void initCalculationFields() {
		sumText.setFont(new Font("Serif", Font.PLAIN, 20));
		sumText.setHorizontalAlignment(SwingConstants.RIGHT);
		sumText.setEditable(false);
		top.setLayout(new BorderLayout());
		top.add(sumText, BorderLayout.CENTER);

		insertText.setFont(new Font("Serif", Font.PLAIN, 16));
		insertText.setHorizontalAlignment(SwingConstants.RIGHT);
		insertText.setBorder(BorderFactory.createTitledBorder(""));
		insertText.setEditable(false);
		top.add(insertText, BorderLayout.SOUTH);
	}

	/**
	 * Sets all of the buttons at once, and one JLabel.
	 * Sets appropriate text on them, makes their size and 
	 * adds ActionListener to all buttons.
	 */
	private void initButtons() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonText[i]);
			buttons[i].setPreferredSize(regular);
			if (i == 3 || i == 16) { // Make clear and equals stretched
				buttons[i].setPreferredSize(stretched);
			}
			if (i == 14) { // JLabel, setting size text position and font.
				java.setPreferredSize(regular);
				java.setHorizontalAlignment(SwingConstants.CENTER);
				java.setFont(new Font("Monotyped", Font.BOLD, 10));
				center.add(java);
			}
			center.add(buttons[i]); // Adding all buttons
			buttons[i].addActionListener(new Action()); // along with ActionListener 
		}
	}
	
	/**
	 * Initializes JFrame, makes it visible and non resizable.
	 */
	private void initFrame() {
		setTitle("Simple Java calculator");
		setSize(280, 370);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	/**
	 * Calculates result based on user input.
	 * 
	 * @throws ArithmeticException
	 */
	private void result() {
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
			if (num == 0 && math.equals("/")) {
				sumText.setText("Can't divide by zero");
				throw new ArithmeticException("Can't divide by zero");
			} else {
				sum /= num;
			}
			break;
			default:
	}
	sumText.setText("" + sum);
	commaCounter = 0;
	number = "";
	}
	
	/**
	 * Used to clear all previous input.
	 */
	private void clearAll() {
		insertText.setText("0");
		sumText.setText("0");
		number = "";
		mathExpression = "";
		sum = 0;
		num = 0;
		commaCount = false; 
		isParsable = false;
		isFirstNum = true;
		isFirstOp = true;
		counterOperations = 0;
		counterEquals = 0;
		commaCounter = 0;
		math = "";
	}
	
	/**
	 * Inner class used to implement ActionListener on buttons.
	 * 
	 * @author boris
	 *
	 */
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			for (int i = 0; i < buttons.length; i++) {
				if (i == 0 || i == 1 || i == 2 || i == 4 || i == 5 || i == 6 || i == 9 || i == 10 || i == 11 || i == 14) { // Number buttons
					if (e.getSource() == buttons[i]) {
						number += buttons[i].getText();
						mathExpression += buttons [i].getText();
						insertText.setText(mathExpression);
						if (isParsable) {
							num = Double.parseDouble(number);
						}
						if (commaCounter == 0) {
							commaCount = true; 
						}
					}
				} else if (i == 13 || i == 12 || i == 8 || i ==7) { // Math operator buttons
					if (e.getSource() == buttons[i]) {
						mathExpression += buttons [i].getText();
						insertText.setText(mathExpression);
						if (isFirstNum) {
							try {
								sum = Double.parseDouble(number);
							} catch (NumberFormatException ex) {
								ex.printStackTrace();
							}
							isFirstNum = false;
						}
						if (counterOperations > 0 && counterEquals == 0) {
							result();
						}
						counterOperations++;
						if (isFirstOp) {
							result();				
							isFirstOp = false;
						}
						isParsable = true;
						number = "";
						commaCounter = 0;
						if (i == 13) {
							math = "+";
						} else if (i == 12) {
							math = "-";
						} else if (i == 8) {
							math = "*";
						} else if (i == 7) {
							math = "/";
						}
					}
				}
			}
			if (e.getSource() == buttons[15]) { // Comma button
				if (commaCount) {
					commaCount = false;
					number += buttons[15].getText();
					mathExpression += buttons [15].getText();
					insertText.setText(mathExpression);
					commaCounter++;
				}
			} else if (e.getSource() == buttons[16]) { // Equals button
				counterEquals++;
				result();
			} else if (e.getSource() == buttons[3]) { // Clear button
				clearAll();
			}
					
		}
	}
	
	/**
	 * Inner class used to implement ActionListener on JMenuBar buttons.
	 * 
	 * @author boris
	 *
	 */
	private class ActionBar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == exit) {
				System.exit(EXIT_ON_CLOSE);
			} else if (e.getSource() == clear) {
				clearAll();
			} else if (e.getSource() == copy) {
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				String copy = sumText.getText();
				clip.setContents(new StringSelection(copy), null);
			} else if(e.getSource() == about) {
				JOptionPane.showMessageDialog(null, "(Very) Simple Java Calculator\n\nCalculates in Java double data type.\n"
						+ "You can calculate multiple operations before pressing equals button.\nAfter pressing equals button "
						+ "only last number will be calculated with result.\n\nIf you want to be sure in your calculation best "
						+ "thing to do is to press equals after each operation. :)\n\nCopy option will copy result to clipboard "
						+ "if you need to paste it quickly.", "Mostly about flaws", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

	/**
	 * main method runs the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		new Calc();

	}

}