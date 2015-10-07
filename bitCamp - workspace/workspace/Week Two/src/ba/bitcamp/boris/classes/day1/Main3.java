package ba.bitcamp.boris.classes.day1;

public class Main3 {
	public static void main (String []args){
		
		double kilometara = 42000;
		double mPret = 1;
		
		do {
			mPret += Math.random();
			System.out.println(mPret);
		} while (mPret < kilometara); 
		mPret ++;
		
		
	}
}
