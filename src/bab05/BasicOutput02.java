package bab05;

import java.io.FileWriter;
import java.io.IOException;

public class BasicOutput02 {
    public static void main(String[] args) {
        String nama = "Affandes";

        try {
            FileWriter fileWriter = new FileWriter("src/bab05/nama.txt");
            fileWriter.write(nama);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File gak bisa disimpan!");
        }

    }
}
