package Teht03Composite;

public class Näytönohjain implements Laiteosa {
	private double hinta;

	public Näytönohjain(double hinta) {
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
