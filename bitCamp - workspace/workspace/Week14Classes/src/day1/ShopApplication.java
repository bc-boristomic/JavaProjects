package day1;

import java.math.BigDecimal;

import org.avaje.agentloader.AgentLoader;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;

import day1.day12.Product;
import day1.day12.Purchace;
import day1.day12.User;

public class ShopApplication {

	static {
		AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent",
				"debug=1;packages=day1.day12.**");
	}
	
	private static EbeanServer server = Ebean.getServer("h2");

	public static void main(String[] args) {
		
		User first = new User();
		first.setFullName("Mujo Mujic");
		first.setEmail("email@mail.com");
		first.setBalance(new BigDecimal(0));

		System.out.println(first.getId());
		
		Ebean.save(first);
		
		System.out.println(first.getId());
		
		Product p = new Product();
		
		p.setTitle("Monitor DELL");
		p.setPrice(new BigDecimal("399.99"));
		p.setQuantity(0);
		Ebean.save(p);
		
		Purchace pu = new Purchace();
		pu.setUser(first);
		pu.setProduct(p);
		
		first.setBalance(first.getBalance().subtract(p.getPrice()));
		
		Ebean.save(pu);
		
	}

}
