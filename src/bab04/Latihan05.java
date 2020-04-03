package bab04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/bab04/angka02.txt");
            Scanner input = new Scanner(reader);
            System.out.println(input.nextInt());
            System.out.println(input.nextInt());
            System.out.println(input.nextInt());
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        }

    }
}
