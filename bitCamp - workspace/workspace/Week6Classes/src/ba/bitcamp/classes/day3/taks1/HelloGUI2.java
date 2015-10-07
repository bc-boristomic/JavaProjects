package ba.bitcamp.classes.day3.taks1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGUI2 {

	public static void main(String[] args) {

		JButton button1 = new JButton("");
		JButton button2 = new JButton("");
		JButton button3 = new JButton("");
		JButton button4 = new JButton("");
		JButton button5 = new JButton("");
		JButton button6 = new JButton("");
		JButton button7 = new JButton("");
		JButton button8 = new JButton("");
		JButton button9 = new JButton("");

		JButton[] buttons = { button1, button2, button3, button4, button5,
				button6, button7, button8, button9 };
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(new ButtonHandler2(buttons));
		}

//		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
//		JButton okButton = new JButton("X");

//		ButtonHandler2 listner = new ButtonHandler2(buttons); // for 
		
//		Color c = new Color(128, 10, 10);
//		okButton.setBackground(c);
//		Font f = new Font("Wingdings", Font.ITALIC, 20);
//		okButton.setFont(f);
//		okButton.addActionListener(listner);
//		okButton.addActionListener(new ButtonHandler2(buttons));
		

//		JPanel content = new JPanel();
//		content.setLayout(new BorderLayout());
//		content.add(displayPanel, BorderLayout.CENTER);
//		content.add(okButton, BorderLayout.SOUTH);

		JPanel cont = new JPanel();
		cont.setLayout(new GridLayout(3, 3));
		cont.add(button1);
		cont.add(button2);
		cont.add(button3);
		cont.add(button4);
		cont.add(button5);
		cont.add(button6);
		cont.add(button7);
		cont.add(button8);
		cont.add(button9);
		
		JFrame window = new JFrame("TicTacToe");
		window.setContentPane(cont);
		window.setSize(450, 450);
		window.setLocation(700, 300);
		window.setVisible(true);
		window.setDefaultCloseOperation(3);

	}

//	private static class HelloWorldDisplay extends JPanel {
//
//		private static final long serialVersionUID = -9133472834373091661L;
//
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//
//			Font f = new Font("Oriya MN", Font.BOLD, 25);
//			Color c = new Color(70, 200, 120);
//
//			g.setColor(c);
//			g.setFont(f);
//			g.drawString("Hello world", 20, 30);
//		}
//	}

	private static class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}

	private static class ButtonHandler2 implements ActionListener {

		JButton[] button;

		public ButtonHandler2(JButton[] button) {
			super();
			this.button = button;
		}

		public void actionPerformed(ActionEvent e) {
			
			for (int i = 0; i < button.length; i++) {
				if(e.getSource() == button[i]){
					if (i % 2 == 1) {
						button[i].setText("O");
					} else {
						button[i].setText("X");
					}
				}
			}
		}

	}

}
