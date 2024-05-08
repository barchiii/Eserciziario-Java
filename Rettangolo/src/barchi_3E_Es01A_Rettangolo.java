import java.util.Scanner;
public class barchi_3E_Es01A_Rettangolo {
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        double altezza;
        double base;
        double area;
        double perimetro;

        System.out.println("Inserisci il valore dell'altezza");
        altezza=keyboard.nextDouble();

        // check
        if(altezza>0)
        {
            System.out.println("Inserisci il valore della base");
            base=keyboard.nextDouble();

            // calculations
            area=base*altezza;
            perimetro=(base+altezza)*2;

            // output 1
            System.out.println("L'area del rettangolo è: "+area);
            System.out.println("Il perimetro del rettangolo è: "+perimetro);
        }
        else
        {
            // output2
            System.out.println("Hai inserito un valore dell'altezza errato");
        }
    }
}