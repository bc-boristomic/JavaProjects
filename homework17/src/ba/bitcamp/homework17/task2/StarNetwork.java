package ba.bitcamp.homework17.task2;

import ba.bitcamp.homework17.task1.Client;
import ba.bitcamp.homework17.task1.Computer;
import ba.bitcamp.homework17.task1.Network;
import ba.bitcamp.homework17.task1.Server;

public class StarNetwork extends Network implements Functionable {
	
	private Server server;
	
	public StarNetwork(String name, Server server) {
		super(name);
		this.server = server;
	}
	
	/**
	 * Adds computer to StarNetwork.
	 */
	@Override
	public void addComputer(Computer c) {
		if (c instanceof Client) {
			Client comp = (Client) c;
			ArrayManipulation.extendArray(getComputers());
			((Client) comp).connect(server);
		} else {
			throw new ClassCastException("Cant' add server");
		}
	}
	
	/**
	 * Removes computer from StarNetwork.
	 */
	@Override
	public void removeComputer(Computer c) {
		if (c instanceof Client) {
			Client comp = (Client) c;
			for (int i = 0; i < getComputers().length; i++) {
				if (c.equals(getComputers()[i])){
					ArrayManipulation.shrinkArray(getComputers(), i);
					comp.disconnect();
					return;
				} else {
					throw new UnsupportedOperationException("No computer");
				}
			}
		} else {
			throw new UnsupportedOperationException("No computer.");
		}
	}
	
	/**
	 * Checks if StarNetwork is functioning, can't have more computes
	 * then servers can hold.
	 */
	@Override
	public boolean isFunctioning() {
		int counter = 0;
		for (int i = 0; i < getComputers().length; i++) {
			if( getComputers()[i] instanceof Client) {
				Client comp = (Client) getComputers()[i];
				if (comp.getNetwork() != null) {
					counter++;
				}
			}
		}
		if (counter > server.getMaxComputers()) {
			return false;
		} else {
			return true;
		}
	}

}
