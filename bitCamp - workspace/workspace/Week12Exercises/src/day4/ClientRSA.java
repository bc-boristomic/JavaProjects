package day4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.Socket;

public class ClientRSA {

public static void main(String[] args) {
		
		try {
			while (true) {
				Socket socket = new Socket("10.0.82.40", 8000);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream()));
				String msg = br.readLine();
				System.out.println(msg);
				
				getAllPrimes(new BigInteger(msg.split(" ")[0]), new BigInteger(msg.split(" ")[1]), new BigInteger(msg.split(" ")[2]));
				
				
				socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//getAllPrimes(new BigInteger("10"), new BigInteger("31176236472038964811"));
	}
	
	public static BigInteger getAllPrimes(BigInteger start, BigInteger end, BigInteger big) {
		int counter = 0;
			
		for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(new BigInteger("1"))) {
			//if (isPrime(i)){
				//BigInteger tmp1 = big.divideAndRemainder(i)[0];
				BigInteger tmp = big.remainder(i);
				//System.out.print(tmp1 + ", " + tmp + "\n");
				if(tmp.equals(new BigInteger("0"))){
					System.out.println(i);
					return i;
					
				}
			//}
		}
		return null;
	}

	public static boolean isPrime(BigInteger num) {
		return num.isProbablePrime(99);
	}
	
	
}