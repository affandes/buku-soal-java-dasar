package bab04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputScanner04 {
    public static void main(String[] args) {

        String file = "src/bab04/data02.txt";

        try {
            FileReader fileReader = new FileReader(file);
            Scanner input = new Scanner(fileReader);
            System.out.println(input.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        }

    }
}
