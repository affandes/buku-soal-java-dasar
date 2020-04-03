package bab04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStream04 {
    public static void main(String[] args) {

        String file = "src/bab04/data02.txt";

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            char[] buffer1 = new char[5];
            char[] buffer2 = new char[5];
            String data1 = bufferedReader.readLine();
            String data2 = bufferedReader.readLine();
            System.out.println(data1);
            System.out.println(data2);
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("File gak bisa dibaca!");
        }

    }
}
