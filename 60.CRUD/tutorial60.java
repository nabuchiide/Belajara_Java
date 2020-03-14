import java.io.IOException;
import java.util.Scanner;

/**
 * tutorial60
 */
public class tutorial60 {

    public static void main(final String[] args) throws IOException {

        final Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("database Perpustakaan\n");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("2.\tCari Data Buku");
            System.out.println("3.\tTambah Data Buku");
            System.out.println("4.\tUbah Data Buku");
            System.out.println("5.\tHapus Data Buku");

            System.out.print("\n\nPilihan Anda : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("List Seluruh Buku");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("Cari Data Buku");
                    // cari data
                    break;
                case "3":
                    System.out.println("Tambah Data Buku");
                    // tambah data
                    break;
                case "4":
                    System.out.println("Ubah Data Buku");
                    // Ubah Data
                    break;
                case "5":
                    System.out.println("Hapus Data Buku");
                    // Hapus DAta
                    break;
                default:
                    System.out.println("\n\nInput Anda Tidak Ditemukan Silahkan pilih satu sampai lima");
            }
            isLanjutkan = getYeseOrNo("Apakah Anda Ingin Melanjutkan ?");
        }

    }

    private static void tampilkanData() throws IOException {
        System.out.println("ini isi dari data brother");

        boolean tampilkanData = getYeseOrNo("Apakah Anda Ingin Menambahkan ?");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Tidak Bisa Clear Screeen");
        }
    }

    private static boolean getYeseOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + "\t(y/n)");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.out.println("Pilihan Anda bukan y atau n");
            System.out.print("\n" + message + "\t(y/n)");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");// untuk memberikan nilai true pada boolean isLanjutkan
    }
}