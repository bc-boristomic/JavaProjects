package ba.bitcamp.boris.exercises.day4.task1;

public class Main {
	
	public static void main(String[] args) {
		
	Building b = new Building();
	b.area = 1000;
	b.location = "Hrasnicka cesta 17";
	b.population = 1000;
	
	University u = new University();
	u.name = "IUS";
	u.isItPublic = false;
	u.numberOfFaculties = 3;
	u.numberOfStaff = 200;
	u.area = 500;
	u.location = "Butmirska bb";
	u.population = 1200;

	Hospital h = new Hospital();
	h.area = 100;
	h.hasCTMachine = false;
	h.isItPublic = false;
	h.location = "Adresa 1";
	h.numberOfBeds = 10;
	h.numberOfSurgeons = 1;
	h.population = 50;
	
	Jail j = new Jail();
	j.area = 200;
	j.hasGym = true;
	j.location = "Adresa 2";
	j.numberOfCells = 12;
	j.numberOfFreeCells = 1;
	j.population = 30;
	j.securityLevel = 3;
	
	
	CorrectionalFacility c = new CorrectionalFacility();
	c.numberOfCells = 30;
	c.numberOfFreeCells = 7;
	System.out.println(c.getNumberOfOccupiedCells());
	System.out.println(u.getPopulationDensity());
	System.out.println(h.getPopulationDensity());
	System.out.println(j.getPopulationDensity());
	
	System.out.println(j.getNumberOfOccupiedCells());
	
	}
}
