import java.util.Scanner;

/**
 * tutorial31
 */
public class tutorial31 {

    public static void main(String[] args) {
        //menghitung nilai deret fibonaci ke n
        int nilai, nilaiAwal, nilaiAkhir, Fibbonaci;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil nilai Fibbonaci ke- :");
        Fibbonaci = inputUser.nextInt();
        nilaiAkhir=0;
        nilaiAwal = 1;
        nilai = 1;
        // for (int i = 1; i <= Fibbonaci; i++) {
        //     System.out.println("nilai ke- "+i+" adalah "+ nilai);
        //     nilai = nilaiAwal + nilaiAkhir;
        //     nilaiAkhir = nilaiAwal;
        //     nilaiAwal = nilai;
        // }
        // int i = 1;
        // while (i<=Fibbonaci) {
        //     System.out.println("nilai ke- "+i+" adalah "+ nilai);
        //     nilai = nilaiAwal + nilaiAkhir;
        //     nilaiAkhir = nilaiAwal;
        //     nilaiAwal = nilai;
        //     i++;
        // }
        int i = 1;
        do {
            System.out.println("nilai ke- "+i+" adalah "+ nilai);
            nilai = nilaiAwal + nilaiAkhir;
            nilaiAkhir = nilaiAwal;
            nilaiAwal = nilai;
            i++;
        } while (i<=Fibbonaci);
    }
}