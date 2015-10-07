package ba.bitcamp.exercises.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Planet earth = new Planet("Earth", 2002.1, Planet.EARTH_MASS, 170000.1);
		Planet mars = new Planet("Mars", 7015.8, Planet.EARTH_MASS * 2, 12050.1);
		Planet venera = new Planet("Venera", 4518.48, Planet.EARTH_MASS * 2.34, 50464.1);
		Planet mercur = new Planet("Mercur", 1548.1, Planet.EARTH_MASS * 1.845, 1843.4);
		
		ArrayList<Planet> planets = new ArrayList<>(Arrays.asList(earth, mars, venera, mercur));
		
		System.out.println(planets);
		planets.sort(null);
		System.out.println(planets);
		
		Planet.sortByDiameter(planets);
		System.out.println(planets);
		
		Planet.sortByMass(planets);
		System.out.println(planets);
		
		Planet.sortByDistance(planets);
		System.out.println(planets);
		
	}

}
