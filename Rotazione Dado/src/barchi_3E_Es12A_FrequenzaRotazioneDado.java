import java.util.Random;
public class barchi_3E_Es12A_FrequenzaRotazioneDado {
    public static void main(String[] args) {
        int n, i;

        int[] frequenza = new int[6];

        for (i = 0; i < 100; i++) {
            n = ValoreRandom(0, 6);

            // System.out.printf("Valore %d\n", val); // like in C
            // %d int
            // %f float
            // %s string

            FacceDado(n);
            frequenza[n - 1]++; // increase the counter
        }

        for (i = 0; i < frequenza.length; i++) {
            System.out.printf("Faccia %d: %d\n", i + 1, frequenza[i]);
        }
    }

    private static int ValoreRandom(int minValue, int maxValue)
    {
        Random casuale = new Random(); //Metodo che non ha nessun parametro, si chiama costruttore.

        return  casuale.nextInt(minValue,maxValue)+1;

    }
    private static void FacceDado(int valoreFaccia1)
    {
        //ALT + 201 ╔
        //ALT + 188 ╝
        //ALT + 187 ╗
        //ALT + 200 ╚
        //ALT + 205 ═
        //ALT + 186 ║

        switch (valoreFaccia1) {
            case 1 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ╚═════════╝");

                break;
            }

            case 2 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");

                break;
            }

            case 3 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 4 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 5 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 6 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
        }
    }
}