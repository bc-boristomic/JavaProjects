package ba.bitcamp.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
	
	public static void main(String[] args) {
		
		try {
			URL site = new URL("inet", "10.0.82.137/User/boris.tomic/Documents/", "grades.in");
			URLConnection conn = site.openConnection();
			InputStream in = conn.getInputStream();
			String res = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = br.readLine()) != null) {
				res += line + "\n";
			}
			in.close();
			System.out.println(res);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
}
