import java.util.Scanner;
import static tools.utility.*;
public class Main {
    public static String[] tipologia={"TIPO GENERE", "giallo", "horror", "fantasy"};

    public static void main(String[] args) {
        String[] operazioni = {"LIBRERIA",
                "Inserimento",
                "Visualizzazione",
                "Ricerca",
                "Stampa autore",
                "Elimina libro",
                "Stampa archivio(anche eliminati)",
                "Ordine alfabetico titolo",
                "Ordine alfabetico autore",
                "Fine"};
        final int nMax=3;
        int libriInseriti=0;
        int posLibro=0;
        int scelta;
        Libro[] scaffale = new Libro[nMax];

        Scanner kb = new Scanner(System.in);
        boolean fine = true;
        do{
            scelta=menu(operazioni,kb);
            switch(scelta){
                case 1:
                    ClrScr();
                    if(libriInseriti<nMax) {
                        scaffale[libriInseriti] = leggiLibro(true, kb);

                        if (checkLibro(scaffale[libriInseriti].titolo, scaffale, libriInseriti) < 0)
                            libriInseriti++;
                        else
                            System.out.println("Libro già inserito");
                    }
                    else
                        System.out.println("Scaffale pieno");

                    break;
                case 2:
                    ClrScr();
                    visualizzaLibri(scaffale, libriInseriti);
                    break;
                case 3:
                    ClrScr();
                    /* ricerca contatto */
                    posLibro=posLibro(scaffale, libriInseriti, kb);
                    /* output differenziato */
                    if(posLibro>=0) //se il contatto è stato trovato
                        System.out.println(scaffale[posLibro].stampa()); //stampa le informazioni del contratto
                    else
                        System.out.println("Libro non trovato"); //altrimenti riporto messaggio di errore
                    break;
                case 4:
                    ClrScr();
                    posLibro=posLibro(scaffale, libriInseriti, kb);
                    if(posLibro>=0)
                        System.out.printf("Autore: %s\n",scaffale[posLibro].getAutore());
                    else
                        System.out.println("Libro non trovato");
                    break;
                case 5:
                    ClrScr();
                    posLibro = posLibro(scaffale, libriInseriti, kb); //ricerca posizione contratto

                    if(posLibro>=0){
                        eliminaLibro(posLibro, scaffale, libriInseriti); //cancello l'elemento nell'array
                        libriInseriti--; //diminuisco il numero di contratti vendutiù
                        System.out.println("Libro eliminato con successo"); //output di operazione riuscita
                    }
                    break;
                case 6:
                    ClrScr();
                    visualizzaLibri(scaffale, libriInseriti);//non stampa eliminati
                    break;
                case 7:
                    scaffale = ordinaTitolo(scaffale);
                    System.out.println("L'elenco è orinato alfabeticamente secondo il titolo");
                    break;
                case 8:
                    scaffale = ordinaAutore(scaffale);
                    System.out.println("L'elenco è orinato alfabeticamente secondo l'autore");
                    break;
                default:
                    ClrScr();
                    fine=false; //cambio valore booleano e esco dal ciclo
                    System.out.println("Fine programma");
            }
            Wait(1);
        }while(fine);
    }
    private static Libro leggiLibro(boolean siLibro, Scanner kb){
        String titolo, editore, autore;
        double prezzo = 0;
        genere tipo = genere.undefined;
        ClrScr();
        System.out.println("Inserisci il titolo");
        titolo= kb.nextLine();
        System.out.println("Inserisci il autore");
        autore= kb.nextLine();
        System.out.println("Inserisci il editore");
        editore= kb.nextLine();

        if(siLibro){
            System.out.println("Inserisci il prezzo");
            prezzo= kb.nextDouble();
            tipo=genere.valueOf(tipologia[sceltaTipologia(kb)]);
        }

        return new Libro(titolo, editore, autore, tipo, prezzo);
    }

    private static int sceltaTipologia(Scanner kb){
        int scelta;

        /* input tipologia */
        scelta=menu(tipologia, kb);

        return scelta;
    }

    private static int checkLibro(String titolo, Libro[] vet, int libriInseriti){
        /* scorro tutti i valori */
        for(int i=0;i<libriInseriti;i++)
        {
            /* se un contratto corrisponde
             * a quello inserito, ritorno il valore */
            if(titolo.equalsIgnoreCase(vet[i].titolo.toLowerCase()))
                return i;
        }

        return -1; //altrimenti ritorno un valore negativo
    }

    private static void visualizzaLibri(Libro[] vet, int libriInseriti){
        if(libriInseriti>0){
            for(int i=0; i<libriInseriti; i++){
                System.out.println(vet[i].stampa());
            }
        }
        else
            System.out.println("Non ci sono libri nello scaffale");
    }

    private static int posLibro(Libro[] vet, int libriInseriti, Scanner kb){
        String titolo;
        int pos = 0;

        if(libriInseriti==0)
            System.out.println("Non ci sono libri nello scaffale");
        else{
            System.out.println("Inserisci il titolo");
            titolo=kb.nextLine();

            pos=checkLibro(titolo, vet, libriInseriti);

            if(pos>=0)
                return pos;
        }
        return -1;
    }

    private static void eliminaLibro(int pos, Libro[] vet, int libriInseriti){
        for(int i=0; i<libriInseriti;i++){
            vet[i-1]=vet[i];
        }
        if(pos==libriInseriti-1)
            vet[pos]=null;

    }

    private static Libro[] ordinaTitolo(Libro[] vet){
        Libro temp;
        for(int i=0; i<vet.length-1;i++){
            for(int t=0; t<vet.length-1;t++){
                for(int k=0;k<vet.length-1;k++)
                    if(vet[i].titolo.charAt(k) < vet[t].titolo.charAt(k)){
                        temp = vet[i];
                        vet[i]=vet[k];
                        vet[k]=temp;
                    }
            }
        }
        return vet;
    }

    private static Libro[] ordinaAutore(Libro[] vet){
        Libro temp;
        for(int i=0; i<vet.length-1;i++){
            for(int k=0; k<vet.length-1;k++){
                for(int t=0;t<vet.length-1;t++)
                    if(vet[i].titolo.charAt(t) < vet[k].titolo.charAt(t)){
                        temp = vet[i];
                        vet[i]=vet[k];
                        vet[k]=temp;
                    }

                    else if (vet[i].autore.equals(vet[k])) {
                        if (vet[i].titolo.charAt(t) < vet[k].titolo.charAt(t)) {
                            temp = vet[i];
                            vet[i] = vet[k];
                            vet[k] = temp;
                        }
                    }
            }
        }
        return vet;
    }
}