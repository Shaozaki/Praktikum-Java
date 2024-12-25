import java.util.Scanner;
public class IF_ELSE {
    public static void main(String[] args) throws Exception {
       int belanja = 0;
       Scanner scan = new Scanner(System.in);

       System.out.print("Total Belanjaan: Rp");
       belanja = scan.nextInt();

       if ( belanja > 100000) {
            System.out.println("selamat anda mendapat hadiah!! ");

       }
       System.out.println("Terima Kasih....."); 
       scan.close();
             
    }
}
