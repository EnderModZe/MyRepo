package NegozioStrumenti;

public class Tromba extends StrumentoAbstract{
    private String materiale;

    public Tromba(){
        super();
    }
    public Tromba(String materiale, double prezzo){
        super(prezzo);
        this.materiale = materiale;
    }

    public void setMateriale(String materiale){
        this.materiale = materiale;
    }
    public String getMateriale(){
        return materiale;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tromba ["+getMateriale()+"]"+getPrezzo()+" €");
        return sb.toString();
    }
}
