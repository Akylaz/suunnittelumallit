package teht06Decorator;

public class Kebab extends TäyteDecorator {

	public Kebab(Pizza pohja) {
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