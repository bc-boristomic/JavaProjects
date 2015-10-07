package ba.bitcamp.exercises.day1;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Email extends JFrame {
	private static final long serialVersionUID = -1338772235812394103L;

	private JTextField check = new JTextField();
	private String[] emails = { "abc@mail.com", "def@mail.com", "ghi@mail.com" };
	
	public Email() {
		
		add(check, BorderLayout.NORTH);
		check.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER){
					String string = check.getText();
					for (int i = 0; i < emails.length; i++) {
						if (string.equals(emails[i])) {
							new MyDialog1("Used");
							break;
						} else {
							new MyDialog1("Not used");
							break;
						}
					}
				}
			}
		});
		
		
		setTitle("Is email available?");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyDialog1 extends JDialog {
		private static final long serialVersionUID = -7302627133422592060L;

		public MyDialog1(String s) {
			
			
			setModalityType(ModalityType.MODELESS);
			setTitle(s);
			setSize(200, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
			
		}
	}

	public static void main(String[] args) {
		new Email();
	}
}
