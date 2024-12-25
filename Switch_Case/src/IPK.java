import java.util.Scanner;
public class IPK {
    public static void main(String[] args) {
        //Deklarasi Nama dan IPK
    String nama ;
    Float nilai_ipk;
    Scanner scan = new Scanner(System.in);
//Baca Nama dan IPK
    System.out.print("Masukan Nama :");
    nama = scan.nextLine();
    System.out.print("Masukan IPK :");
    nilai_ipk = scan.nextFloat();
//pengecekan kondisi IPK
    if (nilai_ipk >= 3.5 ){
        System.out.println("Cumlaude");
    }else if (nilai_ipk >= 3.0){
        System.out.println("Sangat Memuaskan");
    }else if(nilai_ipk >= 2.5){
        System.out.println("memuaskan");
    }else if (nilai_ipk >= 2.0){
        System.out.println("Cukup");
    }else{
        System.out.println("Gagal");
    }
scan.close();
    }
    }

