package day07;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai (0-10) = ");
        int nilai = input.nextInt();
        if (nilai > 5) {
            System.out.println("Selamat, anda lulus");
        } else {
            System.out.println("Anda tidak lulus!");
        }
    }
}
