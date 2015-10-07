package ba.bitcamp.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadFile {

	public static void main(String[] args) {
		Map<String, String> classMates = new HashMap<>();
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(new File(
					"file.txt")));
			String line = "";
			while (read.ready()) {
				line = read.readLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				classMates.put(st.nextToken(), st.nextToken());
			}
			
			//System.out.println(classMates);
			//System.out.println(classMates.size());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String ss = getRandomIP(classMates);
		//System.out.println(getRandomIP(classMates));
		System.out.println(classMates.get(ss) + ss );
		Scanner input = new Scanner(System.in);
		
		try {
			String s = "";
			ServerSocket server = new ServerSocket(8888);
			
			Socket client = server.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(classMates.get(client.getLocalAddress()));
			System.out.println("Write something");
			System.out.println(s);
			s += reader.readLine() + input.nextLine();
			
			System.out.println(s);
			
			Socket zaid = new Socket("10.0.82.98", 8888);
			BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(zaid.getOutputStream()));
			writer2.write(s);
			writer2.flush();
			writer2.close();
			
			while (true) {
				try {

					Socket socket = new Socket(getRandomIP(classMates), 8888);
					
					System.out.println(classMates.get(socket.getLocalAddress()));
					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					writer.write(s);
					writer.newLine();
					writer.flush();
					break;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
			
			
			
			
						
			
			
			
			
			
			
//			Socket connect = new Socket(getRandomIP(classMates), 8888);
//			ServerSocket server = new ServerSocket(8888);
//						
//			Socket client = server.accept();
//			
//			System.out.println(classMates.get(client.getInetAddress()));
//			
//			InputStream is = client.getInputStream();
//			BufferedReader br = new BufferedReader(new InputStreamReader(is));
//			
//			OutputStream os = client.getOutputStream();
//			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
//			
//			
//			
//			
//			writer.write(br.readLine());
//			
//			
//			writer.flush();
//			writer.close();
//			
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		

	}

	private static String getRandomIP(Map<String, String> map) {
		Random rand = new Random();
		Collection<String> set = map.keySet();

		while (true) {
			String ip = "10.0.82.";
			int num = rand.nextInt(110);
			ip += num;
			for (String string : set) {
				if (string.equals(ip)) {
					return string;
				}
			}
			
		}

	}

}
