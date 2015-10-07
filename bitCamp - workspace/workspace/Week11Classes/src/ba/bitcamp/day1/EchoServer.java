package ba.bitcamp.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static final int ECHO_PORT = 12345;
	
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(ECHO_PORT);
			
			while (true) {
				System.out.println("Waiting for next request");
				Socket clientSocket = server.accept();
				System.out.println("Req accepted, waiting for response");
			
				InputStream is = clientSocket.getInputStream();
				OutputStream os = clientSocket.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				//br.readLine();
				
				OutputStreamWriter writer = new OutputStreamWriter(os);
				writer.write("OK");
				writer.write(br.readLine());
				writer.flush();
				System.out.println("Resp flushed, closing conn.");
				//os.close();
				clientSocket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			server.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
