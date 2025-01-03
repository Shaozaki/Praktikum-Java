import java.util.LinkedList;

public class linkedlistEX4 {
    public static void main(String[] args) {
        // Membuat instance atau objek daarai linkedList
        LinkedList <String> buah = new LinkedList<>();
        
        //Menambahkan Data Pada Objek
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");

       
        buah.removeFirst();
        buah.removeLast();
        buah.remove(1);

        System.out.println(buah);
    }
}

