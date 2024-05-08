import java.util.Random;
import java.util.Scanner;

public class barchi_3E_Es15B_EstrazioniVeneziaBoleano {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random caso = new Random();
        int scelta;
        int cont, nGiusti = 0;
        int[] nEstratti = new int[5];
        int[] nG1 = new int[5];
        boolean ordine = false;
        boolean[] check = new boolean[90];

        for (int k = 0; k < check.length; k++) {
            check[k] = false;
        }
        do {
            // menu option
            String[] opzioni = {"=== Gioco Dadi === ",
                    "[1] Estrazioni ruota di Venezia",
                    "[2] Giocata utente",
                    "[3] Verifica vincita",
                    "[4] Visualizza giocate",
                    "[5] Exit"
            };

            // show the menu and choice the options
            scelta = Menu(opzioni, kb);
            Wait(2000);

            switch (scelta) {
                case 1:
                    // Extract casual numbers
                    for (int i = 0; i < nEstratti.length; i++) {
                        nEstratti[i] = Estrazione(caso, nEstratti, i, check);
                        System.out.println(nEstratti[i]);
                    }
                    System.out.println("numeri estratti");
                    break;

                case 2:
                    // player input
                    for (int i = 0; i < nG1.length; i++) {
                        do {
                            System.out.println("Inserisci il " + (i + 1) + " numero");
                            nG1[i] = kb.nextInt();


                            // check
                            for (int j = 0; j < i; j++) {
                                if (nG1[i] == nG1[j]) {
                                    System.out.println("Numero già inserito. Riprova.");
                                    break;
                                }
                            }

                        } while (!(nG1[i] >= 1 && nG1[i] <= 90));
                    }
                    System.out.println("\nnumeri inseriti");
                    break;

                case 3:
                    // check win
                    if (nG1[0] == 0) {
                        System.out.println("Devi prima inserire i numeri giocati.");
                        break;
                    }
                    ordine = true;

                    for (int i = 0; i < nG1.length; i++) {
                        cont = VerificaVincita(i, nEstratti, nG1);
                        nGiusti = nGiusti + cont;
                    }
                    break;

                case 4:
                    // show the result of the games
                    if (ordine==false)
                    {
                        System.out.println("Devi prima verificare la vincità.");
                        break;
                    }
                    if (nGiusti > 0)
                        System.out.println("\nHai indovinato " + nGiusti + " numeri");
                    else
                        System.out.println("\n Non è stato indovinato nessun numero");

                    nGiusti = 0;
                    break;

                case 5:
                    // exit
                    break;
            }
        } while (scelta != 5);

        Wait(2000);
    }

    // function menu
    private static int Menu(String opzioni[], Scanner kb) {
        int scelta;

        do {
            ClrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);
            }
            scelta = kb.nextInt();

            // Controllo se la scelta è valida
            if (scelta < 1 || scelta > opzioni.length) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        } while (scelta < 1 || scelta > opzioni.length - 1);

        return scelta;
    }

    // extract the numbers
    private static int Estrazione(Random caso, int nEstratti[], int i, boolean[] check) {
        nEstratti[i] = caso.nextInt(0,90) + 1;

        // boolean check
        if (check[nEstratti[i]-1]) {
            nEstratti[i] = caso.nextInt(0, 90) +1;
        }
        check[nEstratti[i]-1] = true;

        return nEstratti[i];
    }

    // verifica la vincita
    private static int VerificaVincita(int i, int nEstratti[], int nG1[]) {
        int contaGiusti = 0;
        for (int j = 0; j < nEstratti.length; j++) {
            if (nG1[i] == nEstratti[j]) {
                contaGiusti++;
            }
        }
        return contaGiusti;
    }

    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}