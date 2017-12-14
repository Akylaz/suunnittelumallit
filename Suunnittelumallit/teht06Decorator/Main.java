package teht06Decorator;

public class Main {

	public static void main(String[] args) {
		Pizza opera = new Salami(new Tonnikala(new Kinkku(new Pizzapohja())));
		Pizza hawaji = new Ananas(new Kinkku(new Pizzapohja()));
		Pizza meatlover = new Jauheliha(new Pepperoni(new Kebab(new Salami(new Kinkku(new Pizzapohja())))));

		System.out.println("Hinnasto:");
		System.out.println("Opera: " + opera.getDescription() + " " + opera.getPrice() + "e");
		System.out.println("Hawaji: " + hawaji.getDescription() + " " + hawaji.getPrice() + "e");
		System.out.println("Meatlover: " + meatlover.getDescription() + " " + meatlover.getPrice() + "e");
	}

}
