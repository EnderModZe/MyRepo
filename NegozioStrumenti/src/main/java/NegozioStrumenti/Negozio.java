package NegozioStrumenti;

import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private List<StrumentoAbstract> inventario = new ArrayList<>();
    private String nomeNegozio;
    private int pIva;

    public Negozio(){
    }

    public Negozio(String nomeNegozio, int pIva){
        this.nomeNegozio = nomeNegozio;
        this.pIva = pIva;
    }

    public void addInventario(StrumentoAbstract strumento){
        inventario.add(strumento);
    }
    public List<StrumentoAbstract> getInventario(){
        return inventario;
    }

    public void setNomeNegozio(String nomeNegozio){
        this.nomeNegozio = nomeNegozio;
    }
    public String getNomeNegozio(){
        return nomeNegozio;
    }

    public void setPIva(int pIva){
        this.pIva = pIva;
    }
    public int getPIva(){
        return pIva;
    }

    public double mediaPrezziInventario(){
        int count=0;
        double somma=0;
        for (StrumentoAbstract s : inventario){
            somma += s.getPrezzo();
            count++;
        }
        return somma/count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNomeNegozio()+" "+getPIva());
        return sb.toString();
    }
}
