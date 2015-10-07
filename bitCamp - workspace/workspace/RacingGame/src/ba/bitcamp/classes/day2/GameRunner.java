package ba.bitcamp.classes.day2;

import javax.swing.JFrame;

public class GameRunner {
	
	public static void main(String[] args) {
		
		RacingGame racingGame = new RacingGame(600, 400);
		JFrame window = new JFrame("Racing Game");
		window.setSize(600, 400);
		window.setLocationRelativeTo(null);;
		window.setResizable(false);
		window.setContentPane(racingGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
