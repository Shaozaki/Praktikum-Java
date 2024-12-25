
public class latihanArrra2 {
    public static void main(String[] args) {
        //deklarasi dan inisialisasi nama siswa dalam arrat String
        String[] siswa = {"Lubna", "Nidya", "Qia", "Ilham", "Azka", "Anggi"};
        //Perulangan untuk menampilkan urutan sesuai length array;
            for(int i = 0; i < siswa.length; i++ ){
            //cetak urutan siswa
            System.out.println("Siswa ke "+i+" : "+siswa[i]);
            }
            //cetak daftar nama siswa menggunakan \n untuk ganti baris
        System.out.println("\n=====Daftar Nama Siswa=======");
            // perulangan untuk menampilkan data nama siswa
            for(String data : siswa){
                System.out.println(data);
            }
    }
}
