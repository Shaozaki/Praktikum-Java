import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan harga yang diinginkan : ");
        int panjangData = masuk.nextInt();
        int data[] = new int[panjangData];

        for(int i=0; i<panjangData; i++){
            System.out.print("Data ["+(i+1)+"] = ");
            data [i] = masuk.nextInt();
        }
        System.out.println("-------------------");
        System.out.print("Data array = ");
        for(int a=0; a<=panjangData-1;a++){
            System.out.print( data [a] +" ");
        }
        System.out.println("");
        System.out.println("-------------------");
        System.out.print("Masukan data yang dicari = ");
        int cari = masuk.nextInt();

        int x=0;
        boolean ketemu = false;
        for(int i=x; i<panjangData;i++){
            if(cari==data[i]){
                ketemu = true;
                x=i;
            }
        }
        if(ketemu){
            System.out.println("Data berada pada urutan ke- "+(x+1)+", index ke "+x);
        }else{
            System.out.println("Data tidak ada");
        }
        masuk.close();
    }
}
