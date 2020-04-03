package bab04;

import java.io.IOException;
import java.io.StringReader;

public class CharStream01 {
    public static void main(String[] args) {

        String teks = "Affandes";
        StringReader input = new StringReader(teks);

        try {
            System.out.println(input.read());
            System.out.println(input.read());
            System.out.println(input.read());
            System.out.println(input.read());
        } catch (IOException e) {
            System.out.println("Error!");
        }

    }
}
