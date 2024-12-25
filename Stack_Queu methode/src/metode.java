public class metode {
    public static void main(String[] args) {
        double jumlah = tambah(6,2);
        System.out.println(jumlah);
        jumlah = tambah(jumlah,4);
        System.out.println(jumlah);
        System.out.println(tambah(100,100));


    }
    static double tambah(double bil1,double bil2){
        double hasil = bil1 + bil2;
        return hasil;
    }
}
