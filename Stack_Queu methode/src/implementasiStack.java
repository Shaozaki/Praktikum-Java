import java.util.Stack;
public class implementasiStack {
    public static void main(String[] args) {
        //inisiali sasi stackk
        Stack<Integer> stack = new Stack <> ();

        //push beberapa item ke stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
 // POP dan tampilkan item dari stack
        System.out.println("POP :"+ stack.pop());
        //Tampilkan Stack kosong 
        System.out.println("Stack Kosong :" + stack.empty());
    }
}
