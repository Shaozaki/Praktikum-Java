import java.util.Scanner;
public class conoth7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] siswa = new String[3];

        System.out.print("Siswa Pertama : ");
        siswa[0] = input.nextLine();

        System.out.print("Siswa kedua : ");
        siswa[1] = input.nextLine();

        System.out.print("Siswa Ketiga: ");
        siswa[2] = input.nextLine();

        input.close();

        System.out.println();
        System.out.println("# Hasil #");
        System.out.println(siswa[0]+", "+siswa[1]+", "+siswa[2]);
    }
}
