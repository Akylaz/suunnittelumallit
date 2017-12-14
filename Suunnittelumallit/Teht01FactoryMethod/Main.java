package Teht01FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus henkilö = new Henkilö();
        
        opettaja.aterioi();
        opiskelija.aterioi();
        henkilö.aterioi();
    }
}
