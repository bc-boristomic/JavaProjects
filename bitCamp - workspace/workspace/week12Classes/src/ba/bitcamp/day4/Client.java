package ba.bitcamp.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {

	private Socket socket;
	private String id;
	private BufferedReader reader;
	private BufferedWriter writer;
	private LinkedBlockingQueue<Message> messages = new LinkedBlockingQueue<>();

	public Client(Socket socket) {
		this.socket = socket;
		this.id = socket.getInetAddress().getHostAddress();
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getId() {
		return id;
	}
	
	public BufferedReader getReader() {
		return reader;
	}
	
	public BufferedWriter getWriter() {
		return writer;
	}
	
	public Socket getSocket() {
		return socket;
	}

	public void close() {
		try {
			this.socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addMessage(Message message) {
		messages.add(message);
	}
	
	public void sendMessage() {
		Iterator<Message> it = messages.iterator();
		try {
			while (it.hasNext()) {
				writer.write(it.next().getMessage());
			}
		writer.flush();
		} catch (IOException e) {
			messages.clear();
			Server.clients.remove(this);
			e.printStackTrace();
		}
	}

	

}
