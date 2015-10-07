package ba.bitcamp.day5_2;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

		  
public class BITResponse implements Serializable {
	private static final long serialVersionUID = 1436818961308194582L;

	public static boolean isValidURL(String url) {  

		    URL u = null;

		    try {  
		        u = new URL(url);  
		    } catch (MalformedURLException e) {  
		        return false;  
		    }

		    try {  
		        u.toURI();  
		    } catch (URISyntaxException e) {  
		        return false;  
		    }  

		    return true;  
		} 	
	
	public static void main(String[] args) {
		
		System.out.println(isValidURL("localhost"));
			
		  
	}

}
