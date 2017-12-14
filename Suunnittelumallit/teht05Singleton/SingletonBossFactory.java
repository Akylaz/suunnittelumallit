package teht05Singleton;

public class SingletonBossFactory extends VaateFactory {
	private static SingletonBossFactory factory = null;

	private SingletonBossFactory() {

	}

	public static SingletonBossFactory getFactory() {
		if(factory == null) {
			factory = new SingletonBossFactory();
		}
		return factory;
	}

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