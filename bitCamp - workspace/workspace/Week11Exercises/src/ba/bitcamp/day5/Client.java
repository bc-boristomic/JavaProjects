package ba.bitcamp.day5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	private static BufferedWriter writer;

	public static void main(String[] args) {

		try {
			Socket connectTo = new Socket("localhost", 8000);
			writer = new BufferedWriter(new OutputStreamWriter(
					connectTo.getOutputStream()));

			new ClientGUI();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void action(String message) {
		try {
			writer.write(message);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
