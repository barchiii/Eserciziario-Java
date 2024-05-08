public class barchi_3E_Es19A_Week {
    public static void main(String[] args) {
        String[] settimana = {"Lunedì",
                "Martedì",
                "Mercoledì",
                "Giovedì",
                "Venerdì",
                "Sabato",
                "Domenica"};
        Show(settimana);
    }

    private static void Show(String[] settimana) {
        int disp = 0;
        for (int i = 0; i < settimana.length; i++) {
            System.out.printf(settimana[i] + " e': ");
            switch (disp) {
                case 0: {
                    System.out.printf("dispari\n");
                    disp = 1;
                }
                break;

                case 1: {
                    System.out.printf("pari\n");
                    disp = 0;
                }
                break;
            }
        }
    }
}