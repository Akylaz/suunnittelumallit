package Teht02AbstractFactory;

public class Tpaita implements Vaate {
	private String merkki;


    public Tpaita(String merkki) {
		this.merkki = merkki;
	}


	@Override
    public String toString(){
        return merkki + " T-paita";
    }
}
