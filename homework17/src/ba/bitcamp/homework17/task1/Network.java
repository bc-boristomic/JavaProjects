package ba.bitcamp.homework17.task1;

public abstract class Network {
	
	private String name;
	private Computer[] computers;
	
	/**
	 * Constructor of Network class, sets computers array at 0 length.
	 * Sets default name to Network.
	 */
	public Network(String name){
		this.name = name;
		computers = new Computer[0];
	}
	
	/**
	 * Abstract method, must be implemented in case of inheritance.
	 * Adds a computer.
	 * 
	 * @param c Computer
	 */
	public abstract void addComputer(Computer c);
	
	/**
	 * Abstract method, must be implemented in case of inheritance.
	 * Removes a computer.
	 * 
	 * @param c Computer
	 */
	public abstract void removeComputer(Computer c);

	/**
	 * Returns array of computers.
	 * 
	 * @return Computers array
	 */
	public Computer[] getComputers() {
		return computers;
	}

	/**
	 * Sets computers.
	 * 
	 * @param computers array
	 */
	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}

}
