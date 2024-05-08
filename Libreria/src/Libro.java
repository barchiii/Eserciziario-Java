enum genere{giallo, horror, fantasy, undefined};
public class Libro{
    protected String titolo;
    protected String editore;
    protected String autore;
    protected genere tipo;
    protected double prezzo;

    public Libro(String titolo, String editore, String autore,genere tipo, double prezzo){
        this.titolo=titolo;
        this.editore=editore;
        this.autore=autore;
        this.tipo=tipo;
        this.prezzo=prezzo;
    }


    public String stampa(){
        if(tipo==null)
            tipo=genere.undefined;
        return String.format("Titolo: %s\tEditore: %s\nAutore: %s\tGenere: %s\tPrezzo: %.2f\n", titolo,editore,autore,tipo.toString(),prezzo);
    }

    public String getTitolo(){return this.titolo;}
    public String getEditore(){return this.editore;}
    public String getAutore(){return this.autore;}

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setTitolo(String titolo){this.titolo=titolo;}
    public void setEditore(String editore){this.editore=editore;}
    public void setAutore(String autore){this.autore=autore;}
    public void setPrezzo(double prezzo){this.prezzo=prezzo;}
    public void setTipo(genere tipo){this.tipo=tipo;}
}