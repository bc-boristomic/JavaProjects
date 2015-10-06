package ba.bitcamp.homeworkweekend10.task4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Class Server recieves a file from client and disconnects.
 * 
 * @author boris
 *
 */
public class Server {

	protected static final int PORT = 8000;
	private String filename = "";

	public Server() {
		Random rand = new Random();
		filename += rand.nextInt(100000);
	}

	public String getFilename() {
		return filename;
	}

	public void runServer() {
		try {
			ServerSocket server = new ServerSocket(PORT);
			Socket client = server.accept();

			InputStream is = client.getInputStream();
			FileOutputStream writeFile = new FileOutputStream("src/"
					+ getFilename() + ".jpg");

			byte[] buffer = new byte[1024];
			int readSoFar;
			while ((readSoFar = is.read(buffer, 0, buffer.length)) > 0) {
				writeFile.write(buffer, 0, readSoFar);
			}
			is.close();
			writeFile.close();
			client.close();
			server.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
