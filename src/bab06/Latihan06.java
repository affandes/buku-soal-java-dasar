package bab06;

public class Latihan06 {
    public static void main(String[] args) {
        boolean x = false & false;
        boolean y = false & true;
        boolean z = true & true;
        boolean hasil1 = x && y;
        boolean hasil2 = y && z;
        boolean hasil3 = z && x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
    }
}
