package teht10ChainOfResponsibility;

public class Lähiesimies extends Esimies {

	@Override
	public void käsittelePalkankorotus(double amount) {
		if(amount <= 2.0) {
			System.out.println("Lähiesimies hyväksyi palkankorotuksen.");
		} else {
			next.käsittelePalkankorotus(amount);
		}
	}

}
