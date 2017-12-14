package teht14Builder;

public class Main {

	public static void main(String[] args) {
		Chef chef = new Chef();
		BurgerBuilder hese = new Hesburger();
		BurgerBuilder mc = new McDonalds();

		chef.setBuilder(hese);
		chef.buildBurger();
		Burger heseBurger = chef.getBurger();
		System.out.println("Hesburger: ");
		heseBurger.printBurger();


		chef.setBuilder(mc);
		chef.buildBurger();
		Burger mcBurger = chef.getBurger();
		System.out.println("McDonalds:");
		mcBurger.printBurger();

	}

}
