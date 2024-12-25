import java.util.Scanner;

public class menghitungluaslingkaran {
    public static void main(String[] args) {
        float r, luas;
        float pi = 3.14f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Membuat program luas lingkaran");
        System.out.println("==============================");
        System.out.print("Masukan Jari-jari Lingkaran :");
        r = scan.nextFloat();
        luas = pi*(r*r);
        scan.close();
        System.out.println("Luas lingkaran :" +luas);
    }
}