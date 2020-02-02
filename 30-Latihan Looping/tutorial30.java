import java.util.Scanner;

/**
 * tutorial30
 */
public class tutorial30 {

    public static void main(String[] args) {
        // Program untuk menjumlahakan angka dengan rentang
        int nilai_awal, nilai_akhir, totoal;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai awal = ");
        nilai_awal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilai_akhir = inputUser.nextInt();

        // System.out.println("while Loop====="); 
        //totoal = 0;
        // while (nilai_awal <= nilai_akhir) {
        //     totoal = totoal + nilai_awal;
        //     System.out.println("ditambah " + nilai_awal + " menjadi " + totoal);
        //     nilai_awal++;
        // }

        /**
         * For loop
         */
        // System.out.println("For Loop=====");
        // int tot = 0;
        // for (int i = nilai_awal ; i <= nilai_akhir; i++) {
        //     tot = tot + i;
        //     System.out.println("ditambah " + nilai_awal+ " menjadi " + tot);
        //     nilai_awal++;
        // }
        /**
         * do while
         */
        System.out.println("do while=====");
        int total=0;
        do {
            total = total + nilai_awal;
            System.out.println("ditambah " + nilai_awal + " menjadi " + total);
            nilai_awal++;
        } while (nilai_awal<=nilai_akhir);
    }
}