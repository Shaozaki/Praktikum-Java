import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Ahmad");
        theTree.insert(25, "Rosa");
        theTree.insert(75, "Raida");
        theTree.insert(12, "Naya");
        theTree.insert(37, "Gagas");
        theTree.insert(43, "Ainun");
        theTree.insert(30, "Beri");
        theTree.insert(33, "Vivid");
        theTree.insert(87, "Orin");
        theTree.insert(93, "Wiwid");
        theTree.insert(97, "Sasa");

        while (true) {
            System.out.print("Enter First letter of show, "
                            +"Insert, find, delete, or traverse");
            int choice = getChar();
            switch (choice) {
                case 's':
                theTree.displayTree();
                break;
                case'i': 
                System.out.print("Enter data value and data to"
                                   +" insert ");
                value = getInt();
                data = getString();
                theTree.insert(value, data);
                break;
                case 'f': 
                System.out.print("Enter value to finf: ");
                value = getInt();
                Node found = theTree.find(value);
                
            }

        }
        

    }
}
