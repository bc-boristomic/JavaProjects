package ba.bitcamp.homework22.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Public class Server opens a server at port 8888 that listens for client
 * input. It is known that input will be represented in string name, followed by
 * string address.
 * <p>
 * Address must be valid (valid address is address from BITCamp network :)) and
 * address can't be repeated.
 * <p>
 * All the data is saved in <tt>HashMap</tt>, then when client terminates their
 * program data from map is written into a file "forhttp.txt".
 * <p>
 * That data is then used to create web page with links and names.
 * 
 * @author boris
 *
 */
public class Server {

	protected static final int PORT = 8888;

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		LinkedList<String> addresses = new LinkedList<>();
		BufferedWriter fileWriter = null;

		try {
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Waiting for a client...");

			Socket client = server.accept();
			System.out.println("Client is connected");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			fileWriter = new BufferedWriter(new FileWriter("src/forhttp.txt"));

			String name = "";
			String link = "";

			while (client.isConnected()) {
				name = reader.readLine();
				link = reader.readLine();

				if (link.contains("10.0.82") && !map.containsValue(link)) {
					map.put(name, link);
					fileWriter.write(link + " " + name);
					fileWriter.newLine();
					fileWriter.flush();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
