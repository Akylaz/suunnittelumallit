package teht06Decorator;

public class Pepperoni extends TäyteDecorator {

	public Pepperoni(Pizza pohja) {
		super(pohja);
	}

	@Override
	public double getPrice() {
		return täyte.getPrice() + 1.75;
	}

	public String getDescription() {
		return täyte.getDescription() + ", " + this.getClass().getSimpleName();
	}

}
