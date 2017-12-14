package Teht03Composite;

public class Main {

	public static void main(String[] args) {
		Laiteosa kotelo = new Kotelo(49.95);
		Laiteosa emolevy = new Emolevy(79.95);
		Laiteosa muistipiiri = new Muistipiiri(24.95);
		Laiteosa muistipiiri2 = new Muistipiiri(24.95);
		Laiteosa näytönohjain = new Näytönohjain(199.95);
		Laiteosa prosessori = new Prosessori(262.50);
		Laiteosa verkkokortti = new Verkkokortti(15.90);

		emolevy.liitäLaiteosa(prosessori);
		emolevy.liitäLaiteosa(muistipiiri);
		emolevy.liitäLaiteosa(muistipiiri2);
		emolevy.liitäLaiteosa(verkkokortti);
		emolevy.liitäLaiteosa(näytönohjain);
		kotelo.liitäLaiteosa(emolevy);

		System.out.println("Tietokone sisältää seuraavat osat: \n" + kotelo.toString());
		System.out.println("Yhteishinta on " + kotelo.laskeHinta() + "e");
	}

}
