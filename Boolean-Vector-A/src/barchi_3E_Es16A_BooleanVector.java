import java.util.Scanner;
public class barchi_3E_Es16A_BooleanVector {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        boolean[] val = new boolean[26]; // character control array
        String[] word = new String[26]; // array character string
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"}; // alpabhet array

        int lenght;

        // make the whole array false
        for (int i=0; i< val.length; i++)
        {
            val[i] = false;
        }

        do {
            System.out.println("Quanti caratteri vuoi inserire? (inserisci un numero compreso tra 1 e 26)");
            lenght = kb.nextInt();
        } while (lenght < 0 || lenght >= 26); // string length insertion control

        for (int i = 0; i < lenght; i++) {
            System.out.println("Inserisci il carattere nella posizione "+i);
            word[i] = kb.next(); // we use next to read characters
        }

        // checking the characters entered
        for (int j = 0; j < alphabet.length; j++) { // "j" is the position of the letter in the alphabet
            for (int k = 0; k < lenght; k++) { // we use k to iterate (scorrere) through the entered character array
                if (alphabet[j].equals(word[k])) {
                    val[k] = true; // when the character is included in the alphabet,
                    // it causes the vector cell at the corresponding position to become true
                }
            }
        }

        // output of the entered characters
        System.out.println("\nI caratteri inseriti sono: ");
        for (int enteredVal = 0; enteredVal < val.length; enteredVal++) { // entered value
            if (val[enteredVal]) { // if it's true
                System.out.printf("%s - ", alphabet[enteredVal]);
            }
        }

        // output of the not-entered characters
        System.out.println("\nI caratteri non inseriti sono: ");
        for (int nEnteredVal = 0; nEnteredVal < val.length; nEnteredVal++) { // non-entered value
            if (!val[nEnteredVal]) { // if it's false
                System.out.printf("%s - ", alphabet[nEnteredVal]);
            }
        }
    }
}