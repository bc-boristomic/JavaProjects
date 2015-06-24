package ba.bitcamp.homework17.task1;

public class Server extends Computer {
	
private int maxComputers;	
	
	/**
	 * Constructor of Server class.
	 * 
	 * @param name <code>String</code> type Server name
	 * @param mac <code>char[]</code> type MAC address
	 * @param maxComputers <code>int</code> type maximum computers server can have
	 */
	public Server(String name, char[] mac, int maxComputers){
		super(name, mac);
		this.maxComputers = maxComputers;
		
	}
	
	/**
	 * Returns maximum computer server can have.
	 * 
	 * @return <code>int</code> type value
	 */
	public int getMaxComputers() {
		return maxComputers;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Server other = (Server) obj;
		if (maxComputers != other.maxComputers)
			return false;
		return true;
	}
	
	/**
	 * toString method of Server class.
	 */
	public String toString() {
		return String.format("Server name: %s, Server address: %s, Server max capacity %d", getName(), getMacAddress(), maxComputers);
	}

}
