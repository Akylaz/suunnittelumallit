package teht05Singleton;

public class Farmarit implements Vaate {
	private String merkki;


    public Farmarit(String merkki) {
		this.merkki = merkki;
	}


	@Override
    public String toString(){
        return merkki + " farmarit";
    }
}