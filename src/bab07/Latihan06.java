package day07;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input A = ");
        int a = input.nextInt();
        System.out.print("Input B = ");
        int b = input.nextInt();
        if (a < b) {
            System.out.println("A lebih kecil dari B");
        } else {
            System.out.println("B lebih kecil dari A");
        }
    }
}
