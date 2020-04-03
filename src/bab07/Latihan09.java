package day07;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama = ");
        String nama = input.next();
        System.out.print("Tahun Lahir = ");
        int tahun = input.nextInt();
        int umur = 2016 - tahun;
        if (umur > 25) {
            System.out.println("Hai Bapak " + nama);
        } else if (umur > 17) {
            System.out.println("Hai " + nama);
        } else {
            System.out.println("Hai Nak " + nama);
        }
    }
}
