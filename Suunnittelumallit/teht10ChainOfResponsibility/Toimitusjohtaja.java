package teht10ChainOfResponsibility;

public class Toimitusjohtaja extends Esimies {

	@Override
	public void käsittelePalkankorotus(double amount) {
		System.out.println("Toimitusjohtaja hyväksyi palkankorotuksen.");
	}

}
