import java.util.Scanner;
public class barchi_3E_Es05A_Byte {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String num = "";

        boolean flagByte = true;

        System.out.println("Inserisci un valore Byte");
        num = keyboard.nextLine();
        if (num.length() != 8)
            System.out.println("Non è un byte");

        else {
            for (int indice = 0; indice < num.length(); indice++){
                System.out.println(num.charAt(indice));

                if (!(num.charAt(indice) == '1' || num.charAt(indice) == '0')) {
                    flagByte = false;
                }
            }

            if (flagByte)
                System.out.println("E' un Byte");
            else
                System.out.println("Non è un Byte");
        }//end


        System.out.println("Fine programma");
    }
}