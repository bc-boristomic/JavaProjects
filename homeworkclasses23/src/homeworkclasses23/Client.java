package homeworkclasses23;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Public class <tt>Client</tt> connects to localhost server and receives a JSON
 * object via input stream. <tt>BitResponse</tt> object is then printed to
 * standard output. printed to standard output.
 * 
 * @author boris
 *
 */
public class Client {

	public static void main(String[] args) {

		try {
			Socket connectTo = new Socket("localhost", Server.PORT);

			InputStream is = connectTo.getInputStream();
			ObjectMapper mapper = new ObjectMapper();

			BitResponse br2 = mapper.readValue(is, BitResponse.class);
			System.out.println(br2);

			connectTo.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
