import java.util.Scanner;

/**
 * tutorial19
 */
public class tutorial19 {

    public static void main(final String[] args) {
        // Membuat sebuah Objek untuk menangkap input
        final Scanner inputuser = new Scanner(System.in);
        // Sebuah program sederhana untuk menebak sebuah angka
        final int nilai_Benar = 6;
        int nilai_Tebakan;

        boolean sataus_tebakan;
        System.out.print("\nMasukan nilai tebakan Anda! : ");
        nilai_Tebakan = inputuser.nextInt();
        System.out.println("nilai tebakan anda adalah : " + nilai_Tebakan);

        // Operasi Logika
        sataus_tebakan = (nilai_Tebakan == nilai_Benar);
        System.out.println("nilai tebakan anda adalah : "+sataus_tebakan);

        //Operasi AlJabar boolean (AND/OR)
        System.out.println("Masukan Nilai Sederhana diatara 4 - 9");
        nilai_Tebakan = inputuser.nextInt();
        // sataus_tebakan = ((nilai_Tebakan > 4) && (nilai_Tebakan<9))||((nilai_Tebakan > 24) && (nilai_Tebakan<29));
        sataus_tebakan = (nilai_Tebakan > 4) && (nilai_Tebakan<9);
        System.out.println("tebakan anda adalah : "+sataus_tebakan);
    }
}