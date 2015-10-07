package ba.bitcamp.boris.exerises.day4.task2;


/**
 * Inherits PersonalComputer class, have three additional variables.
 * Can access superclass thru get and set methods. 
 * 
 * @author boris.tomic
 *
 */
public abstract class StationaryComputer extends PersonalComputer {
	

	
	private Double processingPower;
	private Integer psu;
	private Integer hdd;
	
	public StationaryComputer(String osType, Integer memory, Double price, Double processingPower, Integer psu, Integer hdd) {
		super(osType, memory, price);
		this.processingPower = processingPower;
		this.psu = psu;
		this.hdd = hdd;
	}
	
	
	public Double getProcessingPower() {
		return processingPower;
	}
	public void setProcessingPower(Double processingPower) {
		this.processingPower = processingPower;
	}
	public Integer getPsu() {
		return psu;
	}
	public void setPsu(Integer psu) {
		this.psu = psu;
	}
	public Integer getHdd() {
		return hdd;
	}
	public void setHdd(Integer hdd) {
		this.hdd = hdd;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Processing power: " + getProcessingPower());
		System.out.println("PSU: " + getPsu());
		System.out.println("HDD: " + getHdd());
	}
	
	

}
