//"Timer up to 60 minutes."

import java.util.Scanner;

public class barchi_3E_Es10A_Cronometro {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);

        int sec = 0;
        int min = 0;
        int millis = 0;

        do {
            Timer();
            millis++;

            while (millis > 99) {
                millis = 0;
                sec++;
            }
            while (sec > 59) {
                sec = 0;
                min++;
            }

            ClrScr();
            System.out.println(min +" min : " +sec +" sec : " +millis +" millisec");
        } while (min < 60);

    }

    private static void Timer() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}