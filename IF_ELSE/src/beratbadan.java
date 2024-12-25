import java.util.Scanner;

public class beratbadan {
    
    public static void main(String[] args) {
    // Deklarasi variabel char dengan jeniskelamin, double dengan tinggibadan dan beratBadanIdeal
        char jeniskelamin;
        double tinggiBadan, beratBadanIdeal;

         //membuat objek scanner   
        Scanner scan = new Scanner(System.in);

        //cetak untuk inputan Jenis kelamin
        System.out.print("Jenis Kelamin =");
        //membaca jeniskelamin

        jeniskelamin = scan.nextLine().charAt(0);
        //cetak untuk inputan Tinggibadan
        System.out.print("Masukan Tinggi badan =");

        //membaca tinggi badan
        tinggiBadan = scan.nextDouble();
        scan.close();
        //pengecekan kondisi untuk kelamin Laki-laki dan perempuan 
        //serta penghitungan berat badan ideal berdasarkan tinggi badan
        if (jeniskelamin == 'L'|| jeniskelamin == 'l'){
            beratBadanIdeal = (tinggiBadan - 100 ) - (0.1*(tinggiBadan - 100));
        }else if (jeniskelamin == 'P' || jeniskelamin == 'p' ){
            beratBadanIdeal = (tinggiBadan - 100)-(0.15* (tinggiBadan-100));
        }else{
            //cetak jika jenis kelamin tidak sesuai 
            System.err.println(" Jenis Kelamin tidak valid");
            return;
        }
        // cetak hasil berat badan ideal
        System.out.println(" Berat badan ideal anda adalah " +beratBadanIdeal+ "Kg");

    }
    
}
