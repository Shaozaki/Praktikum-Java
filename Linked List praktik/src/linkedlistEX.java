import java.util.LinkedList;

public class linkedlistEX {
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
        // Mencetak data
        System.out.println("Saya Makan Buah " + buah);
        // Menampilkan jumlah item
        System.out.println("Di rumah saya setiap hari menyediakan " + buah.size() + " Macam buah-buahan");

    }
}
