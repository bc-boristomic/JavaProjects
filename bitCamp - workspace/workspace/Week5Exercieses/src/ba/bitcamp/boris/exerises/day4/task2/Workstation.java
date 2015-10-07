package ba.bitcamp.boris.exerises.day4.task2;


/**
 * Inherits StationaryComputer class, have three additional variables.
 * Can access superclass thru get and set methods.
 * 
 * @author boris.tomic
 *
 */
public class Workstation extends StationaryComputer {
	
	

	private Integer numberOfDisplays;
	private Integer numberOfProcessors;
	private Boolean hasEEC;
	
	public Workstation(String osType, Integer memory, Double price,
			Double processingPower, Integer psu, Integer hdd, Integer numberOfDisplays, Integer numberOfProcessors, Boolean hasEEC) {
		super(osType, memory, price, processingPower, psu, hdd);
		this.numberOfDisplays = numberOfDisplays;
		this.numberOfProcessors = numberOfProcessors;
		this.hasEEC = hasEEC;
	}

	
	public Integer getNumberOfDisplays() {
		return numberOfDisplays;
	}
	public void setNumberOfDisplays(Integer numberOfDisplays) {
		this.numberOfDisplays = numberOfDisplays;
	}
	public Integer getNumberOfProcessors() {
		return numberOfProcessors;
	}
	public void setNumberOfProcessors(Integer numberOfProcessors) {
		this.numberOfProcessors = numberOfProcessors;
	}
	public Boolean getHasEEC() {
		return hasEEC;
	}
	public void setHasEEC(Boolean hasEEC) {
		this.hasEEC = hasEEC;
	}
	
	
	public void printTypeInfo() {
		super.printInfo();		
		System.out.println("Number of Displays: " + getNumberOfDisplays());
		System.out.println("Number of processors: " + getNumberOfProcessors());
		System.out.println("Does it have EEC " + getHasEEC());

	}
	

	public String toString() {
		return numberOfDisplays + " " + numberOfProcessors + " " + hasEEC;
	}

}
