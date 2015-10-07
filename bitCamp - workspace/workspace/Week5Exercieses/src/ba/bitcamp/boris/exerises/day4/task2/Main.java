package ba.bitcamp.boris.exerises.day4.task2;

public class Main {
	
	public static void main(String[] args) {
		
		Workstation w = new Workstation("Unix", 13000, 53000.99, 63200.200, 70000, 300, 17, 700, true);
		
		w.printTypeInfo();
		
		System.out.println();
		
		DesktopComputer d = new DesktopComputer("Windows 7", 3000, 1200.99, 3400.2, 600, 1, 0, true, true);
	
		
		d.printTypeInfo();

		System.out.println();
		
		Laptop l = new Laptop("Windows 10", 4000, 2999.99, 2400.15, 22, true, 2, true, true);
		
		
		l.printTypeInfo();

		System.out.println();
		
		PocketPC p = new PocketPC("Android", 1000, 999.99, 400.35, 8, true, true, false, true);
		
		p.printTypeInfo();
		
		System.out.println();
		
		PersonalComputer[] computers = new PersonalComputer[] {w, d, l, p};
		
		for (int i = 0; i < computers.length; i++) {
			System.out.println(computers[i]);
			
		}
		
		
		
	}

}
