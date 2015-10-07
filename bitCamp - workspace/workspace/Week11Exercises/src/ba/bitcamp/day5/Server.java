package ba.bitcamp.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			Socket client = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			ServerGUI window = new ServerGUI();

			while (client.isConnected()) {
				String msg = reader.readLine();
				window.action(msg);
			}
			// System.out.println(msg);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("client disconnected");
		}
	}
}
