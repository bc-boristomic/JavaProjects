package ba.bitcamp.homeworkweekend10.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client sends request to check if certain file exist on server. If file exist
 * message received will be 1, if file is inexistent message received will be 0.
 * 
 * @author boris
 *
 */
public class Client {

	public static void main(String[] args) {

		try {
			Socket connectTo = new Socket("127.0.0.1", 8000);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connectTo.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					connectTo.getOutputStream()));

			Scanner input = new Scanner(System.in);

			while (true) {
				System.out.println("Write file path you want to chek if exist");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();

				System.out.println("Server response: " + reader.readLine());

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
