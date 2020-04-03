package bab04;

import java.io.StringReader;
import java.util.Scanner;

public class InputScanner03 {
    public static void main(String[] args) {

        String teks = "Affandes";
        StringReader reader = new StringReader(teks);
        Scanner input = new Scanner(reader);
        System.out.println(input.nextLine());

    }
}
