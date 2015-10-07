package ba.bitcamp.boris.classes.day5;

public class PlayGuesNumber {
	
	public static void main(String[] args) {
		
		PogodiBroj g1 = new PogodiBroj();
		PogodiBroj g2 = new PogodiBroj(200);
		PogodiBroj g3 = new PogodiBroj(100, 5);
		
		
		//System.out.println(g1.generateRandomNumber());
		//System.out.println(g2.generateRandomNumber());
		//System.out.println(g3.generateRandomNumber());
		
		
		//g1.playGame();
		//g2.playGame();
		g3.playGame();
		
	}

}
