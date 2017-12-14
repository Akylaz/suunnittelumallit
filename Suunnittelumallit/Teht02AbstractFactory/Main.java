package Teht02AbstractFactory;

public class Main {

	public static void main(String[] args) {
		JavaKoodaaja jasper = new JavaKoodaaja();
		VaateFactory boss = new BossFactory();
		VaateFactory adidas = new AdidasFactory();

		jasper.pueVaatteet(adidas);
		jasper.luetteleVaatteet();

		System.out.println("Jasper valmistuu insinööriksi");

		jasper.pueVaatteet(boss);
		jasper.luetteleVaatteet();

	}

}
