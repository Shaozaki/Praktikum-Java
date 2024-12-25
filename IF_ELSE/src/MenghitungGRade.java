import java.util.Scanner;
public class MenghitungGRade {
    public static void main(String[] args) {
        //membuat variabel Scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //Mengambil Input
        System.out.print("input nilai: ");
        nilai = scan.nextInt();
        scan.close();
        //hitung Gradenya
        if (nilai >=90) {
            grade = "A";
        }else if (nilai >=80){
            grade = "B+";
        }else if(nilai >=70){
            grade = "B";
        }else if(nilai >=60 ){
            grade = "C+";
        }else if (nilai >= 50){
            grade ="C";
        }else if (nilai >= 40){
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("Grade : " +grade);


    }
}
