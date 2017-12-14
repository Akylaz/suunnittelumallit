package teht10ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Lähiesimies le = new Lähiesimies();
		YksikönPäällikkö yp = new YksikönPäällikkö();
		Toimitusjohtaja tj = new Toimitusjohtaja();
		le.setEsimies(yp);
		yp.setEsimies(tj);

		System.out.println("Pyydät 1% palkankorotusta:");
		le.käsittelePalkankorotus(1);

		System.out.println("Pyydät 3.5% palkankorotusta:");
		le.käsittelePalkankorotus(3.5);

		System.out.println("Pyydät 6% palkankorotusta:");
		le.käsittelePalkankorotus(6);

	}

}
