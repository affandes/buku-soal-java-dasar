package bab04;

import java.io.IOException;
import java.io.InputStream;

public class SystemIn01 {
    public static void main(String[] args) {

        InputStream input = System.in;

        try {
            int data = input.read();
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
