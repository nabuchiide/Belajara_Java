import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    cariData();
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

    private static void cariData() throws IOException {

        // membaca database ada atau tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Database Tidak Ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        // kita ambil data dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan Kata Kunci untuk Mencari Buku : ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s");

        // mengecek keywords di database
        cekBukuDiDatabase(keywords);
    }

    private static void cekBukuDiDatabase(String[] keywords) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExsist;
        int numberData = 1;
        System.out.println("\n| No |\tTahun |\tPengarang            |\tPenerbit             |\tJudul Buku");
        System.out.println("==============================================================================");
        while (data != null) {
            // cek Keywords di dalam baris
            isExsist = true;

            for (String keyword : keywords) {
                isExsist = isExsist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            // Jika Keyword nya cocok maka tampilkan
            if (isExsist) {
                StringTokenizer stringToken = new StringTokenizer(data, ",");
                stringToken.nextToken();
                System.out.printf("| %2d ", numberData);
                System.out.printf("|\t%4s  ", stringToken.nextToken());
                System.out.printf("|\t%-20s ", stringToken.nextToken());
                System.out.printf("|\t%-20s ", stringToken.nextToken());
                System.out.printf("|\t%s ", stringToken.nextToken());
                System.out.print("\n");
                numberData++;
            }
            data = bufferInput.readLine();
        }
    }

    private static void tampilkanData() throws IOException {
        // System.out.println("ini isi dari data brother");

        // boolean tampilkanData = getYeseOrNo("Apakah Anda Ingin Menambahkan ?");

        FileReader fileInput;
        BufferedReader bufferInput; // membuat file BufferReader
        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Data Base Tidak Ditemukan");
            System.err.println("Silahkan Tambah Data terlebih dahulu");
            return;
        }
        String data = bufferInput.readLine();
        System.out.println("\n| No |\tTahun |\tPengarang            |\tPenerbit             |\tJudul Buku");
        System.out.println("==============================================================================");
        int numberData = 1;
        while (data != null) { // apabila data tidak null
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %2d ", numberData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s ", stringToken.nextToken());
            System.out.printf("|\t%-20s ", stringToken.nextToken());
            System.out.printf("|\t%s ", stringToken.nextToken());
            System.out.print("\n");
            numberData++;

            data = bufferInput.readLine();
        }
        System.out.println("==============================================================================");
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