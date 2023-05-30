package NegozioStrumenti;

public class Main {
    public static void main(String[] args) {
        Negozio negozio = new Negozio("MyMusicShop", 152632);
        StrumentoAbstract pianola = new Pianoforte(false, true, 250.00);
        StrumentoAbstract tromba = new Tromba("Ottone", 300.00);
        StrumentoAbstract contrabbasso = new Contrabbasso(false, 100);
        negozio.addInventario(tromba);
        negozio.addInventario(contrabbasso);

        System.out.println(negozio.mediaPrezziInventario());
    }
}
