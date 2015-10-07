package ba.bitcamp.boris.exercises.day4.task1;

public class Building {
	
	public String location;
	public Integer population;
	public Integer area;
	
	public double getPopulationDensity() {
		return (double) population / area;
	}
	
	

}
