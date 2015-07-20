package ba.bitcamp.homeworkclasses18.task1;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedListInt list = new LinkedListInt();
		
		
		list.add(0);
		list.add(2);
		list.add(-1);
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(1);
		list.add(-3);
		list.add(9);
		list.add(2);
		list.add(9);
		list.add(8);
		
		System.out.println(list.getLength());
		
		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println(list);
		
	}

}
