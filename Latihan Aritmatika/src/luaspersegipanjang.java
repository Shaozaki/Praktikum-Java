import java.util.Scanner;

public class luaspersegipanjang {
    public static void main(String[] args) {
        // membuat program luas persegi panjang
        float panjang, lebar, luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("=================================");
        System.out.print("Maukan Panjang :");
        panjang = scan.nextFloat();
        System.out.print("Masukan Lebar :");
        lebar = scan.nextFloat();
        luas = panjang * lebar;
        scan.close();
        System.out.println("Luas Persegi panjang adalah :" +luas);
        System.out.println("==================================");

    }
}
