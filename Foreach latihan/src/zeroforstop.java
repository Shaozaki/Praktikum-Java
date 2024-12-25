import java.util.Scanner;
public class zeroforstop {
    public static void main(String[] args){
int input;
Scanner scan = new Scanner(System.in);

System.out.print("Masukan Angka (Masukan 0 untuk berhenti) :");
input = scan.nextInt();
        while (input !=0) {
            System.out.println("anda memasukan angka  :"+input);
            System.out.print("Masukan angka nol untuk berhenti  :");
            input = scan.nextInt();
        }
    System.out.println("Terimakasih sudah menggunakan Program ini");
    scan.close();
    }
}
