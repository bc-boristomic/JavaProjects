package ba.bitcamp;

public class Planet {

	private Integer tezina;
	private Integer masa;
	private String oblik;
	private String ime;
	private static final Integer g = 10;

	/**
	 * @param tezina
	 * @param masa
	 * @param oblik
	 * @param ime
	 */
	public Planet(Integer tezina, Integer masa, String oblik, String ime) {
		super();
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;
	}

	public void dodajMasu(Integer dodatak) {
		this.masa += dodatak;
	}

	/**
	 * Metoda za definisanje mase
	 * 
	 * @return
	 */
	public Integer vrijednostMase() {
		return this.masa;
	}
	
	
	/**
	 * 
	 * Racuna vrijednost tezine
	 * @return
	 */
	public Integer racunajTezinu () {
		this.tezina = this.masa * g;
		return this.tezina;
	}

}
