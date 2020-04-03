package bab06;

import java.util.Scanner;

public class OpComp02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Angka: ");
        int angka = input.nextInt();
        boolean hasil = angka != 10;
        System.out.println(hasil);
    }
}
