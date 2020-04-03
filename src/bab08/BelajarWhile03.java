package day08;

public class BelajarWhile03 {
    public static void main(String[] args) {
        int angka = 9;
        int total = 9;
        while (angka >= 0) {
            System.out.printf("%d + %d = %d%n", angka, total - angka, total);
            angka--;
        }
    }
}
