package ba.bitcamp.homework22.task1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Utility class used for networking method.
 * 
 * @author boris
 *
 */
public class NetUtils {

	/**
	 * Checks if given URL link is valid.
	 * 
	 * @param url
	 *            <code>String</code> type value of URL address
	 * @return <code>boolean</code> type value true if link is valid, false if
	 *         not
	 */
	public static boolean netIsAvailable(String link) {
		try {
			URL url = new URL(link);
			url.toURI();
			URLConnection conn = url.openConnection();
			conn.connect();
		} catch (MalformedURLException e) {
			return false;
		} catch (IOException e) {
			return false;
		} catch (URISyntaxException e) {
			return false;
		}
		return true;
	}

}
