package bab04;

import java.io.IOException;
import java.io.InputStream;

public class SystemIn03 {
    public static void main(String[] args) {

        InputStream input = System.in;

        try {
            System.out.print("Inputkan data = ");
            int data1 = input.read();
            int data2 = input.read();
            int data3 = input.read();
            int data4 = input.read();
            System.out.println("Data1 = " + data1);
            System.out.println("Data2 = " + data2);
            System.out.println("Data3 = " + data3);
            System.out.println("Data4 = " + data4);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
