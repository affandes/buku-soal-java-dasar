package bab04;

import java.io.InputStream;
import java.util.Scanner;

public class InputScanner02 {
    public static void main(String[] args) {

        InputStream inputStream = System.in;
        Scanner input = new Scanner(inputStream);
        System.out.println(input.nextLine());

    }
}
