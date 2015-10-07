package ba.bitcamp.exercises.day2.task3;

import ba.bitcamp.exercises.day2.task1.Computer;

public class Server extends Computer {
	
	private int maxComputers;	
	
	
	public Server(String name, char[] mac, int maxComputers){
		super(name, mac);
		this.maxComputers = maxComputers;
		
	}
	
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
	
	@Override
	public String toString() {
		return String.format("Server name: %s, Server address: %s, Server max capacity %d", getName(), getMacAddress(), maxComputers);
	}
	

}
