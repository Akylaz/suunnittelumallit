package teht05Singleton;

public class Lippis implements Vaate {
	private String merkki;


    public Lippis(String merkki) {
		this.merkki = merkki;
	}


	@Override
    public String toString(){
        return merkki + " lippis";
    }
}
