
public class Task22 {

	public static void main(String[] args) {
		
				String serijeZagrada = ("}{{}{}{}");
				
				int b = serijeZagrada.length();
				String prvaZagrada = "";
				int counterZaPrvu = 0;
				int counterZaDrugu = 0;
				
				for (int i = 0; i < b; i++){
					char c = serijeZagrada.charAt(i);
					char prva = '{';
					char druga = '}';
					
					if (c == prva){
						counterZaPrvu++;
					} 
					else if (c == druga){
						counterZaDrugu++;
					}
				}
				
				for (int i= serijeZagrada.length(); i > 0; i--) {
			        prvaZagrada = prvaZagrada + serijeZagrada.charAt(i-1);
			        }
			        System.out.println(prvaZagrada);
			        if (prvaZagrada == "}") {
			        	System.out.println("Zagrada pogresno otvorena");
				}
				
				if (counterZaPrvu != counterZaDrugu){
					System.out.println("Bracket is not closed.");
				} else {
					System.out.println("All closed.");
				}
			
	}

}
