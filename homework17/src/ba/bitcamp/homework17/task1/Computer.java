package ba.bitcamp.homework17.task1;

public abstract class Computer {
	
	private String name;
	private MACAddress macAddress;;
	
	/**
	 * Constructor of abstract Computer class.
	 * 
	 * @param name <code>String</code> type name
	 * @param macAddress <code>char[]</code> type MAC address, only numbers and characters
	 */
	public Computer(String name, char[] macAddress) {
		this.name = name;
		this.macAddress = new MACAddress(macAddress);
	}
	
	/**
	 * Default constructor, sets computer name to "Computer"
	 * and MAC Address to null.
	 */
	public Computer(){
		name = "Computer";
		macAddress = null;
	}
	
	/**
	 * Name of computer.
	 *  
	 * @return <code>String</code> type
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Returns MAC Address
	 * 
	 * @return MACAddress object
	 */
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
		
		
		/**
		 * MAC Address without : in it.
		 * 
		 * @return <code>String</code>
		 */
		public String getCleanAddress() {
			String s = "";
			for (int i = 0; i < address.length; i++) {
				s += address[i];
			}
			s = s.replace(":", "");
			return s;
		}
		
	
		/**
		 * toString method, adds : between every two characters
		 * 
		 * @return <code>String</code>
		 */
		public String toString() {
			String s = "";
			for (int i = 0; i < address.length; i++) {
				s += address[i];
				if (i % 2 == 1 && i != 0 && i != address.length-1) {
					s += ":";
				}
			}
			return s;
		
		}
		
	}

}
