package Teht03Composite;

public class Verkkokortti implements Laiteosa {
	private double hinta;

	public Verkkokortti(double hinta) {
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
