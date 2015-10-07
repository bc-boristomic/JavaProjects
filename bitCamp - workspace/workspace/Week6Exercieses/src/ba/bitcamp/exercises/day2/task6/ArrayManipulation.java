package ba.bitcamp.exercises.day2.task6;

import ba.bitcamp.exercises.day2.task1.Computer;

public class ArrayManipulation {
	
	
	
	public static void extendArray(Computer[] c) {
		Computer[] com = new Computer [c.length + 1];
		for (int i = 0; i < com.length; i++) {
			com[i] = c[i];
		}
		c = com;
	}
	
	
	public static void shrinkArray(Computer[] c, int index) {
		Computer[] com = new Computer [c.length - 1];
		for (int i = 0; i < index; i++) {
			com[i] = c[i];
		}
		for (int i = index+1; i < com.length; i++) {
			com[i] = c[i];
		}
		c = com;
	}

}
