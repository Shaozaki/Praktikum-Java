import java.util.Scanner;
public class PenjualanSederhana {

    public static void main(String[] args) {
        // deklarasi variabel
        double hargaProduk, diskon,total;
        int Jumlah_Pembelian;
        Scanner scan = new Scanner(System.in);
        // Input harga dan jumlah barang
        System.out.print("masukan harga produk :");
        hargaProduk = scan.nextDouble();
        System.out.print("masukan jumlah beli :");
        Jumlah_Pembelian = scan.nextInt();
        //menentukan dsikon yang didapat baerdasarkan data yang diinputkan
        if (Jumlah_Pembelian >10){
          if (hargaProduk > 100000)
            diskon = Jumlah_Pembelian*hargaProduk*15f/100;
          else 
        diskon = Jumlah_Pembelian*hargaProduk*10f/100;
        }else{
        if (hargaProduk >50000 )
        diskon = Jumlah_Pembelian*hargaProduk*5/100;
        else
        diskon = Jumlah_Pembelian*hargaProduk*2/100;
        } 
        // menampilkan diskon dan harga
        System.out.println("Diskon :" +diskon);
        total= Jumlah_Pembelian*hargaProduk-diskon;
        System.out.println("Total :" +total);


scan.close();
    }
}