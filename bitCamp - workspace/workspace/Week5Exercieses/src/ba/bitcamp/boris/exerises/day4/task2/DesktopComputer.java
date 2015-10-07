package ba.bitcamp.boris.exerises.day4.task2;

/**
 * Inherits StationaryComputer class, have three additional variables. Can
 * access superclass thru get and set methods.
 * 
 * @author boris.tomic
 *
 */
public class DesktopComputer extends StationaryComputer {


	private Integer freeSpaceForRAM;
	private Boolean isOveerclocked;
	private Boolean hasDVD;

	public DesktopComputer(String osType, Integer memory, Double price,
			Double processingPower, Integer psu, Integer hdd, Integer freeSpaceForRAM, Boolean isOverclocked, Boolean hasDVD) {
		super(osType, memory, price, processingPower, psu, hdd);
		this.freeSpaceForRAM = freeSpaceForRAM;
		this.isOveerclocked = isOverclocked;
		this.hasDVD = hasDVD;
	}

	public Integer getFreeSpaceForRAM() {
		return freeSpaceForRAM;
	}

	public void setFreeSpaceForRAM(Integer freeSpaceForRAM) {
		this.freeSpaceForRAM = freeSpaceForRAM;
	}

	public Boolean getIsOveerclocked() {
		return isOveerclocked;
	}

	public void setIsOveerclocked(Boolean isOveerclocked) {
		this.isOveerclocked = isOveerclocked;
	}

	public Boolean getHasDVD() {
		return hasDVD;
	}

	public void setHasDVD(Boolean hasDVD) {
		this.hasDVD = hasDVD;
	}

	public void printTypeInfo() {
		super.printInfo();
		System.out.println("How much is there space for RAM: " + getFreeSpaceForRAM());
		System.out.println("Is it overclocked: " + getIsOveerclocked());
		System.out.println("Does it have DVD " + getHasDVD());

	}
	
	

}
