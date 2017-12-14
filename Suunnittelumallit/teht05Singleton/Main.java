package teht05Singleton;

public class Main {

	public static void main(String[] args) {
		JavaKoodaaja jasper = new JavaKoodaaja();
		VaateFactory boss = SingletonBossFactory.getFactory();
		VaateFactory adidas = SingletonAdidasFactory.getFactory();

		jasper.pueVaatteet(adidas);
		jasper.luetteleVaatteet();

		System.out.println("Jasper valmistuu insinööriksi");

		jasper.pueVaatteet(boss);
		jasper.luetteleVaatteet();

	}

}
