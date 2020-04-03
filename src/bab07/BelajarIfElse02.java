package day07;

import java.util.Scanner;

public class BelajarIfElse02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }

    }
}
