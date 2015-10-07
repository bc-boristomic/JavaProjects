package ba.bitcamp.boris.exercises.day4.task1;

public class Jail extends Building {
	
	public Integer numberOfCells;
	public Integer numberOfFreeCells;
	public Integer securityLevel;
	public Boolean hasGym;
	
	public int getNumberOfOccupiedCells() {
		return numberOfCells -= numberOfFreeCells;
	}

}
