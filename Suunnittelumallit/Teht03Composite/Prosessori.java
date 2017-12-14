package Teht03Composite;

public class Prosessori implements Laiteosa {
	private double hinta;

	public Prosessori(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return this.hinta;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
