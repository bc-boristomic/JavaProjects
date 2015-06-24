package ba.bitcamp.homework17.task2;

import ba.bitcamp.homework17.task1.Client;
import ba.bitcamp.homework17.task1.Computer;
import ba.bitcamp.homework17.task1.Network;

public class BusNetwork extends Network implements Functionable {

	
	public BusNetwork(String name) {
		super(name);
	}

	/**
	 * Checks if there are two computer connected to network.
	 */
	@Override
	public boolean isFunctioning() {
		int counter = 0;
		for (int i = 0; i < getComputers().length; i++) {
			if (getComputers()[i] instanceof Client) {
				Client comp = (Client) getComputers()[i];
				if(getComputers() != null) {
				counter++;
			}
			}
		}
		if (counter >= 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Adds a Client computer to network and connects it to BusNetwork.
	 * 
	 * @param c Computer Client
	 * @throws ClassCastException
	 */
	@Override
	public void addComputer(Computer c) {
		ArrayManipulation.extendArray(getComputers());
		getComputers()[getComputers().length - 1] = c;
		if (c instanceof Client) {
			Client comp = (Client) c;
			comp.connect(this);
		} else {
			throw new ClassCastException("Can't cast");
		}
	}

	/**
	 * Removes Client computer from network and disconnects it.
	 * 
	 * @param c Computer Client
	 * @throws UnsupportedOperationException
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

}
