package ba.bitcamp.classes.day5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Task1 extends JFrame {
	private static final long serialVersionUID = 1807614342830711718L;

	JMenuBar bar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem clear = new JMenuItem("Clear");
	JMenuItem exit = new JMenuItem("Exit");

	public Task1() {

		setLayout(new BorderLayout());
		add(bar, BorderLayout.NORTH);

		bar.add(file);
		file.add(clear);
		file.add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Are you sure", "",
						JOptionPane.YES_NO_OPTION);
				if (a == JOptionPane.YES_OPTION) {
					System.exit(EXIT_ON_CLOSE);
				} else if (a == JOptionPane.NO_OPTION) {
					new MyDialog();
				}

			}
		});

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -9124513021329545411L;

		
		
		public MyDialog() {
			
			setModalityType(ModalityType.DOCUMENT_MODAL);
			setSize(290, 130);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);

		}

	}

	public static void main(String[] args) {
		new Task1();
	}
}
