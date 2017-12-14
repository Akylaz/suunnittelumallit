package Teht03Composite;

public class Main {

	public static void main(String[] args) {
		Laiteosa kotelo = new Kotelo(20);
		Laiteosa emolevy = new Emolevy(20);
		Laiteosa muistipiiri = new Muistipiiri(10);
		Laiteosa muistipiiri2 = new Muistipiiri(10);
		Laiteosa näytönohjain = new Näytönohjain(15);
		Laiteosa prosessori = new Prosessori(15);
		Laiteosa verkkokortti = new Verkkokortti(5);

		((Emolevy) emolevy).liitäLaiteosa(prosessori);
		((Emolevy) emolevy).liitäLaiteosa(muistipiiri);
		((Emolevy) emolevy).liitäLaiteosa(muistipiiri2);
		((Emolevy) emolevy).liitäLaiteosa(verkkokortti);
		((Emolevy) emolevy).liitäLaiteosa(näytönohjain);
		((Kotelo) kotelo).liitäLaiteosa(emolevy);

		System.out.println("Tietokone sisältää seuraavat osat: \n" + kotelo.toString());
		System.out.println("Yhteishinta on " + ((Kotelo) kotelo).getHinta() + "e");
	}

}
