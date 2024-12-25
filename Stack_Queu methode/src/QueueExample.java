import java.util.Scanner;

class Queue {
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;

    public Queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;

    }
    public void enqueue(int value){
        if(rear == maxSize - 1){
            System.out.println("Antrian Penuh. Tidak dapat menambah elemen.");
        }else{
            queueArray[++rear] = value;
            System.out.println("Elemen"+value+"ditambahkan ke dalam antrian");
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian Kosong tidak dapat menghapus elemen");
        }else{
            int removedValue = queueArray[front++];
            System.out.println("Elemen "+removedValue+"dihapus dari antrian");
        }
    }
    public boolean isEmpty(){
        return front > rear;
    }
    public void display() {
        if(isEmpty()){
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Isi Antrian: ");
            for(int i = front; i <= rear; i++){
                System.out.print(queueArray[i]+"");
            }
            System.out.println();
        }

}

}
public class QueueExample{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan ukuran antrian : ");
    int size = scan.nextInt();

    Queue queue = new Queue(size);
    int choice;
    do {
        System.out.println("\nMenu");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Display");
        System.out.println("0. Display");
        System.out.print("Pilihan Anda");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukan Elemen yang akan ditambahkan: ");
                int enqueueValue = scan.nextInt();
                queue.enqueue(enqueueValue);
                break;
        case 2:
            queue.dequeue();
            break;
        case 3:
            queue.display();
            break;
        case 0:
            System.out.println("Keluar dari progaram");
            break;
            default:
                System.out.println("Pilihan tidak valid silahkan coba lagi");
                break;
        }
    }while (choice != 0);
    scan.close();
}
}
