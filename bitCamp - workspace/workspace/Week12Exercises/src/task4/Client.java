package task4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	static Socket connectTo;
	static BufferedWriter writer;

	public static void main(String[] args) {

		try {
			connectTo = new Socket("10.0.82.63", 9999);
			while (true) {
				Thread t = new MyThread();
				t.start();
				t.sleep(1000);
			}

		} catch (IOException | InterruptedException  e) {
			e.printStackTrace();
		}

	}

	private static class MyThread extends Thread {

		Message m = new Message();

		public MyThread() {
			
			try {
				writer = new BufferedWriter(new OutputStreamWriter(
						connectTo.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {

			try {
				m.generateRandMessage();
				writer.write(m.getOption() + " " + m.getMessage());
				writer.newLine();
				//writer.flush();
				//System.out.println(m.getMessage());
				//System.out.println(m.getOption());
				//writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
