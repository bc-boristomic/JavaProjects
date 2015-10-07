public class Task8 {

	public static void main(String[] args) {
		
				String a = "www.nekastranica.com?name=Jon&surname=Stark";
				int l = a.length ();
				int counter = 0;
				String surname = "";
				String name = "";
				String reverse1 = "";
				String reverse2 = "";
				
				
				for (int i = l-1; i > 0; i--) {
					char c1 = a.charAt(i);
					if (c1 != '=') {
						surname += c1;	
						counter++;
					} else {
						break;
					}
				}
				int m = surname.length();
				for (int j = m-1; j >=0;j--) {
					char c2 = surname.charAt(j);
					reverse1 += c2;	
				}
				counter +=10;
				for (int k = l - counter; k > 0; k--) {
					char c3 = a.charAt(k);
					if (c3 != '='){
						name += c3;
					} else {
						break;
					}
					
				}
				int n = name.length();
				for(int p = n - 1; p >= 0; p--){
					char c4 = name.charAt(p);
					reverse2 += c4;	
				}
				surname = reverse1;
				name = reverse2;
				System.out.printf("%s %s",name, surname);
				
			

		


	}

}
