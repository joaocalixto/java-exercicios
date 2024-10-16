package polimorfismo;

public class Main {

    public static void main(String[] args) {
        Cao cao = new Cao();
        Cao chiquito = new Labrador();
        Cao maria = new Boxer();
        Cao toto = new PastorAlemao();

        chiquito.latir();
        maria.latir();
        cao.latir();
        toto.latir();


    }
}
