package ba.bitcamp.homework22.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Class HTTPServer represents HTTP server with two pages, index.html and
 * classmates.html. Page classmates is read from file that contains only names
 * and raw addresses. While reading that while <code>html</code> code is build
 * up to create direct link to website.
 * 
 * @author boris
 *
 */
public class HTTPServer {

	private static final int HTTP_PORT = 8080;

	public static void main(String[] args) {

		ServerSocket http;
		try {
			http = new ServerSocket(HTTP_PORT);
			System.out.println("HTTP server opened");
			while (true) {
				Socket client = http.accept();
				System.out.println("Client visited server "
						+ client.getLocalAddress());
				BufferedWriter clientWriter = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				BufferedReader clientReader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				BufferedReader fileReader = null;
				String htmlDoc = "";
				boolean printIps = false;
				try {
					String fromClient = clientReader.readLine();
					String[] wantedAddress = fromClient.split(" ");

					String address = "src/index.html";

					if (wantedAddress[1].equals("/other.html")
							|| wantedAddress[1].equals("/other")) {
						address = "src/other.html";
						printIps = true;
					}

					fileReader = new BufferedReader(new FileReader(new File(
							address)));

				} catch (NullPointerException ex) {
					continue;
				}
				while (fileReader.ready()) {
					htmlDoc += fileReader.readLine();
				}

				BufferedReader fileRead = new BufferedReader(new FileReader(
						"src/forhttp.txt"));
				if (printIps) {
					while (fileRead.ready()) {
						String line = fileRead.readLine();
						String[] s = line.split(" ", 2);
						htmlDoc += "<a href = " + s[0] + ">" + s[1]
								+ "</a>" + "<br>\n";
					}
				}
				fileRead.close();

				htmlDoc += "</body></html>";
				clientWriter.write(htmlDoc);
				clientWriter.close();
				client.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
