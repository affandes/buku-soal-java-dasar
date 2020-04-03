package bab04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharStream02 {
    public static void main(String[] args) {

        InputStreamReader input = new InputStreamReader(System.in);

        try {
            int data = input.read();
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
