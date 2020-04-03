package day08;

public class BelajarWhile02 {
    public static void main(String[] args) {
        int anakAyam = 10;
        while (anakAyam > 0) {
            System.out.printf("Anak ayam ada %d, mati 1 tinggal %d%n", anakAyam, anakAyam - 1);
            anakAyam--;
        }
    }
}
