package day07;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jurusan (1-5) = ");
        int jurusan = input.nextInt();
        switch (jurusan) {
            case 1:
                System.out.println("Anda memilih Jurusan Teknik Informatika");
                break;
            case 2:
                System.out.println("Anda memilih Jurusan Sistem Informasi");
                break;
            case 3:
                System.out.println("Anda memilih Jurusan Sistem Informasi");
                break;
            case 4:
                System.out.println("Anda memilih Jurusan Sistem Informasi");
                break;
            case 5:
                System.out.println("Anda memilih Jurusan Sistem Informasi");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }
}
