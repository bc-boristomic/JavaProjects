package day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static final Integer PORT = -2000;
	private static Integer newPort;

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		try {
			// Securing server port is valid
			if (PORT < 1500) {
				if (newPort == null) {
					newPort = 0;
				}
				newPort = 1500;
				server = new ServerSocket(newPort);
				while (server.isClosed()) {
					newPort = 1500 + 10;
					server = new ServerSocket(newPort);
				}
			} else {
				server = new ServerSocket(PORT);
			}
			// Getting real Server port number
			if (server.getLocalPort() == PORT) {
				System.out.println("Server port passed, port is " + PORT);
			} else {
				System.out.println("Server port passed, port is " + newPort);
			}

			client = server.accept();
		} catch (IOException e) {

			e.printStackTrace();
		}

		OutputStream clientWriter = null;
		BufferedReader clientReader = null;
		FileInputStream fileReader = null;

		if (client.isConnected()) {
			try {
				clientWriter = client.getOutputStream();
				clientReader = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
			} catch (IOException e) {
				System.out.println("Can't get client IOStream");
				System.err.println("Error message: " + e.getMessage());
				System.exit(1);
			}
		} else {
			System.err.println("No client connection");
			System.exit(1);
		}

		System.out.println("IOStream to client opened");

		String getMessage = "";

		try {
			// while(clientReader.ready()) {
			getMessage = clientReader.readLine();
			// }
		} catch (IOException e) {
			System.out.println("There was problem with clientReader");
			System.err.println("Error message: " + e.getMessage());
		}

		System.out.println("Message " + getMessage);
		if (getMessage == null) {
			// sendErrorFileToClient(); // method that send error file detailing
			// where error occured
			System.out.println("message null");
		} else if (!getMessage.split(" ")[0].equals("GET")) {
			// sendErrorFileToClient(); // method that send error file detailing
			// where error occured
			System.out.println("message not /GET");
		}

		boolean goOn = false;
		if (getMessage.split(" ")[1].equals("/image.jpg")) {
			System.out.println("file");
			File fileToRead = new File(getMessage.split(" ")[1].split("/")[1]);

			if (!fileToRead.exists() || !fileToRead.isFile()
					|| !fileToRead.canRead()) {
				System.out
						.println("Seems like there was problem with your file");
				System.err.println("Does file exists: " + fileToRead.exists());
				System.err.println("Is file a file: " + fileToRead.isFile());
				System.err.println("Is file readable: " + fileToRead.canRead());
				System.err.println("Program terminated!");
				System.exit(1);
			}
			System.out.println("File is good");

			try {
				fileReader = new FileInputStream(fileToRead);
				goOn = true;
			} catch (FileNotFoundException e) {
				System.out.println("There was problem with your file");
				System.err.println("Error message: " + e.getMessage());
				System.exit(1);
			}

			System.out.println("Stream to file opened");
		}

		// Integer length = null;
		// try {
		// length = Integer.parseInt(getMessage.split(" ")[2]);
		// } catch (NumberFormatException e) {
		// System.out.println("Could not parse third part of string");
		// System.err.println("Error message: " + e.getMessage());
		// // sendErrorFileToClient(); // method that send error file detailing
		// // where error occured
		// System.exit(1);
		// }
		//
		// if (length < 50 || length == null) {
		// length = 1024;
		// } else if (length > 5000) {
		// length = 1024;
		// }

		if (goOn) {

			byte[] buffer = new byte[1024];
			int readBytes;

			try {
				while ((readBytes = fileReader.read(buffer, 0, buffer.length)) > 0) {
					clientWriter.write(buffer, 0, readBytes);
				}
				clientWriter.close();
			} catch (IOException e) {
				System.out.println("Problem with closing clientWriter");
				System.err.println("Error message: " + e.getMessage());
			}

		}

		try {
			client.close();
		} catch (IOException e) {
			System.out.println("Problem with closing client");
			System.err.println("Error message: " + e.getMessage());
		}

		try {
			server.close();
		} catch (IOException e) {
			System.out.println("Problem with closing server");
			System.err.println("Error message: " + e.getMessage());
		}

		System.out.println("END OF MAIN");
	}

}
