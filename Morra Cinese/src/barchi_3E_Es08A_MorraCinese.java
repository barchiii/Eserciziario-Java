import java.util.Scanner;

public class barchi_3E_Es08A_MorraCinese {
    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char player1;
        char player2 = 0;
        int check1 = 0;
        int check2 = 0;

        do {
            do {
                ClrScr();
                System.out.println("Giocatore 1: Inserisci A per carta, S per sasso, D per forbici, o X per uscire");
                player1 = keyboard.next().toLowerCase().charAt(0);
                ClrScr();

                if (player1 == 'X' || player1 == 'x')
                    check1 = 2;
                    // game finished by player 1

                else if (player1 == 'A' || player1 == 'a' ||
                        player1 == 'S' || player1 == 's' ||
                        player1 == 'D' || player1 == 'd') {
                    do {
                        System.out.println("Giocatore 2: Inserisci J per carta, K per sasso, L per forbici, o X per uscire");
                        player2 = keyboard.next().toLowerCase().charAt(0);
                        ClrScr();

                        if (player2 == 'X' || player2 == 'x')
                            check2 = 2;
                            // game finished by player 2

                        else if (player2 == 'J' || player2 == 'j' ||
                                player2 == 'K' || player2 == 'k' ||
                                player2 == 'L' || player2 == 'l')
                            check2 = 1;

                            // Value entered by valid player2, we continue with the verification of the winner
                        else
                            System.out.println("Input non valido per il Giocatore 2. Riprova");
                        // Value entered by player2 invalid, input is repeated

                    } while (check2 == 0);

                    check1 = 1;
                }
                // Valid player1 entered values

                else
                    System.out.println("Input non valido per il Giocatore 1. Riprova");
                // Invalid value entered by player1, the game is repeated

            } while (check1 == 0);

            if (check1 == 2 || check2 == 2) {
                System.out.println("Gioco terminato.");
            }
            // Output end game

            else {
                if (player1 == 'A' || player1 == 'a') {
                    if (player2 == 'J' || player2 == 'j')
                        System.out.println("Parità!");


                    else if (player2 == 'K' || player2 == 'k')
                        System.out.println("Giocatore 1 ha vinto!");


                    else
                        System.out.println("Giocatore 2 ha vinto!");

                }
                // Player 1 inserts A, control winner

                if (player1 == 'S' || player1 == 's') {
                    if (player2 == 'J' || player2 == 'j')
                        System.out.println("Giocatore 2 ha vinto!");


                    else if (player2 == 'K' || player2 == 'k')
                        System.out.println("Parità!");


                    else
                        System.out.println("Giocatore 1 ha vinto!");

                }
                // Player 1 inserts S, control winner

                if (player1 == 'D' || player1 == 'd') {
                    if (player2 == 'J' || player2 == 'j')
                        System.out.println("Giocatore 1 ha vinto!");


                    else if (player2 == 'K' || player2 == 'k')
                        System.out.println("Giocatore 2 ha vinto!");


                    else
                        System.out.println("Parità!");

                }
                // Player 1 inserts D, control winner
            }

        } while (!(player1 == 'X' || player1 == 'x' || player2 == 'X' || player2 == 'x'));
        // cycle whether to continue playing or not

    }
} // end