public class InterpolationSearchA {
    public static int InterpolationSearch(int[] arr, int x) {
        int low = 0;
        int high =arr.length-1;

        while(low <= high && x>= arr[low] && x<= arr[high]){
            int pos = low + ((x-arr[low])*(high-low) / (arr[high]-arr[low]));
            
            if (arr[pos]== x){
                return pos;
            }else{
                if (arr[pos]< x){
                    low = pos + 1;
                }else{
                    high = pos - 1;}
                }


        
}
return -1;
}

public static void main(String[] args) {
  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int searchValue = 9;
  int result = InterpolationSearch(array, searchValue);
   if (result != -1){
    System.out.println("Nilai "+searchValue+" ditemukan pada index "+result);
   }else{
    System.out.println("Nilai "+searchValue+" tidak ditemukan");
   }
}
}