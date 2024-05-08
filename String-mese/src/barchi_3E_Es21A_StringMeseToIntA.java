import java.util.Scanner;

public class barchi_3E_Es21A_StringMeseToIntA {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String meseString;
        int meseInt;

        do {
            System.out.println("Inserisci il mese a parole, es: GENNAIO");
            meseString = kb.nextLine().toLowerCase();

            meseInt = intToStrMese(meseString);

            if (meseInt == -1)
                System.out.println("Il mese inserito non esiste,\nRINSERIRE ");
            else
                System.out.println("Il mese inserito, ovvero " + meseString + " è il numero " + meseInt);
        } while (meseInt == -1);
    }

    public static int intToStrMese(String mese) {
        switch (mese) {
            case "GENNAIO":
                return 1;

            case "FEBBRAIO":
                return 2;

            case "MARZO":
                return 3;

            case "APRILE":
                return 4;

            case "MAGGIO":
                return 5;

            case "GIUGNO":
                return 6;

            case "LUGLIO":
                return 7;

            case "AGOSTO":
                return 8;

            case "SETTEMBRE":
                return 9;

            case "OTTOBRE":
                return 10;

            case "NOVEMBRE":
                return 11;

            case "DICEMBRE":
                return 12;

            default:
                return -1;
        }
    }
}