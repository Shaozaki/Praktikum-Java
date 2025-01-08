import java.util.*;
public class arraylinkinparklist {
    public static void main(String[] args) {
        LinkedList <String> object = new LinkedList<>();

        object.add("A");
        object.add("B");
        object.addLast("C");

        System.out.println(object);

        object.remove("B");
        object.removeLast();
        System.out.println("Linkedlist setalah operasi deletion "+object);
    }
}
