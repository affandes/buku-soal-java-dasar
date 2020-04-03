package day07;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Transfer berapa? (max 5jt) = ");
        int nilai = input.nextInt();
        if (nilai <= 5000000) {
            System.out.println("Transfer berhasil");
        } else {
            System.out.println("Saldo anda tidak mencukupi");
        }
    }
}
