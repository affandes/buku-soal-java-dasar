package bab09;

public class NestIf01 {
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 8;

        if (panjang < lebar) {
            System.out.println("Nilai panjang harus lebih besar dari lebar!");
        } else {
            if (lebar <= 0) {
                System.out.println("Nilai lebar tidak boleh 0 atau negatif!");
            } else {
                int luas = panjang * lebar;
                System.out.println("Luas = " + luas);
            }
        }
    }
}
