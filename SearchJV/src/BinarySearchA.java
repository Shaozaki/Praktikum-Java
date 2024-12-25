import java.util.Scanner;
public class BinarySearchA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] nilai = {66,77,80,84,88,99,100};
        System.out.print("Masukan nilai yang akan dicari :");
        BinarySearchInt (nilai, scan.nextInt());
        scan.close();
    }
    //procedure Binary Search
    public static void BinarySearchInt (int[] angka, int key){
        int low =0, high = angka.length-1, median;
        boolean status = false;
        while (low <= high) {
            median = (low+high)/2;
        
        //cek apakah data ada atau tidak
        if(key == angka[median]){
            //jika data ketemu
            System.out.println(key+" ditemukan pada posisi ke-"+(median+1)+" pada indexs ke-"+median);
            status=true;
            break;
        }else{
            /*Jika data tidak ditemukan
            lakukan pembagian array apakah lebih besar atau lebih kecil dari key*/
            if(key>angka[median]){
                //cari datanya yang lebih besar dari median
                low = median+1;
            }else{
                high = median-1;
            }
        }
    }// akhir while
    // pengecekan apakah datanya ditemukan atau tidak
    if(status == false){
        //artinya data tidak ditemukan
        System.out.println(key+" Data tidak ditemukan");
    }
}
}
