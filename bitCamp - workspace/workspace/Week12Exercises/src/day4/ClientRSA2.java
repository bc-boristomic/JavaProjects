package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.Socket;

public class ClientRSA2 {

public static void main(String[] args) {
		
		try {
			while (true) {
				Socket socket = new Socket("10.0.82.40", 8000);
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				//System.out.println(msg);
				
				BigInteger big = new BigInteger(msg.split(" ")[2]);
				BigInteger workLoad = new BigInteger("250000");
				BigInteger b = new BigInteger(msg.split(" ")[1]);
				BigInteger a = new BigInteger(msg.split(" ")[0]);
				
				//getAllPrimes(new BigInteger(msg.split(" ")[0]), new BigInteger(msg.split(" ")[1]), new BigInteger(msg.split(" ")[2]));
				
				for (int i = 0; i < 8; i++) {
					new Task(big, workLoad, b, a).start();
					a = a.add(workLoad);
				}
				socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//getAllPrimes(new BigInteger("10"), new BigInteger("31176236472038964811"));
	}

	private static class Task extends Thread {
		
		BigInteger big;
		BigInteger workLoad;
		BigInteger b;
		BigInteger a;
		
		
		
		/**
		 * @param big
		 * @param workLoad
		 * @param b
		 * @param a
		 */
		public Task(BigInteger big, BigInteger workLoad, BigInteger b,
				BigInteger a) {
			super();
			this.big = big;
			this.workLoad = workLoad;
			this.b = b;
			this.a = a;
		}



		@Override
		public void run() {
			getAllPrimes(a, a.add(workLoad), big);
			
		}
	}
	
	public static BigInteger getAllPrimes(BigInteger start, BigInteger end, BigInteger big) {
		for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(new BigInteger("1"))) {
			if(big.remainder(i).equals(new BigInteger("0"))){
				System.out.println(i);
				return i;
			}
		}
		return null;
	}
	
	
}