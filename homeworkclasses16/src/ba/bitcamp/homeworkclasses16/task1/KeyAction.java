package ba.bitcamp.homeworkclasses16.task1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Class KeyAction extends KeyAdapter and uses only one method
 * keyPressed to check which key is pressed and to direct movement
 * of circle from Task1 class in every which way user inputed.  
 * 
 * @author boris
 *
 */
public class KeyAction extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Task1.x -= Task1.MOVE;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Task1.x += Task1.MOVE;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			Task1.y -= Task1.MOVE;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Task1.y += Task1.MOVE;
		}
	}

}
