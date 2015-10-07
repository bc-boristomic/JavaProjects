package ba.bitcamp.day4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	//10.0.82.105
	
	public static void main(String[] args) {
		
		try {
			Socket connect = new Socket("10.0.82.98", 8000);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connect.getOutputStream()));
			
			Scanner in =  new Scanner(System.in);
			for (;;) {
				System.out.println("write something");
				String line = in.nextLine();
				writer.write(line);
				writer.newLine();
				writer.flush();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
