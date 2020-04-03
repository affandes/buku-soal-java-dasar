package bab04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDariFile02 {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/bab04/data01.txt");
            int data1 = file.read();
            int data2 = file.read();
            int data3 = file.read();
            int data4 = file.read();
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("File gak bisa dibaca!");
        }

    }
}
