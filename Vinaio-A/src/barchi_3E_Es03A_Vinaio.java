/* Programma che chiede quanti bottiglioni acquistare
 *  ne calcola il costo
 *  calcola l'iva
 *  calcola il costo finale
 *  restituendo lo scontrino dell'acquisto. */

/* Program that asks how many large bottles to purchase,
 * calculates the cost,
 * calculates the VAT (Value Added Tax),
 * calculates the final cost,
 * and returns the purchase receipt. */

import java.util.Scanner;
public class barchi_3E_Es03A_Vinaio {
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int bottiglioni;
        double capacita = 1.5;
        double costoLitro = 1.0;
        double costoTot;
        double iva;
        double tot;

        System.out.println("Quanti bottiglioni vuoi acquistare?");
        bottiglioni = keyboard.nextInt();
        // check and calculations
        if (bottiglioni > 0)
        {
            costoTot = bottiglioni * capacita * costoLitro;
            iva = costoTot * 0.21;
            tot = costoTot + iva;

            // output
            System.out.println("Numero di bottiglioni acquistati: " +bottiglioni);
            System.out.println("Prezzo di vendita senza IVA: " +costoTot +"€");
            System.out.println("Iva applicata: " +iva +"€");
            System.out.println("Prezzo finale: " +tot +"€");
        }

        else
        {
            System.out.println("Hai inserito un numero di bottiglioni minore o uguale a zero!");
        }

    }
}