package day07;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai (0-100) = ");
        int nilai = input.nextInt();
        if (nilai > 85) {
            System.out.println("Nilai A");
        } else if (nilai > 75) {
            System.out.println("Nilai B");
        } else if (nilai > 65) {
            System.out.println("Nilai C");
        } else if (nilai > 55) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
