public class BubbleSortExample {
 // fungsi untuk melakukan pertukaran nilai
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }           
    // fungsi untuk melakukan bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    swap(arr, j , j + 1);
                }
            }
        }
    }

    //fungsi untuk menampilkan array
    public static void printArray(int[] arr){
       for (int value : arr){
              System.out.print(value + " ");
       }        
         System.out.println();
    }

    public static void main(String[] args) {
       int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array sebelum sorting :");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Array setelah sorting :");
        printArray(arr);
    }

}
 
 