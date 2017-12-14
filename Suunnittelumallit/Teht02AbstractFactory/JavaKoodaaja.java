package Teht02AbstractFactory;

public class JavaKoodaaja {
	private Vaate kengät = null;
	private Vaate farmarit = null;
	private Vaate lippis = null;
	private Vaate tpaita = null;

	public void pueVaatteet(VaateFactory factory) {
		kengät = factory.luoKengät();
		farmarit = factory.luoFarmarit();
		lippis = factory.luoLippis();
		tpaita = factory.luoTpaita();
	}

	public void luetteleVaatteet() {
		System.out.println(kengät.toString() + ", " + farmarit.toString() + ", " + lippis.toString() + " ja " + tpaita.toString());
	}


}
