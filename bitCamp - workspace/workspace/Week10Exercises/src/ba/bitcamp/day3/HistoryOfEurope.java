package ba.bitcamp.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class HistoryOfEurope {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		JFileChooser choose = new JFileChooser();
		choose.setCurrentDirectory(new File("/Users/boris.tomic/Documents/workspace/Week10Exercises"));
		int option = choose.showOpenDialog(choose);
		File file = choose.getSelectedFile();
		Scanner in = null;
		if (option == JFileChooser.APPROVE_OPTION) {
			try {
				in = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String line = null;
			StringTokenizer st = null;
			long start = System.currentTimeMillis();
			while (in.hasNext()) {
				line = in.nextLine();
				st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					list.add(st.nextToken());
				}
			}
			System.out.println("Time it took to read from file: " + (System.currentTimeMillis() - start) + " ms\n");

			LinkedList<Integer> nums = new LinkedList<Integer>();
			ListIterator<String> it = list.listIterator();
			Integer year = null;
			while (it.hasNext()) {
				try {
					year = Integer.parseInt(it.next());
					if (year < 2016) {
						nums.add(year);
					}
				} catch (NumberFormatException e) {
					
				}
			
			}
//			nums.sort(new Comparator<Integer>() {
//
//				@Override
//				public int compare(Integer o1, Integer o2) {
//					return o1 - o2;
//				}
//				
//			});
			
			LinkedList<Integer> set = new LinkedList<>();
			for (Integer integer : nums) {
				set.add(integer);
			}

			System.out.println("sorted years");
			System.out.println(set);
			System.out.println(set.size());
			

		}
		
	}


}
