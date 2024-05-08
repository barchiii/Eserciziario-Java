import java.util.Scanner;

public class barchi_3E_Es21A_StringToIntB {
    public static void main(String[] args) {
        String ggmmaaaa = "12042024";

        Integer Valore1 = Integer.parseInt(ggmmaaaa);

        System.out.println(Valore1);

        //da stringa a int
        int valore1 = Integer.parseInt(ggmmaaaa);
        System.out.println(valore1);

        //conversione binaria
        valore1 = Integer.parseInt("1000", 2);
        System.out.println(valore1);

        //conversione esadecimale
        valore1 = Integer.parseInt("FF", 16);
        System.out.println(valore1);

        // se presenta un'eccezzione il programma la passa alla parte cathc
        try {
            valore1 = Integer.parseInt("a" + ggmmaaaa);
        } catch(Exception x) {
            System.out.println("Errore : stringa non valida");
        }

        Scanner kb = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Inserisci un valore intero");
        boolean error = false;
        do {
            error = false;
            System.out.println("Inserisci un valore intero:");
            try {
                userInput = kb.nextInt();
            } catch(Exception x) {
                System.out.println("Il valore inserito non è un numero");
                error = true;
                kb.nextLine();
            }
        } while (error);

        System.out.println("Valore inserito: " + userInput);

    }
}