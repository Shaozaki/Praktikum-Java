import java.util.Scanner;
public class Urutan_Hari {
    public static void main(String[] args) {
        int day;
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan angka 1-7 untuk menentukan hari: ");
        day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            
            case 2:
            System.out.println("Selasa");
            break;

            case 3:
            System.out.println(" Rabu ");
            break;

            case 4: 
            System.out.println("Kamis");

            case 5:
            System.out.println("Jum'at");
            break;

            case 6:
            System.out.println("Sabtu");
            case 7:
            System.out.println("Minggu");
            break;
            default:
            System.out.println(" angka tidak valid");
                break;
        }
        scan.close();
    }
}
