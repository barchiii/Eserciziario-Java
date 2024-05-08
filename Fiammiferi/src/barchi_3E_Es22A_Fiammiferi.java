/*Il gioco dei 21 fiammiferi è una gara tra due
giocatori che, a turno, possono prelevare,
dall’insieme iniziale dei 21 fiammiferi, da 1 a 3 fiammiferi.
Il gioco e vinto dal giocatore che preleva l’ultimo fiammifero.*/

import java.util.Scanner;
import java.util.Random;
public class barchi_3E_Es22A_Fiammiferi {
    public static void main(String[] args) {
        //Object Scanner and Random
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        String [] sFiamm={"|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|",};
        String [] tFiamm={"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"};

        //Variables declaration
        int choice = 0, fiammiferi = 21;

        String[] opzioni = {
                "Cosa vuoi fare",
                "[1] - Player VS Player",
                "[2] - Player VS PC",
                "[3] - Player VS PC fortissimo",
                "[4] - Quit"
        };

        choice = printMenu(opzioni, kb);

        //switch "scelta"
        switch (choice)
        {
            case 1: //Player vs Player
                sfidaPvsP(fiammiferi, kb, random, choice, sFiamm, tFiamm);
                break;

            case 2: //Player vs PC
                sfidaPvsPc(fiammiferi, kb, random, choice, sFiamm, tFiamm);
                break;

            case 3: //Player vs PC GOD
                sfidaPvsPc(fiammiferi, kb, random, choice, sFiamm, tFiamm);
                break;

            default:
                System.out.println("\nGrazie per aver giocato!");
                break;
        }
    }

    //Player vs Player
    private static void sfidaPvsP(int fiammiferi, Scanner kb, Random random, int choice, String[] sFiamm, String tFiamm[]) {

        //Counter for the win
        int j=0;
        //Cycle for like a while with a counter
        for (int i = 0; fiammiferi > 3; i++)
        {
            //Subtract fiammiferi
            fiammiferi = prendiFiammiferi(fiammiferi, i, kb, random, choice);
            stampaFiammiferi(fiammiferi, sFiamm, tFiamm);
            j = i;
        }
        //Who wins
        if (j % 2 != 0) {
            System.out.println("\nHa vinto il Player 1");
        }
        else {
            System.out.println("\nHa vinto il Player 2");
        }
    }

    private static void sfidaPvsPc(int fiammiferi, Scanner kb, Random random, int choice, String[] sFiamm, String tFiamm[])
    {
        //Counter for the win
        int j = 0;
        //Cycle for like a while with a counter
        for (int i = 0; fiammiferi > 3 ; i++)
        {
            fiammiferi = prendiFiammiferi(fiammiferi, i, kb, random, choice);
            stampaFiammiferi(fiammiferi, sFiamm, tFiamm);
            j = i;
        }

        if (j % 2 != 0) {
            System.out.println("\nHa vinto il Player 1");
        }
        else {
            System.out.println("\nHa vinto il PC");
        }
    }

    //Subtract fiammiferi
    private static int prendiFiammiferi(int fiammiferi, int i, Scanner kb, Random random, int choice)
    {
        int taken = 0;
        //Check
        do {
            if (i % 2 == 0){
                System.out.println("\nP1 scegli i fiammiferi\n(MIN 1 - Max 3)");
                taken = kb.nextInt();
            }

            else if (choice == 1){
                System.out.println("\n\nP2 scegli i fiammiferi\n(MIN 1 - Max 3)");
                taken = kb.nextInt();
            }

            else if (choice == 2){ //Normal PC
                taken = fiammiferiPc(random);
                System.out.println("Il pc prende: "+ taken);
            }
            else{//PC always wins
                taken = fiammiferiPcAlwaysWin(fiammiferi);
                System.out.println("\nIl pc forte prende: " + taken);
            }
            //Check
            if (taken > 3 || taken <= 0)
                System.out.println("\nFiammiferi presi non valido\nREINSERIRE");
        }while (taken > 3 || taken <= 0);

        return fiammiferi - taken;
    }

    //PC always wins
    private static int fiammiferiPcAlwaysWin(int fiammiferi) {

        if ((fiammiferi - 1) % 4 == 0 || (fiammiferi - 5) % 4 == 0 || (fiammiferi - 9) % 4 == 0) {
            return 1;
        }
        else if ((fiammiferi - 10) % 4 == 0 || (fiammiferi - 6) % 4 == 0 || (fiammiferi - 2) % 4 == 0) {
            return 2;
        }
        else if (fiammiferi % 4 == 0){//if the player insert always 1
            return 1;
        }
        else {//take 3
            return 3;
        }
    }

    //PC normal
    private static int fiammiferiPc(Random random)
    {
        return random.nextInt(1, 4);
    }

    //print menu
    public static int printMenu (String[] opzioni, Scanner kb)
    {
        int choice;

        do {
            ClrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i=1; i < opzioni.length; i++)
            {
                System.out.println(opzioni[i]);
            }

            choice = Integer.parseInt(kb.nextLine());

            if ((choice < 1 ) || (choice > opzioni.length -1 ))
            {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((choice < 1 ) || (choice > opzioni.length -1 ));

        return choice;
    }

    public static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try{
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void stampaFiammiferi(int fiammiferi,String [] sFiamm,String [] tFiamm){
        System.out.println("Fiammiferi rimanenti: "+fiammiferi+"");
        for(int i=0;i<fiammiferi;i++){
            System.out.printf(tFiamm[i]);
        }
        System.out.printf("\n");
        for(int i=0;i<fiammiferi;i++){
            System.out.printf(sFiamm[i]);
        }
    }
}