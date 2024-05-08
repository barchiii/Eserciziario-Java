/* Inserire un numero intero che rappresenta i secondi trascorsi dall’inizio di oggi e mostra in
   uscita l’ora attuale espressa in hh:mm:ss (ore:minuti:secondi).
   Se l’utente inserisce un valore nullo o un valore superiore ad un giorno chiedere il
   reinserimento.
   Esempio 1:
   102(secondi) = 0(ore):1(minuto):42(secondi);
   Esempio 2:
   6662(secondi) = 1(ora):51(minuti):2(secondi) */

/* Enter an integer representing the seconds elapsed since the beginning of today
   and display the current time in the format hh:mm:ss (hours:minutes:seconds).
   If the user enters a null value or a value greater than a day, ask for re-entry.
   Example 1:
   102(seconds) = 0(hours):1(minute):42(seconds);
   Example 2:
   6662(seconds) = 1(hour):51(minutes):2(seconds) */

import java.util.Scanner;
public class barchi_3E_Es07A_Secondi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        int sec = 0;
        int min = 0;
        int ore = 0;

        do {
            System.out.println("Inserisci il numero di secondi");
            num = keyboard.nextInt();

            if(num > 86400)
                System.out.println("Errato! Hai inserito un valore maggiore di un giorno! Riprova.");
            else
                System.out.println("Errato! Hai inserito un valore negativo! Riprova.");
        }while(num < 0 || num > 86400);

        while (num >= 60) {
            num = num - 60;
            min++;
            while (min == 60){
                min = 0;
                ore++;
            }
        }

        sec = num;
        System.out.println(ore +"(ore):" +min +"(min):" +sec +"(sec)");

    }
}