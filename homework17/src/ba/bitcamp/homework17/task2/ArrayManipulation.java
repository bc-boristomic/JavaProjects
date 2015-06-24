package ba.bitcamp.homework17.task2;

import ba.bitcamp.homework17.task1.Computer;

public class ArrayManipulation {
	
	/**
	 * Extends array by one
	 * 
	 * @param c Computer array
	 */
	public static void extendArray(Computer[] c) {
		Computer[] com = new Computer [c.length + 1];
		for (int i = 0; i < com.length; i++) {
			com[i] = c[i];
		}
		c = com;
	}
	
	/**
	 * Shrinks array and at given index creates null
	 * 
	 * @param c Computer array
	 * @param index <code>int</code> type index of array
	 */
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
