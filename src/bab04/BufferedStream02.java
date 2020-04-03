package bab04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedStream02 {
    public static void main(String[] args) {

        InputStream input = System.in;
        BufferedInputStream bufferedInput = new BufferedInputStream(input);

        byte[] buffer = new byte[5];

        try {
            System.out.print("Tulis nama kamu = ");
            bufferedInput.read(buffer);
            String nama = new String(buffer);
            System.out.println("Hai " + nama);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
