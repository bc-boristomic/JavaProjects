package ba.bitcamp.boris.exerises.day4.task2;


/**
 * Inherits PersonalComputer class, have three additional variables.
 * Can access superclass thru get and set methods.
 * 
 * @author boris.tomic
 *
 */
public abstract class PortableComputer extends PersonalComputer {
	
	
		
	private Double weight;
	private Integer displaySize;
	private Boolean hasWiFi;
	
	public PortableComputer(String osType,Integer memory, Double price, Double weight, Integer displaySize, Boolean hasWiFi) {
		super(osType, memory, price);
		this.weight = weight;
		this.displaySize = displaySize;
		this.hasWiFi = hasWiFi;
	}
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}
	public Boolean getHasWiFi() {
		return hasWiFi;
	}
	public void setHasWiFi(Boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Weight: " + getWeight());
		System.out.println("Display size: " + getDisplaySize());
		System.out.println("Does it have Wi-Fi: " + getHasWiFi());
	}

}
