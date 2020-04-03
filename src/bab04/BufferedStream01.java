package bab04;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedStream01 {
    public static void main(String[] args) {

        String teks = "Affandes";

        ByteArrayInputStream input = new ByteArrayInputStream(teks.getBytes());
        BufferedInputStream bufferedInput = new BufferedInputStream(input);

        byte[] buffer = new byte[5];

        try {
            bufferedInput.read(buffer);
            String data = new String(buffer);
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
