package ba.bitcamp.exercises.day2.task4;

import ba.bitcamp.exercises.day2.task1.Computer;
import ba.bitcamp.exercises.day2.task2.Network;

public class Client extends Computer implements Connectable {
	
	Computer computer;
	Network network;
	
	
	/**
	 * Constructor of Client class
	 * 
	 * @param name
	 * @param mac
	 */
	public Client(String name, char[] mac){
		super(name, mac);
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " " + "MAC: " + getMacAddress();
	}
	
	
	/**
	 * Connects computer
	 * 
	 * @param c Object computer
	 * @throws NullPointerException
	 */
	@Override
	public void connect(Computer c) {
		if (computer == null && network == null) {
			computer = c;
		} else {
			throw new NullPointerException("Can't connect");
		}
	}
	
	/**
	 * Connects network
	 * 
	 * @param n Object network
	 * @throws NullPointerException
	 */
	@Override
	public void connect(Network n) {
		if (computer == null && network == null){
			network = n;
		} else {
			throw new NullPointerException("Can't connect");
		}
	}
	
	/**
	 * Disconnect computer and network.
	 */
	@Override
	public void disconnect() {
		computer = null;
		network = null;
	}
	
	/**
	 * Checks if computer is connectable
	 * 
	 * @return <code>boolean</code> type value
	 */
	public boolean getConnectComputer(){
		if (computer != null) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if network is conectable
	 * 
	 * @return <code>boolean</code> type value
	 */
	public boolean getConnectNetwork(){
		if (network != null) {
			return true;
		} else {
			return false;
		}
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (computer == null) {
			if (other.computer != null)
				return false;
		} else if (!computer.equals(other.computer))
			return false;
		if (network == null) {
			if (other.network != null)
				return false;
		} else if (!network.equals(other.network))
			return false;
		return true;
	}
	
	
	

}
