package ba.bitcamp.exercises.day2.task1;

public abstract class Computer {
	
	private String name;
	private MACAddress macAddress;;
	
	public Computer(String name, char[] macAddress) {
		this.name = name;
		this.macAddress = new MACAddress(macAddress);
	}
	
	public Computer(){
		name = "Computer";
		macAddress = null;
	}
	
	public String getName() {
		return name;
	}
	
	
	public MACAddress getMacAddress() {
		return macAddress;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (macAddress == null) {
			if (other.macAddress != null)
				return false;
		} else if (!macAddress.equals(other.macAddress))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	

	/**
	 * Nested class MACAddress
	 * 
	 * @author boris.tomic
	 *
	 */
	public class MACAddress {
		
		char[] address = new char[17];
		
		
		/**
		 * Constructor for nested MACAddress class
		 * 
		 * @param address
		 */
		public MACAddress(char[] address) {
			this.address = address;
		}
		
		public String getCleanAddress() {
			String s = "";
			for (int i = 0; i < address.length; i++) {
				s += address[i];
			}
			s = s.replace(":", "");
			return s;
		}
		
	
		@Override
		public String toString() {
			return String.format("MAC: %s", getCleanAddress());
		}
		
	}
	
}
