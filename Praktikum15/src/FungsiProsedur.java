import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FungsiProsedur {
    // Deklarasi list untuk menyimpan data buah
    static ArrayList<String> listBuah = new ArrayList<>();
    // Variabel untuk mengontrol jalannya program
    static boolean isRunning = true;
    // Membaca input dari pengguna
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    // Fungsi untuk menampilkan menu
    static void showMenu() throws IOException {
        System.out.println("=========== Menu ============");
        System.out.println("[1] Show All Buah ");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU: ");

        // Membaca pilihan menu dari pengguna
        int selectedMenu = Integer.valueOf(input.readLine());
        switch (selectedMenu) {
            case 1:
                // Menampilkan semua buah
                showAllBuah();
                break;
            case 2:
                // Menambahkan buah baru
                insertBuah();
                break;
            case 3:
                // Mengedit buah yang ada
                editBuah();
                break;
            case 4:
                // Menghapus buah
                deleteBuah();
                break;
            case 5:
                // Keluar dari program
                System.exit(0);
                break;
            default:
                // Menampilkan pesan jika pilihan tidak valid
                System.out.println("Pilihan salah");
        }
    }

    // Fungsi untuk menampilkan semua buah dalam list
    static void showAllBuah() {
        // Mengecek apakah list buah kosong
        if (listBuah.isEmpty()) {
            // Menampilkan pesan jika tidak ada data
            System.out.println("Belum Ada Data");
        } else {
            // Menampilkan semua buah dalam list
            for (int i = 0; i < listBuah.size(); i++) {
                System.out.println(listBuah.get(i));
            }
        }
    }

    // Fungsi untuk menambahkan buah ke dalam list
    static void insertBuah() throws IOException {
        System.out.print("Masukkan nama buah: ");
        String buah = input.readLine();
        listBuah.add(buah);
        System.out.println("Buah berhasil ditambahkan!");
    }

    // Fungsi untuk mengedit buah dalam list
    static void editBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomor buah yang akan diedit: ");
        int index = Integer.parseInt(input.readLine());
        System.out.print("Masukkan nama buah baru: ");
        String buahBaru = input.readLine();
        listBuah.set(index - 1, buahBaru);
        System.out.println("Buah berhasil diedit!");
    }

    // Fungsi untuk menghapus buah dari list
    static void deleteBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomor buah yang akan dihapus: ");
        int index = Integer.parseInt(input.readLine());
        listBuah.remove(index - 1);
        System.out.println("Buah berhasil dihapus!");
    }

    public static void main(String[] args) throws IOException {
        while (isRunning) {
            showMenu();
        }
    }
}
