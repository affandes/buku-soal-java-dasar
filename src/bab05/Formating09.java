package bab05;

import java.util.Locale;

public class Formating09 {
    public static void main(String[] args) {

        String namaBarang = "Laptop";
        double hargaDasar = 12_624_500;
        double diskon = 0.21;
        double hargaNet = hargaDasar - (hargaDasar * diskon);

        Locale bahasa = new Locale("id");
        String teks = "Dijual %s dengan harga Rp%,10.0f diskon %.0f%% menjadi Rp%,10.2f";

        System.out.printf(bahasa, teks, namaBarang, hargaDasar, diskon * 100, hargaNet);
    }
}
