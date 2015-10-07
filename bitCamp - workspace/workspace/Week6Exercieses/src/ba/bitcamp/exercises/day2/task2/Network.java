package ba.bitcamp.exercises.day2.task2;

import ba.bitcamp.exercises.day2.task1.Computer;

public abstract class Network {
	
	private String name;
	private Computer[] computers;
	
	public Network(){
		computers = new Computer[0];
	}
	
	public abstract void addComputer(Computer c);
	
	public abstract void removeComputer(Computer c);

	public Computer[] getComputers() {
		return computers;
	}

	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}
	

	
}
