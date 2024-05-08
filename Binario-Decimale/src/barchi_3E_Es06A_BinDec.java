import java.util.Scanner;
public class barchi_3E_Es06A_BinDec {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String num = "";

        boolean flagByte = true;

        int decimal = 0;
        char bit;
        int position;

        System.out.println("Inserisci un valore binario");
        num = keyboard.nextLine();

        for (int i = 0; i < num.length(); i++){
            if (!(num.charAt(i) == '1' || num.charAt(i) == '0')) { // "Input validity check."
                flagByte = false;
            }

            else {
                System.out.println(num.charAt(i));
                bit = num.charAt(i);
                position = bit - '0'; // "Use the ASCII code of the character; if the bit is 1, it returns 1."
                decimal = decimal * 2 + position; // "Multiply the decimal by 2 for each bit, assigning value to the position."
                //System.out.println("decimale :" +decimal); "Temporary value check."
            }
        }

        if (flagByte)
            System.out.println("Il valore binario inserito in decimale vale: " +decimal);

        else
            System.out.println("Errato! Non hai inserito un valore binario.");

        System.out.println("Fine programma");

    }
}