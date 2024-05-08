public class barchi_3E_Es16C_BooleanVector {
    public static void main(String[] args) {

        boolean [] presenti = new boolean [26];
        String frase = "La mamma di pierino";

        Vett(presenti, frase);
        Stampa(presenti);
    }

    private static void Vett(boolean []presenti, String frase) {
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                presenti [frase.charAt(i) - 'a'] = true;;
            }
        }
    }

    private static void Stampa(boolean [] presenti) { // output of the entered letters
        System.out.println("\nNella stringa compaiono i caratteri:");
        for (int i = 0; i < presenti.length; i++) {
            if (presenti[i]) { // true control array positions
                char character = (char) (i + 97); // sommo 97 ad i dove i corrispondi alla lettera in ASCII-97
                System.out.printf("%s  ", character); // poi faccio il casting della variabile
            }
        }
    }
}