package ba.bitcamp.boris.exerises.day4.task2;

public abstract class PersonalComputer {

	protected String osType;
	protected Integer memory;
	protected Double price;
	//private PersonalComputer[] pc;
	
	public PersonalComputer (String osType, Integer memory, Double price) {
		this.osType = osType;
		this.memory = memory;
		this.price = price;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String toString() {
		String s = "";
		s += "OS: " + osType + "\t Memory: " + memory + "\t Price: " + price; 
		return s;
	}
	
	public void printInfo() {
		System.out.println("OS: " + getOsType());
		System.out.println("Memory: " + getMemory());
		System.out.println("Price: " + getPrice());
	}

	

}
