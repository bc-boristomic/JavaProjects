package ba.bitcamp.exercieses.day1.task1;

public class Main {
	
	public static void main(String[] args) {
		
		Line l = new Line(3);
		l.drawOnConsole();
		System.out.println(l);
		
		
		System.out.println();
		
		Rectangle r = new Rectangle(3, 5);
		r.drawOnConsole();
		System.out.println(r);
		
		Drawable[] d = new Drawable[50];
		
		for (int i = 0, j = 0; i < d.length; i++, j++) {
			d[i] = new Line((int)(Math.random()*5+1));
			d[j] = new Rectangle((int)(Math.random()*5+1), (int)(Math.random()*5+1));
		}
		
		for (int i = 0, j = 0; i < d.length; i++, j++) {
			d[i].drawOnConsole();
			System.out.println();
			d[j].drawOnConsole();
			//System.out.println();
		}
		
		
	}

}
