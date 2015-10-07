package ba.bitcamp.day5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClientGUI extends JFrame {
	private static final long serialVersionUID = 8040314973855981323L;

	private JLabel[][] labels = new JLabel[ServerGUI.SIZE][ServerGUI.SIZE];
	private int x = 0;
	private int y = 0;

	public ClientGUI() {

		addKeyListener(new KeyAction());

		setLayout(new GridLayout(ServerGUI.SIZE, ServerGUI.SIZE));

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

		setTitle("Move square - Client");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private class KeyAction extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

			try {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

					labels[x][y].setBackground(Color.WHITE);
					labels[x][y + 1].setBackground(Color.BLACK);
					y++;
					Client.action("d");

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

					labels[x][y].setBackground(Color.WHITE);
					labels[x][y - 1].setBackground(Color.BLACK);
					y--;
					Client.action("a");

				} else if (e.getKeyCode() == KeyEvent.VK_UP) {

					labels[x][y].setBackground(Color.WHITE);
					labels[x - 1][y].setBackground(Color.BLACK);
					x--;
					Client.action("w");

				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					labels[x][y].setBackground(Color.WHITE);
					labels[x + 1][y].setBackground(Color.BLACK);
					x++;
					Client.action("s");

				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Uhvacen");
			}
		}
	}

}
