/* Programma che chiede quanti bottiglioni acquistare
 ne calcola il costo
 calcola l'iva
 calcola il costo finale
 restituendo lo scontrino dell'acquisto. */

/* Program that asks how many large bottles to purchase,
 * calculates the cost,
 * calculates the VAT (Value Added Tax),
 * calculates the final cost,
 * and returns the purchase receipt. */

import java.util.Scanner;
public class barchi_3E_Es03C_Vinaio {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int bottiglioni;
        int scelta;
        double capacita = 1.5;
        double costoTot;
        double iva;
        double totP;
        double tot = 0;
        double costoB = 1.5;
        double costoL = 2;
        double costoM = 1;
        String risposta = "";
        int clienti = 0;

        do
        {
            System.out.println("Che tipo di vino vuoi acquistare?");
            System.out.println("    Premere 1 per acquistare bottiglioni di Barbera");
            System.out.println("    Premere 2 per acquistare bottiglioni di Lugana");
            System.out.println("    Premere 3 per acquistare bottiglioni di Merlot");
            scelta = keyboard.nextInt();

            if (scelta == 1)
            {
                do {

                    System.out.println("Quanti bottiglioni di Barbera vuoi acquistare?");
                    bottiglioni = keyboard.nextInt();

                } while (bottiglioni <= 0); //"Bottle quantity input validation."
                costoTot = bottiglioni * capacita * costoB;
                iva = costoTot * 0.21;
                totP = costoTot + iva;
                clienti = clienti + 1;
                tot = tot + totP;

                System.out.println("    Numero di bottiglioni di Barbera acquistati: " + bottiglioni);
                System.out.println("    Prezzo di vendita senza IVA: " + costoTot + "€");
                System.out.println("    Iva 21% applicata: " + iva + "€");
                System.out.println("    Numero di clienti: " + clienti);
                System.out.println("    -----------------------");
                System.out.println("    Prezzo finale: " + totP + "€");
                scelta = 0;

            }

            if (scelta == 2){
                do {

                    System.out.println("Quanti bottiglioni di Lugana vuoi acquistare?");
                    bottiglioni = keyboard.nextInt();

                } while (bottiglioni <= 0);
                costoTot = bottiglioni * capacita * costoL;
                iva = costoTot * 0.21;
                totP = costoTot + iva;
                clienti = clienti + 1;
                tot = tot + totP;

                System.out.println("    Numero di bottiglioni di Lugana acquistati: " + bottiglioni);
                System.out.println("    Prezzo di vendita senza IVA: " + costoTot + "€");
                System.out.println("    Iva 21% applicata: " + iva + "€");
                System.out.println("    Numero di clienti: " + clienti);
                System.out.println("    -----------------------");
                System.out.println("    Prezzo finale: " + totP + "€");
                scelta = 0;

            }

            if (scelta == 3){
                do {

                    System.out.println("Quanti bottiglioni di Merlot vuoi acquistare?");
                    bottiglioni = keyboard.nextInt();

                } while (bottiglioni <= 0);
                costoTot = bottiglioni * capacita * costoM;
                iva = costoTot * 0.21;
                totP = costoTot + iva;
                clienti = clienti + 1;
                tot = tot + totP;

                System.out.println("    Numero di bottiglioni di Merlot acquistati: " + bottiglioni);
                System.out.println("    Prezzo di vendita senza IVA: " + costoTot + "€");
                System.out.println("    Iva 21% applicata: " + iva + "€");
                System.out.println("    Numero di clienti: " + clienti);
                System.out.println("    -----------------------");
                System.out.println("    Prezzo finale: " + totP + "€");
                scelta = 0;

            }

            System.out.println("C'è un altro cliente? (S/N)");
            risposta = keyboard.nextLine().toUpperCase();
            risposta = keyboard.nextLine().toUpperCase();

            System.out.println("------------------------");
            System.out.println("Il prezzo finale è: " + tot);

        }while(risposta.equals("S"));


        System.out.println("Fine programma");
    }
}