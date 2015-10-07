package ba.bitcamp.boris.exercises.day3.task5;

import ba.bitcamp.boris.exercises.day3.task1.Speakerphone;
import ba.bitcamp.boris.exercises.day3.task2.Battery;
import ba.bitcamp.boris.exercises.day3.task3.Antenna;
import ba.bitcamp.boris.exercises.day3.task4.Display;

public class Main {
	
	public static void main(String[] args) {
		
		Speakerphone s1 = new Speakerphone("Sony", 3, 22.99);
		//System.out.println(s1);
		
		Battery b1 = new Battery("Sony", 2);
		//System.out.println(b1);
		
		Antenna a1 = new Antenna ("Sony", 10);
		//System.out.println(a1);
		
		Display d1 = new Display("Sony", 18);
		//System.out.println(d1);
		
		CellPhone c1 = new CellPhone("Sony", a1, s1, d1, b1);
		
		b1.chargeBattery(25);
		a1.setSignalStrength(3);
		System.out.println(c1);
		
		System.out.println(c1.getHowMuchBatteryLast() + " hours.");
		d1.turnON();
		System.out.println(c1.getHowMuchBatteryLast() + " hours.");
		
		a1.setSignalStrength(0);
		System.out.println(c1.getHowMuchBatteryLast() + " hours.");
		
		s1.enable();
		System.out.println(c1.getHowMuchBatteryLast() + " hours.");
		
		s1.disable();
		d1.turnOFF();
		System.out.println(c1.getHowMuchBatteryLast() + " hours.");
		
		s1.enable();
		System.out.println(c1.getHowMuchBatteryLast() + " hours.");
		
		
		
	}

}
