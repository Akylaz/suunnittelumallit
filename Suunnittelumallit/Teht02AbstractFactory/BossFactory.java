package Teht02AbstractFactory;

public class BossFactory extends VaateFactory {

	@Override
	public Vaate luoLippis() {
		return new Lippis("Boss");
	}

	@Override
	public Vaate luoTpaita() {
		return new Tpaita("Boss");
	}

	@Override
	public Vaate luoFarmarit() {
		return new Farmarit("Boss");
	}

	@Override
	public Vaate luoKengät() {
		return new Kengät("Boss");
	}
}