package bab05;

import java.util.Locale;

public class Formating08 {
    public static void main(String[] args) {
        int angka1 = 13;
        int angka2 = 2101;
        int angka3 = 231242;

        Locale bahasa = new Locale("id");

        System.out.printf(bahasa, "Poin anda : %,8d \n", angka1);
        System.out.printf(bahasa, "Poin anda : %,8d \n", angka2);
        System.out.printf(bahasa, "Poin anda : %,8d \n", angka3);
    }
}
