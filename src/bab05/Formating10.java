package bab05;

import java.io.PrintStream;

public class Formating10 {
    public static void main(String[] args) {

        PrintStream print = System.out;
        print.print("Contoh output nomor serial.");
        print.println();
        print.printf("Angka = %05d %n", 123);
        print.printf("Angka = %05d %n", 1234);
        print.printf("Angka = %05d %n", 12345);

    }
}
