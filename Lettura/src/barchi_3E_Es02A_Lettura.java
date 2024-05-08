// type of variables
import java.util.Scanner;
public class barchi_3E_Es02A_Lettura {
    public static void main(String[] args)
    {
        System.out.println("Lettura dei dati in java");
        Scanner keyboard=new Scanner(System.in);
        int datoint;
        double datodouble;
        byte datobyte;
        float datofloat;
        boolean datoboolean=true;
        char datochar;
        String datostring;

        datoint=keyboard.nextInt();
        System.out.println("Dato intero: "+datoint); //"An integer is comprised of 4 bytes."

        datodouble=keyboard.nextDouble();
        System.out.println("Dato Double: "+datodouble);//"A double data type is comprised of 8 bytes."

        datobyte=keyboard.nextByte();
        System.out.println("Dato Byte: "+datobyte);//"A byte data type is comprised of 1 byte."

        datofloat=keyboard.nextFloat();
        System.out.println("Dato Float: "+datofloat);//"A float data type is comprised of 4 bytes."

        System.out.println("Dato Boolean: "+datoboolean);//" A boolean data type is typically represented by 1 byte."

        datochar=keyboard.next().charAt(0);//"0 indicates the position of the character in the word."
        System.out.println("Dato Char: "+datochar);//"A char data type is comprised of 1 byte."

        datostring=keyboard.nextLine();
        System.out.println("Dato Stringa: "+datostring);//?
    }
}
