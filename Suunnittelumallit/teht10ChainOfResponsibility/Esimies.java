package teht10ChainOfResponsibility;

abstract class Esimies {
	protected Esimies next;


	public void setEsimies(Esimies next) {
		this.next = next;
	}

	abstract public void käsittelePalkankorotus(double amount);
}
