package ba.bitcamp.homeworkweekend8.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task3 {

	public static void main(String[] args) {

			
		LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(2, 4, 3, 5, 2, 9, 2));
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println(nums);
		
		ListIterator<Integer> it = nums.listIterator();
		while (it.hasNext()) {
			int value = it.next();
			it.remove();
			value += it.next();
			list.add(value);
			it.remove();
		}
		
		System.out.println(list);
		System.out.println(nums);

	}

}
