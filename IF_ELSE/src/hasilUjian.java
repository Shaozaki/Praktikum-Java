import java.util.Scanner;

public class hasilUjian {
    public static void main(String[] args) {
        int nilai;
        String nama;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        nama = scan.nextLine();
        System.out.print("Masukan Nilai :");
        nilai = scan.nextInt();
        scan.close();
        if (nilai >= 70) {
            System.out.println(" Selamat " +nama+ " anda Lulus ");
        }else{
            System.out.println(" maaf " +nama+ " gagal ");
        }

        
    }
}
