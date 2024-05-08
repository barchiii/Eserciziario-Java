import java.util.Scanner;

public class barchi_3E_Es06B_BinarioDecimaleMath {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String numeroBinario = ""; // input
        double numeroDecimale = 0; // output

        // "Calculation variables."
        double carattere = 0;
        double potenza = 1;
        boolean flagBinario = true;

        System.out.println("Conversione numero binario in numero decimale\n");

        // "acquire a binary number."
        System.out.println("Inserisci un numero binario: ");
        numeroBinario = keyboard.next();

        // "inside the loop until I reach the end of the number."
        for (int i = numeroBinario.length(); i > 0 && flagBinario; i--) {

            carattere = (double)numeroBinario.charAt(i - 1) - 48;

            // "check if the character is 0 or 1."
            // "If yes, then I calculate the number."
            if (numeroBinario.charAt(i - 1) == '1' || numeroBinario.charAt(i - 1) == '0') {
                // FORMULA: numeroDecimale = numeroDecimale + (int)char * 2**pow
                // numeroDecimale = numeroDecimale + carattere * Math.pow(2.0, pow);
                // pow++;

                // 0 =               0         +   1        * 2 * 0
                // 0 =              1        +     0       * 2 * 1
                // 0 =               1          +   1      * 2 * 2
                numeroDecimale = numeroDecimale + carattere * potenza;
                potenza = potenza * 2;
            }
            else {
                flagBinario = false;
            }
        }

        // "If the number is valid, then I print the result."
        if (flagBinario)
            System.out.println(numeroDecimale);
        else
            System.out.println("Numero non valido");
    }
}