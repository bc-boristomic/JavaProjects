package ba.bitcamp.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerGraph  {
	private static final long serialVersionUID = -135750826661757050L;
	
	//private JTextArea chat = new JTextArea();
	
	
//	public ServerGraph() {
//		add(new JScrollPane(chat));
//		setSize(300, 300);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
//	}
	
	
	private static class Client implements Runnable {

		Socket client = new Socket();
			
		public Client(Socket client) {
			this.client = client;
		}
		
		@Override
		public void run() {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				System.out.println(reader.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		
		new ServerGraph();
		try {
			ServerSocket server = new ServerSocket(8888);
			
			for (;;) {
			Socket client = server.accept();
			(new Thread(new Client(client))).start();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
