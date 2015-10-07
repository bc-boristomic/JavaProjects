package ba.bitcamp.exercieses.day1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Tells which mouse button is clicked.
 * 
 * @author boris.tomic
 *
 */
public class Task3 extends JFrame {
	private static final long serialVersionUID = 6639580398009901396L;
	
	private JLabel text = new JLabel("Last Pressed: ");
	
	public Task3(){
		add(text);
		text.setHorizontalAlignment(NORMAL);
		text.addMouseListener(new Mouse());
		
		setTitle("Task 3");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			text.setText("Last Pressed: ");
			if (e.getSource() == text) {
				switch (e.getButton()) {
				case 1:
					text.setText(text.getText() + " Left");
					break;
				case 2:
					text.setText(text.getText() + " Middle");
					break;
				case 3:
					text.setText(text.getText() + " Right");
					break;
				}
			}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new Task3();
	}
}
