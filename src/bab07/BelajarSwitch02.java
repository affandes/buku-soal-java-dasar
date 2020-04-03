package day07;

public class BelajarSwitch02 {
    public static void main(String[] args) {
        int status = 2;
        switch (status) {
            case 1:
                System.out.println("Aktif Kuliah");
                break;
            case 2:
                System.out.println("Cuti Kuliah");
                break;
            case 3:
                System.out.println("Alpa Studi");
                break;
            default:
                System.out.println("Tidak Diketahui");
                break;
        }
    }
}
