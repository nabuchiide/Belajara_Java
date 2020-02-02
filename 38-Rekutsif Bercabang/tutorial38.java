import java.util.*;
import java.lang.*;

/**
 * tutorial38
 */
public class tutorial38 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai n =");
        int nilai = inputUser.nextInt();
        int nilaiFibbonaci = Fibbonaci(nilai, "daun atas");
        System.out.println("nilai Fibonci ke -" + nilai + " adalah " + nilaiFibbonaci);
    }

    private static int Fibbonaci(int n, String daun) {
        System.out.print("Fibbonaci ke- " + n);
        System.out.println(" " + daun);
        if (n == 1 || n == 0) {
            return n;
        } else {
            return Fibbonaci(n - 1, "daun kiri") + Fibbonaci(n - 2, "daun Kanan");
        }
    }
}