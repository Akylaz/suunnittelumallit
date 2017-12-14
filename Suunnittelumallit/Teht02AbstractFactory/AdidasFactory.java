package Teht02AbstractFactory;

public class AdidasFactory extends VaateFactory {

	@Override
	public Vaate luoLippis() {
		return new Lippis("Adidas");
	}

	@Override
	public Vaate luoTpaita() {
		return new Tpaita("Adidas");
	}

	@Override
	public Vaate luoFarmarit() {
		return new Farmarit("Adidas");
	}

	@Override
	public Vaate luoKengät() {
		return new Kengät("Adidas");
	}
}
