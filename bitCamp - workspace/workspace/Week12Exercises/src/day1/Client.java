package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		
		
		try {
			Socket connectTo = new Socket("10.0.82.106", 8000);
			FileInputStream is = new FileInputStream(new File("student.out"));
			OutputStream os = connectTo.getOutputStream();
			
			
			byte[] buffer = new byte[1024];
			int readSoFar;
			while ((readSoFar = is.read(buffer, 0, buffer.length)) > 0) {
				os.write(buffer, 0, readSoFar);
			}

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
