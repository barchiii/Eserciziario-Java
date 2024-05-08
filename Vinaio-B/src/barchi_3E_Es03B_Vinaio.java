/* Programma che chiede quanti bottiglioni acquistare
 ne calcola il costo
 calcola l'iva
 calcola il costo finale
 restituendo lo scontrino dell'acquisto. */

/* Program that asks how many large bottles to purchase,
 calculates the cost,
 calculates the VAT (Value Added Tax),
 calculates the final cost,
 and returns the purchase receipt. */

import java.util.Scanner;
public class barchi_3E_Es03B_Vinaio {
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);

        int bottiglioni;
        double capacita = 1.5;
        double costoLitro = 1.0;
        double costoTot;
        double iva;
        double totP;
        double tot = 0;
        String risposta=""; //initialize an empty string
        int clienti=0;

        do
        {
            do
            {
                System.out.println("Quanti bottiglioni vuoi acquistare?");
                bottiglioni = keyboard.nextInt();

            } while(bottiglioni <= 0); //"Check for bottle quantity input."
            costoTot = bottiglioni * capacita * costoLitro;
            iva = costoTot * 0.21;
            totP = costoTot + iva;
            clienti = clienti + 1;
            tot = tot + totP;

            System.out.println("Numero di bottiglioni acquistati: " +bottiglioni);
            System.out.println("Numero di clienti: "+clienti);
            System.out.println("Prezzo di vendita senza IVA: " +costoTot +"€");
            System.out.println("Iva 21% applicata: " +iva +"€");
            System.out.println("-----------------------");
            System.out.println("Prezzo finale: " +totP +"€");

            System.out.println("C'è un altro cliente? (S/N)");
            risposta = keyboard.nextLine().toUpperCase();//"This clears the previous data."
            risposta = keyboard.nextLine().toUpperCase();//"Otherwise, you just write 'next'."

            System.out.println("Il prezzo finale è: "+tot);

        } while(risposta.equals("S"));

        System.out.println("Fine programma");
    }
}