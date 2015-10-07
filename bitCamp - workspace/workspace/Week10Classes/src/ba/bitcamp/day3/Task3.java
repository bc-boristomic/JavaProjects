package ba.bitcamp.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task3 {
	
	public static void main(String[] args) {
		
//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (ClassNotFoundException | InstantiationException
//				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		TreeSet<String> set = new TreeSet<>();
		File file = null;
		JFileChooser choose = new JFileChooser(System.getProperty("usr.dir"));
		int option = choose.showOpenDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {
			file  = choose.getSelectedFile();
			if (file.exists()) {
				if (file.isFile()) {
					Scanner read = null;
					try {
						read = new Scanner(file);
					} catch (FileNotFoundException e) {
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

}
