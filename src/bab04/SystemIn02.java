package bab04;

import java.io.IOException;
import java.io.InputStream;

public class SystemIn02 {
    public static void main(String[] args) {

        InputStream input = System.in;

        try {
            System.out.print("Inputkan data = ");
            int data = input.read();
            System.out.println("Data = " + data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
