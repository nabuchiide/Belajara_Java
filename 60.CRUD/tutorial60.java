import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * tutorial60
 */
public class tutorial60 {

    private static void tambahData() throws IOException {
        FileWriter fileOutput = new FileWriter("database.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukan nama penulis : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan Judul Buku : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit, Format (YYYY) : ");
        tahun = ambilTahun();
        // cek buku dalam database
        String[] keywords = { tahun + "," + penulis + "," + penerbit + "," + judul };
        System.out.println(Arrays.toString(keywords));
        boolean isExsist = cekBukuDiDatabase(keywords, false);
        // Menulis buku di database
        if (isExsist == false) {
            // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(ambilEntryPerTahun(penulis, tahun));
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;
            String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("data yang akan anda masukan adalah");
            System.out.println("_____________________________________");
            System.out.println("Primary Key\t: " + primaryKey);
            System.out.println("Tahun terbit\t: " + tahun);
            System.out.println("Penulis Buku\t: " + penulis);
            System.out.println("Judul Buku\t: " + judul);
            System.out.println("Penerbit\t: " + penerbit);

            boolean isTambah = getYeseOrNo("Apakah Anda ingin menambah data tersebut");
            if (isTambah) {
                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("Buku yang akan anda masukan sudah tersedia di database dengan data berikut : ");
            cekBukuDiDatabase(keywords, true);
        }
        bufferOutput.close();
    }

    private static void cariData() throws IOException {

        // membaca database ada atau tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Database Tidak Ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        // kita ambil data dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan Kata Kunci untuk Mencari Buku : ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s");

        // mengecek keywords di database
        cekBukuDiDatabase(keywords, true);
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
            tambahData();
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

    private static void deleteData() throws IOException {
        // kita ambil database Original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan di hapus : ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete
        boolean isFound = false;
        int entryCount = 0;

        String data = bufferInput.readLine();

        while (data != null) {
            entryCount++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data, ",");

            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCount) {
                System.out.println("\nData yang ingin anda hapus adalah ");
                System.out.println("====================================\n");
                System.out.println("Referensi\t : " + st.nextToken());
                System.out.println("Tahun\t\t : " + st.nextToken());
                System.out.println("Penulis\t\t : " + st.nextToken());
                System.out.println("Penerbit\t : " + st.nextToken());
                System.out.println("Judul\t\t : " + st.nextToken());

                isDelete = getYeseOrNo("Apakah anda yakin akan menghapus data dari database ?");
                isFound = true;
            }
            if (isDelete) {
                // Skip pindahkan data dari original
                System.out.println("Data Berhasil dihapus");
            } else {
                // kita pindahkan data original ke sementara
                bufferOutput.write(data);
                bufferOutput.newLine();
            }
            data = bufferInput.readLine();
        }

        if (!isFound) {
            System.err.println("Buku tidak ditemukan");
        }
        // menulis data ke file
        bufferOutput.flush();
        // delete Original file
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);
    }

    private static void updateData() throws IOException {
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // ambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan diupdate: ");
        int updateNum = terminalInput.nextInt();

        // tampilkan data yang diupdate
        String data = bufferInput.readLine();
        int entryCount = 0;

        while (data != null) {
            entryCount++;
            StringTokenizer st = new StringTokenizer(data, ",");

            // tampilkan entry count apabila entrycount == updateNum
            if (updateNum == entryCount) {
                System.out.println("\nData yang ingin diupdate adalah ");
                System.out.println("------------------------------------");
                System.out.println("Referensi\t : " + st.nextToken());
                System.out.println("Tahun\t\t : " + st.nextToken());
                System.out.println("Penulis\t\t : " + st.nextToken());
                System.out.println("Penerbit\t : " + st.nextToken());
                System.out.println("Judul\t\t : " + st.nextToken());

                // update data

                // mengambil input dari user
                String[] fieldData = { "tahun", "penulis", "penerbit", "judul" };
                String[] tempData = new String[4];
                // refresh token
                st = new StringTokenizer(data, ",");
                String originaData = st.nextToken();

                for (int i = 0; i < fieldData.length; i++) {
                    boolean isUpdate = getYeseOrNo("Apakah anda ingin merubah data terkait " + fieldData[i]);

                    originaData = st.nextToken();
                    if (isUpdate) {
                        // user input
                        if (fieldData[i].equalsIgnoreCase("tahun")) {
                            System.out.print("Masukan tahun terbit, format=(YYYY): ");
                            tempData[i] = ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukan " + fieldData[i] + " baru : ");
                            tempData[i] = terminalInput.nextLine();
                        }
                    } else {
                        tempData[i] = originaData;
                    }
                }
                // tampilkan data baru ke layar
                st = new StringTokenizer(data, ",");
                st.nextToken();
                System.out.println("\nData baru anda adalah ");
                System.out.println("------------------------------------");
                System.out.println("Tahun\t\t : " + st.nextToken() + "-->" + tempData[0]);
                System.out.println("Penulis\t\t : " + st.nextToken() + "-->" + tempData[1]);
                System.out.println("Penerbit\t : " + st.nextToken() + "-->" + tempData[2]);
                System.out.println("Judul\t\t : " + st.nextToken() + "-->" + tempData[3]);

                System.out.println(Arrays.toString(tempData));
                boolean isUpdate = getYeseOrNo("Apakah anda yakin ingin update data tersebut?");
                if (isUpdate) {
                    // cek data baru didatabase
                    boolean isExsist = cekBukuDiDatabase(tempData, false);
                    if (isExsist) {
                        System.out.println(
                                "data buku sudah ada didatabase, proses update dibatalakan,\nSilahkan delete data yang bersangkutan! ");
                    } else {
                        // format data baru kedalam database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];
                        // kita buat primary key
                        long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

                        String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
                        String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + penulis + "_" + penerbit + "_"
                                + judul;
                        // tulis data ke database
                        bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                    }
                } else {
                    bufferOutput.write(data);
                }
            } else {
                // copy data
                bufferOutput.write(data);
            }
            bufferOutput.newLine();
            data = bufferInput.readLine();
        }
        // menulis data kefile
        bufferOutput.flush();
        // delete data original
        database.delete();
        // rename file tempDB menjadi database
        tempDB.renameTo(database);
    }

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
                    System.out.println("\n====================");
                    System.out.println("List Seluruh Buku");
                    System.out.println("====================");
                    // menampilkan data
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n====================");
                    System.out.println("Cari Data Buku");
                    System.out.println("====================");
                    // cari data
                    cariData();
                    break;
                case "3":
                    System.out.println("\n====================");
                    System.out.println("Tambah Data Buku");
                    System.out.println("====================");
                    // tambah data
                    tambahData();
                    tampilkanData();
                    break;
                case "4":
                    System.out.println("\n====================");
                    System.out.println("Ubah Data Buku");
                    System.out.println("====================");
                    // Ubah Data
                    updateData();
                    break;
                case "5":
                    System.out.println("\n====================");
                    System.out.println("Hapus Data Buku");
                    System.out.println("====================");
                    deleteData();
                    // Hapus DAta
                    break;
                default:
                    System.out.println("\n\nInput Anda Tidak Ditemukan Silahkan pilih satu sampai lima");
            }
            isLanjutkan = getYeseOrNo("Apakah Anda Ingin Melanjutkan ?");
        }

    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primarykey;
        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primarykey = dataScanner.next();
            dataScanner = new Scanner(primarykey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replace("\\s+", "");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine();
        }
        return entry;
    }

    private static String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while (!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Format tahun yang anda masukan salah");
                System.out.print("Silahkan masukan tahun terbit kembali! : ");
                tahunValid = true;
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }

    private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExsist = false;
        int numberData = 0;
        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPengarang            |\tPenerbit             |\tJudul Buku");
            System.out.println("==============================================================================");
        }
        while (data != null) {
            // cek Keywords di dalam baris
            isExsist = true;

            for (String keyword : keywords) {
                isExsist = isExsist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            // Jika Keyword nya cocok maka tampilkan
            if (isExsist) {
                if (isDisplay) {
                    numberData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");
                    stringToken.nextToken();
                    System.out.printf("| %2d ", numberData);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s ", stringToken.nextToken());
                    System.out.printf("|\t%-20s ", stringToken.nextToken());
                    System.out.printf("|\t%s ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        if (isDisplay) {
            System.out.println("==============================================================================");
        }
        return isExsist;
    }

    private static void clearScreen() throws IOException {
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