package ba.bitcamp.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {

	private InputStream buff;

	public MyBufferedReader(InputStream in) {
		this.buff = in;
	}

	public int read() {
		try {
			return buff.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public String readLine() {
		String s = "";
		try {
			while (buff.available() > 0) {
				s += (char) (read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

	public static void main(String[] args) {

		MyBufferedReader br = new MyBufferedReader(System.in);
		MyBufferedWriter bw = new MyBufferedWriter(System.out);

		try {
			MyBufferedReader file = new MyBufferedReader(new FileInputStream("file.txt"));
			MyBufferedWriter fil = new MyBufferedWriter(new FileOutputStream("fil.txt"));
			fil.write(br.read());
			//bw.write(file.readLine());		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//bw.write(br.read());
		//bw.write(br.readLine());
		
		bw.flush();

	}

	/*
	 * readLine(), read(char[]), read(char[], int, int), close() i
	 * 
	 * ready().
	 */

}
