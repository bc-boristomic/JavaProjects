package ba.bitcamp.day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	private static final String HOST = "localhost";
	private static final int PORT = EchoServer.ECHO_PORT;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Connecting to " + HOST + ":" + PORT);
			Socket client = new Socket(HOST, PORT);
			
			System.out.println("Connection established, sending request...");
			
			OutputStream rqStream = client.getOutputStream();
			InputStream respStream = client.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(respStream));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(rqStream));
			bw.write("Hello server\n");
			bw.flush();
			//bw.close();
			System.out.println("Request sent, waiting for response.");
			System.out.println(br.readLine());
			
			System.out.println("Finishing program");
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
