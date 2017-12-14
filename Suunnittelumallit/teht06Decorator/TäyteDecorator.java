package teht06Decorator;

public abstract class TäyteDecorator implements Pizza {
	protected Pizza täyte;

	public TäyteDecorator(Pizza täyte) {
		this.täyte = täyte;
	}

	public double getHinta() {
		return täyte.getPrice();
	}

	public String getDescription() {
		return täyte.getDescription();
	}
}
