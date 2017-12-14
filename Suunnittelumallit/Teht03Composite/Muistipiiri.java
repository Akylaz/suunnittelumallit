package Teht03Composite;

public class Muistipiiri implements Laiteosa {
	private double hinta;
	
	public Muistipiiri(double hinta) {
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
