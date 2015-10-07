package ba.bitcamp.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Task {

	public static void main(String[] args) throws IOException {

		InputStream is = null;
		BufferedWriter bw = null;
		try {
			is = new FileInputStream("file.txt");
			bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("write.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);

		String s = "";
		while ((s = br.readLine()) != null) {
			try {
				bw.write(s);
				bw.newLine();
				bw.flush();
			} catch (IOException | NullPointerException e) {
				e.printStackTrace();
			}
		}
				
	}

}
