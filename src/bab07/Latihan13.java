package day07;

import java.util.Scanner;

public class Latihan13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input (1-5) = ");
        int step = input.nextInt();
        switch (step) {
            case 1:
            case 2:
            case 3:
                System.out.println("Step 3");
                break;
            case 4:
            case 5:
                System.out.println("Step 5");
            default:
                System.out.println("Selesai");
        }
    }
}
