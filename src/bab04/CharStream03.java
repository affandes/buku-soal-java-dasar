package bab04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStream03 {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("src/bab04/data01.txt");
            char[] buffer = new char[4];
            file.read(buffer);
            String data = new String(buffer);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("File gak bisa dibaca!");
        }


    }
}
