import java.io.*;
public class sqntl {
    public static void main(String[] args) throws IOException{
        int data[] = {8, 10, 6, -2, 11, 7, 1 , 100};
        int cari;
        int flag = 0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan data yang ingin dicari : ");
        cari = Integer.parseInt(in.readLine());
        for (int i=0; i<8; i++){
            if(data[i] == cari){
                flag = 1;
            }
        }
        if(flag == 1)
        System.out.println(" Data ditemukan");
        else
        System.out.println(" Data Tidak ditemukan ");
        
    }
}
