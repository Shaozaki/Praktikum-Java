public class QueueWithArray {
    private static final int MAX_SIZE = 5;
    private final int[] queueArray;
    private int front, rear, size;

    public QueueWithArray(){
        this.queueArray = new int[MAX_SIZE];
        this.front =  0;
        this.rear  = -1;
        this.size  =  0;
    }

    public void enqueue(int item) {
        if(size == MAX_SIZE){
            System.out.println("Queue is full. Cannoat enqueue");
            return;
        }
        rear = ( rear + 1) % MAX_SIZE;
        queueArray[rear] = item;
        size++;
        System.out.println("Enqueue :"+ item);
    }
    public void dequeue() {
        if(size == 0){
            System.out.println("Queue is Empty. Cannot Dequeue");
            return;
        }
        int removedItem = queueArray[front];
        front =(front + 1) % MAX_SIZE;
        size--;
        System.out.println("Dequeue: "+ removedItem);
    }
    public void front() {
    if (size == 0){
        System.out.println("Queue is Empty");
        return;
    }
    System.out.println("Front Element: "+queueArray[front]);
    }
    public void display(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print ("Queue Element: ");
        int i =  front;
        for(int count = 0; count < size; count++){
            System.out.print(queueArray[i]+ " ");
            i =(i+1)% MAX_SIZE;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();

        queue.front();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}


