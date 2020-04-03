package bab04;

import java.util.Scanner;

public class Latihan03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double angka = 0;

        do {
            System.out.print("Angka : ");
            if (input.hasNextDouble()) {
                angka = input.nextDouble();
            } else {
                System.out.println("Coba inputkan angka!");
                input.nextLine();
            }
        } while (angka <= 0);

        System.out.println("Angka kamu = " + angka);
    }
}
