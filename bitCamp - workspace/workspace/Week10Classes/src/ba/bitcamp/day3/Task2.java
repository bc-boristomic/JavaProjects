package ba.bitcamp.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Task2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter filename");
		Scanner ask = new Scanner(System.in);
		File file = new File(ask.nextLine());
		TreeSet<String> set = new TreeSet<>();
		
		if (file.exists()) {
			if (file.isFile()) {
				Scanner read = null;
				try {
					read = new Scanner(new File("file.txt"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while (read.hasNext()) {
					set.add(read.nextLine());
				}
				System.out.println(set);
			}
		}
		
	}

}
