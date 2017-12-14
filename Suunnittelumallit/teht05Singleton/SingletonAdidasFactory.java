package teht05Singleton;

public class SingletonAdidasFactory extends VaateFactory {
	private static SingletonAdidasFactory factory = null;

	private SingletonAdidasFactory() {

	}

	public static SingletonAdidasFactory getFactory() {
		if(factory == null) {
			factory = new SingletonAdidasFactory();
		}
		return factory;
	}

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
