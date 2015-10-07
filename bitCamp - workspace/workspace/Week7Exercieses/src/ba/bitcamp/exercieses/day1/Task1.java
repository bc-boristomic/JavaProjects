package ba.bitcamp.exercieses.day1;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * When mouse is clicked on JLabel, text is changed along with font.
 * 
 * @author boris.tomic
 *
 */
public class Task1 extends JFrame {
	private static final long serialVersionUID = -1562501436859753729L;
	
	private JLabel text = new JLabel("Not clicked...");
	private Font f = new Font("Monospaced", Font.BOLD, 22);
	
	public Task1(){
		text.setHorizontalAlignment(NORMAL);
		add(text);
		text.addMouseListener(new Mouse());
		setTitle("Task 1");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == text) {
				text.setFont(f);
				text.setText("It is clicked!");
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
		
		new Task1();
		
	}
}
