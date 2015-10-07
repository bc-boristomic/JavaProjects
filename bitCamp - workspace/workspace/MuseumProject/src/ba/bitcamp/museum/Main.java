package ba.bitcamp.museum;

import java.util.Scanner;

import ba.bitcamp.museum.ExhibitDetails.ArtPeriod;
import ba.bitcamp.museum.HistoricArtifects.TimePeriod;

public class Main {
	
	public static void main(String[] args) {

		Museum m = new Museum();
		
		// Declaring and initializing exhibits
		Exhibit ex1 = new Exhibit("Painting One", "Less known painting");
		Exhibit ex2 = new Exhibit("Painting Two", "Famoous painting");
		Exhibit ex3 = new Exhibit("Painting Three", "Less known painting");
		Exhibit ex4 = new Exhibit("Painting Four", "Famous painting");
		Exhibit ex5 = new Exhibit("Cold Weapon", "simple weapon");
		Exhibit ex6 = new Exhibit("Machine", "Wery complex old machine");

		// Adding exhibits to Museum
		m.getExhibits().add(ex1);
		m.getExhibits().add(ex2);
		m.getExhibits().add(ex3);
		m.getExhibits().add(ex4);
		m.getExhibits().add(ex5);
		m.getExhibits().add(ex6);

		System.out.println("All exhibits in museum");
		System.out.println(m.getExhibits() + "\n\n");
		
		// Declaring and initializing exhibits details
		ExhibitDetails ed1 = new ExhibitDetails(ex1, "Less known painter", ArtPeriod.MODERN_ART);
		ExhibitDetails ed2 = new ExhibitDetails(ex3, "Less known painter", ArtPeriod.MODERN_ART);
		ExhibitDetails ed3 = new ExhibitDetails(ex2, "Famous old painter", ArtPeriod.RENAISSANCE);
		ExhibitDetails ed4 = new ExhibitDetails(ex4, "Famous painter", ArtPeriod.NEOCLASSIC);
		
		// Adding exhibit details to museum
		m.getDetails().add(ed1);
		m.getDetails().add(ed2);
		m.getDetails().add(ed3);
		m.getDetails().add(ed4);
		
		System.out.println("Details of exhibits");
		System.out.println(m.getDetails() + "\n\n");
		
		// Declaring and initializing historic artifacts
		HistoricArtifects ha1 = new HistoricArtifects(ex5, "Unknown blacksmith", ArtPeriod.RENAISSANCE, TimePeriod.MIDDLE_AGE);
		HistoricArtifects ha2 = new HistoricArtifects(ex6, "Known manufacturer", ArtPeriod.MODERN_ART, TimePeriod.MODERN_AGE);
		
		// Adding historic artifacts to museum
		m.getArtifects().add(ha1);
		m.getArtifects().add(ha2);
		
		System.out.println("Historic artifects in museum");
		System.out.println(m.getArtifects() + "\n\n");
		
		// Declaring and initializing employees
		Employee e1 = new Employee("John", "Doe", 4, 1200);
		Employee e2 = new Employee("Jane", "Ding", 2, 900);
		Employee e3 = new Employee("Jack", "Dee", 3, 1000);
		
		// Adding employees to museum
		m.getEmployees().add(e1);
		m.getEmployees().add(e2);
		m.getEmployees().add(e3);
		
		System.out.println("Employees working in museum");
		System.out.println(m.getEmployees() + "\n\n");
		
		m.getExhibits().sort(null); // Exhibits sorted by name
		System.out.println(m.getExhibits() + "\n\n");

		System.out.println("Enter string to check if it exist in list");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean b = false;
		for (int i = 0; i < m.getExhibits().size(); i++) {
			if (m.getExhibits().get(i).fitsSearch(s) == true) {
				b = true;
			}
		}
		System.out.println(b);
		in.close();
	}

}
