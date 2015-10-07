public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Zadatak 1
		 
		/*char character1 = 'B';
		char character2 = 'o';
		char character3 = 'r';
		char character4 = 'i';
		char character5 = 's';
		String s = "" + character1 + character2 + character3 + character4 + character5;

		System.out.printf("Moje ime je \n" + s);
		
		System.out.println(s);
		*/
		
		/* Zadatak 2
		// 3 varijable tacne (vrijednost 1) da ispisu 100% bodova
		// 3 correct variables (with value 1 or 0), print out their value in %
		
		byte task1 = 1;
		byte task2 = 1;
		float task3 = 0;

		System.out.println ("Ukupan rezultat " + (task1 + task2 + task3)/3*100 + "%");
		
		// or like this
		
		byte t1 = 1;
		byte t2 = 0;
		byte t3 = 0;
		double f= (float)(t1 + t2 + t3)/3*100; //TODO
		System.out.println(f);
		*/
		
		/*
		 * int num1 = 1;
		num1++;
		System.out.println(num1++);	// never write like this
		System.out.println(num1);
		
		int a = 2;
		int b = (a++) + (++a);	// never use this
		System.out.println(b);
		*/
	
		/*/ calculate cylinder area and volume
		int h = 4;
		int R = 6;
		int r = R / 2;
		double p1 = 3.14;
				
		double P = 2 * r * r * p1 + 2 * r * h * p1;
		double v = r * r * p1 * h;
		
		System.out.printf("Povrsina valjka je %.1f \n" + "a, volumen je %.2f\n", + P, v);
		System.out.printf("R = %d", R);
		*/
		
		
		double voltage = 220;
		double ressistance = 1200;
		
		double I = voltage / ressistance;
		
		System.out.printf("I = %s [A]\n", + I);

		
		boolean survive = I > 0.1;
		
		System.out.printf("Moze li se prezivjeti %s %%\n", survive);
		
		
		int a = 2;
		double d = a;
		System.out.println(d);
	
		
		
		
	}

}
