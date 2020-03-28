package bab03;

public class VarNumber01 {
    public static void main(String[] args) {
        byte varByte = 127;
        short varShort = 32767;
        int varInt = 2147483647;
        long varLong = 0x7fffffffffffffffL; //9.223.372.036.854.775.807‬

        double varFloat = 3.14f; // diakhiri simbol f
        double varDouble = 3.14;

        System.out.println("varByte = " + varByte);
        System.out.println("varShort = " + varShort);
        System.out.println("varInt = " + varInt);
        System.out.println("varLong = " + varLong);

        System.out.println("varFloat = " + varFloat);
        System.out.println("varDouble = " + varDouble);
    }
}
