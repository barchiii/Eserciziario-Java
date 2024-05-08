/*
=== APP Gara Dadi ===
[1]-Sfida tra due giocatori
[2]-Sfida contro il computer
[3]-Fine

metodo menu
*/

import java.util.Scanner;
import java.util.Random;
public class barchi_3E_Es14C_GaraDadi {
    public static void main(String[] args)
    {
        //variable declaration
        int d1, d2, caso;
        int scelta;
        boolean exit = true;
        Scanner kb = new Scanner(System.in);

        //repeat until the user press 3
        do {
            String [] opzioni = {"=== Gioco Dadi ===",
                    "[1] Sfida tra due giocatori",
                    "[2] Sfida contro il computer",
                    "[3] Exit"};
            scelta = Menu(opzioni, kb);

            switch (scelta) { // swich case
                case 1:
                {
                    caso=1;
                    System.out.println("Estrazione dei dadi...\n");
                    Wait(1000);
                    d1 = estraiDado();
                    System.out.println("Giocatore 1 ha estratto: " + d1);
                    FacceDado(d1);
                    Wait(1000);
                    d2 = estraiDado();
                    System.out.println("Giocatore 2 ha estratto: " + d2);
                    FacceDado(d2);
                    Vincitore(d1, d2, caso);
                    Wait(2000);
                    break;
                }
                case 2:
                {
                    caso=2;
                    System.out.println("Estrazione dei dadi...\n");
                    Wait(1000);
                    d1 = estraiDado();
                    System.out.println("Giocatore 1 ha estratto: " + d1);
                    FacceDado(d1);
                    Wait(1000);
                    d2 = estraiDado();
                    System.out.println("Il computer ha estratto: " + d2);
                    FacceDado(d2);
                    Vincitore(d1, d2, caso);
                    Wait(2000);
                    break;
                }
                case 3:
                {
                    System.out.println("Uscita");
                    exit = false; // flag
                    Wait(2000);
                    break;
                }
                default:
                {
                    System.out.println("Scelta errata");
                    Wait(200);
                }
            }
        }while (exit);
    }

    private static int estraiDado()
    {
        Random num = new Random();
        return num.nextInt(6) + 1;
    }

    private static int Menu (String[] opzioni, Scanner kb)
    {
        int scelta;

        do {
            ClrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i=1; i < opzioni.length; i++)
            {
                System.out.println(opzioni[i]);
            }
            scelta = kb.nextInt();

            if ((scelta < 1 ) || (scelta > opzioni.length -1 ))
            {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1 ) || (scelta > opzioni.length -1 ));

        return scelta;
    }

    private static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Vincitore(int d1, int d2, int caso)
    {

        if (d1>d2)
            System.out.println("\nHa vinto G1");

        else if (d1==d2)
            System.out.println("\nPareggio");

        else
        {
            if (caso==1)
                System.out.println("\nHa vinto G2");
            else
                System.out.println("\nHa vinto il Computer");
        }
    }


    private static void Wait(int attesa)
    {
        try
        {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void FacceDado(int faccia)
    {
        switch(faccia)
        {
            case 1: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
            case 2: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
            case 3: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
            case 4: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
            case 5: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
            case 6: {
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