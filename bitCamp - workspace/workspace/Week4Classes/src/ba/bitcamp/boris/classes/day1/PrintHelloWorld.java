package ba.bitcamp.boris.classes.day1;

public class PrintHelloWorld {
	
	public static void main(String[] args) {
	
//		sayHello();
//		sayHello("Name");
		if (args.length == 0) {
			System.out.println("Enter string to use code.");
		} else {
			for (int i = 0; i < args.length; i++) {
				String name = args[i];
				sayHello(name);
			}
			
			for (String name : args) { // Za svaki element (string) iz niza arguments.
				sayHello(name);	// Korisna za ispisivanje svakog elementa.
			}
		}
		
	}
	
	/**
	 * Prints hello world to the screen.
	 *<p>
	 * Sends string "Hello world." to the <b>standard output</b>.
	 */
	public static void sayHello () {
		System.out.println("Hello world.");
	}
	
	/**
	 * Greets a user by name.
	 * 
	 * @param name Name of a user to greet.
	 */
	public static void sayHello (String name) {
		System.out.printf("Hello %s.\n", name);
	}

}
