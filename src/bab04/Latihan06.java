package bab04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/bab04/data03.txt");
            Scanner input = new Scanner(reader);

            System.out.println("Nama barang = " + input.next());
            System.out.println("Jumlah = " + input.nextInt());
            System.out.println("Harga (Rp) = " + input.nextDouble());

        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        }

    }
}
