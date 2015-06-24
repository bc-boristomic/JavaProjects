package ba.bitcamp.homework17.task1;

import ba.bitcamp.homework17.task2.StarNetwork;

public class Main {
	
	public static void main(String[] args) {
		
		char[] c = new char[] {'1','2','3','4','5','6','7','8','a','b','c','d'};
		
		Client c1 = new Client("Client", c);
		Client c2 = new Client("Client2", c);
		Client c3 = new Client("Client3", c);
		
		
		
		
		System.out.println(c1);
		
		Server s = new Server("Server", c, 2);
		
		System.out.println(s);
		
		c1.connect(s);
		//cl.connect(s); // remove comments for exception
		
		c1.disconnect();
		c1.connect(s);
		
		StarNetwork sn = new StarNetwork("Network", s);

		sn.addComputer(c1);
		sn.addComputer(c2);
		
		sn.removeComputer(c3);
		sn.addComputer(c3);
		
		System.out.println(sn);
	}

}
