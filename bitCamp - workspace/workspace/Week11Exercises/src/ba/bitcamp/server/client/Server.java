package ba.bitcamp.server.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args) {

		try {
			System.out.println("{SERVER} Application started.");
			ServerSocket server = new ServerSocket(2905);
			System.out.println("Server socked made.");
			
			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("{SERVER} Client found.");
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("I/O awailable now.");
			
//			writer.write("Hello client");
//			writer.newLine();
//			writer.flush();
//			
//			System.out.println("Client: " + reader.readLine());
			
			Scanner input = new Scanner(System.in);
//			System.out.print("Msg: ");
//			writer.write(input.nextLine());
//			writer.flush();
			
			
			
			boolean end = false;
			while (!end) {
				System.out.print("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				System.out.println("Client: " + reader.readLine());
			}
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
