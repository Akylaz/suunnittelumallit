package teht11Memento;

public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Thread x = new Asiakas(arvuuttaja);
		Thread y = new Asiakas(arvuuttaja);
		Thread z = new Asiakas(arvuuttaja);

		x.start();
		y.start();
		z.start();

	}

}
