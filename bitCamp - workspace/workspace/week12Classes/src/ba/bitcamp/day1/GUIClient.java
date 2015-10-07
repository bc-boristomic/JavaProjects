package ba.bitcamp.day1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIClient extends JFrame {
	private static final long serialVersionUID = 5400549707932532582L;
	
	private static final int PORT = 7321;
	private static final String HOST = "10.0.82.113";
	
	private JButton send = new JButton("Send");
	private JTextField message = new JTextField();
	private Socket socket;
	private BufferedWriter writer;
	private BufferedReader reader;

	
	public GUIClient() {
		
		send.addActionListener(new Action());
		message.addKeyListener(new Action());
		
		setLayout(new BorderLayout());
		add(message, BorderLayout.CENTER);
		add(send, BorderLayout.SOUTH);
		
		
		setTitle("Simple chat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		try {
			socket = new Socket(HOST, PORT);
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (true) {
			try {
				System.out.println(reader.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private class Action extends KeyAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == send) {
				try {
					writer.write(message.getText());
					writer.newLine();
					writer.flush();
					message.setText("");
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
		}

		
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				try {
					writer.write(message.getText());
					writer.newLine();
					writer.flush();

				} catch (IOException e1) {
					e1.printStackTrace();
				}
				message.setText("");
			}
			
		}

				
	}
	

	public static void main(String[] args) {
		//new GUIClient();
		try {
			Socket socket = new Socket(HOST, PORT);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			Scanner input = new Scanner(System.in);
			while (true) {
				System.out.println("Msg: " );
				writer.write(input.nextLine());
				writer.flush();
				System.out.println(reader.readLine());
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}

}
