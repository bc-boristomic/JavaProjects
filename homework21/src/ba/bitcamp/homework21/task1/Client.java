package ba.bitcamp.homework21.task1;

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Client class extends JFrame and have one Socket used for connecting to
 * server. GUI app starts as soon as main method is called. When client connects
 * to server, client and server can have chat thru GUI app. Client can ask
 * server to do certain action such as open web page, or file on computer, or to
 * delete file on computer and to list all the files in specific directory. If
 * asked client client will receive a list of files in certain folder location.
 * 
 * @author boris
 *
 */
public class Client extends JFrame {
	private static final long serialVersionUID = 7007189518447759L;

	private static final String HOST = "127.0.0.1";

	private static Socket connectTo;

	private JButton send = new JButton("send");
	private JTextField message = new JTextField(20);
	private JTextArea conversation = new JTextArea();
	private JScrollPane scroll = new JScrollPane(conversation);
	private JPanel panel = new JPanel();

	/**
	 * Default constructor of Client class. Initializes GUI application, open's
	 * server connection and starts listening for incoming messages to read from
	 * input stream.
	 */
	public Client() {
		initGUIPart();
		connectToServer();
		recieveMessage();
	}

	/**
	 * Private method that setups GUI app. Adds action listener to send button
	 * and adds keyboard listener to text field. When user press enter on
	 * keyboard message is sent.
	 */
	private void initGUIPart() {
		setLayout(new BorderLayout());

		conversation.setEditable(false);
		add(scroll, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		panel.add(message);
		panel.add(send);

		message.addKeyListener(new Action());
		send.addActionListener(new Action());

		setTitle("Chat - Client");
		setSize(320, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Connect to server using host address and server port.
	 */
	private void connectToServer() {
		try {
			connectTo = new Socket(HOST, Server.PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Private method used to receive message, input stream will continuously
	 * wait to read message, and append it to text area.
	 * 
	 */
	private void recieveMessage() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connectTo.getInputStream()));

			while (true) {
				String msg = reader.readLine();
				conversation.append("Server: " + msg + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Private inner class extends Abstract class KeyAdapter and implements only
	 * one needed method. Also ActionListener interface is implemented to handle
	 * button action.
	 * 
	 * @author boris
	 *
	 */
	private class Action extends KeyAdapter implements ActionListener {

		/**
		 * Implemented method that handles button action, message is send when
		 * button is pressed.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == send) {
				sendMessage();
			}
		}

		/**
		 * Implemented method that handles keyboard action, message is send when
		 * enter key is pressed.
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				sendMessage();
			}
		}

		/**
		 * Method that sends message to server. Message is read from text field
		 * and send to server via output stream. Message is also appended to
		 * client text area.
		 */
		private void sendMessage() {
			String msg = message.getText();
			try {
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(connectTo.getOutputStream()));
				writer.write(msg);
				writer.newLine();
				writer.flush();
				conversation.append("Me: " + msg + "\n");

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			message.setText("");
		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		new Client();

	}

}
