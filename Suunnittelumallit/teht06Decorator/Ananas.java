package teht06Decorator;

public class Ananas extends TäyteDecorator {

	public Ananas(Pizza pohja) {
		super(pohja);
	}

	@Override
	public double getPrice() {
		return täyte.getPrice() + 1.95;
	}

	public String getDescription() {
		return täyte.getDescription() + ", " + this.getClass().getSimpleName();
	}

}
