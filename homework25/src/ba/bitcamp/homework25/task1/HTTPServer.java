package ba.bitcamp.homework25.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {

	private static ServerSocket server;

	/**
	 * Setups a ServerSocket at port 8000.
	 */
	private static void setupServer() {
		try {
			server = new ServerSocket(8000);
		} catch (IOException e) {
			System.out.println("Server could not be established");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		}
	}

	/**
	 * Waits for client to connect, when client connects it's socket is sent to
	 * ClientThread for processing.
	 */
	private static void waitForClients() {
		try {
			Socket client = server.accept();
			new ClientThread(client);
		} catch (IOException e) {
			System.out.println("Client could not connect to server.");
			System.err.println("Error message: " + e.getMessage());
		}
	}

	/**
	 * Private inner class ClientThread extends Thread and is used to process
	 * every new client. Client socket is taken thru constructor so IO streams
	 * can be opened to communicate.
	 * 
	 * @author boris
	 *
	 */
	private static class ClientThread extends Thread {

		private BufferedReader reader;
		private BufferedWriter writer;
		private Socket socket;

		/**
		 * Default constructor of ClientThread class. Client socket is taken, IO
		 * streams are opened at provided socket and thread is started.
		 * 
		 * @param socket
		 *            <code>Socket</code> type value of client socket that
		 *            connected to server
		 */
		public ClientThread(Socket socket) {
			this.socket = socket;
			try {
				reader = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				writer = new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream()));
			} catch (IOException e) {
				System.out
						.println("Could not establish IO streams at provided client socket");
				System.err.println("Error message: " + e.getMessage());
			}
			start();
		}

		/**
		 * Method listens to client messages, if client want so read specific
		 * file, that file is sent as string.
		 */
		@Override
		public void run() {
			try {

				String get = reader.readLine();
				if (get != null) {
					String requestedFile = get.split(" ")[1];

					if (requestedFile.equals("/")) {
						writer.write(ReadFromResources.readFile("/index.html"));
					} else if (requestedFile.equals("/main.css")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					} else if (requestedFile.equals("/set.html")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					} else if (requestedFile.equals("/set.css")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					} else if (requestedFile.equals("/analysis.html")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					} else if (requestedFile.equals("/an.css")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					} else if (requestedFile.equals("/cast.html")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					} else if (requestedFile.equals("/cast.css")) {
						writer.write(ReadFromResources.readFile(requestedFile));
					}
				}

				writer.newLine();
				writer.flush();
			} catch (IOException e) {
				System.out.println("Could not send file to client");
				System.err.println("Error message: " + e.getMessage());
			}
			try {
				writer.close();
			} catch (IOException e) {
				System.out.println("Could not close output stream to client.");
				System.err.println("Error message: " + e.getMessage());
			}
			try {
				socket.close();
			} catch (IOException e) {
				System.out.println("Could not close client socket.");
				System.err.println("Error message: " + e.getMessage());
			}

		}
	}

	/**
	 * Method that starts the server.
	 * <p>
	 * First server is started, then infinite loop starts to listen for new
	 * clients.
	 * 
	 */
	public static void runServer() {
		setupServer();
		for (;;) {
			waitForClients();
		}
	}

}
