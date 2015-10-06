package ba.bitcamp.homework21.task1;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Server class extends JFrame and have ServerSocket and one Socket for client.
 * GUI app starts as soon as main method is called. When some client connects to
 * server port, client and server can have chat thru GUI app. Client can ask
 * server to do certain action such as open web page, or file on computer, or to
 * delete file on computer and to list all the files in specific directory.
 * 
 * @author boris
 *
 */
public class Server extends JFrame {
	private static final long serialVersionUID = 6039781833599967318L;

	protected static final int PORT = 8888;

	private static ServerSocket server;
	private static Socket client;

	private JButton send = new JButton("send");
	private JTextField message = new JTextField(20);
	private JTextArea conversation = new JTextArea();
	private JScrollPane scroll = new JScrollPane(conversation);
	private JPanel panel = new JPanel();

	/**
	 * Default constructor of Server class. Initializes GUI application, open's
	 * server connection and starts listening for incoming messages to read from
	 * input stream.
	 */
	public Server() {
		initGUIPart();
		initServerClient();
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

		setTitle("Chat - Server");
		setSize(320, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Starts the server and waits for client to connect.
	 */
	private void initServerClient() {
		try {
			server = new ServerSocket(PORT);
			client = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Depending on message client is sending, server responds with certain
	 * action.
	 * <p>
	 * Message is spliced at first white space only and if first word is /open
	 * specific file will be opened if exist on given location.
	 * <p>
	 * If first word is /web a web page will be opened.
	 * <p>
	 * If first word is /delete inputed file will be deleted.
	 * <p>
	 * If first word is /list client will receive a message with list of files
	 * at given folder path.
	 * 
	 * @param message
	 *            <code>String</code> type value of message client is sending.
	 * @exception FileNotFoundException
	 * @exception IOException
	 * @exception ArrayIndexOutOfBoundsException
	 * @exception URISyntaxException
	 */
	private void doSomeAction(String message) {
		try {
			String[] s = message.split(" ", 2);
			File file = new File(s[1]);
			if (s[0].equals("/open")) {
				Desktop.getDesktop().open(file);
			} else if (s[0].equals("/web")) {
				Desktop.getDesktop().browse(new URL("http://" + s[1]).toURI());
			} else if (s[0].equals("/delete")) {
				file.delete();
			} else if (s[0].equals("/list")) {
				String[] list = file.list();
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				writer.write("Files in folder " + file);
				writer.newLine();
				for (String string : list) {
					writer.write(string);
					writer.newLine();
				}
				writer.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Private method used to receive message, input stream will continuously
	 * wait to read message, and append it to text area.
	 * <p>
	 * Note that method doSomeAction is called here.
	 */
	private void recieveMessage() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			while (true) {
				String msg = reader.readLine();
				conversation.append("Client: " + msg + "\n");
				doSomeAction(msg);
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
		 * Method that sends message to client. Message is read from text field
		 * and send to client via output stream. Message is also appended to
		 * server text area.
		 */
		private void sendMessage() {
			String msg = message.getText();
			try {
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

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

		new Server();

	}

}
