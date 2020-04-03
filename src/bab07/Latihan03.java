package day07;

import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai (0-10) = ");
        int nilai = input.nextInt();

        if (nilai % 2 == 0) {
            System.out.println(nilai + " adalah bilangan genap");
        } else {
            System.out.println(nilai + " adalah bilangan ganjil");
        }
    }
}
