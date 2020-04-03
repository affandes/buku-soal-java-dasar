package day07;

import java.util.Scanner;

public class Latihan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi badan (cm) = ");
        int tinggi = input.nextInt();
        System.out.print("Berat badan (kg) = ");
        int berat = input.nextInt();
        int ideal = (tinggi - 100) - ((tinggi - 100) / 10);
        if (berat > ideal) {
            System.out.println("Berat anda " + (berat - ideal) + " angka di atas ideal");
        } else if (berat == ideal) {
            System.out.println("Berat anda IDEAL");
        } else {


            System.out.println("Berat anda " + (ideal - berat) + " angka di bawah ideal");
        }
    }
}
