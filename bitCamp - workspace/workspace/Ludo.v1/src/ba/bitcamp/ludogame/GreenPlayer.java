package ba.bitcamp.ludogame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GreenPlayer extends JFrame {
	private static final long serialVersionUID = -7279692822351465019L;

	public static int[][] matrix; // = new int [11][11];
	public static JLabel[][] label = new JLabel[11][11];
	private static int diceValue;

	private static int x1 = 0;
	private static int y1 = 6;

	private static int x2 = 0;
	private static int y2 = 6;

	private static int x3 = 0;
	private static int y3 = 6;

	private static int x4 = 0;
	private static int y4 = 6;

	static int temp1 = 0;
	static int temp2 = 0;
	static int temp3 = 0;
	static int temp4 = 0;

	private static int diceCounter = 0;
	private static Boolean nextTurn = false;

	static int[][] redmove = new int[][] { { 0, 6 }, { 1, 6 }, { 2, 6 },
			{ 3, 6 }, { 3, 7 }, { 3, 8 }, { 3, 9 }, { 3, 10 }, { 9, 7 },
			{ 10, 7 }, { 10, 6 }, { 10, 5 }, { 10, 4 }, { 10, 3 }, { 9, 3 },
			{ 8, 3 }, { 7, 3 }, { 7, 2 }, { 7, 1 }, { 7, 0 }, { 6, 0 },
			{ 5, 0 }, { 4, 0 }, { 3, 0 }, { 3, 1 }, { 3, 2 }, { 3, 3 },
			{ 2, 3 }, { 1, 3 }, { 0, 3 }, { 0, 4 }, { 0, 5 }, { 0, 6 },
			{ 0, 7 }, { 1, 7 }, { 2, 7 }, { 3, 7 }, { 3, 8 }, { 3, 9 },
			{ 3, 10 }, { 0, 5 }, { 1, 5 }, { 2, 5 }, { 3, 5 } };

	public GreenPlayer() {
		String ip = JOptionPane.showInputDialog("Insert ip address of server");
		System.out.println(ip);
		setLayout(new GridLayout(11, 11));

		matrix = new int[][] { { 3, 3, 0, 0, 1, 1, 1, 0, 0, 2, 2 },
				{ 3, 3, 0, 0, 1, 2, 1, 0, 0, 2, 2 },
				{ 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 2, 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 },
				{ 1, 7, 7, 7, 7, 6, 4, 4, 4, 4, 1 },
				{ 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 1, 5, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 5, 1, 0, 0, 0, 0 },
				{ 5, 5, 0, 0, 1, 5, 1, 0, 0, 4, 4 },
				{ 5, 5, 0, 0, 1, 1, 1, 0, 0, 4, 4 }, };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				label[i][j] = new JLabel();
				label[i][j].setOpaque(true);
				label[i][j].setHorizontalAlignment(NORMAL);
				if (matrix[i][j] == 3) {
					label[i][j].setBackground(Color.RED);
				} else if (matrix[i][j] == 2) {
					label[i][j].setBackground(Color.GREEN);
				} else if (matrix[i][j] == 1) {
					label[i][j].setBackground(Color.WHITE);
				} else if (matrix[i][j] == 4) {
					label[i][j].setBackground(Color.BLUE);
				} else if (matrix[i][j] == 5) {
					label[i][j].setBackground(Color.YELLOW);
				} else if (matrix[i][j] == 6) {

				} else if (matrix[i][j] == 7) {
					label[i][j].setBackground(new Color(247, 64, 86));
				}
				label[i][j].addMouseListener(new Action());
				label[i][j].setBorder(BorderFactory
						.createLineBorder(Color.BLACK));
				add(label[i][j]);

			}
		}

		setSize(800, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Action extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == label[5][5]) {
				if (diceCounter < 3  || diceValue == 6 || nextTurn ) {
					diceCounter++;
					diceValue = Utility.getRandomNumber();
					label[5][5].setIcon(new ImageIcon(new Dice()
							.getRandomDice(diceValue)));
					System.out.println(diceValue);
					if (diceCounter == 3) {
						nextTurn = true;
						// diceCounter = 0;
					}
				}
			}

			if (e.getSource() == label[x1][y1]) {
				if (label[x1][y1].getBackground().equals(Color.RED)) {
					if (temp1 >= 40 && temp1 < 43) {
						label[x1][y1].setBackground(new Color(247, 64, 86));
					} else if (temp1 == 43) {

					} else {
						label[x1][y1].setBackground(Color.WHITE);
					}
					System.out.println(temp1 + diceValue);
					if (temp1 + diceValue == temp2
							|| temp1 + diceValue == temp3
							|| temp1 + diceValue == temp4) {
						label[x1][y1].setBackground(Color.RED);
					} else if (temp1 + diceValue < 44) {
						x1 = redmove[temp1 + diceValue][0];
						y1 = redmove[temp1 + diceValue][1];
						temp1 += diceValue;
						label[x1][y1].setBackground(Color.RED);

					} else {
						label[x1][y1].setBackground(Color.RED);
					}

				}

			} else if (e.getSource() == label[x2][y2]) {
				if (label[x2][y2].getBackground().equals(Color.RED)) {
					if (temp2 >= 40 && temp2 < 43) {
						label[x2][y2].setBackground(new Color(247, 64, 86));
					} else if (temp2 == 43) {

					} else {
						label[x2][y2].setBackground(Color.WHITE);
					}
					if (temp2 + diceValue == temp1
							|| temp2 + diceValue == temp3
							|| temp2 + diceValue == temp4) {
						label[x2][y2].setBackground(Color.RED);
					} else if (temp2 + diceValue < 44) {
						x2 = redmove[temp2 + diceValue][0];
						y2 = redmove[temp2 + diceValue][1];
						temp2 += diceValue;
						label[x2][y2].setBackground(Color.RED);

					} else {
						label[x2][y2].setBackground(Color.RED);
					}

				}
			} else if (e.getSource() == label[x3][y3]) {
				if (label[x3][y3].getBackground().equals(Color.RED)) {
					if (temp3 >= 40 && temp3 < 43) {
						label[x3][y3].setBackground(new Color(247, 64, 86));
					} else if (temp3 == 43) {

					} else {
						label[x3][y3].setBackground(Color.WHITE);
					}

					if (temp3 + diceValue == temp1
							|| temp3 + diceValue == temp2
							|| temp3 + diceValue == temp4) {
						label[x3][y3].setBackground(Color.RED);
					} else if (temp3 + diceValue < 44) {
						x3 = redmove[temp3 + diceValue][0];
						y3 = redmove[temp3 + diceValue][1];
						temp3 += diceValue;
						label[x3][y3].setBackground(Color.RED);

					} else {
						label[x3][y3].setBackground(Color.RED);
					}

				}
			} else if (e.getSource() == label[x4][y4]) {
				if (label[x4][y4].getBackground().equals(Color.RED)) {
					if (temp4 >= 40 && temp4 < 43) {
						label[x4][y4].setBackground(new Color(247, 64, 86));
					} else if (temp4 == 43) {

					} else {
						label[x4][y4].setBackground(Color.WHITE);
					}

					if (temp4 + diceValue == temp1
							|| temp4 + diceValue == temp2
							|| temp4 + diceValue == temp3) {
						label[x4][y4].setBackground(Color.RED);
					} else if (temp4 + diceValue < 44) {
						x4 = redmove[temp4 + diceValue][0];
						y4 = redmove[temp4 + diceValue][1];
						temp4 += diceValue;
						label[x4][y4].setBackground(Color.RED);

					} else {
						label[x4][y4].setBackground(Color.RED);
					}

				}
			}

			if (diceValue == 6) {
				if (e.getSource() == label[0][10]
						&& label[0][10].getBackground().equals(Color.GREEN)) {

					if (label[0][6].getBackground().equals(Color.WHITE)) {
						label[0][6].setBackground(Color.GREEN);
						//label[0][10].setBackground(new Color(247, 64, 86));
					}
				} else if (e.getSource() == label[0][9]
						&& label[0][9].getBackground().equals(Color.GREEN)) {
					if (label[0][6].getBackground().equals(Color.WHITE)) {
						label[0][6].setBackground(Color.GREEN);
						//label[0][1].setBackground(new Color(247, 64, 86));
					}
				} else if (e.getSource() == label[1][10]
						&& label[1][10].getBackground().equals(Color.GREEN)) {
					if (label[0][6].getBackground().equals(Color.WHITE)) {
						label[0][6].setBackground(Color.GREEN);
						//label[1][0].setBackground(new Color(247, 64, 86));
					}
				} else if (e.getSource() == label[1][9]
						&& label[1][9].getBackground().equals(Color.GREEN)) {
					if (label[0][6].getBackground().equals(Color.WHITE)) {
						label[0][6].setBackground(Color.GREEN);
						//label[1][1].setBackground(new Color(247, 64, 86));
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		new GreenPlayer();
	}

}
