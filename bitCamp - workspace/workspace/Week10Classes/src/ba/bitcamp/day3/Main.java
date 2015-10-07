package ba.bitcamp.day3;

import java.io.File;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		//JFileChooser choose = new JFileChooser("/Users/home");
		//System.out.println(System.getProperties());
		//System.out.println(System.getProperty("user.home"));
		//choose.showSaveDialog(choose);
		//choose.getSelectedFile();
		
		
		File dir = new File(System.getProperty("user.home"));

		if (dir.exists()) {
			if (dir.isDirectory()) {
				System.out.println(Arrays.toString(dir.listFiles()));
				System.out.println(Arrays.toString(dir.list()));
			}
		}
		
		
		System.out.println(dir.getFreeSpace());
		System.out.println(dir.getTotalSpace());
		System.out.println(dir.getParent());
		
		File usr = new File("/Users");
		System.out.println(usr.getParent());
		
		
	}

}
