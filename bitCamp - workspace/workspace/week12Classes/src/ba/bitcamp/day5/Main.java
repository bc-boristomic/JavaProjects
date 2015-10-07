package ba.bitcamp.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) {

		try {
			URL site = new URL("http://www.klix.ba/");
			URLConnection c = site.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					c.getInputStream()));
			while (reader.ready()) {
				System.out.println(reader.readLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
