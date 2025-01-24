import java.util.LinkedList;

public class linkedlistEX3 {
    public static void main(String[] args) {
        // Membuat instance atau objek daarai linkedList
        LinkedList<String> buah = new LinkedList<>();

        // Menambahkan Data Pada Objek
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        // Mengambil data pada urutan teratas
        System.out.println("Data Urutan teratas :" + buah.getFirst());
        // Mengambil data urutan terbawah
        System.out.println("Data Urutan Terbawah :" + buah.getLast());
        // Mengambil data pada urutan ke 1
        System.out.println("Data no index 1:" + buah.get(1));
        // mengambil data pada urutan ke 6
        System.out.println("Data pada indexs ke 6:" + buah.get(6));

    }
}
