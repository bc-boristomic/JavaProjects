package ba.bitcamp.homeworkweekend8.task4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();

		System.out.println("Enter amount of keys to add");
		int keys = in.nextInt();

		System.out.println("Enter number of elements each list will have");
		int size = in.nextInt();

		for (int i = 1; i <= keys; i++) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int j = 1; j <= size * i; j += i) {
				list.add(j);
			}
			map.put(i, list);
		}

		System.out.println(map);

		in.close();
	}

}
