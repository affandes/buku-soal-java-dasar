package bab04;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Panjang tanah : ");
        double panjang = input.nextDouble();
        System.out.print("Lebar tanah : ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas = " + luas);
    }
}
