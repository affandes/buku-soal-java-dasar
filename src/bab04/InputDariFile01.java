package bab04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDariFile01 {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/bab04/data01.txt");
            int data = file.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("File gak bisa dibaca!");
        }

    }
}
