package teht06Decorator;

public class Pizzapohja implements Pizza {

	@Override
	public double getPrice() {
		return 2.50;
	}

	@Override
	public String getDescription() {
		return "Rapea pohja";
	}

}
