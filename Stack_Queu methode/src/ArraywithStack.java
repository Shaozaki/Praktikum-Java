 public class ArraywithStack {
    private final int maxSize;
    private  int top;
    private final int[] stackArray;

    public ArraywithStack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value){
        if(top < maxSize -1){
            stackArray[++top] = value;
            System.out.println("Pushed : "+ value);
        }else{
            System.out.println("Stack is Full cannot push "+ value);
        }
    }
    public int pop(){
        if(top >= 0){
            int poppedValue = stackArray[top--] ;
            System.out.println("Popped :"+ poppedValue);
            return poppedValue;
        }else{
            System.out.println("Stcak is Empty cannot POP");
            return -1;
        }
    }
    public int peek(){
        if (top>=0){
            return stackArray[top];
        }else{
            System.out.println("Stack is empty cannot pekk");
            return -1;
        }
    }
    public boolean isEmpty(){
        return(top== -1);
    }
    public static void main(String[] args) {
        ArraywithStack stack = new ArraywithStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top of the stack" +stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Cannot pop. Stack is Empty");
    }
}
