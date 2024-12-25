public class SequentalSearch {
    public static void main(String[] args) {
        SequentalSearch obj = new SequentalSearch();

        //Untuk menampilkan data pada array
        obj.tampilkandata();

        //melakukan pencarian data
        obj.searching("pajero");

    }
     String [] allData = new String[] {"Ayla", "Jazz", "Splah", "March", "H-RV","Pajero"};
     private void tampilkandata(){
        for (String data : allData){
            System.out.print(data+" ");
        }
        System.out.println();
     }
     private void searching(String karakter){
        int x = 0 ;
        boolean ketemu = false;
        for(int i = x; i < allData.length; i++){
            if(karakter.equalsIgnoreCase(allData[i])){
                ketemu = true;
                x = i;
            }
        }
        if(ketemu){
            System.out.println("Data berada di urutan "+(x+1)+", indeks ke"+x);
        }else{
            System.out.println("Data tidak ditemukan");
        }
     }
}
