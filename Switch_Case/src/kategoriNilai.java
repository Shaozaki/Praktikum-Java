import java.util.Scanner;
public class kategoriNilai {
    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nilai :");
        nilai = scan.nextInt();

        if (nilai >=80 && nilai <90 ){
            System.out.println("Nilai A");
        }else if (nilai > 90){
            System.out.println("Sempurna");
        }else if(nilai >= 60 && nilai <80){
            System.out.println("Nilai B");
        }else if(nilai >= 40 && nilai <60){
            System.out.println("Nilai C");
        }else{
            System.out.println("Nilai D");
        }

        scan.close();
    }
}
