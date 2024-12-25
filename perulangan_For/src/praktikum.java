import java.util.Scanner;
public class praktikum {
    public static void main(String[] args) {
        int input = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("MAsukan Angka (0 untuk berhenti) :");
        input = scan.nextInt();
         while(input != 0){
            System.out.println(" Anda memasukan angka :" +input);
            System.out.print("Masukan 0 untuk berhenti :");
            input = scan.nextInt();
         }
         System.out.println("Terimakasih Sudah Menggunakan Program ini");
         scan.close();
    }   
}
