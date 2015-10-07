package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {

	private static ServerSocket server;
	private static String website = "";
	private static String css = "";

	private static void loadWebsite() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new FileReader(
							"/Users/boris.tomic/Desktop/web day4 ex/index.html"));
		} catch (FileNotFoundException e) {
			System.out.println("Could not read from file.");
			System.out.println("Message " + e.getMessage());
			System.exit(1);
		}

		try {
			while (reader.ready()) {
				website += reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Could not read lines from file.");
			System.out.println("Message " + e.getMessage());
			System.exit(1);
		}

		try {
			reader.close();
		} catch (IOException e) {
			System.out.println("Could not close reader.");
			System.out.println("Message: " + e.getMessage());
		}
	}
	
	private static void sendCss() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new FileReader(
							"/Users/boris.tomic/Desktop/web day4 ex/main.css"));
		} catch (FileNotFoundException e) {
			System.out.println("Could not read from file.");
			System.out.println("Message " + e.getMessage());
			System.exit(1);
		}

		try {
			while (reader.ready()) {
				css += reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Could not read lines from file.");
			System.out.println("Message " + e.getMessage());
			System.exit(1);
		}

		try {
			reader.close();
		} catch (IOException e) {
			System.out.println("Could not close reader.");
			System.out.println("Message: " + e.getMessage());
		}
	}

	private static void startServer() {
		try {
			server = new ServerSocket(8000);
			System.out.println("Server started");
		} catch (IOException e) {
			System.out.println("Server could not start.");
			System.out.println("Message: " + e.getMessage());
			System.exit(1);
		}
	}

	private static void findClients() {
		try {
			Socket client = server.accept();
			System.out.println("Client accepted");
			new ClientThread(client);
		} catch (IOException e) {
			System.err.println("Could not accept client");
			System.out.println("Message: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		loadWebsite();
		sendCss();
		startServer();
		for (;;) {
			findClients();
		}

	}

	private static class ClientThread extends Thread {

		private Socket client;
		private BufferedWriter writer;
		private BufferedReader reader;

		public ClientThread(Socket client) {
			this.client = client;
			try {
				writer = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
				reader = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
			} catch (IOException e) {
				System.out
						.println("Could not open writer to client output stream");
				System.out.println("Message: " + e.getMessage());
				return;
			}
			start();
		}

		@Override
		public void run() {
			try {
				String msg = reader.readLine();
				System.out.println("Message from client " + msg);
				
				if (msg.split(" ")[1].equals("/main.css")) {
					writer.write(css);
					System.out.println(css);
				} else if (msg.split(" ")[1].equals("/")) {
					writer.write(website);
				}
				writer.newLine();
				writer.flush();
				writer.close();
				client.close();
			} catch (IOException e) {
				System.out.println("Could not close writer or client.");
				System.out.println("Message: " + e.getMessage());
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	
	}

}
