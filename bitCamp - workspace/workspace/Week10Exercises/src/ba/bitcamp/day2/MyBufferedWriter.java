package ba.bitcamp.day2;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {

	private OutputStream buff;
	
	public MyBufferedWriter(OutputStream buff) {
		this.buff = buff;
	}
	
	public void write(char c) {
		try {
			buff.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(int n) {
		try {
			buff.write((byte) n);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String s) {
		try {
			buff.write(s.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(byte[] b) {
		try {
			buff.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			buff.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void newLine() {
		try {
			buff.write(13);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void flush() {
		try {
			buff.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MyBufferedWriter bw = new MyBufferedWriter(System.out);
		bw.write('a');
		bw.newLine();
		bw.write(97);
		bw.newLine();
		bw.write("ab3333333");
		
		bw.close();
		
		
	}
	

}
