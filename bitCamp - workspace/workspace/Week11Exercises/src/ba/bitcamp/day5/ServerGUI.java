package ba.bitcamp.day5;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServerGUI extends JFrame {
	private static final long serialVersionUID = -1967740294311394478L;

	protected static final int SIZE = 10;
	
	private JLabel[][] labels = new JLabel[SIZE][SIZE];
	private int x = 0;
	private int y = 0;

	public ServerGUI() {

		setLayout(new GridLayout(SIZE, SIZE));

		for (int i = 0; i < labels.length; i++) {
			for (int j = 0; j < labels[i].length; j++) {
				labels[i][j] = new JLabel();
				labels[i][j].setHorizontalAlignment(NORMAL);
				labels[i][j].setBorder(BorderFactory
						.createLineBorder(Color.BLUE));
				labels[i][j].setOpaque(true);
				labels[i][j].setBackground(Color.WHITE);
				labels[0][0].setBackground(Color.BLACK);
				add(labels[i][j]);
			}
		}

		setTitle("Move square - Server");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void action(String msg) {
		// String msg = Server.recieveMessage();
		// System.out.println(Server.msg);
		try {
			if (msg.equals("d")) {

				labels[x][y].setBackground(Color.WHITE);
				labels[x][y + 1].setBackground(Color.BLACK);
				y++;

			} else if (msg.equals("a")) {

				labels[x][y].setBackground(Color.WHITE);
				labels[x][y - 1].setBackground(Color.BLACK);
				y--;

			} else if (msg.equals("w")) {

				labels[x][y].setBackground(Color.WHITE);
				labels[x - 1][y].setBackground(Color.BLACK);
				x--;

			} else if (msg.equals("s")) {

				labels[x][y].setBackground(Color.WHITE);
				labels[x + 1][y].setBackground(Color.BLACK);
				x++;

			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Uhvacen");
		}
	}

}
