package teht10ChainOfResponsibility;

public class YksikönPäällikkö extends Esimies {

	@Override
	public void käsittelePalkankorotus(double amount) {
		if(amount <= 5.0) {
			System.out.println("Yksikön päällikkö hyväksyi palkankorotuksen.");
		} else {
			next.käsittelePalkankorotus(amount);
		}
	}

}
