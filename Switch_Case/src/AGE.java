import java.util.Scanner;
public class AGE {
    public static void main(String[] args) {
        //Deklarasi umur
        int umur;
        Scanner scan = new Scanner(System.in);
        // Membaca Umur
        System.out.print("MAsukan Umur Anda : ");
        umur = scan.nextInt();
        // pengecekan kategori yang sesuai dengan rentang usia
        if (umur < 13){
            System.out.println("Kamu Masih Anak-anak");
        }else if(umur >= 13 & umur <20){
            System.out.println("Kamu seorang Remaja");
        }else{
            System.out.println("Kamu Orang Dewasa");
        }
        scan.close();
    }
}
