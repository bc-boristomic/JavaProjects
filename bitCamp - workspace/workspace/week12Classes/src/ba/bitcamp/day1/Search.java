package ba.bitcamp.day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Search {

	private String fileName;
	private String extension;
	private String searchTerm;

	private Queue<File> files;

	public Search(String searchString) throws IllegalArgumentException {
		String[] parts = searchString.split(" ", 2);
		if (parts.length < 2) {
			throw new IllegalArgumentException("Invalid search format");
		}
		searchTerm = parts[0];

		String[] fileInfo = parts[1].split("\\.");
		if (fileInfo.length < 2) {
			throw new IllegalArgumentException("Invalid search format");
		}
		fileName = fileInfo[0];
		extension = fileInfo[1];

		// to avoid filter errors
		if (fileName.equals("*")) {
			fileName = "";
		}
		if (extension.equals("*")) {
			extension = "";
		}

		files = new LinkedList<File>();

	}

	public void startSearch() {
		File root = new File(".");
		enqueueFiles(root);
//		Thread t1 = new SearchThread();
//		Thread t2 = new SearchThread();
//		t1.start();
//		t2.start();
		
		SearchThread[] st = new SearchThread[5];
		for (int i = 0; i < st.length; i++) {
			st[i] = new SearchThread();
			st[i].start();
		}


	}

	private synchronized void enqueueFiles(File root) {
		File[] files = root.listFiles(new Filter());
		for (int i = 0; i < files.length; i++) {
			this.files.add(files[i]);
		}
	}

	private class SearchThread extends Thread {

		@Override
		public void run() {
			while (true) {

				File f = null;
				synchronized (files) {
					if (files.isEmpty()) {
						return;
					} else {
						f = files.remove();
					}
				}

				if (f.isDirectory()) {
					enqueueFiles(f);
					continue;
				}
				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					while (br.ready()) {
						String line = br.readLine();
						if (line.contains(searchTerm)) {
							System.out.println(f.getName() + ": " + line);
						}
					}
				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {

				}
			}
		}

	}

	/**
	 * 
	 * 
	 * 
	 * @author boris.tomic
	 *
	 */
	private class Filter implements FileFilter {

		@Override
		public boolean accept(File pathname) {
			if (pathname.isDirectory()) {
				return true;
			}
			if (fileName.isEmpty() && extension.isEmpty()) {
				return true;
			}
			String file = fileName + "." + extension;
			return pathname.getName().contains(file);

			// if (!extension.isEmpty()) {
			// if (pathname.getAbsolutePath().endsWith(file)) {
			// return true;
			// }
			// } else {
			// if (fileName.isEmpty()) {
			// return true;
			// } else {
			// return pathname.getName().contains(file);
			// }
			// }
			// return false;

		}
	}

}
