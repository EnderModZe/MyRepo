package NegozioStrumenti;

public class Pianoforte extends StrumentoAbstract{
    private boolean aCoda;
    private boolean elettronico;

    public Pianoforte(){
        super();
    }
    public Pianoforte(boolean aCoda, boolean elettronico, double prezzo){
        super(prezzo);
        this.aCoda = aCoda;
        this.elettronico = elettronico;
    }

    public void setACoda(boolean aCoda){
        this.aCoda = aCoda;
    }
    public boolean isACoda(){
        return aCoda;
    }

    public void setElettronico(boolean elettronico){
        this.elettronico = elettronico;
    }
    public boolean isElettronico(){
        return elettronico;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pianoforte [");
        if(isACoda()) sb.append("A coda,");
        else sb.append("Verticale,");

        if(isElettronico()) sb.append(" Elettronico]");
        else sb.append(" Acustico]");

        sb.append(getPrezzo()+" €");

        return sb.toString();
    }
}
