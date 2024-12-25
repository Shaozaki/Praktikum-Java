import java.util.Scanner;

public class GJGN {
    public static void main(String[] args) {
          
    // Deklarasi variabel integer dengan bilangan 
    int bilangan;

    // membuat objek scanner scan
    Scanner scan = new Scanner(System.in);

    // Print teks untuk pengguna memasukan bilangan
    System.out.print("Insert Bilangan =");
    
    //membaca bilangan yang diinput dari pengguna
    bilangan = scan.nextInt();
    scan.close();
    //pengecekan kondisi apakah bilangan yang diinput itu bilangan genap
    if (bilangan % 2 == 0){
    //print teks jika kondisi IF terpenuhi
        System.out.print("Bilangan adalah Genap ");

    //jika bilangan tidak genap maka akan dialihkan ke ELSE
    }else{
        //print teks jika kondisi bilangan adalah ganjil
        System.out.print("Bilangan adalah Ganjil");
    }
   
    }
 
}
