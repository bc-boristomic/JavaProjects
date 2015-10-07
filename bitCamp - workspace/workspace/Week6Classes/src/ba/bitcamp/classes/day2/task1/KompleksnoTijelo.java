package ba.bitcamp.classes.day2.task1;

import java.util.Arrays;

public class KompleksnoTijelo implements ITijelo {

	
	ITijelo[] dijelovi;
	
	@Override
	public String toString() {
		return "KompleksnoTijelo [dijelovi=" + Arrays.toString(dijelovi) + "]";
	}

	public void dodajDio(ITijelo dio){
		ITijelo[] novi;
		if (dijelovi == null) {
			novi = new ITijelo[]{dio};
		} else {
			novi = new ITijelo[dijelovi.length + 1];
			System.arraycopy(dijelovi, 0, novi, 0, dijelovi.length);
		}
		novi[novi.length-1] = dio;
		dijelovi = novi;
	}
	// TODO isjeci prozore
	@Override
	public double povrsina() {
		if(dijelovi != null) {
			double povrsina = 0;
			for (ITijelo dio : dijelovi) {
				povrsina += dio.povrsina();
			}
			return povrsina;
		}
		return 0;
	}

	@Override
	public double obim() {
		if (dijelovi != null) {
			double obim = 0;
			for (ITijelo dio : dijelovi) {
				obim += dio.obim();
			}
			return obim;
		}
		return 0;
	}
	
	
	

}
