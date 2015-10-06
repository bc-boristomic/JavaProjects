package ba.bitcamp.homeworkweekend10.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server waits for client to send message about file to be checked, if file is
 * file and not directory, and if file exists, server will send message 1.
 * Otherwise server will send message 0.
 * 
 * @author boris
 *
 */
public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(8000);
			Socket client = server.accept();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			String fileName = "";

			while (client.isConnected()) {
				fileName = reader.readLine();
				System.out.println(fileName);

				File file = new File(fileName);
				if (file.exists() && file.isFile()) {
					writer.write("1");
				} else {
					writer.write("0");
				}
				writer.newLine();
				writer.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
