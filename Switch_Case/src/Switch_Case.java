import java.util.Scanner;
public class Switch_Case{
    public static void main(String[] args) {
    String Lampu;
    Scanner scan = new Scanner(System.in); 
    
    System.out.print("Masukan Nama Lampu: ");
    Lampu = scan.nextLine();

    switch (Lampu) {
        case "Merah":
            System.out.println("Lampu Merah, Berhenti");
            break;
        case "Kuning":
            System.out.println("Lampu Kuning, Harap Hati-Hati");
            break;
        case "Hijau":
            System.out.println("Lampu Hijau, Silahkan Jalan");
            break;
        default:
        System.out.print("Warna Lampu Salah");
            break;
    }
scan.close();
    }
}