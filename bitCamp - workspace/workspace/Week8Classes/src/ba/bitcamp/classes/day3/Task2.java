package ba.bitcamp.classes.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
		
		System.out.println(list.toString());
		
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			if (temp.length() == 4) {
				list2.add("****");
			}
			list2.add(temp);
		}
		System.out.println(list2.toString());

	}

}
