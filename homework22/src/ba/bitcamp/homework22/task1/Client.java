package ba.bitcamp.homework22.task1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Class Client represents client that is connecting to a localhost server.
 * Client sends data in form of name, followed by new message with value of
 * address. Data is inputed via <tt>Scanner</tt>.
 * 
 * @author boris
 *
 */
public class Client {

	private static final String HOST = "127.0.0.1";

	public static void main(String[] args) {

		try {
			Socket connectTo = new Socket(HOST, Server.PORT);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					connectTo.getOutputStream()));
			Scanner input = new Scanner(System.in);

			while (true) {
				System.out.println("Write your message");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
