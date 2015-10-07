package ba.bitcamp.day2;

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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {
	private static final long serialVersionUID = 5400549707932532582L;

	private ExecutorService pool = Executors.newSingleThreadExecutor();
	
	private JButton send = new JButton("Send");
	private JTextField message = new JTextField();
	private JTextArea chat = new JTextArea();
	private JScrollPane scroll = new JScrollPane(chat);
	
	private Socket socket;
	private BufferedWriter writer;
	private BufferedReader reader;

	public Client() {
		try {
			socket = new Socket("10.0.82.113", 7321);
			writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} catch (IOException e) {
			System.exit(1);
			e.printStackTrace();
		}
		setLayout(new BorderLayout());
		add(message, BorderLayout.SOUTH);
		add(send, BorderLayout.NORTH);
		chat.setEditable(false);
		add(scroll, BorderLayout.CENTER);

		send.addActionListener(new Action());
		message.addKeyListener(new Action());

		setTitle("Simple chat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	private class Action extends KeyAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == send) {
				sendMessage();
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				sendMessage();
			}
		}

		private void sendMessage() {
			pool.submit(new Runnable() {
				@Override
				public void run() {
					try {
						String msg = message.getText();
						writer.write(msg);
						writer.newLine();
						writer.flush();
						chat.append("Me: " + msg + "\n");
						message.setText("");
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			});
		}
	}
	
	private void readMessage() {
		new Thread(new Runnable(){
			
			@Override
			public void run() {
				for (;;) {
					try {
						String line = reader.readLine();
						chat.append(line + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		new Client();

	}

}
