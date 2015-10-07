package ba.bitcamp.twoservers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class HTTPServer {
	
	public static void main(String[] args) {
		
		ServerSocket http;
		try {
			http = new ServerSocket(8888);
			System.out.println("Server started.");
		
			while (true) {
				Socket client = http.accept();			
				
				BufferedWriter clientWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
		
				BufferedReader fileReader = null;
				String htmlDoc = "";
				boolean printIps = true;
				try {
					String fromClient = clientReader.readLine();
					String[] wantedAddress = fromClient.split(" ");
				
					String address = "index.html";
					
					if (wantedAddress[1].equals("/about.html")) {
						address = "about.html";
						printIps = false;
					}
					if (wantedAddress[1].equals("/classmates.html")) {
						address = "classmates.html";
						printIps = false;
					}
					
					fileReader = new BufferedReader(new FileReader(new File(address)));
					
				} catch (NullPointerException ex) {
					System.out.println("Neko zeza...");
					continue;
				}
				if (printIps) {
					while (fileReader.ready()) {
						htmlDoc += fileReader.readLine();
					}
				}
				
				BufferedReader fileRead = new BufferedReader(new FileReader("downloaded.txt"));
				while (fileRead.ready()) {
					htmlDoc += fileRead.readLine() + "<br>\n";
				}
				fileRead.close();
				
				htmlDoc += "</p></body></html>";
				clientWriter.write(htmlDoc);				
				clientWriter.close();
				client.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
