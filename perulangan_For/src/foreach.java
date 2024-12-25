import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {
        int[] angka = {1,2,3,4,5};

        for (int nilai : angka ) {
            System.out.println(nilai);
        }
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Alice");
        daftarNama.add("Bob");
        daftarNama.add("Charlie");
        daftarNama.add("Delta");
        for (String nama : daftarNama){
            System.out.println(nama);
        }
    }
}
