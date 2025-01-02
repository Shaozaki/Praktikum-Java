import java.util.LinkedList;
public class linkedlistEX {
    public static void main(String[] args) {
        // Membuat instance atau objek daarai linkedList
        LinkedList <String> buah = new LinkedList<>();
        
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        System.out.println("Saya Makan Buah "+buah);

        System.out.println("Di rumah saya setiap hari menyediakan "+buah.size()+" Macam buah-buahan");
        
    }
}
