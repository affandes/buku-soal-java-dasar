package bab04;

import java.io.FileReader;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Scanner;

public class InputScanner01 {
    public static void main(String[] args) {

        String teks = "Affandes";
        Scanner input = new Scanner(teks);
        System.out.println(input.nextLine());

    }
}
