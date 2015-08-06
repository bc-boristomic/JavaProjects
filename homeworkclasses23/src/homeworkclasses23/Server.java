package homeworkclasses23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Public class <tt>Server</tt> makes instance of <tt>BitResponse</tt> class
 * every time client get's connected. Reads random line from file.txt, set's
 * that line as message, set's current date as Date and send JSON string to
 * client via output stream. After witch Server closes connection to clients and
 * starts listening to another clients to connect.
 * 
 * @author boris
 *
 */
public class Server {

	protected static final int PORT = 8000;

	public static void main(String[] args) {

		Random rand = new Random();

		try {
			ServerSocket server = new ServerSocket(PORT);
			while (true) {
				Socket client = server.accept();

				OutputStream os = client.getOutputStream();

				BufferedReader fileReader = new BufferedReader(new FileReader(
						"src/file.txt"));
				ObjectMapper mapper = new ObjectMapper();

				String line = "";
				BitResponse br = new BitResponse();
				for (int i = 0; i < rand.nextInt(512) + 1; i++) {
					line = fileReader.readLine();
				}
				br.setMessage(line);
				br.setTimestamp(br.getTimestamp());

				mapper.writeValue(os, br);
				client.close();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
