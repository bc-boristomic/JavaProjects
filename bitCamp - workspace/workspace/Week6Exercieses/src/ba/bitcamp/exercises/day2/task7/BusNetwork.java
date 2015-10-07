package ba.bitcamp.exercises.day2.task7;

import ba.bitcamp.exercises.day2.task1.Computer;
import ba.bitcamp.exercises.day2.task2.Network;
import ba.bitcamp.exercises.day2.task4.Client;
import ba.bitcamp.exercises.day2.task5.Functionable;
import ba.bitcamp.exercises.day2.task6.ArrayManipulation;

public class BusNetwork extends Network implements Functionable {

	
	@Override
	public boolean isFunctioning() {
		for (int i = 0; i < getComputers().length; i++) {
			if(getComputers() instanceof Client[]) {
				
			}
		}
		
		int counter = 0;
		Client[] comp = new Client[]{}; 
		for (int i = 0; i < getComputers().length; i++) {
			if (getComputers()[i] != null){
				
			}
		}
		return false;
	}

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
