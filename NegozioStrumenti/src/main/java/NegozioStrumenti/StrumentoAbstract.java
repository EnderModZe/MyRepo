package NegozioStrumenti;

public class StrumentoAbstract {
    private double prezzo;

    public StrumentoAbstract(){
    }
    public StrumentoAbstract(double prezzo){
        this.prezzo = prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public double getPrezzo(){
        return prezzo;
    }
}
