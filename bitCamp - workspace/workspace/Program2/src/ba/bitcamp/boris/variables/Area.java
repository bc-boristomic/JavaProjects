package ba.bitcamp.boris.variables;

public class Area {

	public static void main(String[] args) {

		int pageLong = 5; //duza strana
		int pageShort = 2; //kraca strana
		int volume = 2 * (pageLong + pageShort); // obim 2(a+b)
		int area = pageLong * pageShort; // povrsina a*b
		
		System.out.println("Obim pravougaonika je " + volume + ".");
		System.out.println("Povrsina pravougaonika je " + area + ".");
		
		int circleRadius = 7; //radijus
		double circleArea = (circleRadius * circleRadius) * 3.14; // povrsina kruga 2r*pi
		double circleCircumference = (2 * 3.14 * circleRadius); // obim kruga 2*pi*r
		System.out.println("Povrsina kruga je " + circleArea);
		System.out.println("Obim kruga je " + circleCircumference);
		
		System.out.println(); // prazna linija
		
		double longNumber = 10.0 / 3;
		System.out.println("Long number " + longNumber);
		
		int num1 = 3, num2 = 4;
		System.out.printf("prvi broj je %d drugi broj je %d ", num1, num2);
		
	}

}
