public class barchi_3E_Es18A_Maiuscole {
    public static void main(String[] args) {
        String[] disney = {"Pippo", "pluto", "Topolino", "minnie"};
        show(getUpWord(disney));

    }
    private static String[] getUpWord(String[] disney) {
        String[] maiuscola = new String[disney.length];
        for (int i = 0; i < disney.length; i++){
            if(disney[i].charAt(0) >= 'A' && disney[i].charAt(0) <= 'Z') {
                maiuscola[i] = disney[i];
            }
        }
        return maiuscola;
    }

    private static void show(String[] up) {
        for (int i = 0; i < up.length; i++) {
            if (up[i] != null) {
                System.out.println(up[i]);
            }
        }
    }
}