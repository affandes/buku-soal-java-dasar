package bab04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStream03 {
    public static void main(String[] args) {

        String file = "src/bab04/data02.txt";

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            char[] buffer = new char[5];
            bufferedReader.read(buffer);
            String data = new String(buffer);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("File gak bisa dibaca!");
        }
    }
}
