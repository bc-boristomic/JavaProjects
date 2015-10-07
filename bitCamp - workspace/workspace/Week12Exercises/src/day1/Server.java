package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {

	private static final int PORT = 8000;

	public static void main(String[] args) {

		ServerSocket server = null;
		try {
			server = new ServerSocket(PORT);

		} catch (IOException e) {
			System.out.println("Server connection couldn't be established");
			System.err.println("Error message: " + e.getMessage());
			System.exit(1);
		} catch (SecurityException e) {
			System.out.println("Security violated");
			System.err.println("Error message: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Server port ins't good");
			System.out.println("Port: " + server.getLocalPort());
			System.err.println("Error message: " + e.getMessage());
		}

		Socket client;
		try {
			client = server.accept();
		
		while (true) {
			FileOutputStream is = new FileOutputStream(new File("list.json"));
			InputStream os = client.getInputStream();

			byte[] buffer = new byte[1024];
			int readSoFar;
			while ((readSoFar = os.read(buffer, 0, buffer.length)) > 0) {
				is.write(buffer, 0, readSoFar);
			}
			is.flush();

			Date date = new Date();
			String time = "" + date.getTime();
			Message m1 = new Message("Boris", time, "WHAT?");
			//
			ObjectMapper maper = new ObjectMapper();
			//
			ArrayList<Message> m = null;

			m = maper.readValue(new File("list.json"), ArrayList.class);

			m.add(m1);
			// ********
			ArrayList<Message> list = new ArrayList<>();
			list.add(new Message("ime", "date", "msg"));
			list.add(new Message("ime2", "date2", "msg2"));
			maper.writeValue(new File("list.json"), m);

			System.out.println(m);

			Socket connectTo = new Socket("10.0.82.32", 8000);
			FileInputStream is2 = new FileInputStream("list.json");
			OutputStream os2 = connectTo.getOutputStream();

			byte[] buffer2 = new byte[1024];
			int readSoFar2;
			while ((readSoFar2 = is2.read(buffer2, 0, buffer2.length)) > 0) {
				os2.write(buffer2, 0, readSoFar2);
			}
			os2.flush();
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
