package ba.bitcamp.homeworkweekend10.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Class Client send a file to the server and disconnects.
 * 
 * @author boris
 *
 */
public class Client {

	private static final String HOST = "127.0.0.1";

	public static void main(String[] args) {

		try {
			Socket connectTo = new Socket(HOST, Server.PORT);
			OutputStream sendFile = connectTo.getOutputStream();
			FileInputStream readFile = new FileInputStream(
					"/home/boris/Desktop/image.jpg");

			byte[] buffer = new byte[1024];
			int readSoFar;
			while ((readSoFar = readFile.read(buffer, 0, buffer.length)) > 0) {
				sendFile.write(buffer, 0, readSoFar);
			}

			readFile.close();
			sendFile.close();
			connectTo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
