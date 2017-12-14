package teht05Singleton;

public class Kengät implements Vaate {
	private String merkki;


    public Kengät(String merkki) {
		this.merkki = merkki;
	}


	@Override
    public String toString(){
        return merkki + " kengät";
    }
}
