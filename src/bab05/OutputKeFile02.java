package bab05;

import java.io.*;

public class OutputKeFile02 {
    public static void main(String[] args) {

        String teks = "Affandes";

        try {
            FileWriter file = new FileWriter("src/bab05/output02.txt", true);
            file.write(teks);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File gak ketemu!");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
