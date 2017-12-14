package teht06Decorator;

public class Tonnikala extends TäyteDecorator {

	public Tonnikala(Pizza pohja) {
		super(pohja);
	}

	@Override
	public double getPrice() {
		return täyte.getPrice() + 2.30;
	}

	public String getDescription() {
		return täyte.getDescription() + ", " + this.getClass().getSimpleName();
	}

}