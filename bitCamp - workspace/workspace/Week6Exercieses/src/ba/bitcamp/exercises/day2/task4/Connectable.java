package ba.bitcamp.exercises.day2.task4;

import ba.bitcamp.exercises.day2.task1.Computer;
import ba.bitcamp.exercises.day2.task2.Network;

public interface Connectable {
	
	
	void connect(Computer c);
	void connect(Network n);
	void disconnect();

}
