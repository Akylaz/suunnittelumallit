package Teht03Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public abstract class Komposiitti  implements Laiteosa {
	
	private double hinta;
	private List<Laiteosa> osat = new ArrayList<>();
	
	public Komposiitti(double hinta) {
		this.hinta = hinta;
	}

	void liitäLaiteosa(Laiteosa osa) {
		osat.add(osa);
	};

	@Override
	public double getHinta() {		
		return osat.stream().flatMapToDouble(l -> DoubleStream.of(l.getHinta())).sum() + this.hinta;
	};
	
	@Override
	public String toString() {
		String s = new String();
		for (Laiteosa l : osat) {
			
			s += l.toString() + "\n";
			
		}

		return s + this.getClass().getSimpleName();
		
	}

}