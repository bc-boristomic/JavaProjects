package ba.bitcamp.ring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(2905);
			//Socket socket = new Socket("10.0.82.33", 9990);
			Socket socket = new Socket("10.0.82.54", 9393);
			Socket hajrudin = server.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(hajrudin.getInputStream()));
			String s = br.readLine();
			System.out.println(s);
			
			
			
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writer.write(s);
			writer.newLine();
			writer.flush();
			writer.close();
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
