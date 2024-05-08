import java.util.Scanner;
public class barchi_3E_Es20A_Data {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int data;
        int day, month, year;
        String charMonths = "";
        int maxDay = 0;
        boolean bisestile = false;
        String[] months = {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO",
                "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"};

        do{
            System.out.println("Inserisci la data nel formato ggmmaaaa");
            data = kb.nextInt();

            day = data / 1000000;
            month = (data / 10000) % 100;
            year = data % 10000;

            Bisestile(year, bisestile);

            switch (month) {
                case 1,3,5,7,8,10,12:{
                    maxDay = 31;
                    break;
                }

                case 4,6,9:{
                    maxDay = 30;
                    break;
                }

                case 2:{
                    if(bisestile) {
                        maxDay = 29;
                    }
                    else {
                        maxDay = 28;
                    }

                    break;
                }
            }
        }while (day <= 0 || day > maxDay || month <= 0 || month > 12 || year < 0 || year > 9999);

        System.out.println("Giorno: " + day + "\nMese: " + month + "\nAnno: " + year + "\n\n\n");

        GetMeseInChar(month, months, charMonths);

        System.out.println("Giorno: " + day + "\nMese: " + charMonths + "\nAnno: " + year);
    }

    private static String GetMeseInChar(int month, String[] months, String charMonths) {

        for (int i = 0; i <= months.length; i++) {
            if (i == month) {
                charMonths = months[i];

            }
        }
        return charMonths;
    }

    private static boolean Bisestile(int year, boolean bisestile) {
        if (year % 4 == 0) {
            bisestile = true;
        }
        return bisestile;
    }
}