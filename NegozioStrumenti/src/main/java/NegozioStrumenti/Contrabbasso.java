package NegozioStrumenti;

public class Contrabbasso extends StrumentoAbstract{
    private boolean elettronico;

    public Contrabbasso(){
        super();
    }
    public Contrabbasso(boolean elettronico, double prezzo){
        super(prezzo);
        this.elettronico = elettronico;
    }

    public void setElettronico(boolean elettronico){
        this.elettronico = elettronico;
    }
    public boolean isElettronico(){
        return elettronico;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Contrabbasso [");

        if(isElettronico()) sb.append("Elettronico]");
        else sb.append("Acustico]");

        sb.append(getPrezzo()+" €");
        return sb.toString();
    }
}
