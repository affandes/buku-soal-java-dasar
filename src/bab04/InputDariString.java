package bab04;

import java.io.ByteArrayInputStream;

public class InputDariString {
    public static void main(String[] args) {

        String teks = "ABCD";
        ByteArrayInputStream input = new ByteArrayInputStream(teks.getBytes());

        int data1 = input.read();
        int data2 = input.read();
        int data3 = input.read();
        int data4 = input.read();

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);

    }
}
