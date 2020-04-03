package bab09;

import java.util.Scanner;

public class NestIf02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.length() < 6) {
            System.out.println("Username minimal 6 karakter!");
        } else {
            if (password.length() < 6) {
                System.out.println("Password minimal 6 karakter!");
            } else {
                if (username.equals("affandes") && password.equals("qwerty123456")) {
                    System.out.println("Login berhasil");
                } else {
                    System.out.println("Login gagal");
                }
            }
        }
    }
}
