package ba.bitcamp.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

	protected static final int PORT = 6815;

	protected static LinkedBlockingQueue<Client> clients = new LinkedBlockingQueue<>();
	private LinkedBlockingQueue<Message> messages = new LinkedBlockingQueue<>();
	private ExecutorService pool = Executors.newFixedThreadPool(8);

	private ServerSocket server;
	private Socket client;

	public Server() {
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());

		pool.submit(new Sender());
		pool.submit(new Sender());
		pool.submit(new Sender());

		try {
			server = new ServerSocket(PORT);
			for (;;) {
				client = server.accept();
				clients.add(new Client(client));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private class Listener implements Runnable {

		@Override
		public void run() {
			Client tempClient = null;
			try {
				tempClient = clients.take();
				clients.add(tempClient);

				BufferedReader reader = tempClient.getReader();

				StringBuilder sb = new StringBuilder();

				while (reader.ready()) {
					sb.append(reader.readLine());
					Message tempMessage = new Message(tempClient.getId(),
							sb.toString());
					Iterator<Client> it = clients.iterator();
					while (it.hasNext()) {
						it.next().addMessage(tempMessage);
					}
					
					messages.add(tempMessage);
				}

			} catch (InterruptedException | IOException e) {
				clients.remove();
				e.printStackTrace();
			}
			pool.execute(this);
		}
	}

	private class Sender implements Runnable {

		@Override
		public void run() {
			try {
//				Message msgToSend = messages.take();
//
//				Client[] copyOfClients;
//				synchronized (clients) {
//					copyOfClients = new Client[clients.size()];
//					for (int i = 0; i < copyOfClients.length; i++) {
//						copyOfClients[i] = clients.take();
//						clients.add(copyOfClients[i]);
//					}
//				}
//
//				for (int i = 0; i < copyOfClients.length; i++) {
//					BufferedWriter writer = copyOfClients[i].getWriter();
//					writer.write(msgToSend.getMessage());
//					writer.newLine();
//					writer.flush();
//				}

				Client tempClient = clients.take();
				clients.add(tempClient);
				tempClient.sendMessage();
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pool.execute(this);
		}
	}

	public static void main(String[] args) {
		new Server();
	}

}
