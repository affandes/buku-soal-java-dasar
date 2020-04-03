package bab05;

import java.io.*;

public class OutputKeFile01 {
    public static void main(String[] args) {

        String teks = "Affandes";

        try {
            OutputStream output = new FileOutputStream("src/bab05/output01.txt");
            output.write(teks.getBytes());
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
