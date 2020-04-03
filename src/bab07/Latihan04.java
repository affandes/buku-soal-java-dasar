package day07;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai (-100 sampai 100) = ");
        int nilai = input.nextInt();
        if (nilai >= 0) {
            System.out.println(nilai + " adalah bilangan positif");
        } else {
            System.out.println(nilai + " adalah bilangan negatif");
        }
    }
}
