package ba.bitcamp.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JFileChooser;

public class Main {

	private static void printByteArray(byte[] array) {
		for (byte b : array) {
			System.out.print((char) b);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// koriste niz byteova
		InputStream is = System.in;
		//OutputStream os = System.out;

		// koriste niz charova
		Reader r = new InputStreamReader(System.in);
		Writer w = new OutputStreamWriter(System.out);
		
//		InputStream is = null;
//		try {
//			is = new FileInputStream("file.txt"); // inputstream that reads from file
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
		OutputStream os = null;
		try {
			os = new FileOutputStream("file.txt", true);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return;
		}
		
		// prima objekt tipa reader
		BufferedReader br = new BufferedReader(r);
		// prima objekt tipa writer 
		BufferedWriter bw = new BufferedWriter(w);
		
		byte[] buffer = new byte[3];

		//String message = "Hello world";
		try {
			int read = 0;
			do {
				read = is.read(buffer);
				os.write(buffer, 0, read);
			} while (is.available() > 0);
			//buffer = message.getBytes();
			os.write(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Finished");

	}

}
