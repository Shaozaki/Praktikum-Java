import java.util.LinkedList;

public class LinkedlistEX2 {
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

        buah.addFirst("Paling atas");// Mengubah data ke indexs paling atas
        buah.addLast("Paling bawah");// mengubah data ke indexs paling bawah
        buah.set(2, "diubah");// Mengubah indexs ke 2
        buah.set(5, "diganti");// mengubah indexs ke 5
        // Mencetak data
        System.out.println("Saya Makan Buah " + buah);
        // Menampilkan jumlah item
        System.out.println("Di rumah saya setiap hari menyediakan " + buah.size() + " Macam buah-buahan");

    }
}
