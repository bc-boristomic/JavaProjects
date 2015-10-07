package ba.bitcamp.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	private static final int PORT = 7321;
	
	

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(PORT);
			
			while (true) {
				Socket client = server.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				String line = "";
				String reqType = "";
				String reqRoute = "";
				
				while ((line = reader.readLine()) != null) {
					if (line.contains("GET") || line.contains("POST")) {
						String[] lines = line.split(" ");
						reqType = lines[0];
						reqRoute = lines[1];
						break;
					}
				}
				
				System.out.println("Sub page " + reqRoute);
				
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				try {
					String htmlContent = ba.bitcamp.day3.FileHandler.getContent(reqRoute);
					
					Result.ok(writer, htmlContent);
				} catch (FileNotFoundException e) {
					Result.notFound(writer);
				} catch (IOException e) {
					Result.serverError(writer);
				}
								
				client.close();
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
